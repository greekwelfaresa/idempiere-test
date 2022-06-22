/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.a_asset_split;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_A_Asset_Split;

/** Generated assertion class for A_Asset_Split
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractA_Asset_SplitAssert<SELF extends AbstractA_Asset_SplitAssert<SELF, ACTUAL>, ACTUAL extends X_A_Asset_Split>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractA_Asset_SplitAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasA_Amount_Split(Object expected)
	{
		isNotNull();
		bdAssert("A_Amount_Split", actual.getA_Amount_Split(), expected);
		return myself;
	}


	public SELF hasA_Asset_Acct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Acct_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Acct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Cost(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Cost", actual.getA_Asset_Cost(), expected);
		return myself;
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

	public SELF hasA_Asset_ID_To(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_ID_To();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_ID_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Split_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Split_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Split_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Split_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Split_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Split_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_Workfile_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Workfile_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Workfile_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Percent_Original(Object expected)
	{
		isNotNull();
		bdAssert("A_Percent_Original", actual.getA_Percent_Original(), expected);
		return myself;
	}


	public SELF hasA_Percent_Split(Object expected)
	{
		isNotNull();
		bdAssert("A_Percent_Split", actual.getA_Percent_Split(), expected);
		return myself;
	}


	public SELF hasA_QTY_Current(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Current", actual.getA_QTY_Current(), expected);
		return myself;
	}


	public SELF hasA_QTY_Split(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Split", actual.getA_QTY_Split(), expected);
		return myself;
	}


	public SELF hasA_Split_Type(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Split_Type();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Split_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isA_Transfer_Balance_IS()
	{
		isNotNull();
		if (!actual.isA_Transfer_Balance_IS()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be A_Transfer_Balance_IS\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotA_Transfer_Balance_IS()
	{
		isNotNull();
		if (actual.isA_Transfer_Balance_IS()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be A_Transfer_Balance_IS\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasC_Period_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Period_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Period_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public SELF hasPostingType(String expected)
	{
		isNotNull();
		String actualField = actual.getPostingType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PostingType: <%s>\nbut it was: <%s>",
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
}