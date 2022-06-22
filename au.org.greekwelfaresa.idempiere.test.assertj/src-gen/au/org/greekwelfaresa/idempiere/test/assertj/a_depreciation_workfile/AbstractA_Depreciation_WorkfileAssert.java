/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.a_depreciation_workfile;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_A_Depreciation_Workfile;

/** Generated assertion class for A_Depreciation_Workfile
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractA_Depreciation_WorkfileAssert<SELF extends AbstractA_Depreciation_WorkfileAssert<SELF, ACTUAL>, ACTUAL extends X_A_Depreciation_Workfile>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractA_Depreciation_WorkfileAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasA_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr", actual.getA_Accumulated_Depr(), expected);
		return myself;
	}


	public SELF hasA_Accumulated_Depr_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Accumulated_Depr_F", actual.getA_Accumulated_Depr_F(), expected);
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

	public SELF hasA_Asset_Life_Current_Year(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Life_Current_Year", actual.getA_Asset_Life_Current_Year(), expected);
		return myself;
	}


	public SELF hasA_Asset_Life_Years(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Life_Years();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Life_Years: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Life_Years_F(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Life_Years_F();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Life_Years_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Remaining(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Remaining", actual.getA_Asset_Remaining(), expected);
		return myself;
	}


	public SELF hasA_Asset_Remaining_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Asset_Remaining_F", actual.getA_Asset_Remaining_F(), expected);
		return myself;
	}


	public SELF hasA_Base_Amount(Object expected)
	{
		isNotNull();
		bdAssert("A_Base_Amount", actual.getA_Base_Amount(), expected);
		return myself;
	}


	public SELF hasA_Calc_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Calc_Accumulated_Depr", actual.getA_Calc_Accumulated_Depr(), expected);
		return myself;
	}


	public SELF hasA_Curr_Dep_Exp(Object expected)
	{
		isNotNull();
		bdAssert("A_Curr_Dep_Exp", actual.getA_Curr_Dep_Exp(), expected);
		return myself;
	}


	public SELF hasA_Current_Period(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Current_Period();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Current_Period: <%s>\nbut it was: <%s>",
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

	public SELF hasA_Depreciation_Workfile_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Depreciation_Workfile_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Depreciation_Workfile_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Expense_SL(Object expected)
	{
		isNotNull();
		bdAssert("A_Expense_SL", actual.getA_Expense_SL(), expected);
		return myself;
	}


	public SELF hasA_Expense_SL_F(Object expected)
	{
		isNotNull();
		bdAssert("A_Expense_SL_F", actual.getA_Expense_SL_F(), expected);
		return myself;
	}


	public SELF hasA_FundingMode_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_FundingMode_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_FundingMode_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Life_Period(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Life_Period: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Life_Period_F(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_F();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Life_Period_F: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Life_Period_Max(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_Max();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Life_Period_Max: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Life_Period_Min(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Life_Period_Min();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Life_Period_Min: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Period_Forecast(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_Forecast", actual.getA_Period_Forecast(), expected);
		return myself;
	}


	public SELF hasA_Period_Posted(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_Posted();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Period_Posted: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Prior_Year_Accumulated_Depr(Object expected)
	{
		isNotNull();
		bdAssert("A_Prior_Year_Accumulated_Depr", actual.getA_Prior_Year_Accumulated_Depr(), expected);
		return myself;
	}


	public SELF hasA_QTY_Current(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Current", actual.getA_QTY_Current(), expected);
		return myself;
	}


	public SELF hasA_Salvage_Value(Object expected)
	{
		isNotNull();
		bdAssert("A_Salvage_Value", actual.getA_Salvage_Value(), expected);
		return myself;
	}


	public SELF hasA_Tip_Finantare(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Tip_Finantare();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Tip_Finantare: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Valoare_Cofinantare(Object expected)
	{
		isNotNull();
		bdAssert("A_Valoare_Cofinantare", actual.getA_Valoare_Cofinantare(), expected);
		return myself;
	}


	public SELF hasA_Valoare_Tert(Object expected)
	{
		isNotNull();
		bdAssert("A_Valoare_Tert", actual.getA_Valoare_Tert(), expected);
		return myself;
	}


	public SELF hasAssetDepreciationDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDepreciationDate", actual.getAssetDepreciationDate(), expected);
		return myself;
	}


	public SELF hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
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

	public SELF isDepreciated()
	{
		isNotNull();
		if (!actual.isDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Depreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDepreciated()
	{
		isNotNull();
		if (actual.isDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Depreciated\nbut it was",
				getPODescription());
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