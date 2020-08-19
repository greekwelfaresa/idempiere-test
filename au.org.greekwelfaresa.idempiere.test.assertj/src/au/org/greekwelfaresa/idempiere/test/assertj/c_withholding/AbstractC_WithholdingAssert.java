/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_withholding;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_Withholding;

/** Generated assertion class for C_Withholding
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_WithholdingAssert<SELF extends AbstractC_WithholdingAssert<SELF, ACTUAL>, ACTUAL extends X_C_Withholding>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_WithholdingAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasBeneficiary(int expected)
	{
		isNotNull();
		int actualField = actual.getBeneficiary();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Beneficiary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Withholding_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Withholding_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Withholding_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Withholding_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Withholding_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Withholding_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFixAmt(Object expected)
	{
		isNotNull();
		bdAssert("FixAmt", actual.getFixAmt(), expected);
		return myself;
	}


	public SELF isPaidTo3Party()
	{
		isNotNull();
		if (!actual.isPaidTo3Party()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaidTo3Party\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPaidTo3Party()
	{
		isNotNull();
		if (actual.isPaidTo3Party()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaidTo3Party\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPercentWithholding()
	{
		isNotNull();
		if (!actual.isPercentWithholding()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PercentWithholding\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPercentWithholding()
	{
		isNotNull();
		if (actual.isPercentWithholding()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PercentWithholding\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTaxProrated()
	{
		isNotNull();
		if (!actual.isTaxProrated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxProrated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTaxProrated()
	{
		isNotNull();
		if (actual.isTaxProrated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxProrated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTaxWithholding()
	{
		isNotNull();
		if (!actual.isTaxWithholding()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxWithholding\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTaxWithholding()
	{
		isNotNull();
		if (actual.isTaxWithholding()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxWithholding\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasMaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("MaxAmt", actual.getMaxAmt(), expected);
		return myself;
	}


	public SELF hasMinAmt(Object expected)
	{
		isNotNull();
		bdAssert("MinAmt", actual.getMinAmt(), expected);
		return myself;
	}


	public SELF hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPercent(Object expected)
	{
		isNotNull();
		bdAssert("Percent", actual.getPercent(), expected);
		return myself;
	}


	public SELF hasThresholdMax(Object expected)
	{
		isNotNull();
		bdAssert("ThresholdMax", actual.getThresholdMax(), expected);
		return myself;
	}


	public SELF hasThresholdmin(Object expected)
	{
		isNotNull();
		bdAssert("Thresholdmin", actual.getThresholdmin(), expected);
		return myself;
	}

}