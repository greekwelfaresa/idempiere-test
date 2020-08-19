/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.t_invoicegl;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_T_InvoiceGL;

/** Generated assertion class for T_InvoiceGL
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractT_InvoiceGLAssert<SELF extends AbstractT_InvoiceGLAssert<SELF, ACTUAL>, ACTUAL extends X_T_InvoiceGL>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractT_InvoiceGLAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAmtAcctBalance(Object expected)
	{
		isNotNull();
		bdAssert("AmtAcctBalance", actual.getAmtAcctBalance(), expected);
		return myself;
	}


	public SELF hasAmtRevalCr(Object expected)
	{
		isNotNull();
		bdAssert("AmtRevalCr", actual.getAmtRevalCr(), expected);
		return myself;
	}


	public SELF hasAmtRevalCrDiff(Object expected)
	{
		isNotNull();
		bdAssert("AmtRevalCrDiff", actual.getAmtRevalCrDiff(), expected);
		return myself;
	}


	public SELF hasAmtRevalDr(Object expected)
	{
		isNotNull();
		bdAssert("AmtRevalDr", actual.getAmtRevalDr(), expected);
		return myself;
	}


	public SELF hasAmtRevalDrDiff(Object expected)
	{
		isNotNull();
		bdAssert("AmtRevalDrDiff", actual.getAmtRevalDrDiff(), expected);
		return myself;
	}


	public SELF hasAmtSourceBalance(Object expected)
	{
		isNotNull();
		bdAssert("AmtSourceBalance", actual.getAmtSourceBalance(), expected);
		return myself;
	}


	public SELF hasAPAR(String expected)
	{
		isNotNull();
		String actualField = actual.getAPAR();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have APAR: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ConversionTypeReval_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ConversionTypeReval_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ConversionTypeReval_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DocTypeReval_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeReval_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeReval_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDateReval(Object expected)
	{
		isNotNull();
		dateAssert("DateReval", actual.getDateReval(), expected);
		return myself;
	}


	public SELF hasFact_Acct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getFact_Acct_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Fact_Acct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGrandTotal(Object expected)
	{
		isNotNull();
		bdAssert("GrandTotal", actual.getGrandTotal(), expected);
		return myself;
	}


	public SELF isAllCurrencies()
	{
		isNotNull();
		if (!actual.isAllCurrencies()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllCurrencies\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllCurrencies()
	{
		isNotNull();
		if (actual.isAllCurrencies()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllCurrencies\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasOpenAmt(Object expected)
	{
		isNotNull();
		bdAssert("OpenAmt", actual.getOpenAmt(), expected);
		return myself;
	}


	public SELF hasPercent(Object expected)
	{
		isNotNull();
		bdAssert("Percent", actual.getPercent(), expected);
		return myself;
	}


	public SELF hasT_InvoiceGL_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_InvoiceGL_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have T_InvoiceGL_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}