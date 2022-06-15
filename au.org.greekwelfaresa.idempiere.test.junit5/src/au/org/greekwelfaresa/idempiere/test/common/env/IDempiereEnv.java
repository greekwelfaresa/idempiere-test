package au.org.greekwelfaresa.idempiere.test.common.env;

import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.BD_ONE;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.BD_ZERO;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.waitForAdempiereStart;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_CHANGE;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_DELETE;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_NEW;
import static org.osgi.service.event.EventConstants.EVENT_TOPIC;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.injectMockLog;
import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.timestamp;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Dictionary;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.regex.Pattern;

import org.adempiere.base.Core;
import org.adempiere.base.event.IEventTopics;
import org.assertj.core.api.SoftAssertionsProvider;
import org.compiere.Adempiere;
import org.compiere.model.MAcctSchema;
import org.compiere.model.MActivity;
import org.compiere.model.MAttachment;
import org.compiere.model.MAttribute;
import org.compiere.model.MAttributeInstance;
import org.compiere.model.MAttributeSet;
import org.compiere.model.MAttributeSetInstance;
import org.compiere.model.MAttributeUse;
import org.compiere.model.MBPBankAccount;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.compiere.model.MBank;
import org.compiere.model.MBankAccount;
import org.compiere.model.MBankStatement;
import org.compiere.model.MBankStatementLine;
import org.compiere.model.MCalendar;
import org.compiere.model.MCampaign;
import org.compiere.model.MClient;
import org.compiere.model.MClientInfo;
import org.compiere.model.MCountry;
import org.compiere.model.MCurrency;
import org.compiere.model.MDepositBatch;
import org.compiere.model.MDepositBatchLine;
import org.compiere.model.MDiscountSchema;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MLocation;
import org.compiere.model.MLocator;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MOrg;
import org.compiere.model.MOrgInfo;
import org.compiere.model.MPInstance;
import org.compiere.model.MPaySelection;
import org.compiere.model.MPaySelectionCheck;
import org.compiere.model.MPaySelectionLine;
import org.compiere.model.MPayment;
import org.compiere.model.MPeriodControl;
import org.compiere.model.MPriceList;
import org.compiere.model.MPriceListVersion;
import org.compiere.model.MProcess;
import org.compiere.model.MProduct;
import org.compiere.model.MProductBOM;
import org.compiere.model.MProductCategory;
import org.compiere.model.MProductPrice;
import org.compiere.model.MProject;
import org.compiere.model.MRegion;
import org.compiere.model.MResource;
import org.compiere.model.MResourceAssignment;
import org.compiere.model.MResourceType;
import org.compiere.model.MTaxCategory;
import org.compiere.model.MUOM;
import org.compiere.model.MUser;
import org.compiere.model.MWarehouse;
import org.compiere.model.MYear;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.model.X_AD_Org;
import org.compiere.model.X_AD_Process;
import org.compiere.model.X_AD_User;
import org.compiere.model.X_C_AcctSchema;
import org.compiere.model.X_C_BankAccount;
import org.compiere.model.X_C_BankAccountDoc;
import org.compiere.model.X_C_Calendar;
import org.compiere.model.X_C_DocType;
import org.compiere.model.X_C_Order;
import org.compiere.model.X_C_PeriodControl;
import org.compiere.model.X_C_Year;
import org.compiere.model.X_M_DiscountSchema;
import org.compiere.model.X_M_InOut;
import org.compiere.model.X_M_Product;
import org.compiere.model.X_M_Warehouse;
import org.compiere.process.ProcessCall;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Language;
import org.compiere.util.Msg;
import org.compiere.util.TimeUtil;
import org.compiere.util.Trx;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.osgi.test.common.dictionary.Dictionaries;
import org.osgi.test.common.exceptions.Exceptions;

import au.org.greekwelfaresa.idempiere.test.common.annotation.InjectIDempiereEnv;
import au.org.greekwelfaresa.idempiere.test.process.ProcessController;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;

public class IDempiereEnv implements AutoCloseable {

	protected SoftAssertionsProvider softly;

	static public Builder newEnv() {
		return new Builder();
	}

	private String mClassName;
	private String mMethodName;
	private String mTrxName;
	private Trx mTrx;
	private boolean mAutoRollback;
	private boolean ourTrx;
	private Properties mCtx;
	private int mClientId;
	private int mOrgId;
	private int mUserId;
	private int mRoleId;
	private int mWarehouseId;
	private List<PO> mPOs = new ArrayList<>();
	private IDempiereEnv mParentEnv;
	private Savepoint mSavePoint;

	// Start ChuBoePopulateVO fields
	private MClient m_client = null;
	private MOrg m_org = null;
	private MUser m_user = null;
	private MWarehouse m_warehouse = null;
	private Timestamp m_date = null;
	private Timestamp m_dateInitial = null;
	private Timestamp m_datePriceList = null;
	private String m_scenarioName = null;
	private boolean m_isIncludeRandom = true;
	private MBPartner m_bp = null;
	private MBPartnerLocation m_bpLoc = null;
	private MBPBankAccount m_bpBankAcct = null;
	private MCountry m_country = null;
	private MRegion m_region = null;
	private String m_city = null;
	private MCurrency m_currency = null;
	private MUser m_contact = null;
	private MPriceList m_priceListSO = null;
	private MPriceList m_priceListPO = null;
	private MProduct m_product = null;
	private MAttributeSet m_attributeSet = null;
	private MAttributeSetInstance m_attributeSetInstance = null;
	private BigDecimal m_limitPriceSO = null;
	private BigDecimal m_stdPriceSO = null;
	private BigDecimal m_listPriceSO = null;
	private BigDecimal m_limitPricePO = null;
	private BigDecimal m_stdPricePO = null;
	private BigDecimal m_listPricePO = null;
	private BigDecimal m_qty = null;
	private BigDecimal m_trxAmount = null;
	private MDocType m_docType = null;
	private String m_docAction = null;
	private String m_paymentRule = null;
	private MOrder m_order = null;
	private MOrderLine m_orderLine = null;
	private MProject m_project = null;
	private MActivity m_activity = null;
	private MCampaign m_campaign = null;
	private MInOut m_inOut = null;
	private MInOutLine m_inOutLine = null;
	private MInvoice m_invoice = null;
	private MInvoiceLine m_invoiceLine = null;
	private MPayment m_payment = null;
	private MPaySelection m_paySelection = null;
	private MPaySelectionLine m_paySelectionLine = null;
	private MPaySelectionCheck m_paySelectionCheck = null;
	private MLocation m_loc = null;
	private MBank m_bank = null;
	private MBankAccount m_bankAcct = null;
	private X_C_BankAccountDoc m_bankAcctDoc = null;
	private MBankStatement m_statement = null;
	private MBankStatementLine m_statementLine = null;
	private MDepositBatch m_depositBatch = null;
	private MDepositBatchLine m_depositBatchLine = null;
	private MResourceAssignment m_resourceAssignment = null;
	private MResourceType m_resourceType = null;
	private MResource m_resource = null;
	private int m_random = 0;
	private boolean m_isError = false;
	private String m_errorMsg = null;
	private Random m_rand = null;
	private int m_ue1 = 0;
	private int m_ue2 = 0;
	
	private String m_process_UU = null;
	private List<ProcessInfoParameter> m_processInfoParams = new ArrayList<ProcessInfoParameter>();
	private int m_processTable_ID = 0;
	private int m_processRecord_ID = 0;

	private Supplier<String> m_accountNoSource;
	private Supplier<String> m_routingNoSource;

	protected CLogger m_log = CLogger.getCLogger(getClass());
	// End ChuBoePopulateVO fields

	public static class Builder {
		int clientId;
		int orgId;
		int userId;
		int roleId;
		int warehouseId;
		Timestamp date;
		boolean autoRollback;
		IDempiereEnv parent;
		SoftAssertionsProvider softly;
		String className;
		String methodName;

		public Builder() {
			clientId = 11;
			orgId = 11;
			userId = 100;
			roleId = 102;
			warehouseId = 103;
			autoRollback = true;
			date = new Timestamp(System.currentTimeMillis());
			parent = null;
			softly = null;
			className = null;
			methodName = null;
		}

		public IDempiereEnv build() {
			return new IDempiereEnv(clientId, orgId, userId, roleId, warehouseId, date, autoRollback, parent, softly,
					className, methodName);
		}

		public Builder withClientId(int clientId) {
			this.clientId = clientId;
			return this;
		}

		public Builder withOrgId(int orgId) {
			this.orgId = orgId;
			return this;
		}

		public Builder withUserId(int userId) {
			this.userId = userId;
			return this;
		}

		public Builder withRoleId(int roleId) {
			this.roleId = roleId;
			return this;
		}

		public Builder withWarehouseId(int warehouseId) {
			this.warehouseId = warehouseId;
			return this;
		}

		public Builder withTimestamp(Timestamp date) {
			this.date = date;
			return this;
		}

		public Builder withSoftAssertions(SoftAssertionsProvider provider) {
			this.softly = provider;
			return this;
		}

		public Builder withParent(IDempiereEnv parent) {
			this.parent = parent;
			return this;
		}

		public Builder withParameters(InjectIDempiereEnv parameters) {
			this.clientId = parameters.clientId();
			this.orgId = parameters.orgId();
			this.userId = parameters.userId();
			this.warehouseId = parameters.warehouseId();
			this.roleId = parameters.roleId();
			this.autoRollback = parameters.autoRollback();
//			System.err.println("About to set the timestamp: " + parameters.timestamp());
			if (parameters.timestamp() != null && !"".equals(parameters.timestamp())) {
//				System.err.println("Setting the timestamp: ");
				this.date = timestamp(parameters.timestamp());
//				System.err.println("Sett the timestamp to: " + date);
			}
			return this;
		}

		public Builder withClassName(String className) {
			this.className = className;
			return this;
		}

		public Builder withMethodName(String methodName) {
			this.methodName = methodName;
			return this;
		}
	}

	public static Builder create() {
		return new Builder();
	}

	protected IDempiereEnv(int clientId, int orgId, int userId, int roleId, int warehouseId, Timestamp date,
			boolean autoRollback, IDempiereEnv parent, SoftAssertionsProvider softly, String className,
			String methodName) {
		Adempiere.startup(false);
		mClientId = clientId;
		mOrgId = orgId;
		mUserId = userId;
		mRoleId = roleId;
		mWarehouseId = warehouseId;
		mAutoRollback = autoRollback;
		mParentEnv = parent;
		mClassName = className;
		mMethodName = methodName;
		this.softly = softly;
		m_date = TimeUtil.trunc(date, TimeUtil.TRUNC_DAY);

		mCtx = Env.getCtx();
//		System.err.println("clientId is actually: " + mClientId);
//		System.err.println("orgId is actually: " + mOrgId);
//		Thread.dumpStack();
		mCtx.setProperty(Env.AD_CLIENT_ID, String.valueOf(mClientId));
		mCtx.setProperty(Env.AD_ORG_ID, String.valueOf(mOrgId));
		mCtx.setProperty(Env.AD_USER_ID, String.valueOf(mUserId));
		mCtx.setProperty(Env.AD_ROLE_ID, String.valueOf(mRoleId));
		mCtx.setProperty(Env.M_WAREHOUSE_ID, String.valueOf(mWarehouseId));
		waitForAdempiereStart();

	}

	// Saves the given pos in the context of the current transaction.
	public void save(PO... pos) {
		for (PO po : pos) {
			po.saveEx(get_TrxName());
		}
	}

	// Loads the given pos in the context of the current transaction.
	public void reload(PO... pos) {
		for (PO po : pos) {
			po.load(get_TrxName());
		}
	}

	// Register a PO that should be cleaned up at the end of the test or reloaded on
	// demand.
	public void registerPO(PO po) {
		mPOs.add(po);
	}

	public boolean isAutoRollback() {
		return mAutoRollback;
	}

	public IDempiereEnv getParentEnv() {
		return mParentEnv;
	}

	private List<WeakReference<AutoCloseable>> toBeClosed = new ArrayList<>();

	public <T extends PO> Query query(Class<T> clazz, String where, Object... parameters) {
		try {
			String tableName = (String) clazz.getField("Table_Name").get(null);
			return new Query(getCtx(), tableName, where, get_TrxName()).setParameters(parameters);
		} catch (Exception e) {
			throw new IllegalArgumentException("Error running query: " + e.getMessage(), e);
		}
	}

	@SuppressWarnings("unchecked")
	public <T extends PO> T queryFirst(Class<T> clazz) {
		return (T) query(clazz, "1=1").first();
	}

	@SuppressWarnings("unchecked")
	public <T extends PO> T queryFirst(Class<T> clazz, String where, Object... parameters) {
		return (T) query(clazz, where, parameters).first();
	}

	public <T extends PO> int queryFirstID(Class<T> clazz, String where, Object... parameters) {
		return query(clazz, where, parameters).firstId();
	}

	@SuppressWarnings("unchecked")
	public <T extends PO> T queryFirstOnly(Class<T> clazz, String where, Object... parameters) {
		return (T) query(clazz, where, parameters).firstOnly();
	}

	public ResultSet runQuery(String sql, Object... params) throws SQLException {
		PreparedStatement st = DB.prepareStatement(sql, get_TrxName());
		toBeClosed.add(new WeakReference<>(st));
		if (params != null && params.length > 0) {
			DB.setParameters(st, params);
		}

		ResultSet rs = st.executeQuery();
		toBeClosed.add(new WeakReference<>(rs));
		return rs;
	}

	public int rowCount(String tableName) {
		return DB.getSQLValue(get_TrxName(), "select count(*) from " + tableName);
	}

	/**
	 * Reloads the POs from the database in the current transaction.
	 * 
	 * Useful if a test updates any of the values in your test POs that you created
	 * at the beginning of the transaction and you want to undo that to continue
	 * your test.
	 */
	public void reloadPOs() {
		for (PO po : mPOs) {
			po.load(get_TrxName());
		}
		if (mParentEnv != null) {
			mParentEnv.reloadPOs();
		}
	}

	/**
	 * Retrieve the attachment for the given PO from within the current transaction.
	 * 
	 * {@link PO#getAttachment()} does not reference the current transaction of the
	 * PO and so attachments created in an uncommitted SQL tx won't be visible. Use
	 * this method instead to retrieve them.
	 * 
	 * @param po The PO whose attachment is being retrieved.
	 * @return The attachment for the given PO (if any).
	 */
	public MAttachment getAttachmentFor(PO po) {
		return MAttachment.get(mCtx, po.get_Table_ID(), po.get_ID(), mTrxName);
	}

	public int getC_Calendar_ID() {
		MOrgInfo info = m_org.getInfo();
		int C_Calendar_ID = info.getC_Calendar_ID();

		if (C_Calendar_ID == 0) {
			MClientInfo cInfo = m_client.getInfo();
			C_Calendar_ID = cInfo.getC_Calendar_ID();
		}
		return C_Calendar_ID;
	}

	public MCalendar getCalendar() {
		return new MCalendar(mCtx, getC_Calendar_ID(), mTrxName);
	}

	public void openPeriod(Timestamp date) {
		GregorianCalendar cal = new GregorianCalendar(Language.getLoginLanguage().getLocale());
		cal.setTime(date);
		String thisYear = String.valueOf(cal.get(Calendar.YEAR));

		MYear year = new Query(getCtx(), MYear.Table_Name,
				MYear.COLUMNNAME_FiscalYear + "=? AND " + MYear.COLUMNNAME_C_Calendar_ID + "=?", mTrxName)
						.setClient_ID().setParameters(thisYear, getC_Calendar_ID()).first();

		if (year == null) {
			year = new MYear(getCalendar());
			year.saveEx();
			year.createStdPeriods(null);
		}
	}

	static final Pattern CAMEL = Pattern.compile("(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])");

	String createShortTrxName() {
		String[] classBits = mClassName.split("[.]");

		StringBuilder sb = new StringBuilder(60);
		for (int i = 0; i < classBits.length - 1; i++) {
			sb.append(classBits[i].charAt(0)).append('.');
		}
		String clazz = classBits[classBits.length - 1];
		if (mMethodName == null) {
			sb.append(clazz);
		} else {
			CAMEL.splitAsStream(clazz).forEach(x -> sb.append(x.charAt(0)));
			sb.append('.');
			sb.append(mMethodName);
		}
		return createShortTrxName(sb.toString());
	}

	static String createShortTrxName(String base) {
		return (base.length() > 54 ? base.substring(0, 54) : base) + "_" + UUID.randomUUID().toString().substring(0, 8);
	}

	public void before() throws Exception {
		if (mParentEnv == null) {
			mTrxName = createShortTrxName();
			mTrx = Trx.get(mTrxName, true);
			ourTrx = true;
		} else {
			mTrxName = mParentEnv.mTrxName;
			mTrx = mParentEnv.mTrx;
			mSavePoint = mTrx.setSavepoint(createShortTrxName(mMethodName));
			mParentEnv.reloadPOs();
			ourTrx = false;
		}

		// From ChuBoePopulateVO
		m_client = new MClient(mCtx, mClientId, mTrxName);
		m_org = new MOrg(mCtx, mOrgId, mTrxName);
		if (m_org.get_ID() == 0)
			changeOrg();
//		m_user = new MUser(getCtx(), mUserId, mTrxName);
		m_user = getUser();
		// warehouse could have been set during changeOrg();
		if (m_warehouse == null)
			m_warehouse = new MWarehouse(getCtx(), mWarehouseId, mTrxName);
		// user could have forgotten to choose a warehouse during login
		if (m_warehouse == null)
			m_warehouse = changeWarehouse();
		m_dateInitial = m_date;
		// openPeriod(m_dateInitial);
		setCurrency(new MCurrency(getCtx(), 100, mTrxName)); // default to USD
		setCountry(new MCountry(getCtx(), 100, mTrxName)); // default to US
		setRegion(new MRegion(getCtx(), 132, mTrxName)); // default to TX
		setCity("Austin"); // default to Austin
		setIsIncludeRandom(m_isIncludeRandom);
		if (m_isIncludeRandom)
			setRandom();
		setScenarioName(m_scenarioName);
		setDocAction(X_C_Order.DOCACTION_Complete);
		setQty(BD_ONE);
		setPricePO(BD_ONE);
		setPriceSO(BD_ONE);

		setAccountNoSource(() -> String.format("%08d", randInt(0, 99999999)));
		setRoutingNoSource(() -> String.format("%06d", randInt(0, 999999)));
	}

	ServiceRegistration<EventHandler> reg;

	List<PORecorder> recorders = new ArrayList<>(); 
	
	public PORecorder startRecorder() {
		PORecorder recorder = new PORecorder(mTrxName);
		recorders.add(recorder);
		return recorder;
	}

	@Override
	public void close() throws Exception {
		recorders.forEach(PORecorder::close);
		recorders.clear();
//		System.err.println("Closing environment: " + this + ", " + mAutoRollback);
		logMap.clear();
		for (WeakReference<AutoCloseable> c : toBeClosed) {
			try {
				c.get().close();
			} catch (Exception e) {
			}
		}
		if (mAutoRollback) {
//			System.err.println(" ====> className: " + mClassName + ", " + mMethodName);
			if (mSavePoint != null) {
//				System.err.println("   rolling back save point: " + mSavePoint.getSavepointName());
				mTrx.rollback(mSavePoint);
				mSavePoint = null;
			} else {
//				System.err.println("  rolling back whole transaction");
				mTrx.rollback(true);
				if (ourTrx) {
					try {
//						System.err.println("   Closing rolled-back transaction: " + mTrx.getTrxName());
						mTrx.close();
					} catch (Exception e) {
					}
				}
			}

			Collections.reverse(mPOs);
			for (PO po : mPOs) {
//				System.err.println("deleting PO: " + po + ", new? " + po.is_new() + ", trx: " + po.get_TrxName() + ", " + mTrx.getTrxName() + ", m: " + mTrxName);
				if (!po.is_new() && !mTrx.getTrxName().equals(po.get_TrxName())) {
//					System.err.println("===>actually deleting: " + po + ", " + mTrx.getTrxName());
					try {
						po.deleteEx(true);
					} catch (Exception e) {
						System.err.println("Error trying to delete: " + po + ", error: " + e);
						e.printStackTrace();
					}
				}
			}
		} else {
			mTrx.commit();
			if (ourTrx) {
				try {
					System.err.println("Closing committed transaction: " + mTrx.getTrxName());
					mTrx.close();
				} catch (Exception e) {
				}
			}
		}
	}

	public Properties getCtx() {
		return mCtx;
	}

	public Trx getTrx() {
		return mTrx;
	}

	protected void setClassName(String className) {
		mClassName = className;
	}

	public String getClassName() {
		return mClassName;
	}

	protected void setName(String name) {
		mMethodName = name;
	}

	public String getName() {
		return mMethodName;
	}

	public String get_TrxName() {
		return mTrxName;
	}

	public MClient getClient() {
		return m_client == null ? (mParentEnv == null ? null : mParentEnv.getClient()) : m_client;
	}

	public void setClient(MClient m_client) {
		this.m_client = m_client;
	}

	public MOrg getOrg() {
		return m_org == null ? (mParentEnv == null ? null : mParentEnv.getOrg()) : m_org;
	}

	public void setOrg(MOrg m_org) {
		this.m_org = m_org;
	}

	public MUser getUser() {
		return m_user == null ? (mParentEnv == null ? new MUser(getCtx(), mUserId, null) : mParentEnv.getUser())
				: m_user;
	}

	public void setUser(MUser m_user) {
		this.m_user = m_user;
	}

	public MWarehouse getWarehouse() {
		return m_warehouse == null ? (mParentEnv == null ? null : mParentEnv.getWarehouse()) : m_warehouse;
	}

	public void setWarehouse(MWarehouse m_warehouse) {
		this.m_warehouse = m_warehouse;
	}

	public Timestamp getDate() {
		return m_date;
	}

	public void setDate(Timestamp m_date) {
		this.m_date = m_date;
	}

	public Timestamp getDateInitial() {
		return m_dateInitial;
	}

	public void setDateInitial(Timestamp m_date) {
		this.m_dateInitial = m_date;
	}

	public void setDateOffset(int days) {
		setDate(getDateOffset(getDate(), days));
	}

	public Timestamp getDatePriceList() {
		return m_datePriceList;
	}

	public void setDatePriceList(Timestamp datePriceList) {
		this.m_datePriceList = datePriceList;
	}

	public MBPartner getBP() {
		return m_bp == null ? (mParentEnv == null ? null : mParentEnv.getBP()) : m_bp;
	}

	public void setBP(MBPartner m_bp) {
		this.m_bp = m_bp;
	}

	public MBPBankAccount getBPBankAcct() {
		return m_bpBankAcct == null ? (mParentEnv == null ? null : mParentEnv.getBPBankAcct()) : m_bpBankAcct;
	}

	public void setBPBankAcct(MBPBankAccount m_bpBankAcct) {
		this.m_bpBankAcct = m_bpBankAcct;
	}

	public MBPartnerLocation getBPLoc() {
		return m_bpLoc == null ? (mParentEnv == null ? null : mParentEnv.getBPLoc()) : m_bpLoc;
	}

	public void setBPLoc(MBPartnerLocation m_bpLoc) {
		this.m_bpLoc = m_bpLoc;
	}

	public MProduct getProduct() {
		return m_product == null ? (mParentEnv == null ? null : mParentEnv.getProduct()) : m_product;
	}

	public void setProduct(MProduct m_product) {
		this.m_product = m_product;
	}

	public MAttributeSet getAttributeSet() {
		return m_attributeSet == null ? (mParentEnv == null ? null : mParentEnv.getAttributeSet()) : m_attributeSet;
	}

	public void setAttributeSet(MAttributeSet m_attributeSet) {
		this.m_attributeSet = m_attributeSet;
	}

	public MAttributeSetInstance getAttributeSetInstance() {
		return m_attributeSetInstance == null ? (mParentEnv == null ? null : mParentEnv.getAttributeSetInstance()) : m_attributeSetInstance;
	}

	public void setAttributeSetInstance(MAttributeSetInstance m_attributeSetInstance) {
		this.m_attributeSetInstance = m_attributeSetInstance;
	}

	public String getPaymentRule() {
		return m_paymentRule == null ? (mParentEnv == null ? null : mParentEnv.getPaymentRule()) : m_paymentRule;
	}

	public void setPaymentRule(String m_paymentRule) {
		this.m_paymentRule = m_paymentRule;
	}

	public MOrder getOrder() {
		return m_order == null ? (mParentEnv == null ? null : mParentEnv.getOrder()) : m_order;
	}

	public void setOrder(MOrder m_po) {
		this.m_order = m_po;
	}

	public MOrderLine getOrderLine() {
		return m_orderLine == null ? (mParentEnv == null ? null : mParentEnv.getOrderLine()) : m_orderLine;
	}

	public void setOrderLine(MOrderLine m_poLine) {
		this.m_orderLine = m_poLine;
	}

	public MProject getProject() {
		return m_project == null ? (mParentEnv == null ? null : mParentEnv.getProject()) : m_project;
	}

	public void setProject(MProject m_project) {
		this.m_project = m_project;
	}

	public MActivity getActivity() {
		return m_activity == null ? (mParentEnv == null ? null : mParentEnv.getActivity()) : m_activity;
	}

	public void setActivity(MActivity m_activity) {
		this.m_activity = m_activity;
	}

	public MCampaign getCampaign() {
		return m_campaign == null ? (mParentEnv == null ? null : mParentEnv.getCampaign()) : m_campaign;
	}

	public void setCampaign(MCampaign m_campaign) {
		this.m_campaign = m_campaign;
	}

	public int getUserElement1() {
		return m_ue1 == 0 ? (mParentEnv == null ? 0 : mParentEnv.getUserElement1()) : m_ue1;
	}

	public int setUserElement1() {
		setRandom();
		setUserElement1(getRandom());
		return getUserElement1();
	}

	public void setUserElement1(int ue1) {
		this.m_ue1 = ue1;
	}

	public int getUserElement2() {
		return m_ue2 == 0 ? (mParentEnv == null ? 0 : mParentEnv.getUserElement2()) : m_ue2;
	}

	public int setUserElement2() {
		setRandom();
		setUserElement2(getRandom());
		return getUserElement2();
	}

	public void setUserElement2(int ue2) {
		this.m_ue2 = ue2;
	}

	public MInOut getInOut() {
		return m_inOut == null ? (mParentEnv == null ? null : mParentEnv.getInOut()) : m_inOut;
	}

	public void setInOut(MInOut m_mr) {
		this.m_inOut = m_mr;
	}

	public MInOutLine getInOutLine() {
		return m_inOutLine == null ? (mParentEnv == null ? null : mParentEnv.getInOutLine()) : m_inOutLine;
	}

	public void setInOutLine(MInOutLine m_mrLine) {
		this.m_inOutLine = m_mrLine;
	}

	public MInvoice getInvoice() {
		return m_invoice == null ? (mParentEnv == null ? null : mParentEnv.getInvoice()) : m_invoice;
	}

	public void setInvoice(MInvoice m_vi) {
		this.m_invoice = m_vi;
	}

	public MInvoiceLine getInvoiceLine() {
		return m_invoiceLine == null ? (mParentEnv == null ? null : mParentEnv.getInvoiceLine()) : m_invoiceLine;
	}

	public void setInvoiceLine(MInvoiceLine m_viLine) {
		this.m_invoiceLine = m_viLine;
	}

	public MPayment getPayment() {
		return m_payment == null ? (mParentEnv == null ? null : mParentEnv.getPayment()) : m_payment;
	}

	public void setPayment(MPayment m_payment) {
		this.m_payment = m_payment;
	}

	public MPaySelection getPaySelection() {
		return m_paySelection == null ? (mParentEnv == null ? null : mParentEnv.getPaySelection()) : m_paySelection;
	}

	public void setPaySelection(MPaySelection m_paySelection) {
		this.m_paySelection = m_paySelection;
	}

	public MPaySelectionLine getPaySelectionLine() {
		return m_paySelectionLine == null ? (mParentEnv == null ? null : mParentEnv.getPaySelectionLine())
				: m_paySelectionLine;
	}

	public void setPaySelectionLine(MPaySelectionLine m_paySelectionLine) {
		this.m_paySelectionLine = m_paySelectionLine;
	}

	public MPaySelectionCheck getPaySelectionCheck() {
		return m_paySelectionCheck == null ? (mParentEnv == null ? null : mParentEnv.getPaySelectionCheck())
				: m_paySelectionCheck;
	}

	public void setPaySelectionCheck(MPaySelectionCheck m_paySelectionCheck) {
		this.m_paySelectionCheck = m_paySelectionCheck;
	}

	public MLocation getLocation() {
		return m_loc == null ? (mParentEnv == null ? null : mParentEnv.getLocation()) : m_loc;
	}

	public void setLocation(MLocation m_loc) {
		this.m_loc = m_loc;
	}

	public MBankStatement getStatement() {
		return m_statement == null ? (mParentEnv == null ? null : mParentEnv.getStatement()) : m_statement;
	}

	public void setStatement(MBankStatement m_statement) {
		this.m_statement = m_statement;
	}

	public MBankStatementLine getStatementLine() {
		return m_statementLine == null ? (mParentEnv == null ? null : mParentEnv.getStatementLine()) : m_statementLine;
	}

	public void setStatementLine(MBankStatementLine m_statementLine) {
		this.m_statementLine = m_statementLine;
	}

	public MDepositBatch getDepositBatch() {
		return m_depositBatch == null ? (mParentEnv == null ? null : mParentEnv.getDepositBatch()) : m_depositBatch;
	}

	public void setDepositBatch(MDepositBatch m_depositBatch) {
		this.m_depositBatch = m_depositBatch;
	}

	public MDepositBatchLine getDepositBatchLine() {
		return m_depositBatchLine == null ? (mParentEnv == null ? null : mParentEnv.getDepositBatchLine())
				: m_depositBatchLine;
	}

	public void setDepositBatchLine(MDepositBatchLine m_depositBatchLine) {
		this.m_depositBatchLine = m_depositBatchLine;
	}

	public MResourceAssignment getResourceAssignment() {
		return m_resourceAssignment == null ? (mParentEnv == null ? null : mParentEnv.getResourceAssignment())
				: m_resourceAssignment;
	}

	public void setResourceAssignment(MResourceAssignment m_resourceAssignment) {
		this.m_resourceAssignment = m_resourceAssignment;
	}

	public MResourceType getResourceType() {
		return m_resourceType == null ? (mParentEnv == null ? null : mParentEnv.getResourceType()) : m_resourceType;
	}

	public void setResourceType(MResourceType m_resourceType) {
		this.m_resourceType = m_resourceType;
	}

	public MResource getResource() {
		return m_resource == null ? (mParentEnv == null ? null : mParentEnv.getResource()) : m_resource;
	}

	public void setResource(MResource m_resource) {
		this.m_resource = m_resource;
	}

	public BigDecimal getQty() {
		return m_qty;
	}

	public void setQty(BigDecimal m_qty) {
		this.m_qty = m_qty;
	}

	public void setQty(int m_qty) {
		setQty(new BigDecimal(m_qty));
	}

	public void setPriceSO(BigDecimal m_price) {
		this.m_limitPriceSO = m_price;
		this.m_listPriceSO = m_price;
		this.m_stdPriceSO = m_price;
	}

	public BigDecimal getLimitPriceSO() {
		return m_limitPriceSO;
	}

	public void setLimitPriceSO(BigDecimal m_limitPrice) {
		this.m_limitPriceSO = m_limitPrice;
	}

	public BigDecimal getStdPriceSO() {
		return m_stdPriceSO;
	}

	public void setStdPriceSO(BigDecimal m_stdPrice) {
		this.m_stdPriceSO = m_stdPrice;
	}

	public BigDecimal getListPriceSO() {
		return m_listPriceSO;
	}

	public void setListPriceSO(BigDecimal m_listPrice) {
		this.m_listPriceSO = m_listPrice;
	}

	public void setPricePO(BigDecimal m_price) {
		this.m_limitPricePO = m_price;
		this.m_listPricePO = m_price;
		this.m_stdPricePO = m_price;
	}

	public BigDecimal getLimitPricePO() {
		return m_limitPricePO;
	}

	public void setLimitPricePO(BigDecimal m_limitPrice) {
		this.m_limitPricePO = m_limitPrice;
	}

	public BigDecimal getStdPricePO() {
		return m_stdPricePO;
	}

	public void setStdPricePO(BigDecimal m_stdPrice) {
		this.m_stdPricePO = m_stdPrice;
	}

	public BigDecimal getListPricePO() {
		return m_listPricePO;
	}

	public void setListPricePO(BigDecimal m_listPrice) {
		this.m_listPricePO = m_listPrice;
	}

	public BigDecimal getTrxAmount() {
		return m_trxAmount == null ? (mParentEnv == null ? null : mParentEnv.getTrxAmount()) : m_trxAmount;
	}

	public void setTrxAmount(BigDecimal m_trxAmount) {
		this.m_trxAmount = m_trxAmount;
	}

	public void setAccountNoSource(Supplier<String> source) {
		m_accountNoSource = source;
	}

	public void setRoutingNoSource(Supplier<String> source) {
		m_routingNoSource = source;
	}

	public String getScenarioName() {
		if (isIncludeRandom()) {
			return m_scenarioName + "_" + getRandom();
		} else
			return m_scenarioName;
	}

	public void setScenarioName(String m_scenarioName) {
		this.m_scenarioName = m_scenarioName;
	}

	public int getRandom() {
		return m_random;
	}

	public void setRandom() {
		this.m_random = randInt(100, 100000000);
	}

	public int randInt(int min, int max) {

		if (m_rand == null)
			m_rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = m_rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	public boolean isError() {
		return m_isError;
	}

	public void setIsError(boolean m_isError) {
		this.m_isError = m_isError;
	}

	public String getErrorMsg() {
		return m_errorMsg;
	}

	public void setErrorMsg(String m_errorMsg) {
		this.m_errorMsg = m_errorMsg;
		setIsError(true);
	}

	public void appendErrorMsg(String m_errorMsg) {
		if (getErrorMsg() != null)
			this.m_errorMsg = this.m_errorMsg + " + " + m_errorMsg;
		else
			this.m_errorMsg = m_errorMsg;
		setIsError(true);
	}

	public void validate() {
		if (mCtx == null) {
			appendErrorMsg("No Context");
		}
		if (mTrxName == null) {
			appendErrorMsg("No Transaction Name");
		}
		if (m_client == null) {
			appendErrorMsg("No Client");
		}
		if (m_org == null) {
			appendErrorMsg("No Org");
		}
		if (m_user == null) {
			appendErrorMsg("No User");
		}
		if (m_warehouse == null) {
			appendErrorMsg("No Warehouse");
		}
		if (m_date == null) {
			appendErrorMsg("No Date");
		}
		if (m_currency == null) {
			appendErrorMsg("No Currency");
		}
		if (m_region == null) {
			appendErrorMsg("No Region");
		}
		if (m_city == null) {
			appendErrorMsg("No City");
		}
		if (m_org == null || m_org.get_ID() == 0)
			appendErrorMsg("Cannot Use null or * Org");

		if (isError()) {
			throw new IllegalStateException(getErrorMsg());
		}
	}

	public boolean isIncludeRandom() {
		return m_isIncludeRandom;
	}

	public void setIsIncludeRandom(boolean m_isIncludeRandom) {
		this.m_isIncludeRandom = m_isIncludeRandom;
	}

	public MUser getContact() {
		return m_contact;
	}

	public void setContact(MUser m_contact) {
		this.m_contact = m_contact;
	}

	public MCurrency getCurrency() {
		return m_currency;
	}

	public void setCurrency(MCurrency m_currency) {
		this.m_currency = m_currency;
	}

	public MCountry getCountry() {
		return m_country;
	}

	public void setCountry(MCountry m_country) {
		this.m_country = m_country;
	}

	public MRegion getRegion() {
		return m_region;
	}

	public void setRegion(MRegion m_region) {
		this.m_region = m_region;
	}

	public String getCity() {
		return m_city;
	}

	public void setCity(String m_city) {
		this.m_city = m_city;
	}

	public MDocType getDocType() {
		return m_docType == null ? (mParentEnv == null ? null : mParentEnv.getDocType()) : m_docType;
	}

	public void setDocType(MDocType m_docType) {
		this.m_docType = m_docType;
	}

	public void setDocBaseType(String m_docBaseType, String m_docSubTypeSO, boolean issotrx, boolean isshipconfirm,
			boolean ispickqaconfirm) {
		setDocType(getDocType(m_docBaseType, m_docSubTypeSO, issotrx, isshipconfirm, ispickqaconfirm));
	}

	public String getDocAction() {
		return m_docAction;
	}

	public void setDocAction(String m_docAction) {
		this.m_docAction = m_docAction;
	}

	public MPriceList getPriceListSO() {
		return m_priceListSO == null ? (mParentEnv == null ? null : mParentEnv.getPriceListSO()) : m_priceListSO;
	}

	public void setPriceListSO(MPriceList m_priceListSO) {
		this.m_priceListSO = m_priceListSO;
	}

	public MPriceList getPriceListPO() {
		return m_priceListPO == null ? (mParentEnv == null ? null : mParentEnv.getPriceListPO()) : m_priceListPO;
	}

	public void setPriceListPO(MPriceList m_priceListPO) {
		this.m_priceListPO = m_priceListPO;
	}

	public <P extends ProcessCall> ProcessController<P> processOf(String processType) {
		try {
			return new ProcessController<>(processType, this);
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
	}

	public <P extends ProcessCall> ProcessController<P> processOf(Class<P> processType) {
		try {
			return new ProcessController<>(processType, this);
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
	}

	public <P extends ProcessCall> ProcessController<P> processOf(P process) {
		return new ProcessController<>(process, this);
	}

	// used to clear the current BP
	public void clearBP() {
		setBP(null);
		setBPLoc(null);
		setContact(null);
		setRandom();
	}

	// used to clear the current BP
	public void clearPriceLists() {
		setPriceListPO(null);
		setPriceListSO(null);
	}

	// used to clear the current BP
	public void clearProduct() {
		setProduct(null);
		setRandom();
	}

	public MBank getBank() {
		return m_bank == null ? (mParentEnv == null ? null : mParentEnv.getBank()) : m_bank;
	}

	public void setBank(MBank m_bank) {
		this.m_bank = m_bank;
	}

	public MBankAccount getBankAcct() {
		return m_bankAcct == null ? (mParentEnv == null ? null : mParentEnv.getBankAcct()) : m_bankAcct;
	}

	public void setBankAcct(MBankAccount m_bankAcct) {
		this.m_bankAcct = m_bankAcct;
		if (m_bank == null && m_bankAcct != null) {
			setBank(m_bankAcct.getBank());
		}
	}

	public X_C_BankAccountDoc getBankAcctDoc() {
		return m_bankAcctDoc == null ? (mParentEnv == null ? null : mParentEnv.getBankAcctDoc()) : m_bankAcctDoc;
	}

	public void setBankAcctDoc(X_C_BankAccountDoc m_bankAcctDoc) {
		this.m_bankAcctDoc = m_bankAcctDoc;
	}

	public CLogger getLog() {
		return m_log;
	}

	public String getProcess_UU() {
		return m_process_UU;
	}

	public void setProcess_UU(String m_process_UU) {
		this.m_process_UU = m_process_UU;
	}

	public List<ProcessInfoParameter> getProcessInfoParams() {
		return m_processInfoParams;
	}

	public void setProcessInfoParams(List<ProcessInfoParameter> m_processInfoParams) {
		this.m_processInfoParams = m_processInfoParams;
	}

	public void addProcessInfoParam(ProcessInfoParameter procInfoParam) {
		getProcessInfoParams().add(procInfoParam);
	}

	public int getProcessTable_ID() {
		return m_processTable_ID;
	}

	public void setProcessTable_ID(int m_processTable_ID) {
		this.m_processTable_ID = m_processTable_ID;
	}

	public int getProcessRecord_ID() {
		return m_processRecord_ID;
	}

	public void setProcessRecord_ID(int m_processRecord_ID) {
		this.m_processRecord_ID = m_processRecord_ID;
	}

	public String getStepName() {
		return mMethodName;
	}

	public String getStepMsg() {
		final String name = getStepName();
		return mClassName + (name == null ? "" : '.' + name);
	}

	/**
	 * Version of getStepMsg() that takes the last 60 chars of the raw step msg.
	 * 
	 * @return
	 */
	public String getStepMsgName() {
		return getStepMsgName("");
	}
	
	public String getStepMsgNameWithHash() {
		return getStepMsgName(String.valueOf(getRandom()));
	}
	
	public String getStepMsgName(String hash) {
		final String stepMsg = getStepMsg() + (hash == null || hash.equals("") ? "" : "_" + hash);
		final int length = stepMsg.length();
		final String name = length > 60 ? stepMsg.substring(length - 60, length) : stepMsg;
		return name;
	}

	public String getStepMsgLong() {
		return mTrxName;
	}

	public MBPartner createBP() {
		return createBP(MBPartner.class);
	}

	// create your BP first
	public <T extends MBPartner> T createBP(Class<T> type) {
		// perform further validation if needed based on business logic
		// NONE

		validate();

		// use clearBP() to create a new BP or replace a new one
//		if (getBP() == null)
//		{
		// create bp
		T bp = createPO(type, null);
		bp.setAD_Org_ID(0);
		bp.setName(getStepMsgName());
		bp.setDescription(getStepMsgLong());
		bp.setIsCustomer(true);
		bp.setIsVendor(true);
		bp.saveEx();
		registerPO(bp);
		setBP(bp);

		// create SO pricelist if not already created from previous BP - used later in
		// document creation
		MPriceList spl = getPriceListSO();
		if (spl == null) {
			spl = createPriceListSO();
		}
		bp.setM_PriceList_ID(spl.get_ID());

		// create PO priceList if not already created from previous BP - used later in
		// document creation
		MPriceList ppl = getPriceListPO();
		if (ppl == null) {
			ppl = createPriceListPO();
		}
		bp.setPO_PriceList_ID(ppl.get_ID());

		bp.saveEx();

		// create loc
		MBPartnerLocation bploc = new MBPartnerLocation(getCtx(), 0, null);
		bploc.setAD_Org_ID(0);
		bploc.setC_BPartner_ID(bp.get_ID());
		MLocation loc = createLocation(null);
		registerPO(loc);
		bploc.setC_Location_ID(loc.get_ID());
		bploc.setName(getCity() + " " + getRegion().getName());
		bploc.saveEx();
		registerPO(bploc);
		setBPLoc(bploc);

		// create contact
		MUser user = new MUser(getBP());
		user.setNotificationType(X_AD_User.NOTIFICATIONTYPE_None);
		user.setDescription(getStepMsgLong());
		user.saveEx();
		registerPO(user);
		setUser(user);
		m_bp = bp;
		return bp;
		// }
		// return null;
	} // create BP

	static class TestPriceList extends MPriceList {

		public TestPriceList(Properties ctx, int M_PriceList_ID, String trxName) {
			super(ctx, M_PriceList_ID, trxName);
		}

		@Override
		public void set_TrxName(String trxName) {
			System.err.println("Changing transaction!!!: " + trxName);
			super.set_TrxName(trxName);
		}
		
	}
	
	public MPriceList createPriceListSO() {
		if (getPriceListSO() == null) {
//			MPriceList spl = new MPriceList(getCtx(), 0, null);
			MPriceList spl = new TestPriceList(getCtx(), 0, null);
			spl.setName("SO_During: " + getPriceListName());
			spl.setDescription(getStepMsgLong());
			spl.setAD_Org_ID(0);
			spl.setIsSOPriceList(true);
			spl.setC_Currency_ID(getCurrency().get_ID());
			spl.saveEx();
			//spl.saveEx(get_TrxName());
			setPriceListSO(spl);
			// Ensure that we clean up afterwards.
			registerPO(spl);
			return spl;
		}
		return null;
	}

	String getPriceListName() {
		final String suffix = getStepName() + getRandom();
		return suffix.substring("PO_During: ".length());
		
	}
	
	public MPriceList createPriceListPO() {
		if (getPriceListPO() == null) {
//			MPriceList ppl = new MPriceList(getCtx(), 0, null);
			TestPriceList ppl = new TestPriceList(getCtx(), 0, null);
			ppl.setName("PO_During: " + getPriceListName());
			ppl.setDescription(getStepMsgLong());
			ppl.setAD_Org_ID(0);
			ppl.setIsSOPriceList(false);
			ppl.setC_Currency_ID(getCurrency().get_ID());
			ppl.saveEx();
			//ppl.saveEx(get_TrxName());
			setPriceListPO(ppl);
			registerPO(ppl);
			return ppl;
		}
		return null;
	}

	public String createRoutingNo() {
		return m_routingNoSource.get();
	}

	public String createAccountNo() {
		return m_accountNoSource.get();
	}

	public MBPBankAccount createBPBankAcct() {
		if (getBP() == null) {
			appendErrorMsg("BP is null");
		}
		validate();

		MBPBankAccount acct = new MBPBankAccount(getCtx(), 0, null);
		acct.setC_BPartner_ID(getBP().get_ID());
		acct.setIsACH(true); // Accepts electronic transfers
		acct.setBPBankAcctUse(MBPBankAccount.BPBANKACCTUSE_Both);
		acct.setA_Name(getStepMsgName());
		if (getBank() != null) {
			acct.setC_Bank_ID(getBank().get_ID());
		} else {
			acct.setRoutingNo(createRoutingNo());
		}
		acct.setAccountNo(createAccountNo());
		acct.saveEx();
//		acct.saveEx(get_TrxName());
		registerPO(acct);
		setBPBankAcct(acct);
		return acct;
	}

	public MAttributeSet createAttributeSet() {
		MAttributeSet as = createPO(MAttributeSet.class, null);
		as.saveEx();
//		registerPO(as);
		setAttributeSet(as);
		return as;
	}

	public MAttributeSetInstance createAttributeSetInstance() {
		MAttributeSetInstance asi = createPO(MAttributeSetInstance.class, null);
		asi.setM_AttributeSet_ID(getAttributeSet().get_ID());
		asi.saveEx();
//		registerPO(as);
		setAttributeSetInstance(asi);
		return asi;
	}

	public MAttribute addAttributeToSet(String attribute, boolean instance) {
		MAttribute a = createPO(MAttribute.class, null);
		a.setName(attribute);
		a.setIsInstanceAttribute(instance);
		a.saveEx();
//			registerPO(a);
		MAttributeUse au = createPO(MAttributeUse.class, null);
		au.setM_Attribute_ID(a.get_ID());
		MAttributeSet as = getAttributeSet();
		if (as == null) {
			as = createAttributeSet();
		}
		au.setM_AttributeSet_ID(as.get_ID());
		au.saveEx();
//			registerPO(au);
		return a;
	}
	
	public MAttributeInstance addAttributeToASI(String attribute, String value) {
		MAttributeInstance a = createPO(MAttributeInstance.class, null);

		MAttributeSetInstance asi = getAttributeSetInstance();
		if (asi == null) {
			asi = createAttributeSetInstance();
		}
		MAttributeSet as = asi.getMAttributeSet();
		
		MAttribute[] nonInstanceAttributes = as.getMAttributes(false);
		MAttribute selected = null;
		
		for (MAttribute attr : nonInstanceAttributes) {
			System.err.println("Checking non-instance attribute " + attr);
			if (attr.getName().equals(attribute)) {
				selected = attr;
				break;
			}
		}
		if (selected == null) {
			for (MAttribute attr : as.getMAttributes(true)) {
				System.err.println("Checking instance attribute " + attr);
				if (attr.getName().equals(attribute)) {
					selected = attr;
					break;
				}
			}
		}
		
		if (selected == null) {
			throw new IllegalStateException("Attribute Set " + as + " does not have attribute " + attribute);
		}
		a.setM_AttributeSetInstance_ID(asi.get_ID());
		a.setM_Attribute_ID(selected.get_ID());
		a.setValue(value);
		a.saveEx();
		registerPO(a);
		return a;
	}
	
	// create product second
	public MProduct createProduct() {
		// perform further validation if needed based on business logic

		validate();

		// use clearProduct() to create new product
		// if (getProduct() == null) {
		MProduct product = new MProduct(getCtx(), 0, null);
		product.setAD_Org_ID(0);
		product.setDescription(getStepMsgLong());
		product.setName(getScenarioName());
		product.setM_Product_Category_ID(getDefaultMProductCategoryID());
		product.setC_TaxCategory_ID(getDefaultMTaxCategoryID());
		product.setProductType(X_M_Product.PRODUCTTYPE_Item);
		product.setC_UOM_ID(MUOM.getDefault_UOM_ID(getCtx()));
		if (getAttributeSet() != null) {
			product.setM_AttributeSet_ID(getAttributeSet().get_ID());
		}
		product.saveEx();
		registerPO(product);
		setProduct(product);

		addProductToPriceLists(product);
		return product;
//		}
//		return null;
	} // create product

	public void addProductToPriceLists(MProduct product) {
		addProductToPriceLists(product, null);
	}
	
	public void addProductToPriceLists(MProduct product, String trxName) {
		if (getBP() != null) {
			// create PO and SO price list entries
			MPriceList spl = getPriceListSO();
			MPriceList ppl = getPriceListPO();

			Timestamp datePL = getDatePriceList();
			if (datePL == null)
				datePL = getDateOffset(getDate(), -365);

			// see if price list version already exists
			String sqlWhere = "M_PriceList_ID = ? and ValidFrom = ?";

			MPriceListVersion splv = new Query(getCtx(), MPriceListVersion.Table_Name, sqlWhere, get_TrxName())
					.setClient_ID().setParameters(spl.get_ID(), datePL).first();

			MPriceListVersion pplv = new Query(getCtx(), MPriceListVersion.Table_Name, sqlWhere, get_TrxName())
					.setClient_ID().setParameters(ppl.get_ID(), datePL).first();

			if (pplv == null) {
				// get bogus price list schema - required field
				MDiscountSchema schema = new Query(getCtx(), X_M_DiscountSchema.Table_Name,
						"discounttype = '" + X_M_DiscountSchema.DISCOUNTTYPE_Pricelist + "'", get_TrxName())
								.setClient_ID().first();

				pplv = new MPriceListVersion(getCtx(), 0, null);
				pplv.setAD_Org_ID(0);
				pplv.setName(datePL + "; IsSOTrx=N; " + getRandom());
				pplv.setDescription(getStepMsgLong());
				pplv.setM_PriceList_ID(ppl.get_ID());
				pplv.setValidFrom(datePL);
				pplv.setM_DiscountSchema_ID(schema.get_ID());
				pplv.saveEx();
				registerPO(pplv);
			}

			if (splv == null) {
				// get bogus price list schema - required field
				MDiscountSchema schema = new Query(getCtx(), X_M_DiscountSchema.Table_Name,
						"discounttype = '" + X_M_DiscountSchema.DISCOUNTTYPE_Pricelist + "'", get_TrxName())
								.setClient_ID().first();

				splv = new MPriceListVersion(getCtx(), 0, null);
				splv.setAD_Org_ID(0);
				splv.setName(datePL + "; IsSOTrx=Y; " + getRandom());
				splv.setDescription(getStepMsgLong());
				splv.setM_PriceList_ID(spl.get_ID());
				splv.setValidFrom(datePL);
				splv.setM_DiscountSchema_ID(schema.get_ID());
				splv.saveEx();
				registerPO(splv);
			}

			MProductPrice pprice = new MProductPrice(getCtx(), pplv.get_ID(), product.get_ID(), trxName);
			pprice.setPriceLimit(getLimitPricePO());
			pprice.setPriceStd(getStdPricePO());
			pprice.setPriceList(getListPricePO());
			pprice.saveEx();
			registerPO(pprice);

			MProductPrice sprice = new MProductPrice(getCtx(), splv.get_ID(), product.get_ID(), trxName);
			sprice.setPriceLimit(getLimitPriceSO());
			sprice.setPriceStd(getStdPriceSO());
			sprice.setPriceList(getListPriceSO());
			sprice.saveEx();
			registerPO(sprice);
		}
	}

	public MProductBOM createProductBOM(BigDecimal qty, MProduct parentProduct) {
		validate();
		if (isError())
			return null;

		// vo, Qty, parentProd
		MProductBOM bom = new MProductBOM(getCtx(), 0, get_TrxName());
		bom.setAD_Org_ID(0);
		bom.setDescription(getStepMsgLong());
		bom.setBOMQty(qty);
		bom.setBOMType(MProductBOM.BOMTYPE_StandardPart);
		bom.setIsActive(true);
		bom.setM_ProductBOM_ID(getProduct().get_ID());
		bom.setM_Product_ID(parentProduct.get_ID());

		// find next line number
		int newLine = new Query(getCtx(), MProductBOM.Table_Name, "M_Product_ID = ?", get_TrxName())
				.setParameters(parentProduct.get_ID()).setClient_ID().aggregate("Line", Query.AGGREGATE_MAX).intValue()
				+ 10;
		bom.setLine(newLine);

		bom.saveEx();

		if (!parentProduct.isVerified()) {
			parentProduct.setIsManufactured(true);
			parentProduct.setIsBOM(true);
			parentProduct.setIsVerified(true); // we know it will be ok :)
			parentProduct.saveEx();
		}
		return bom;
	}

	public MOrder createOrder() {
		// perform further validation if needed based on business logic
		if (getDocType() == null) {
			appendErrorMsg("DocType is Null");
		}
		if (getBP() == null) {
			appendErrorMsg("BP is Null");
		}
		if (getWarehouse() == null) {
			appendErrorMsg("Warehouse is Null");
		}
		if (getProduct() == null) {
			appendErrorMsg("Product is Null");
		}
		validate();

		// create order header
		MOrder order = new MOrder(getCtx(), 0, get_TrxName());
		order.setAD_Org_ID(getOrg().get_ID());
		order.setDescription(getStepMsgLong());
		order.setC_DocTypeTarget_ID(getDocType().get_ID());
		order.setDateOrdered(getDate());
		order.setDatePromised(getDate());
		order.setIsSOTrx(getDocType().isSOTrx());
		order.setBPartner(getBP());
		order.setM_PriceList_ID(getDocType().isSOTrx() ? getPriceListSO().get_ID() : getPriceListPO().get_ID());
		order.setM_Warehouse_ID(getWarehouse().get_ID());
		if (getProject() != null) {
			order.setC_Project_ID(getProject().get_ID());
		}
		if (getActivity() != null) {
			order.setC_Activity_ID(getActivity().get_ID());
		}
		if (getCampaign() != null) {
			order.setC_Campaign_ID(getCampaign().get_ID());
		}
		order.setUser1_ID(getUserElement1());
		order.setUser2_ID(getUserElement2());
		order.saveEx();
		setOrder(order);

		// create order line
		MOrderLine line = new MOrderLine(getCtx(), 0, get_TrxName());
		line.setAD_Org_ID(getOrg().get_ID());
		line.setDescription(getStepMsgLong());
		line.setC_Order_ID(order.get_ID());
		MProduct product = getProduct();
		line.setM_Product_ID(product.get_ID());
		int resourceId = product.getS_Resource_ID();
		if (resourceId != 0) {
			MResource resource = getResource();
			if (resource == null || resource.get_ID() != resourceId) {
				resource = new MResource(getCtx(), resourceId, get_TrxName());
				setResource(resource);
				setResourceType(resource.getResourceType());
			}

			MResourceAssignment ra = getResourceAssignment();
			if (ra == null || ra.getS_Resource_ID() != resourceId) {
				ra = createResourceAssignment();
			}
		}
		MResourceAssignment ra = getResourceAssignment();
		if (ra != null) {
			line.setS_ResourceAssignment_ID(ra.get_ID());
			setQty(ra.getQty());
		}
		
		if (getQty() == null || getQty().compareTo(Env.ZERO) == 0)
			line.setQty(Env.ONE);
		else
			line.setQty(getQty());
		line.setC_UOM_ID(product.getC_UOM_ID());
		line.setM_AttributeSetInstance_ID(0);
		if (getQty() == null || getQty().compareTo(Env.ZERO) == 0)
			line.setQty(Env.ONE);
		else
			line.setQty(getQty());
		line.setHeaderInfo(order);
		line.setPrice();

		line.saveEx();
		setOrderLine(line);

		if (getDocAction() != null) {
			if (getLog() != null)
				getLog().log(Level.SEVERE, "Starting DocAction: " + getDocAction());
			order.setDocAction(getDocAction());
			order.processIt(getDocAction());
		}
		if (getLog() != null)
			getLog().log(Level.SEVERE, "Saving order after completion. Doc Status: " + order.getDocStatus());
		order.saveEx();
		return order;
	} // create order

	public MProject createProject() {
		if (getCurrency() == null) {
			appendErrorMsg("currency is null");
		}

		validate();

		MProject retval = createPO(MProject.class);
		retval.setC_Currency_ID(getCurrency().get_ID());
		retval.saveEx();
		setProject(retval);

		return retval;
	}

	public MActivity createActivity() {
		MActivity retval = createPO(MActivity.class);
		retval.saveEx();
		setActivity(retval);

		return retval;
	}

	public MCampaign createCampaign() {
		MCampaign retval = createPO(MCampaign.class);
		retval.saveEx();
		setCampaign(retval);

		return retval;
	}

	public MInOut createInOut() {
		validate();

		// perform further validation if needed based on business logic
		if (getDocType() == null) {
			appendErrorMsg("DocType is Null");
		}
		if (getBP() == null) {
			appendErrorMsg("BP is Null");
		}
		if (getWarehouse() == null) {
			appendErrorMsg("Warehouse is Null");
		}
		if (getOrder() == null) {
			appendErrorMsg("Order is Null");
		} else if (!getOrder().getDocStatus().equals(X_C_Order.DOCSTATUS_Completed)) {
			appendErrorMsg("Order Not Completed");
		}
		validate();

		// create inout header
		MInOut io = new MInOut(getCtx(), 0, get_TrxName());
		io.setAD_Org_ID(getOrg().get_ID());
		io.setDescription(getStepMsgLong());
		io.setC_BPartner_ID(getBP().get_ID());
		io.setC_BPartner_Location_ID(getBPLoc().get_ID());
		io.setAD_User_ID(getUser().get_ID());
		io.setC_DocType_ID(getDocType().get_ID());
		io.setC_Order_ID(getOrder().get_ID());
		io.setM_Warehouse_ID(getWarehouse().get_ID());
		io.setMovementDate(getDate());
		io.setDateAcct(getDate());
		io.setIsSOTrx(getDocType().isSOTrx());
		io.setMovementType(getDocType().isSOTrx() ? X_M_InOut.MOVEMENTTYPE_CustomerShipment
				: X_M_InOut.MOVEMENTTYPE_VendorReceipts);

		io.saveEx();
		setInOut(io);

		// create inout line
		MInOutLine iol = new MInOutLine(getCtx(), 0, get_TrxName());
		iol.setAD_Org_ID(getOrg().get_ID());
		iol.setDescription(getStepMsgLong());
		iol.setM_InOut_ID(getInOut().get_ID());
		iol.setM_Product_ID(getProduct().get_ID());
		iol.setM_AttributeSetInstance_ID(0);
		iol.setM_Warehouse_ID(getWarehouse().get_ID());
		iol.setM_Locator_ID(getWarehouse().getDefaultLocator().get_ID());
		iol.setC_OrderLine_ID(getOrderLine().get_ID());
		iol.setC_UOM_ID(getProduct().getC_UOM_ID());
		if (getQty() == null || getQty().compareTo(Env.ZERO) == 0)
			iol.setQty(Env.ONE);
		else
			iol.setQty(getQty());

		iol.saveEx();
		setInOutLine(iol);

		if (getDocAction() != null) {
			io.setDocAction(getDocAction());
			io.processIt(getDocAction());
		}
		io.saveEx();
		return io;
	} // create inout

	public MInvoice createInvoice() {
		// perform further validation if needed based on business logic
		if (getDocType() == null) {
			appendErrorMsg("DocType is Null");
		}
		if (getBP() == null) {
			appendErrorMsg("BP is Null");
		}
		if (getOrder() != null && !getOrder().getDocStatus().equals(X_C_Order.DOCSTATUS_Completed)) {
			appendErrorMsg("Order Not Completed");
		}
		if (getProduct() == null) {
			appendErrorMsg("Product is null");
		}
		validate();

		// create invoice header
		MInvoice inv = new MInvoice(getCtx(), 0, get_TrxName());
		inv.setAD_Org_ID(getOrg().get_ID());
		inv.setDescription(getStepMsgLong());
		inv.setC_BPartner_ID(getBP().get_ID());
		inv.setC_BPartner_Location_ID(getBPLoc().get_ID());
		inv.setAD_User_ID(getUser().get_ID());
		inv.setM_PriceList_ID(getDocType().isSOTrx() ? getBP().getM_PriceList_ID() : getBP().getPO_PriceList_ID());
		inv.setC_DocType_ID(getDocType().get_ID());
		inv.setDateInvoiced(getDate());
		inv.setIsSOTrx(getDocType().isSOTrx());
		if (getOrder() != null) {
			inv.setC_Order_ID(getOrder().get_ID());
		}
		if (getPaymentRule() != null) {
			inv.setPaymentRule(getPaymentRule());
		}
		inv.saveEx();
		setInvoice(inv);

		// create invoice line
		MInvoiceLine il = new MInvoiceLine(getCtx(), 0, get_TrxName());
		il.setC_Invoice_ID(getInvoice().get_ID());
		il.setDescription(getStepMsgLong());
		il.setAD_Org_ID(getOrg().get_ID());
		il.setM_Product_ID(getProduct().get_ID());
		il.setC_UOM_ID(getProduct().getC_UOM_ID());
		il.setM_AttributeSetInstance_ID(0);
		if (getQty() == null || getQty().compareTo(Env.ZERO) == 0)
			il.setQty(Env.ONE);
		else
			il.setQty(getQty());
		if (getOrderLine() != null) {
			il.setC_OrderLine_ID(getOrderLine().get_ID());
		}
		il.setPrice();

		il.saveEx();
		setInvoiceLine(il);

		if (getDocAction() != null) {
			inv.setDocAction(getDocAction());
			inv.processIt(getDocAction());
		}
		inv.saveEx();
		return inv;
	} // create invoice

	public MPayment createPayment() {
		// perform further validation if needed based on business logic
		if (getDocType() == null) {
			appendErrorMsg("DocType is Null");
		}
		if (getInvoice() == null && getTrxAmount() == null) {
			appendErrorMsg("Neither invoice nor trx amount specified");
		}
		if (getBankAcct() == null)
			setBankAcct(getBankAccountOfOrg());
		if (getBankAcct() == null) {
			appendErrorMsg("No Bank Account for Org");
		}
		validate();

		// create payment
		MPayment pay = new MPayment(getCtx(), 0, get_TrxName());
		pay.setAD_Org_ID(getOrg().get_ID());
		pay.setC_DocType_ID(getDocType().get_ID());
		pay.setIsReceipt(getDocType().isSOTrx());
		pay.setDateTrx(getDate());
		if (getBP() != null) {
			pay.setC_BPartner_ID(getBP().get_ID());
		}
		pay.setDescription(getStepMsgLong());
		if (getInvoice() != null) {
			pay.setC_Invoice_ID(getInvoice().get_ID());
			pay.setC_Currency_ID(getInvoice().getC_Currency_ID());
			pay.setPayAmt(getInvoice().getGrandTotal());
		} else {
			pay.setC_Currency_ID(getCurrency().get_ID());
			pay.setPayAmt(getTrxAmount());
		}
		pay.setC_BankAccount_ID(getBankAcct().get_ID());

		pay.saveEx();
		setPayment(pay);

		if (getDocAction() != null) {
			pay.setDocAction(getDocAction());
			pay.processIt(getDocAction());
		}
		pay.saveEx();
		return pay;

	}

	public MBank createBank() {
		validate();
		MBank bank = new MBank(getCtx(), 0, null);
		bank.setName(getStepMsgName());
		bank.setDescription(getStepMsgLong());
		bank.setRoutingNo(createRoutingNo());
		bank.saveEx();
		registerPO(bank);
		setBank(bank);
		return bank;
	}

	public MBankAccount createBankAcct() {
		if (getBank() == null) {
			if (getBankAcct() == null) {
				MBankAccount acct = getBankAccountOfOrg();
				setBank(acct.getBank());
			} else {
				setBank(getBankAcct().getBank());
			}
		}
		if (getBank() == null) {
			appendErrorMsg("No Bank specified and couldn't find one from an existing account");
		}
		validate();
		MBankAccount bankAcct = new MBankAccount(getCtx(), 0, null);
		bankAcct.setC_Bank_ID(getBank().get_ID());
		bankAcct.setName(getStepMsgName());
		bankAcct.setDescription(getStepMsgLong());
		bankAcct.setC_Bank_ID(getBank().get_ID());
		bankAcct.setC_Currency_ID(getCurrency().get_ID());
		bankAcct.setAccountNo(createAccountNo());
		bankAcct.saveEx();
		registerPO(bankAcct);
		setBankAcct(bankAcct);
		return bankAcct;
	}

	public X_C_BankAccountDoc createBankAccountDoc() {
		if (getBankAcct() == null) {
			MBankAccount acct = getBankAccountOfOrg();
			setBank(acct.getBank());
		} else {
			setBank(getBankAcct().getBank());
		}
		if (getBankAcct() == null) {
			appendErrorMsg("No Bank Account specified");
		}
		validate();
		X_C_BankAccountDoc doc = new X_C_BankAccountDoc(getCtx(), 0, null);
		doc.setName(getStepMsgName());
		doc.setDescription(getStepMsgLong());
		doc.setC_BankAccount_ID(getBankAcct().get_ID());
		doc.setPaymentRule(X_C_BankAccountDoc.PAYMENTRULE_DirectDeposit);
		doc.setCurrentNext(100);
		doc.saveEx();
		registerPO(doc);
		setBankAcctDoc(doc);
		return doc;
	}

	public MBankStatement createStatement() {
		// perform further validation if needed based on business logic
		if (getBankAcct() == null) {
			setBankAcct(getBankAccountOfOrg());
		}
		if (getBankAcct() == null) {
			appendErrorMsg("No Bank Account specified and Org does not have one");
		}
		validate();

		MBankStatement stmt = new MBankStatement(getCtx(), 0, get_TrxName());
		stmt.setC_BankAccount_ID(getBankAcct().get_ID());
		stmt.setName(getStepMsgName());
		stmt.setDescription(getStepMsgLong());
		stmt.setDateAcct(getDate());
		stmt.saveEx();
		setStatement(stmt);
		return stmt;

	}

	protected Map<Integer, CLogger> logMap = new HashMap<>();

	public <T extends PO> T getPO(int id, Class<T> type) {
		return getPO(id, type, get_TrxName());
	}

	public <T extends PO> T getPO(int id, Class<T> type, String trxName) {
		try {
			Constructor<T> c = type.getConstructor(Properties.class, int.class, String.class);
			T retval = c.newInstance(getCtx(), id, trxName);
			CLogger log = injectMockLog(retval);
			logMap.put(System.identityHashCode(retval), log);
			return retval;
		} catch (NoSuchMethodException | IllegalAccessException e) {
			throw new IllegalArgumentException("Couldn't find PO's constructor for type " + type, e);
		} catch (InstantiationException e) {
			throw new IllegalArgumentException("Couldn't instantiate PO class " + type, e);
		} catch (InvocationTargetException e) {
			throw new IllegalArgumentException("Error running constructor for PO " + type, e.getCause());
		}
	}

	public <T extends PO> T createPO(Class<T> type) {
		return createPO(type, get_TrxName());
	}

	public <T extends PO> T createPO(Class<T> type, String trxName) {
		T retval = getPO(0, type, trxName);
		try {
			Method method = type.getMethod("setName", String.class);
			method.invoke(retval, getStepMsgName());
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
		}
		try {
			Method method = type.getMethod("setDescription", String.class);
			method.invoke(retval, getStepMsgLong());
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
		}
		return retval;
	}

	public CLogger getLogger(PO po) {
		return logMap.get(System.identityHashCode(po));
	}

	public String getMsg(String string) {
		return Msg.getMsg(mCtx, string);
	}

	public String getMsgForElement(String element) {
		return Msg.getElement(mCtx, element);
	}

	public MBankStatementLine createStatementLine() {
		MBankStatementLine line = createOpenStatementLine();
		line.saveEx();
		setStatementLine(line);
		return line;
	}

	public MBankStatementLine createOpenStatementLine() {
		// perform further validation if needed based on business logic
		if (getStatement() == null) {
			appendErrorMsg("No Bank Statement specified");
		}
		if ((getTrxAmount() == null || getDocType() == null) && getPayment() == null) {
			appendErrorMsg("No Trx Amount/DocType or Payment specified");
		}
		validate();

		MBankStatementLine line = new MBankStatementLine(getCtx(), 0, get_TrxName());
		line.setDescription(getStepMsgLong());
		line.setC_BankStatement_ID(getStatement().get_ID());
		line.setDateAcct(getDate());
		line.setValutaDate(getDate());
		line.setStatementLineDate(getDate());
		if (getTrxAmount() == null) {
			if (getPayment().isReceipt()) {
				line.setTrxAmt(getPayment().getPayAmt().negate());
				line.setChargeAmt(getPayment().getChargeAmt().negate());
			} else {
				line.setTrxAmt(getPayment().getPayAmt());
				line.setChargeAmt(getPayment().getChargeAmt());
			}
			line.setC_Currency_ID(getPayment().getC_Currency_ID());
		} else {
			if (getDocType().isSOTrx()) {
				line.setStmtAmt(getTrxAmount());
				line.setTrxAmt(getTrxAmount());
			} else {
				line.setStmtAmt(getTrxAmount().negate());
				line.setTrxAmt(getTrxAmount().negate());
			}
			line.setC_Currency_ID(getCurrency().get_ID());
		}
		line.setChargeAmt(BD_ZERO);
		return line;
	}

	public MBankStatement getStatementForAccount(MBankAccount acct, String name) {
		return new Query(getCtx(), MBankStatement.Table_Name,
				MBankStatement.COLUMNNAME_C_BankAccount_ID + "=? AND " + MBankStatement.COLUMNNAME_Name + "=?",
				get_TrxName()).setParameters(acct.get_ID(), name).firstOnly();
	}

	public MPaySelection createPaySelection() {
		if (getBankAcct() == null) {
			appendErrorMsg("BankAcct is null");
		}
		validate();
		MPaySelection selection = new MPaySelection(getCtx(), 0, get_TrxName());
		selection.setName(getStepMsgName());
		selection.setDescription(getStepMsgLong());
		selection.setC_BankAccount_ID(getBankAcct().get_ID());
		selection.setPayDate(getDate());
		selection.saveEx();
		setPaySelection(selection);
		return selection;
	}

	public MPaySelectionLine createPaySelectionLine() {
		if (getPaySelection() == null) {
			appendErrorMsg("PaySelection is null");
		}
		if (getInvoice() == null) {
			appendErrorMsg("Invoice is null");
		}
		if (getBP() == null) {
			appendErrorMsg("BP is null");
		}
		validate();

		final MInvoice inv = getInvoice();
		MPaySelectionLine line = new MPaySelectionLine(getPaySelection(), 1, inv.getPaymentRule());

		final BigDecimal payAmt = (getTrxAmount() == null) ? inv.getOpenAmt() : getTrxAmount();
		line.setInvoice(inv.get_ID(), inv.isSOTrx(), inv.getOpenAmt(), payAmt, BD_ZERO, BD_ZERO);
		line.saveEx();
		setPaySelectionLine(line);
		return line;
	}

	public MPaySelectionCheck createPaySelectionCheck() {
		if (getPaySelectionLine() == null) {
			appendErrorMsg("PaySelectionLine is null");
		}
		validate();
		MPaySelectionLine line = getPaySelectionLine();
		MPaySelectionCheck check = new MPaySelectionCheck(line, line.getPaymentRule());
		check.saveEx();
		line.setC_PaySelectionCheck_ID(check.get_ID());
		line.saveEx();
		setPaySelectionCheck(check);
		return check;
	}

	public MDepositBatch confirmPrintPaymentSelection(boolean depositBatch, MPaySelectionCheck... checks) {
		MPaySelectionCheck.confirmPrint(checks, null, depositBatch);
		final MPayment p = (MPayment) checks[checks.length - 1].getC_Payment();
		setPayment(p);
		if (depositBatch) {
			final Query dbLookup = new Query(getCtx(), MDepositBatchLine.Table_Name, "C_Payment_ID=?", get_TrxName());
			MDepositBatchLine line = dbLookup.setParameters(p.getC_Payment_ID()).firstOnly();
			setDepositBatchLine(line);
			MDepositBatch rv = (MDepositBatch) line.getC_DepositBatch();
			setDepositBatch(rv);
			return rv;
		}
		return null;
	}

	public MDepositBatch createDepositBatch() {
		if (getBankAcct() == null) {
			appendErrorMsg("BankAcct is null");
		}
		validate();
		MDepositBatch b = new MDepositBatch(getCtx(), 0, get_TrxName());
		b.setDescription(getStepMsgLong());
		b.setC_BankAccount_ID(getBankAcct().get_ID());
		b.setDateDeposit(getDate());
		b.setDateDoc(getDate());
		b.setDateAcct(getDate());
		b.setC_DocType_ID(getDocType().get_ID());
		b.saveEx();
		setDepositBatch(b);
		return b;
	}

	// ***********************************
	// utils
	// ***********************************
	protected int getDefaultMProductCategoryID() {
		validate();

		MProductCategory prodCat = new Query(getCtx(), MProductCategory.Table_Name, "isDefault = 'Y' ", get_TrxName())
				.setClient_ID().first();
		if (prodCat != null)
			return prodCat.get_ID();
		else
			return 0;
	}

	protected MTaxCategory getDefaultMTaxCategory() {
		validate();

		MTaxCategory taxCat = new Query(getCtx(), MTaxCategory.Table_Name, "isDefault = 'Y'", get_TrxName())
				.setClient_ID().first();
		return taxCat;
	}

	protected int getDefaultMTaxCategoryID() {
		final MTaxCategory taxCat = getDefaultMTaxCategory();
		return taxCat == null ? 0 : taxCat.get_ID();
	}

	public MDocType getDocType(String docBaseType, String docSubTypeSO, boolean issotrx, boolean isshipconfirm,
			boolean ispickqaconfirm) {
		String issotrxString = issotrx ? "Y" : "N";
		String isshipconfirmString = isshipconfirm ? "Y" : "N";
		String ispickqaconfirmString = ispickqaconfirm ? "Y" : "N";
		String where = "(docbasetype = '" + docBaseType + "' and docsubtypeso = '" + docSubTypeSO + "' and issotrx = '"
				+ issotrxString + "' and isshipconfirm = '" + isshipconfirmString + "' and ispickqaconfirm = '"
				+ ispickqaconfirmString + "') " + " or (docbasetype = '" + docBaseType + "' and docsubtypeso is null "
				+ " and issotrx = '" + issotrxString + "' and isshipconfirm = '" + isshipconfirmString
				+ "' and ispickqaconfirm = '" + ispickqaconfirmString + "') ";
		return new Query(getCtx(), X_C_DocType.Table_Name, where, get_TrxName()).setClient_ID().first();
	}

	public MBankAccount getBankAccountOfOrg() {
		validate();

		String where = "ad_org_id = " + getOrg().get_ID();
		return new Query(getCtx(), X_C_BankAccount.Table_Name, where, get_TrxName()).setOnlyActiveRecords(true)
				.setOrderBy("name").setClient_ID().first();
	}

	public MLocation createLocation() {
		return createLocation(get_TrxName());
	}

	public MLocation createLocation(String trxName) {
		validate();

		MLocation loc = new MLocation(getCtx(), getCountry().get_ID(), getRegion().get_ID(), getCity(), trxName);
		loc.saveEx();
		setLocation(loc);

		return loc;
	}

	public MOrg changeOrg() {
		// do not validate this method. It is used to update the VO so that it can pass
		// validation
		// validate();
		// if (isError())
		// return;

		String where = "ad_org_id <> " + getOrg().get_ID() + " and issummary = 'N'";
		MOrg org = new Query(getCtx(), X_AD_Org.Table_Name, where, get_TrxName()).setOnlyActiveRecords(true)
				.setOrderBy("AD_Org_ID").setClient_ID().first();

		if (org == null) {
			return createOrg();
		} else {
			setOrg(org);
			changeWarehouse();
			return org;
		}
	}

	public MOrg createOrg() {
		// do not validate this method. It is used to update the VO so that it can pass
		// validation
		// validate();
		// if (isError())
		// return;

		MOrg org = new MOrg(getCtx(), 0, get_TrxName());
		org.setName(getStepMsgName());
		org.setDescription(getStepMsgLong());
		org.saveEx();
		setOrg(org);

		// find orgInfo record and set location
		MLocation loc = createLocation();
		MOrgInfo oInfo = org.getInfo();
		oInfo.setC_Location_ID(loc.get_ID());
		oInfo.saveEx();

		// create a new warehouse
		createWarehouse();
		oInfo.setM_Warehouse_ID(getWarehouse().get_ID());
		oInfo.saveEx();
		return org;
	}

	public MWarehouse changeWarehouse() {
		// do not validate this method. It is used to update the VO so that it can pass
		// validation
		// validate();
		// if (isError())
		// return;

		String where = (getWarehouse() == null ? "" : " m_warehouse_id <> " + getWarehouse().get_ID() + " and ")
				+ " ad_org_id = " + getOrg().get_ID() + " and IsInTransit = 'N' ";
		MWarehouse wh = new Query(getCtx(), X_M_Warehouse.Table_Name, where, get_TrxName()).setOnlyActiveRecords(true)
				.setOrderBy("M_Warehouse_ID").setClient_ID().first();

		if (wh == null) {
			return createWarehouse();
		} else {
			setWarehouse(wh);
			return wh;
		}
	}

	public MWarehouse createWarehouse() {
		return createWarehouse(get_TrxName());
	}
	
	public MWarehouse createWarehouse(String trxName) {
		// do not validate this method. It is used to update the VO so that it can pass
		// validation
		// validate();
		// if (isError())
		// return;

		MWarehouse wh = new MWarehouse(getCtx(), 0, trxName);
		wh.setAD_Org_ID(getOrg().get_ID());
		wh.setName(getStepMsgNameWithHash());
		wh.setDescription(getStepMsgLong());
		if (getOrg().getInfo() != null)
			wh.setC_Location_ID(getOrg().getInfo().getC_Location_ID());
		wh.saveEx();
		setWarehouse(wh);
		registerPO(wh);
		MLocator loc = new MLocator(getWarehouse(), String.valueOf(getRandom()));
		loc.setIsDefault(true);
		loc.saveEx();
		registerPO(loc);
		return wh;
	}

	public MResourceType createResourceType() {
		return createResourceType(MResourceType.class);
	}

	public MUOM getUOM(String name) {
		return MUOM.get(getCtx(), name, get_TrxName());
	}

	public <T extends MResourceType> T createResourceType(Class<T> type) {
		validate();

		// create resource type
		T rt = createPO(type, null);
		rt.setAD_Org_ID(0);
		rt.setAllowUoMFractions(true);
		rt.setC_UOM_ID(MUOM.getDefault_UOM_ID(getCtx()));
		rt.setM_Product_Category_ID(getDefaultMProductCategoryID());
		rt.setC_TaxCategory_ID(getDefaultMTaxCategoryID());
		rt.saveEx();
		registerPO(rt);
		setResourceType(rt);
		return rt;
	} // create resourceType

	public MResource createResource() {
		return createResource(MResource.class);
	}

	public <T extends MResource> T createResource(Class<T> type) {
		validate();

		// create resource type
		T r = createPO(type, null);
		r.setAD_Org_ID(0);
		MResourceType rt = getResourceType();
		if (rt == null) {
			rt = createResourceType();
		}
		r.setS_ResourceType_ID(rt.get_ID());
		r.setM_Warehouse_ID(getWarehouse().get_ID());
		r.saveEx();
		MProduct product = r.getProduct();
		addProductToPriceLists(product);
		registerPO(r);
		setResource(r);
		// ADempiere's MResource will automatically create the corresponding product for
		// the resource.
		setProduct(product);
		return r;
	} // create resourceType

	public MResourceAssignment createResourceAssignment() {
		return createResourceAssignment(MResourceAssignment.class);
	}

	static BigDecimal SIXTY = new BigDecimal("60.0");

	public <T extends MResourceAssignment> T createResourceAssignment(Class<T> type) {
		validate();

		// create resource type
		T ra = createPO(type, get_TrxName());
		ra.setAD_Org_ID(getOrg().get_ID());
		MResource r = getResource();
		if (r == null) {
			r = createResource();
		}
		ra.setS_Resource_ID(r.get_ID());
		ra.setAssignDateFrom(m_date);
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(m_date);

		int hours = getQty().intValue();
		int minutes = getQty().remainder(BD_ONE).multiply(SIXTY).intValue();

		c.add(Calendar.HOUR_OF_DAY, hours);
		c.add(Calendar.MINUTE, minutes);
		ra.setAssignDateTo(new Timestamp(c.getTimeInMillis()));
		ra.setQty(getQty());
		ra.saveEx();
		setResourceAssignment(ra);
		return ra;
	} // create resource assignment

	public void createAndOpenAllFiscalYears() {
		validate();

		// create years for next and past to support broad date ranges
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(getDate());
		int currentYear = cal.get(Calendar.YEAR);
		List<MCalendar> mcals = new Query(getCtx(), X_C_Calendar.Table_Name, null, get_TrxName())
				.setOnlyActiveRecords(true).setClient_ID().list();
		for (MCalendar mcal : mcals) {
			String where = " fiscalyear::int in (" + currentYear + "," + (currentYear - 1) + ", " + (currentYear + 1)
					+ ") and C_Calendar_ID = " + mcal.get_ID();
			List<MYear> myears = new Query(getCtx(), X_C_Year.Table_Name, where, get_TrxName())
					.setOnlyActiveRecords(true).setClient_ID().list();

			// create a set of all three years
			List<String> neededYears = new ArrayList<String>();
			neededYears.add(String.valueOf(currentYear));
			neededYears.add(String.valueOf(currentYear + 1));
			neededYears.add(String.valueOf(currentYear - 1));

			// iterate across years and remove present from set
			for (MYear myear : myears) {
				neededYears.remove(myear.getFiscalYear());
			}

			// iterate across the set to create the years that remain
			for (String neededYear : neededYears) {
				MYear newYear = new MYear(getCtx(), 0, get_TrxName());
				newYear.setC_Calendar_ID(mcal.get_ID());
				newYear.setFiscalYear(neededYear);
				newYear.setAD_Org_ID(0);
				newYear.saveEx();
				newYear.createStdPeriods(getClient().getLocale());
			}
		}

		// open all non-open periods for this client
		changePeriodControlStatus(MPeriodControl.PERIODSTATUS_Open);

		// remove automatic period control
		List<MAcctSchema> acschs = new Query(getCtx(), X_C_AcctSchema.Table_Name, " AutoPeriodControl = 'Y' ",
				get_TrxName()).setOnlyActiveRecords(true).setClient_ID().list();
		for (MAcctSchema acsch : acschs) {
			acsch.setAutoPeriodControl(false);
			acsch.saveEx();
		}
	}

	public void changePeriodControlStatus(String newStatus) {
		validate();

		String where = " PeriodStatus <> '" + newStatus + "'";
		List<MPeriodControl> pcs = new Query(getCtx(), X_C_PeriodControl.Table_Name, where, get_TrxName())
				.setOnlyActiveRecords(true).setClient_ID().list();
		for (MPeriodControl pc : pcs) {
			pc.setPeriodStatus(newStatus);
			pc.saveEx();
		}
	}

	public static Timestamp getDateOffset(Timestamp initDate, int days) {
		GregorianCalendar baseCal = new GregorianCalendar();
		baseCal.setTime(initDate);
		baseCal.add(Calendar.DAY_OF_MONTH, days);
		return (new Timestamp(baseCal.getTimeInMillis()));
	}

	// Instructions
	// Step 1: setProcess_UU
	// Step 2: setProcessTable_ID and setProcessRecord_ID if needed
	// used when running a process against a given record - as opposed to 0,0 from
	// the menu.
	// Step 3: addProcessInfoParam see example below
	public void runProcess() {
		validate();

		// further validation
		if (getProcessInfoParams() == null)
			appendErrorMsg("Parameter List is null - It should at least be an empty List");
		else if (getProcess_UU() == null)
			appendErrorMsg("Process UU is null - cannot look up process");
		if (isError())
			return;

		MProcess pr = new Query(Env.getCtx(), X_AD_Process.Table_Name, "AD_Process_UU=?", get_TrxName())
				.setParameters(getProcess_UU()).first();

		// Create an instance of the process I want to run
		ProcessCall processCall = null;
		boolean procSuccess = false;

		processCall = Core.getProcess(pr.getClassname());

		// Create a process info instance. This is a composite class containing the
		// parameters.
		ProcessInfo pi = new ProcessInfo("", pr.get_ID(), getProcessTable_ID(), getProcessRecord_ID());

		// how to set parameters....
		// ProcessInfoParameter piClient = new ProcessInfoParameter("AD_Client_ID",
		// getAD_Client_ID(), "", "", "");
		// ProcessInfoParameter piOrg = new ProcessInfoParameter("AD_Org_ID", 0, "", "",
		// "");
		// addProcessInfoParam(piClient);
		// ...
		List<ProcessInfoParameter> params = getProcessInfoParams();
		if (!params.isEmpty()) {
			pi.setParameter(getProcessInfoParams().toArray(new ProcessInfoParameter[params.size()]));
		}

		// Create process instance (mainly for logging/sync purpose)
		MPInstance mpi = new MPInstance(Env.getCtx(), pr.get_ID(), getProcessRecord_ID());
		mpi.saveEx();

		// Connect the process to the process instance.
		pi.setAD_PInstance_ID(mpi.get_ID());

		procSuccess = processCall.startProcess(Env.getCtx(), pi, null);

		if (!procSuccess)
			appendErrorMsg("Process Failed: " + pr.getClassname());

		clearProcess();
	}

	public void clearProcess() {
		setProcess_UU(null);
		setProcessInfoParams(new ArrayList<ProcessInfoParameter>());
		setProcessRecord_ID(0);
		setProcessTable_ID(0);
	}
}
