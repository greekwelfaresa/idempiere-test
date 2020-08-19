package au.org.greekwelfaresa.idempiere.test.assertj.po;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

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
	
	protected String getPODescription() {
		return "[" + actual.get_TableName() + ":" + actual.get_ID() + "]";
	}
	
	public SELF hasColumnCount(int expected) {
		isNotNull();
		int actualColumnCount = actual.get_ColumnCount();
		if (actualColumnCount != expected) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto have <%s> columns\nbut it has <%s>", getPODescription(), expected, actualColumnCount);
		}
		return myself;
	}
	
	public SELF hasColumn(String columnName, Object expected) {
		isNotNull();
		
		Object actualColumn = actual.get_Value(columnName);
		System.err.println("actual: " + actual + ", actualColumn: " + actualColumn + ", expected: " + expected);
		if (!Objects.equals(expected, actualColumn)) {
			failWithMessage("\nExpecting PO:\n  <%s>\ncolumn <%s>\nto have value <%s>\nbut it was <%s>", getPODescription(), columnName, expected, actualColumn);
		}
		return myself;
	}
	
	public SELF hasID(int expected) {
		isNotNull();
		int actualID = actual.get_ID();
		if (actualID != expected) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto have ID: <%s>\nbut it was: <%s>", getPODescription(), expected, actualID);
		}
		return myself;
	}
	
	public SELF hasClientID(int expected) {
		isNotNull();
		int actualID = actual.getAD_Client_ID();
		if (actualID != expected) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto have client ID: <%s>\nbut it was: <%s>", getPODescription(), expected, actualID);
		}
		return myself;
	}
	
	public SELF hasOrgID(int expected) {
		isNotNull();
		int actualID = actual.getAD_Org_ID();
		if (actualID != expected) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto have org ID: <%s>\nbut it was: <%s>", getPODescription(), expected, actualID);
		} 
		return myself;
	}
	
	public SELF isActive() {
		isNotNull();
		if (!actual.isActive()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be active", getPODescription());
		}
		return myself;
	}

	public SELF isNotActive() {
		isNotNull();
		if (actual.isActive()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be inactive", getPODescription());
		}
		return myself;
	}

	public SELF isNew() {
		isNotNull();
		if (!actual.is_new()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be new", getPODescription());
		}
		return myself;
	}

	public SELF isNotNew() {
		isNotNull();
		if (actual.is_new()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto not be new", getPODescription());
		}
		return myself;
	}

	public SELF isChanged() {
		isNotNull();
		if (!actual.is_Changed()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be changed", getPODescription());
		}
		return myself;
	}

	public SELF isNotChanged() {
		isNotNull();
		if (actual.is_Changed()) {
			failWithMessage("\nExpecting PO:\n <%s>\nto be unchanged", getPODescription());
		}
		return myself;
	}

	public SELF wasUpdatedBy(int expected) {
		isNotNull();
		int a = actual.getUpdatedBy();
		if (a != expected) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated by userID: <%s>\nbut it was: <%s>",
					getPODescription(), expected, a);
		}
		return myself;
	}

	public SELF wasCreatedBy(int expected) {
		isNotNull();
		int a = actual.getCreatedBy();
		if (a != expected) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto have been created by userID: <%s>\nbut it was: <%s>",
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
			failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated at: <%s>\nbut it was updated at: <%s>",
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
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated after: <%s>\nbut update time was null",
						getPODescription(), new Timestamp(start.getTime()));
			} else if (!a.after(start)) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated after: <%s>\nbut it was updated at: <%s>",
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
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated before: <%s>\nbut update time was null",
						getPODescription(), new Timestamp(start.getTime()));
			} else if (!a.before(start)) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated before: <%s>\nbut it was updated at: <%s>",
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
			failWithMessage("\nExpecting PO:\n  <%s>\nto have been updated at: <%s>\nbut it was updated at: <%s>",
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
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been created after: <%s>\nbut it was created at: <%s>",
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
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been created before: <%s>\nbut create time was null",
						getPODescription(), new Timestamp(start.getTime()));
			} else if (!a.before(start)) {
				failWithMessage("\nExpecting PO:\n  <%s>\nto have been created before: <%s>\nbut it was created at: <%s>",
						getPODescription(), new Timestamp(start.getTime()), a);
			}
		}
		return myself;
	}
}
