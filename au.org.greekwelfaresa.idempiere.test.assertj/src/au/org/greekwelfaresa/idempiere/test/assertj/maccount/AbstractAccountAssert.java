package au.org.greekwelfaresa.idempiere.test.assertj.maccount;

import org.compiere.model.MAccount;
import org.compiere.model.MElementValue;

import au.org.greekwelfaresa.idempiere.test.assertj.c_validcombination.AbstractC_ValidCombinationAssert;

public class AbstractAccountAssert<SELF extends AbstractC_ValidCombinationAssert<SELF, ACTUAL>, ACTUAL extends MAccount>
	extends AbstractC_ValidCombinationAssert<SELF, ACTUAL> {

	public AbstractAccountAssert(ACTUAL actual, Class<SELF> selfType) {
		super(actual, selfType);
	}

	public SELF hasAccount(MElementValue expected)
	{
		isNotNull();
		if (actual.getAccount_ID() != expected.get_ID()) {
			// Lazy evaluation.
			MElementValue actualField = actual.getAccount();
			throw failureWithActualExpected(actualField, expected, "\nExpecting MAccount: \n  <%s>\n to have Account: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
	
	@Override
	public String getPODescription() {
		return actual.toString();
	}
}
