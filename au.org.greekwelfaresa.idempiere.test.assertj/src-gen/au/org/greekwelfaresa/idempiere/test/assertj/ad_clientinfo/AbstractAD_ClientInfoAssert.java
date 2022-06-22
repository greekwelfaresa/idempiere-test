/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_clientinfo;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_ClientInfo;

/** Generated assertion class for AD_ClientInfo
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_ClientInfoAssert<SELF extends AbstractAD_ClientInfoAssert<SELF, ACTUAL>, ACTUAL extends X_AD_ClientInfo>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_ClientInfoAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_ClientInfo_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_ClientInfo_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ClientInfo_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_StorageProvider_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_StorageProvider_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_StorageProvider_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tree_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tree_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tree_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tree_Menu_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Menu_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_Menu_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tree_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Org_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tree_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tree_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tree_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_SalesRegion_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_AcctSchema1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema1_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BPartnerCashTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartnerCashTrx_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartnerCashTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Calendar_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Calendar_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Calendar_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ChargeFreight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ChargeFreight_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ChargeFreight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_Length_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Length_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Length_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_Time_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Time_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Time_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_Volume_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Volume_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Volume_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_Weight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Weight_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Weight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFY_StartDate(Object expected)
	{
		isNotNull();
		dateAssert("FY_StartDate", actual.getFY_StartDate(), expected);
		return myself;
	}


	public SELF isConfirmOnDocClose()
	{
		isNotNull();
		if (!actual.isConfirmOnDocClose()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ConfirmOnDocClose\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotConfirmOnDocClose()
	{
		isNotNull();
		if (actual.isConfirmOnDocClose()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ConfirmOnDocClose\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isConfirmOnDocVoid()
	{
		isNotNull();
		if (!actual.isConfirmOnDocVoid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ConfirmOnDocVoid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotConfirmOnDocVoid()
	{
		isNotNull();
		if (actual.isConfirmOnDocVoid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ConfirmOnDocVoid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDiscountLineAmt()
	{
		isNotNull();
		if (!actual.isDiscountLineAmt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountLineAmt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDiscountLineAmt()
	{
		isNotNull();
		if (actual.isDiscountLineAmt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountLineAmt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasKeepLogDays(int expected)
	{
		isNotNull();
		int actualField = actual.getKeepLogDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have KeepLogDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLogo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLogo_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Logo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLogoReport_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLogoReport_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LogoReport_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLogoWeb_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLogoWeb_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LogoWeb_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_ProductFreight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductFreight_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ProductFreight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasStorageArchive_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getStorageArchive_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have StorageArchive_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}