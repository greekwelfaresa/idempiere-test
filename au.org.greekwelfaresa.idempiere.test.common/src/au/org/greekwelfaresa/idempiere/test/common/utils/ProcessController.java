package au.org.greekwelfaresa.idempiere.test.common.utils;

import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.getField;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.injectMockLog;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.invoke;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.setField;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Stream;

import org.adempiere.base.Core;
import org.compiere.model.MPInstance;
import org.compiere.model.MProcess;
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
	private String mName;
	private CLogger mLog;
	private ProcessInfo mProcessInfo;
	
	private static <X extends ProcessCall> X instantiate(Class<X> type)  {
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
		this((P)Core.getProcess(processType), env);
	}
	
	public ProcessController(Class<P> processType, IDempiereEnv env) {
		this(instantiate(processType), env);
	}
	
	public ProcessController(P process, IDempiereEnv env) {
		mProcess = process;
		mCtx = env.getCtx();
		mTrxName = env.get_TrxName();
		mTrx = env.getTrx();
		mName = null;
		mLog = injectMockLog(process);
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
	
	public ProcessController<P> withParameter(String name, Object parameter, Object parameter_To, String info, String info_To) {
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
		final String name = mName != null ? mName : 
			mProcessPO != null ? mProcessPO.getName() : "";
			
		
		// Create a process info instance. This is a composite class containing the parameters.
		mProcessInfo = new ProcessInfo(name, 0, mTableID, mRecordID);
		ProcessInfoParameter[] parameters = mParameters.values().stream().toArray(ProcessInfoParameter[]::new);
		mProcessInfo.setParameter(parameters);

		if (mProcessPO != null) {
			// Create process instance (mainly for logging/sync purpose)
			MPInstance mpi = new MPInstance(mCtx, 0, mTrxName);
			mpi.setAD_Process_ID(mProcessPO.get_ID()); 
			mpi.setRecord_ID(0);
			mpi.saveEx();
			mProcessInfo.setAD_PInstance_ID(mpi.get_ID());
		}
	}
	
	public boolean start() {
		setupProcessInfo();
		return mProcess.startProcess(mCtx, mProcessInfo, mTrx);
	}
	
	/**
	 * Calls prepareIt() on the underlying process directly.
	 * @return
	 */
	public void prepare() {
		setupProcessInfo();
		setField(mProcess, "m_ctx", mCtx);
		setField(mProcess, "m_pi", mProcessInfo);
		setField(mProcess, "m_trx", mTrx);
		invoke(mProcess, "prepare");
	}

	/**
	 * Calls doIt() on the underlying process directly.
	 * @return
	 */
	public String doIt() {
		setupProcessInfo();
		setField(mProcess, "m_ctx", mCtx);
		setField(mProcess, "m_pi", mProcessInfo);
		setField(mProcess, "m_trx", mTrx);
		return invoke(mProcess, "doIt");
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
}
