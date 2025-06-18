package au.org.greekwelfaresa.idempiere.test.assertj.po;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Properties;

import org.compiere.model.MAttachment;
import org.compiere.model.MAttachmentEntry;
import org.compiere.model.PO;

import au.org.greekwelfaresa.idempiere.test.assertj.AbstractIDAssert;

public abstract class AbstractPOAssert<SELF extends AbstractPOAssert<SELF, ACTUAL>, ACTUAL extends PO>
	extends AbstractIDAssert<SELF, ACTUAL> {

	public AbstractPOAssert(ACTUAL actual, Class<SELF> selfType) {
		super(actual, selfType);
	}

	protected String getDescription() {
		return "PO:\n  <" + getPODescription() + '>';
	}
	
	static String getPODescription(PO po) {
		return po.getClass().getName().startsWith("X_") ? "[" + po.get_TableName() + ":" + po.get_ID() + "]" : po.toString();
	}
	
	protected String getPODescription() {
		return getPODescription(actual);
	}

	public SELF hasAttachments() {
		isNotNull();
		MAttachment a = MAttachment.get(actual.getCtx(), actual.get_Table_ID(), actual.get_ID(), actual.get_TrxName());
		if (a == null || a.getEntryCount() == 0) {
			failWithMessage("\nExpecting PO:\n <%s>\nto have attachments\nbut it doesn't", getPODescription());
		}
		return myself;
	}
	
	public SELF hasAttachmentEntryCount(int expected) {
		isNotNull();
		MAttachment a = MAttachment.get(actual.getCtx(), actual.get_Table_ID(), actual.get_ID(), actual.get_TrxName());
		final int actual = a == null ? 0 : a.getEntryCount();
		if (actual != expected) {
			failWithActualExpectedAndMessage(actual, expected, "\nExpecting PO:\n <%s>\nto have <%d> attachments\nbut it has <%d>", getPODescription(), expected, actual);
		}
		return myself;
	}
	
	public SELF hasAttachmentEntry(String name, byte[] expected) {
		isNotNull();
		System.err.println("Looking for actual: " + actual.get_Table_ID() + ", " + actual.get_ID());
		MAttachment a = MAttachment.get(actual.getCtx(), actual.get_Table_ID(), actual.get_ID(), actual.get_TrxName());
		System.err.println("Looking for actual attachment: " + a + ", " + (a != null ? a.getEntryCount() : " null"));
		if (a == null || a.getEntryCount() == 0) {
			failWithMessage("\nExpecting PO:\n <%s>\nto have attachments\nbut it doesn't", getPODescription());
		}
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < a.getEntryCount(); i++) {
			final MAttachmentEntry e = a.getEntry(i);
			b.append("\n  ").append(e.getName());
			if (Objects.equals(e.getName(), name)) {
				final byte[] actual = e.getData();
				if (!Arrays.equals(expected, actual)) {
					final String expectedString = Arrays.toString(expected);
					final String actualString = Arrays.toString(actual);
					failWithActualExpectedAndMessage(actual, expected, "\nExpecting PO:\n  <%s>\nto have entry <%s>\nwith data\n <%s>\nbut entry has data\n <%s>", getPODescription(), name, expectedString, actualString);
				}
				return myself;
			}
		}
		failWithMessage("\nExpecting PO:\n <%s>\nto have attachment entry\n <%s>\nbut there was no entry with that name.\nThe following entries were present:%s", getPODescription(), name, b.toString());
		return myself;
	}
	
	public SELF doesNotHaveAttachments() {
		isNotNull();
		MAttachment a = MAttachment.get(actual.getCtx(), actual.get_Table_ID(), actual.get_ID(), actual.get_TrxName());
		if (a != null && a.getEntryCount() != 0) {
			failWithMessage("\nExpecting PO:\n <%s>\nto have no attachments\nbut it has <%d>", getPODescription(), a.getEntryCount());
		}
		return myself;
	}
	
	public SELF hasColumnCount(int expected) {
		isNotNull();
		int actualColumnCount = actual.get_ColumnCount();
		if (actualColumnCount != expected) {
			failWithActualExpectedAndMessage(actualColumnCount, expected, "\nExpecting PO:\n  <%s>\nto have <%s> columns\nbut it has <%s>", getPODescription(), expected, actualColumnCount);
		}
		return myself;
	}
	
	public SELF hasColumn(String columnName) {
		isNotNull();
		
		if (!actual.columnExists(columnName)) {
			failWithMessage("\nExpecting PO:\n <%s>\nto have column <%s>\nbut it does not", getPODescription());
		}
		return myself;
	}
	
	public SELF doesNotHaveColumn(String columnName) {
		isNotNull();
		
		if (actual.columnExists(columnName)) {
			failWithMessage("\nExpecting PO:\n <%s>\nto not have column <%s>\nbut it does", getPODescription());
		}
		return myself;
	}
	
	public SELF hasValue(String columnName, Object expected) {
		isNotNull();
		
		Object actualColumn = actual.get_Value(columnName);
		if (!Objects.equals(expected, actualColumn)) {
			failWithActualExpectedAndMessage(actualColumn, expected, "\nExpecting PO:\n  <%s>\ncolumn <%s>\nto have value\n <%s>\nbut it was\n <%s>", getPODescription(), columnName, expected, actualColumn);
		}
		return myself;
	}
	
	public SELF hasID(int expected) {
		isNotNull();
		int actualID = actual.get_ID();
		if (actualID != expected) {
			failWithActualExpectedAndMessage(actualID, expected, "\nExpecting PO:\n  <%s>\nto have ID:\n <%s>\nbut it was:\n <%s>", getPODescription(), expected, actualID);
		}
		return myself;
	}
	
	public SELF hasClientID(int expected) {
		isNotNull();
		int actualID = actual.getAD_Client_ID();
		if (actualID != expected) {
			failWithActualExpectedAndMessage(actualID, expected, "\nExpecting PO:\n  <%s>\nto have client ID:\n <%s>\nbut it was:\n <%s>", getPODescription(), expected, actualID);
		}
		return myself;
	}
	
	public SELF hasOrgID(int expected) {
		isNotNull();
		int actualID = actual.getAD_Org_ID();
		if (actualID != expected) {
			failWithActualExpectedAndMessage(actualID, expected, "\nExpecting PO:\n  <%s>\nto have org ID:\n <%s>\nbut it was:\n <%s>", getPODescription(), expected, actualID);
		} 
		return myself;
	}

	public SELF hasSameContextAs(PO other) {
		Properties actualCtx = actual.getCtx();
		if (actualCtx != other.getCtx()) {
			failWithActualExpectedAndMessage(actualCtx, other.getCtx(), "\nExpecting PO:\n  <%s>\nto have same context as\n <%s>\nbut it did not", getPODescription(), getPODescription(other));
		}
		return myself;
	}

	public SELF hasTrxName(String expected) {
		String actualTrx = actual.get_TrxName();
		if (!Objects.equals(expected, actualTrx)) {
			failWithActualExpectedAndMessage(actualTrx, expected, "\nExpecting PO:\n  <%s>\nto have trx\n <%s>\nbut it was\n <%s>", getPODescription(), expected, actualTrx);
		}
		return myself;
	}
	
	public SELF isActive() {
		isNotNull();
		if (!actual.isActive()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be active\nbut it was not", getPODescription());
		}
		return myself;
	}

	public SELF isNotActive() {
		isNotNull();
		if (actual.isActive()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be inactive\nbut it was active", getPODescription());
		}
		return myself;
	}

	public SELF isNew() {
		isNotNull();
		if (!actual.is_new()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be new\nbut it was not", getPODescription());
		}
		return myself;
	}

	public SELF isNotNew() {
		isNotNull();
		if (actual.is_new()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto not be new\nbut it was", getPODescription());
		}
		return myself;
	}

	public SELF isChanged() {
		isNotNull();
		if (!actual.is_Changed()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be changed\nbut it was not", getPODescription());
		}
		return myself;
	}

	public SELF isNotChanged() {
		isNotNull();
		if (actual.is_Changed()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be unchanged\nbut it was changed", getPODescription());
		}
		return myself;
	}

	public SELF wasUpdatedBy(int expected) {
		isNotNull();
		int a = actual.getUpdatedBy();
		if (a != expected) {
			failWithActualExpectedAndMessage(a, expected, "\nExpecting PO:\n  <%s>\nto have been updated by userID:\n <%s>\nbut it was updated by:\n <%s>",
					getPODescription(), expected, a);
		}
		return myself;
	}

	public SELF wasCreatedBy(int expected) {
		isNotNull();
		int a = actual.getCreatedBy();
		if (a != expected) {
			failWithActualExpectedAndMessage(a, expected, "\nExpecting PO:\n  <%s>\nto have been created by userID:\n <%s>\nbut it was created by:\n <%s>",
					getPODescription(), expected, a);
		}
		return myself;
	}
	
	public SELF wasUpdatedAt(long expected) {
		wasUpdatedAt(new Timestamp(expected));
		return myself;
	}

	public SELF wasUpdatedAt(Instant expected) {
		wasUpdatedAt(Date.from(expected));
		return myself;
	}
	
	public SELF wasUpdatedAt(Date expected) {
		isNotNull();
		Timestamp a = actual.getUpdated();
		if (!Objects.equals(expected, a)) {
			failWithActualExpectedAndMessage(a, expected, "\nExpecting PO:\n  <%s>\nto have been updated at:\n <%s>\nbut it was updated at:\n <%s>",
					getPODescription(), expected == null ? null : new Timestamp(expected.getTime()), a);
		}
		return myself;
	}
	
	public SELF wasUpdatedAfter(long start) {
		wasUpdatedAfter(new Timestamp(start));
		return myself;
	}
	
	public SELF wasUpdatedAfter(Instant expected) {
		wasUpdatedAfter(Date.from(expected));
		return myself;
	}
	
	public SELF wasUpdatedAfter(Date start) {
		isNotNull();
		if (start == null) {
			failWithMessage("start was null");
		} else {
			Timestamp a = actual.getUpdated();
			if (a == null) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated after:\n <%s>\nbut update time was null",
						getPODescription(), new Timestamp(start.getTime()));
			} else if (!a.after(start)) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated after:\n <%s>\nbut it was updated at:\n <%s>",
						getPODescription(), new Timestamp(start.getTime()), a);
			}
		}
		return myself;
	}

	public SELF wasUpdatedBefore(long start) {
		wasUpdatedBefore(new Timestamp(start));
		return myself;
	}
	
	public SELF wasUpdatedBefore(Instant expected) {
		wasUpdatedBefore(Date.from(expected));
		return myself;
	}
	
	public SELF wasUpdatedBefore(Date start) {
		isNotNull();
		if (start == null) {
			failWithMessage("start was null");
		} else {
			Timestamp a = actual.getUpdated();
			if (a == null) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated before:\n <%s>\nbut update time was null",
						getPODescription(), new Timestamp(start.getTime()));
			} else if (!a.before(start)) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated before:\n <%s>\nbut it was updated at:\n <%s>",
						getPODescription(), new Timestamp(start.getTime()), a);
			}
		}
		return myself;
	}

	public SELF wasCreatedAt(long expected) {
		wasCreatedAt(new Timestamp(expected));
		return myself;
	}

	public SELF wasCreatedAt(Instant expected) {
		wasCreatedAt(Date.from(expected));
		return myself;
	}
	
	public SELF wasCreatedAt(Date expected) {
		isNotNull();
		Timestamp a = actual.getCreated();
		if (!Objects.equals(expected, a)) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto have been created at: <%s>\nbut it was created at: <%s>",
					getPODescription(), expected == null ? null : new Timestamp(expected.getTime()), a);
		}
		return myself;
	}
	
	public SELF wasCreatedAfter(long start) {
		wasCreatedAfter(new Timestamp(start));
		return myself;
	}
	
	public SELF wasCreatedAfter(Instant expected) {
		wasCreatedAfter(Date.from(expected));
		return myself;
	}
	
	public SELF wasCreatedAfter(Date start) {
		isNotNull();
		if (start == null) {
			failWithMessage("start was null");
		} else {
			Timestamp a = actual.getCreated();
			if (a == null) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been created after: <%s>\nbut create time was null",
						getPODescription(), new Timestamp(start.getTime()));
			} else if (!a.after(start)) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been created after:\n <%s>\nbut it was created at:\n <%s>",
						getPODescription(), new Timestamp(start.getTime()), a);
			}
		}
		return myself;
	}

	public SELF wasCreatedBefore(long start) {
		wasCreatedBefore(new Timestamp(start));
		return myself;
	}
	
	public SELF wasCreatedBefore(Instant expected) {
		wasCreatedBefore(Date.from(expected));
		return myself;
	}
	
	public SELF wasCreatedBefore(Date start) {
		isNotNull();
		if (start == null) {
			failWithMessage("start was null");
		} else {
			Timestamp a = actual.getCreated();
			if (a == null) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been created before:\n <%s>\nbut create time was null",
						getPODescription(), new Timestamp(start.getTime()));
			} else if (!a.before(start)) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been created before:\n <%s>\nbut it was created at:\n <%s>",
						getPODescription(), new Timestamp(start.getTime()), a);
			}
		}
		return myself;
	}
}
