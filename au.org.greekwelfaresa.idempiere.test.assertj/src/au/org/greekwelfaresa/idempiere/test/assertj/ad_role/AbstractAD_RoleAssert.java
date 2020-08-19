/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_role;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Role;

/** Generated assertion class for AD_Role
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_RoleAssert<SELF extends AbstractAD_RoleAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Role>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_RoleAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Role_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Role_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Role_UU: <%s>\nbut it was: <%s>",
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

	public SELF isAllow_Info_Account()
	{
		isNotNull();
		if (!actual.isAllow_Info_Account()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Account\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_Account()
	{
		isNotNull();
		if (actual.isAllow_Info_Account()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Account\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllow_Info_Asset()
	{
		isNotNull();
		if (!actual.isAllow_Info_Asset()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Asset\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_Asset()
	{
		isNotNull();
		if (actual.isAllow_Info_Asset()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Asset\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllow_Info_BPartner()
	{
		isNotNull();
		if (!actual.isAllow_Info_BPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_BPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_BPartner()
	{
		isNotNull();
		if (actual.isAllow_Info_BPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_BPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllow_Info_InOut()
	{
		isNotNull();
		if (!actual.isAllow_Info_InOut()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_InOut\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_InOut()
	{
		isNotNull();
		if (actual.isAllow_Info_InOut()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_InOut\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllow_Info_Invoice()
	{
		isNotNull();
		if (!actual.isAllow_Info_Invoice()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Invoice\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_Invoice()
	{
		isNotNull();
		if (actual.isAllow_Info_Invoice()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Invoice\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllow_Info_Order()
	{
		isNotNull();
		if (!actual.isAllow_Info_Order()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Order\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_Order()
	{
		isNotNull();
		if (actual.isAllow_Info_Order()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Order\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllow_Info_Payment()
	{
		isNotNull();
		if (!actual.isAllow_Info_Payment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Payment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_Payment()
	{
		isNotNull();
		if (actual.isAllow_Info_Payment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Payment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllow_Info_Product()
	{
		isNotNull();
		if (!actual.isAllow_Info_Product()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Product\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_Product()
	{
		isNotNull();
		if (actual.isAllow_Info_Product()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Product\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllow_Info_Resource()
	{
		isNotNull();
		if (!actual.isAllow_Info_Resource()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Resource\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_Resource()
	{
		isNotNull();
		if (actual.isAllow_Info_Resource()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Resource\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllow_Info_Schedule()
	{
		isNotNull();
		if (!actual.isAllow_Info_Schedule()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Allow_Info_Schedule\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllow_Info_Schedule()
	{
		isNotNull();
		if (actual.isAllow_Info_Schedule()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Allow_Info_Schedule\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasAmtApproval(Object expected)
	{
		isNotNull();
		bdAssert("AmtApproval", actual.getAmtApproval(), expected);
		return myself;
	}


	public SELF hasAmtApprovalAccum(Object expected)
	{
		isNotNull();
		bdAssert("AmtApprovalAccum", actual.getAmtApprovalAccum(), expected);
		return myself;
	}


	public SELF hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasConfirmQueryRecords(int expected)
	{
		isNotNull();
		int actualField = actual.getConfirmQueryRecords();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfirmQueryRecords: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDaysApprovalAccum(int expected)
	{
		isNotNull();
		int actualField = actual.getDaysApprovalAccum();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DaysApprovalAccum: <%s>\nbut it was: <%s>",
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

	public SELF isAccessAdvanced()
	{
		isNotNull();
		if (!actual.isAccessAdvanced()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AccessAdvanced\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAccessAdvanced()
	{
		isNotNull();
		if (actual.isAccessAdvanced()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AccessAdvanced\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAccessAllOrgs()
	{
		isNotNull();
		if (!actual.isAccessAllOrgs()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AccessAllOrgs\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAccessAllOrgs()
	{
		isNotNull();
		if (actual.isAccessAllOrgs()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AccessAllOrgs\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCanApproveOwnDoc()
	{
		isNotNull();
		if (!actual.isCanApproveOwnDoc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CanApproveOwnDoc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCanApproveOwnDoc()
	{
		isNotNull();
		if (actual.isCanApproveOwnDoc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CanApproveOwnDoc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCanExport()
	{
		isNotNull();
		if (!actual.isCanExport()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CanExport\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCanExport()
	{
		isNotNull();
		if (actual.isCanExport()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CanExport\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCanReport()
	{
		isNotNull();
		if (!actual.isCanReport()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CanReport\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCanReport()
	{
		isNotNull();
		if (actual.isCanReport()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CanReport\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isChangeLog()
	{
		isNotNull();
		if (!actual.isChangeLog()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChangeLog\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotChangeLog()
	{
		isNotNull();
		if (actual.isChangeLog()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChangeLog\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDiscountAllowedOnTotal()
	{
		isNotNull();
		if (!actual.isDiscountAllowedOnTotal()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountAllowedOnTotal\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDiscountAllowedOnTotal()
	{
		isNotNull();
		if (actual.isDiscountAllowedOnTotal()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountAllowedOnTotal\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDiscountUptoLimitPrice()
	{
		isNotNull();
		if (!actual.isDiscountUptoLimitPrice()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountUptoLimitPrice\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDiscountUptoLimitPrice()
	{
		isNotNull();
		if (actual.isDiscountUptoLimitPrice()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountUptoLimitPrice\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isManual()
	{
		isNotNull();
		if (!actual.isManual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotManual()
	{
		isNotNull();
		if (actual.isManual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMasterRole()
	{
		isNotNull();
		if (!actual.isMasterRole()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MasterRole\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMasterRole()
	{
		isNotNull();
		if (actual.isMasterRole()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MasterRole\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuAutoExpand()
	{
		isNotNull();
		if (!actual.isMenuAutoExpand()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuAutoExpand\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuAutoExpand()
	{
		isNotNull();
		if (actual.isMenuAutoExpand()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuAutoExpand\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPersonalAccess()
	{
		isNotNull();
		if (!actual.isPersonalAccess()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PersonalAccess\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPersonalAccess()
	{
		isNotNull();
		if (actual.isPersonalAccess()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PersonalAccess\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPersonalLock()
	{
		isNotNull();
		if (!actual.isPersonalLock()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PersonalLock\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPersonalLock()
	{
		isNotNull();
		if (actual.isPersonalLock()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PersonalLock\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isShowAcct()
	{
		isNotNull();
		if (!actual.isShowAcct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowAcct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotShowAcct()
	{
		isNotNull();
		if (actual.isShowAcct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowAcct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUseUserOrgAccess()
	{
		isNotNull();
		if (!actual.isUseUserOrgAccess()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseUserOrgAccess\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUseUserOrgAccess()
	{
		isNotNull();
		if (actual.isUseUserOrgAccess()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseUserOrgAccess\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasMaxQueryRecords(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxQueryRecords();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MaxQueryRecords: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
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

	public SELF isOverwritePriceLimit()
	{
		isNotNull();
		if (!actual.isOverwritePriceLimit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwritePriceLimit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwritePriceLimit()
	{
		isNotNull();
		if (actual.isOverwritePriceLimit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwritePriceLimit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasPreferenceType(String expected)
	{
		isNotNull();
		String actualField = actual.getPreferenceType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PreferenceType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRoleType(String expected)
	{
		isNotNull();
		String actualField = actual.getRoleType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RoleType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSupervisor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSupervisor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Supervisor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUserDiscount(Object expected)
	{
		isNotNull();
		bdAssert("UserDiscount", actual.getUserDiscount(), expected);
		return myself;
	}


	public SELF hasUserLevel(String expected)
	{
		isNotNull();
		String actualField = actual.getUserLevel();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UserLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}