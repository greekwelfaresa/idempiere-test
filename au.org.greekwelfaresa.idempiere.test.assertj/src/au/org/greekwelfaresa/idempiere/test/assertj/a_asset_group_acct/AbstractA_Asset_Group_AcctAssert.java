/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.a_asset_group_acct;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_A_Asset_Group_Acct;

/** Generated assertion class for A_Asset_Group_Acct
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractA_Asset_Group_AcctAssert<SELF extends AbstractA_Asset_Group_AcctAssert<SELF, ACTUAL>, ACTUAL extends X_A_Asset_Group_Acct>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractA_Asset_Group_AcctAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasA_Accumdepreciation_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Accumdepreciation_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Accumdepreciation_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Group_Acct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Group_Acct_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Group_Acct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Group_Acct_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Group_Acct_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Group_Acct_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Group_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_Conv_F_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Conv_F_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Conv_F_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_Conv_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Conv_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Conv_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_F_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_F_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_F_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_Manual_Amount(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Manual_Amount", actual.getA_Depreciation_Manual_Amount(), expected);
		return myself;
	}


	public SELF hasA_Depreciation_Manual_Period(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Depreciation_Manual_Period();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Manual_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_Method_F_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Method_F_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Method_F_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_Method_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Method_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Method_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_Table_Header_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Depreciation_Table_Header_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Table_Header_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Depreciation_Variable_Perc(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Variable_Perc", actual.getA_Depreciation_Variable_Perc(), expected);
		return myself;
	}


	public SELF hasA_Depreciation_Variable_Perc_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Depreciation_Variable_Perc_F", actual.getA_Depreciation_Variable_Perc_F(), expected);
		return myself;
	}


	public SELF hasA_Disposal_Gain_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Gain_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Gain_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Disposal_Loss_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Loss_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Loss_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Disposal_Revenue_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Disposal_Revenue_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Disposal_Revenue_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Reval_Adep_Offset_Cur_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Adep_Offset_Cur_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Adep_Offset_Cur_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Reval_Adep_Offset_Prior_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Adep_Offset_Prior_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Adep_Offset_Prior_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Reval_Cal_Method(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Reval_Cal_Method();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cal_Method: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Reval_Cost_Offset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Reval_Cost_Offset_Prior_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Prior_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Prior_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Reval_Depexp_Offset_Acct(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Depexp_Offset_Acct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Depexp_Offset_Acct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Split_Percent(Object expected)
	{
		isNotNull();
		bdAssert("A_Split_Percent", actual.getA_Split_Percent(), expected);
		return myself;
	}


	public SELF hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
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

	public SELF isProcessing()
	{
		isNotNull();
		if (!actual.isProcessing()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processing\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProcessing()
	{
		isNotNull();
		if (actual.isProcessing()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processing\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasUseLifeMonths(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeMonths();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeMonths: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUseLifeMonths_F(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeMonths_F();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeMonths_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUseLifeYears(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeYears();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeYears: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUseLifeYears_F(int expected)
	{
		isNotNull();
		int actualField = actual.getUseLifeYears_F();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseLifeYears_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}