package au.org.greekwelfaresa.idempiere.test.assertj.processinfolog;

import org.compiere.model.MTable;
import org.compiere.process.ProcessInfoLog;
import org.compiere.util.Env;

import au.org.greekwelfaresa.idempiere.test.assertj.AbstractIDAssert;

public abstract class AbstractProcessInfoLogAssert<SELF extends AbstractProcessInfoLogAssert<SELF, ACTUAL>, ACTUAL extends ProcessInfoLog>
	extends AbstractIDAssert<SELF, ACTUAL> {

	public AbstractProcessInfoLogAssert(ACTUAL actual, Class<SELF> selfType) {
		super(actual, selfType);
	}

	protected String getDescription() {
		return "ProcessInfoLog";
	}
	
	public SELF hasAD_Table_ID(int expected) {
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (actualField != expected) {
			MTable expectedTable = MTable.get(Env.getCtx(), expected);
			if (expectedTable == null || expectedTable.is_new()) {
				throw new IllegalArgumentException("Unknown table ID: " + expected);
			}
			MTable actualTable = MTable.get(Env.getCtx(), actualField);
			
			failWithMessage("\nExpecting log for table\n <%s>\nbut it was for <%s>", expectedTable.getName(), actualTable.getName());
		}
		return myself;
	}
	
	public SELF hasRecord_ID(int expected) {
		isNotNull();
		int actualID = actual.getRecord_ID();
		if (actualID != expected) {
			failWithMessage("\nExpecting log entry to have Record_ID: <%s>\nbut it was: <%s>", expected, actualID);
		}
		return myself;
	}
	
	public SELF hasLog_ID(int expected) {
		isNotNull();
		int actualID = actual.getLog_ID();
		if (actualID != expected) {
			failWithMessage("\nExpecting log entry to have Log_ID: <%s>\nbut it was: <%s>", expected, actualID);
		}
		return myself;
	}
	
	public SELF hasP_ID(int expected) {
		isNotNull();
		int actualID = actual.getP_ID();
		if (actualID != expected) {
			failWithMessage("\nExpecting log entry to have P_ID: <%s>\nbut it was: <%s>", expected, actualID);
		}
		return myself;
	}
	
	public SELF hasP_Date(Object expected) {
		dateAssert("P_Date", actual.getP_Date(), expected);
		return myself;
	}
	
	public SELF hasP_Number(Object expected) {
		bdAssert("P_Number", actual.getP_Number(), expected);
		return myself;
	}
	
	public SELF hasP_Msg(CharSequence expected) {
		isNotNull();
		final String actualField = actual.getP_Msg();
		if ((actualField == null && expected != null) || !actualField.contentEquals(expected)) {
			failWithMessage("\nExpecting log entry to have P_Msg: <%s>\nbut it was: <%s>", expected, actualField);
		}
		return myself;
	}
}
