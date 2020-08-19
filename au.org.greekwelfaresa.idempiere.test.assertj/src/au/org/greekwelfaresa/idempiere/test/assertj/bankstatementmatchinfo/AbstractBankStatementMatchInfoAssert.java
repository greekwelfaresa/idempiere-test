package au.org.greekwelfaresa.idempiere.test.assertj.bankstatementmatchinfo;

import org.compiere.impexp.BankStatementMatchInfo;

import au.org.greekwelfaresa.idempiere.test.assertj.AbstractIDAssert;

public abstract class AbstractBankStatementMatchInfoAssert<SELF extends AbstractBankStatementMatchInfoAssert<SELF, ACTUAL>, ACTUAL extends BankStatementMatchInfo>
	extends AbstractIDAssert<SELF, ACTUAL> {

	public AbstractBankStatementMatchInfoAssert(ACTUAL actual, Class<SELF> selfType) {
		super(actual, selfType);
	}

	protected String getDescription() {
		return "BankStatementMatchInfo";
	}
	
	public SELF isMatched()
	{
		isNotNull();
		if (!actual.isMatched()) {
			failWithMessage("\nExpecting BankStatementMatchInfo to be Matched\nbut it was not");
		}
		return myself;
	}

	public SELF isNotMatched()
	{
		isNotNull();
		if (!actual.isMatched()) {
			failWithMessage("\nExpecting BankStatementMatchInfo to not be Matched\nbut it was");
		}
		return myself;
	}

	public SELF hasC_BPartner_ID(int expected) {
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting BankStatementMatchInfo:\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				expected, actualField);
		}
		return myself;
	}
	
	public SELF hasC_Payment_ID(int expected) {
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting BankStatementMatchInfo:\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				expected, actualField);
		}
		return myself;
	}
	
	public SELF hasC_Invoice_ID(int expected) {
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithMessage("\nExpecting BankStatementMatchInfo:\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				expected, actualField);
		}
		return myself;
	}
}
