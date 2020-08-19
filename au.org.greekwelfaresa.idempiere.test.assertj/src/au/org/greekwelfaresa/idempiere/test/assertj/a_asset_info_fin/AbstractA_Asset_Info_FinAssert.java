/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.a_asset_info_fin;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_A_Asset_Info_Fin;

/** Generated assertion class for A_Asset_Info_Fin
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractA_Asset_Info_FinAssert<SELF extends AbstractA_Asset_Info_FinAssert<SELF, ACTUAL>, ACTUAL extends X_A_Asset_Info_Fin>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractA_Asset_Info_FinAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasA_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Info_Fin_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Info_Fin_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Fin_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Info_Fin_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Info_Fin_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Fin_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Contract_Date(Object expected)
	{
		isNotNull();
		dateAssert("A_Contract_Date", actual.getA_Contract_Date(), expected);
		return myself;
	}


	public SELF hasA_Due_On(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Due_On();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Due_On: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Expired_Date(Object expected)
	{
		isNotNull();
		dateAssert("A_Expired_Date", actual.getA_Expired_Date(), expected);
		return myself;
	}


	public SELF hasA_Finance_Meth(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Finance_Meth();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Finance_Meth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Monthly_Payment(Object expected)
	{
		isNotNull();
		bdAssert("A_Monthly_Payment", actual.getA_Monthly_Payment(), expected);
		return myself;
	}


	public SELF isA_Purchase_Option()
	{
		isNotNull();
		if (!actual.isA_Purchase_Option()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_Purchase_Option\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotA_Purchase_Option()
	{
		isNotNull();
		if (actual.isA_Purchase_Option()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_Purchase_Option\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasA_Purchase_Option_Credit(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Purchase_Option_Credit();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Purchase_Option_Credit: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Purchase_Option_Credit_Per(Object expected)
	{
		isNotNull();
		bdAssert("A_Purchase_Option_Credit_Per", actual.getA_Purchase_Option_Credit_Per(), expected);
		return myself;
	}


	public SELF hasA_Purchase_Price(Object expected)
	{
		isNotNull();
		bdAssert("A_Purchase_Price", actual.getA_Purchase_Price(), expected);
		return myself;
	}


	public SELF hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasTextMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getTextMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TextMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}