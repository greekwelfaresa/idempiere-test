/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.a_asset_change;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_A_Asset_Change;

/** Generated assertion class for A_Asset_Change
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractA_Asset_ChangeAssert<SELF extends AbstractA_Asset_ChangeAssert<SELF, ACTUAL>, ACTUAL extends X_A_Asset_Change>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractA_Asset_ChangeAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasA_Asset_Addition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Addition_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Addition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Change_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Change_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Change_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Change_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Change_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Change_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_CreateDate(Object expected)
	{
		isNotNull();
		dateAssert("A_Asset_CreateDate", actual.getA_Asset_CreateDate(), expected);
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

	public SELF hasA_Asset_Retirement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Retirement_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Retirement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_RevalDate(Object expected)
	{
		isNotNull();
		dateAssert("A_Asset_RevalDate", actual.getA_Asset_RevalDate(), expected);
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

	public SELF hasA_Parent_Asset_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Parent_Asset_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Parent_Asset_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Period_End(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_End();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Period_End: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Period_Start(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Period_Start();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Period_Start: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_QTY_Current(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Current", actual.getA_QTY_Current(), expected);
		return myself;
	}


	public SELF hasA_QTY_Original(Object expected)
	{
		isNotNull();
		bdAssert("A_QTY_Original", actual.getA_QTY_Original(), expected);
		return myself;
	}


	public SELF hasA_Reval_Accumdep_Offset_Cur(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Accumdep_Offset_Cur();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Accumdep_Offset_Cur: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Reval_Accumdep_Offset_Prior(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Accumdep_Offset_Prior();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Accumdep_Offset_Prior: <%s>\nbut it was: <%s>",
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

	public SELF hasA_Reval_Cost_Offset(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset: <%s>\nbut it was: <%s>",
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

	public SELF hasA_Reval_Cost_Offset_Prior(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Cost_Offset_Prior();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Cost_Offset_Prior: <%s>\nbut it was: <%s>",
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

	public SELF hasA_Reval_Depexp_Offset(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Reval_Depexp_Offset();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Depexp_Offset: <%s>\nbut it was: <%s>",
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

	public SELF hasA_Salvage_Value(Object expected)
	{
		isNotNull();
		bdAssert("A_Salvage_Value", actual.getA_Salvage_Value(), expected);
		return myself;
	}


	public SELF hasA_Split_Percent(Object expected)
	{
		isNotNull();
		bdAssert("A_Split_Percent", actual.getA_Split_Percent(), expected);
		return myself;
	}


	public SELF hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAssetAccumDepreciationAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetAccumDepreciationAmt", actual.getAssetAccumDepreciationAmt(), expected);
		return myself;
	}


	public SELF hasAssetBookValueAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetBookValueAmt", actual.getAssetBookValueAmt(), expected);
		return myself;
	}


	public SELF hasAssetDepreciationDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDepreciationDate", actual.getAssetDepreciationDate(), expected);
		return myself;
	}


	public SELF hasAssetDisposalDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetDisposalDate", actual.getAssetDisposalDate(), expected);
		return myself;
	}


	public SELF hasAssetMarketValueAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetMarketValueAmt", actual.getAssetMarketValueAmt(), expected);
		return myself;
	}


	public SELF hasAssetServiceDate(Object expected)
	{
		isNotNull();
		dateAssert("AssetServiceDate", actual.getAssetServiceDate(), expected);
		return myself;
	}


	public SELF hasAssetValueAmt(Object expected)
	{
		isNotNull();
		bdAssert("AssetValueAmt", actual.getAssetValueAmt(), expected);
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

	public SELF hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ValidCombination_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ValidCombination_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ValidCombination_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasChangeAmt(Object expected)
	{
		isNotNull();
		bdAssert("ChangeAmt", actual.getChangeAmt(), expected);
		return myself;
	}


	public SELF hasChangeDate(Object expected)
	{
		isNotNull();
		dateAssert("ChangeDate", actual.getChangeDate(), expected);
		return myself;
	}


	public SELF hasChangeType(String expected)
	{
		isNotNull();
		String actualField = actual.getChangeType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ChangeType: <%s>\nbut it was: <%s>",
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

	public SELF isDisposed()
	{
		isNotNull();
		if (!actual.isDisposed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Disposed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDisposed()
	{
		isNotNull();
		if (actual.isDisposed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Disposed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFullyDepreciated()
	{
		isNotNull();
		if (!actual.isFullyDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FullyDepreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFullyDepreciated()
	{
		isNotNull();
		if (actual.isFullyDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FullyDepreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isInPosession()
	{
		isNotNull();
		if (!actual.isInPosession()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InPosession\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInPosession()
	{
		isNotNull();
		if (actual.isInPosession()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InPosession\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOwned()
	{
		isNotNull();
		if (!actual.isOwned()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Owned\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOwned()
	{
		isNotNull();
		if (actual.isOwned()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Owned\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLifeUseUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getLifeUseUnits();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LifeUseUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLot(String expected)
	{
		isNotNull();
		String actualField = actual.getLot();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Lot: <%s>\nbut it was: <%s>",
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

	public SELF hasSerNo(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SerNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTextDetails(String expected)
	{
		isNotNull();
		String actualField = actual.getTextDetails();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TextDetails: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
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

	public SELF hasUseUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getUseUnits();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UseUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasVersionNo(String expected)
	{
		isNotNull();
		String actualField = actual.getVersionNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VersionNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}