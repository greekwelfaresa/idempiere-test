/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.a_asset_info_ins;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_A_Asset_Info_Ins;

/** Generated assertion class for A_Asset_Info_Ins
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractA_Asset_Info_InsAssert<SELF extends AbstractA_Asset_Info_InsAssert<SELF, ACTUAL>, ACTUAL extends X_A_Asset_Info_Ins>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractA_Asset_Info_InsAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasA_Asset_Info_Ins_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Info_Ins_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Ins_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Info_Ins_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Info_Ins_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Info_Ins_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Ins_Premium(Object expected)
	{
		isNotNull();
		bdAssert("A_Ins_Premium", actual.getA_Ins_Premium(), expected);
		return myself;
	}


	public SELF hasA_Ins_Value(Object expected)
	{
		isNotNull();
		bdAssert("A_Ins_Value", actual.getA_Ins_Value(), expected);
		return myself;
	}


	public SELF hasA_Insurance_Co(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Insurance_Co();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Insurance_Co: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Policy_No(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Policy_No();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Policy_No: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Renewal_Date(Object expected)
	{
		isNotNull();
		dateAssert("A_Renewal_Date", actual.getA_Renewal_Date(), expected);
		return myself;
	}


	public SELF hasA_Replace_Cost(Object expected)
	{
		isNotNull();
		bdAssert("A_Replace_Cost", actual.getA_Replace_Cost(), expected);
		return myself;
	}


	public SELF hasText(String expected)
	{
		isNotNull();
		String actualField = actual.getText();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Text: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}