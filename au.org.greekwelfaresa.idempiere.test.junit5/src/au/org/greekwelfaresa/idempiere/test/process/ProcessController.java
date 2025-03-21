package au.org.greekwelfaresa.idempiere.test.process;

import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.getField;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.injectMockLog;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.invoke;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.setField;
import static java.util.stream.Collectors.joining;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.adempiere.base.Core;
import org.adempiere.util.IProcessUI;
import org.compiere.model.MPInstance;
import org.compiere.model.MProcess;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.process.ProcessCall;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoLog;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogger;
import org.compiere.util.Trx;
import org.osgi.test.common.exceptions.Exceptions;

import au.org.greekwelfaresa.idempiere.test.common.env.IDempiereEnv;

public class ProcessController<P extends ProcessCall> {

	private Properties mCtx;
	private P mProcess;
	private Map<String, ProcessInfoParameter> mParameters = new HashMap<>();
	private String mTrxName;
	private int mTableID = 0;
	private int mRecordID = 0;
	private Trx mTrx;
	private MProcess mProcessPO;
	private IProcessUI mProcessUI;
	private String mName;
	private CLogger mLog;
	private ProcessInfo mProcessInfo;
	private IDempiereEnv mEnv;

	private static <X extends ProcessCall> X instantiate(Class<X> type) {
		try {
			Constructor<X> c = type.getConstructor();
			return c.newInstance();
		} catch (InvocationTargetException e) {
			throw Exceptions.duck(e.getCause());
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
	}

	@SuppressWarnings("unchecked")
	public ProcessController(String processType, IDempiereEnv env) {
		P p = (P) Core.getProcess(processType);

		if (p == null) {
			throw new IllegalStateException("Couldn't instantiate process type '" + processType + "'");
		}
		initialise(p, env);
	}

	public ProcessController(Class<P> processType, IDempiereEnv env) {
		this(instantiate(processType), env);
	}

	public ProcessController(P process, IDempiereEnv env) {
		initialise(process, env);
	}

	private void initialise(P process, IDempiereEnv env) {
		if (process.getClass().getName().endsWith("ProcessCallWrapper")) {
			mProcess = getField(process, "process");
		} else {
			mProcess = process;
		}
		mCtx = env.getCtx();
		mTrxName = env.get_TrxName();
		mTrx = env.getTrx();
		mName = null;
		mLog = injectMockLog(mProcess);
		mEnv = env;
	}

	public P getProcess() {
		return mProcess;
	}

	public CLogger getLog() {
		return mLog;
	}

	public List<ProcessInfoLog> getBufferedPILog() {
		return getField(mProcess, "listEntryLog");
	}

	public ProcessController<P> withCtx(Properties ctx) {
		mCtx = ctx;
		return this;
	}

	public ProcessController<P> withName(String name) {
		mName = name;
		return this;
	}

	public ProcessController<P> withProcessUI(IProcessUI processUI) {
		mProcessUI = processUI;
		return this;
	}

	public ProcessController<P> withProcessPO(MProcess processPO) {
		mProcessPO = processPO;
		return this;
	}

	public ProcessController<P> withParameter(String name, Object parameter) {
		mParameters.put(name, new ProcessInfoParameter(name, parameter, null, null, null));
		return this;
	}

	public ProcessController<P> withParameter(String name, Object parameter, Object parameter_To) {
		mParameters.put(name, new ProcessInfoParameter(name, parameter, parameter_To, null, null));
		return this;
	}

	public ProcessController<P> withParameter(String name, Object parameter, Object parameter_To, String info) {
		mParameters.put(name, new ProcessInfoParameter(name, parameter, parameter_To, info, null));
		return this;
	}

	public ProcessController<P> withParameter(String name, Object parameter, Object parameter_To, String info,
			String info_To) {
		mParameters.put(name, new ProcessInfoParameter(name, parameter, parameter_To, info, info_To));
		return this;
	}

	public ProcessController<P> withParameter(ProcessInfoParameter param) {
		mParameters.put(param.getParameterName(), param);
		return this;
	}

	public ProcessController<P> withParameters(ProcessInfoParameter... parameters) {
		Stream.of(parameters).forEach(this::withParameter);
		return this;
	}

	public ProcessInfo getProcessInfo() {
		return mProcessInfo;
	}

	private void setupProcessInfo() {
		if (mProcessPO == null) {
			mProcessPO = new MProcess(mCtx, 0, null);
			mProcessPO.setName(mName == null ? mEnv.getStepMsgName() : mName);
			mProcessPO.setAD_Org_ID(mEnv.getOrg().get_ID());
			// MProcess.afterSave() will attempt to create process access records for
			// all the "automatic" roles. This includes the System user which is
			// in a different AD_Client to what we are running in. Signal that
			// this is safe.
			PO.setCrossTenantSafe();
			mProcessPO.saveEx();
			PO.clearCrossTenantSafe();
			mEnv.registerPO(mProcessPO);
		}
		final String name = mProcessPO.getName();

		// Create a process info instance. This is a composite class containing the
		// parameters.
		mProcessInfo = new ProcessInfo(name, 0, mTableID, mRecordID);
		ProcessInfoParameter[] parameters = mParameters.values().stream().toArray(ProcessInfoParameter[]::new);
		mProcessInfo.setParameter(parameters);

		if (mProcessPO != null) {
			// Create process instance (mainly for logging/sync purpose)
			MPInstance mpi = new MPInstance(mCtx, 0, mTrxName);
			// Bypass role check
			mpi.set_ValueNoCheck(MPInstance.COLUMNNAME_AD_Process_ID, mProcessPO.get_ID());
			// mpi.setAD_Process_ID(mProcessPO.get_ID());
			mpi.setRecord_ID(mRecordID);
			mpi.saveEx();
			mEnv.registerPO(mpi);
			mProcessInfo.setAD_PInstance_ID(mpi.get_ID());
		}
		mProcess.setProcessUI(mProcessUI);
	}

	public boolean start() {
		setupProcessInfo();
		return mProcess.startProcess(mCtx, mProcessInfo, mTrx);
	}

	/**
	 * Calls prepareIt() on the underlying process directly.
	 * 
	 * @return
	 */
	public void prepare() {
		setupProcessInfo();
		setField(mProcess, "m_ctx", mCtx);
		setField(mProcess, "m_pi", mProcessInfo);
		setField(mProcess, "m_trx", mTrx);
		setField(mProcess, "listEntryLog", null);
		invoke(mProcess, "prepare");
	}

	/**
	 * Calls doIt() on the underlying process directly.
	 * 
	 * @return
	 */
	public String doIt() {
		setupProcessInfo();
		setField(mProcess, "m_ctx", mCtx);
		setField(mProcess, "m_pi", mProcessInfo);
		setField(mProcess, "m_trx", mTrx);
		setField(mProcess, "listEntryLog", null);
		return invoke(mProcess, "doIt");
	}

	public ProcessController<P> withTableID(int tableID) {
		mTableID = tableID;
		return this;
	}

	public ProcessController<P> withPO(PO record) {
		if (record == null) {
			mTableID = mRecordID = 0;
		} else {
			mTableID = record.get_Table_ID();
			mRecordID = record.get_ID();
		}
		return this;
	}

	public ProcessController<P> withRecordIDs(int... ids) {
		return withRecordIDs(IntStream.of(ids));
	}

	public ProcessController<P> withRecordIDs(IntStream ids) {
		return withParameter("*RecordIDs*", "[" + ids.mapToObj(String::valueOf).collect(joining(", ")) + "]");
	}

	public ProcessController<P> withRecordIDs(Stream<Integer> ids) {
		return withRecordIDs(ids.mapToInt(Integer::valueOf));
	}

	public ProcessController<P> withRecordIDs(Collection<Integer> ids) {
		return withRecordIDs(ids.stream());
	}

	public ProcessController<P> withRecords(PO... pos) {
		return withRecords(Stream.of(pos));
	}

	public ProcessController<P> withRecords(Stream<? extends PO> pos) {
		return withRecordIDs(pos.map(po -> {
			final int tableID = po.get_Table_ID();
			if (mTableID > 0) {
				if (tableID != mTableID) {
					throw new IllegalArgumentException("Mixed PO types: " + MTable.get(tableID).getTableName() + " and "
							+ MTable.get(mTableID).getTableName());
				}
			} else {
				mTableID = tableID;
			}
			mTableID = po.get_Table_ID();
			return po;
		}).mapToInt(PO::get_ID));
	}

	public ProcessController<P> withRecords(Collection<? extends PO> pos) {
		return withRecords(pos.stream());
	}
}
