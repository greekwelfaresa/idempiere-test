/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_commissionamt;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_CommissionAmt;

/** Generated assertion class for C_CommissionAmt
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_CommissionAmtAssert<SELF extends AbstractC_CommissionAmtAssert<SELF, ACTUAL>, ACTUAL extends X_C_CommissionAmt>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_CommissionAmtAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasActualQty(Object expected)
	{
		isNotNull();
		bdAssert("ActualQty", actual.getActualQty(), expected);
		return myself;
	}


	public SELF hasC_CommissionAmt_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CommissionAmt_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CommissionAmt_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_CommissionAmt_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_CommissionAmt_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CommissionAmt_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_CommissionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CommissionLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CommissionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_CommissionRun_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CommissionRun_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CommissionRun_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCommissionAmt(Object expected)
	{
		isNotNull();
		bdAssert("CommissionAmt", actual.getCommissionAmt(), expected);
		return myself;
	}


	public SELF hasConvertedAmt(Object expected)
	{
		isNotNull();
		bdAssert("ConvertedAmt", actual.getConvertedAmt(), expected);
		return myself;
	}

}