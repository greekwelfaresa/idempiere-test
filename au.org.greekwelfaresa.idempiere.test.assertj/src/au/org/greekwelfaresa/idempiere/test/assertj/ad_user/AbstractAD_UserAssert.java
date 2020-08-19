/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_user;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_User;

/** Generated assertion class for AD_User
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_UserAssert<SELF extends AbstractAD_UserAssert<SELF, ACTUAL>, ACTUAL extends X_AD_User>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_UserAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Image_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Image_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Image_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
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

	public SELF hasAD_User_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_User_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAnswer(String expected)
	{
		isNotNull();
		String actualField = actual.getAnswer();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Answer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBirthday(Object expected)
	{
		isNotNull();
		dateAssert("Birthday", actual.getBirthday(), expected);
		return myself;
	}


	public SELF hasBP_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBP_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BP_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBPName(String expected)
	{
		isNotNull();
		String actualField = actual.getBPName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BPName: <%s>\nbut it was: <%s>",
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

	public SELF hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Greeting_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Greeting_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Greeting_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Job_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Job_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Job_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasComments(String expected)
	{
		isNotNull();
		String actualField = actual.getComments();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Comments: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDateAccountLocked(Object expected)
	{
		isNotNull();
		dateAssert("DateAccountLocked", actual.getDateAccountLocked(), expected);
		return myself;
	}


	public SELF hasDateLastLogin(Object expected)
	{
		isNotNull();
		dateAssert("DateLastLogin", actual.getDateLastLogin(), expected);
		return myself;
	}


	public SELF hasDatePasswordChanged(Object expected)
	{
		isNotNull();
		dateAssert("DatePasswordChanged", actual.getDatePasswordChanged(), expected);
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

	public SELF hasEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMailUser(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailUser();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMailUser: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMailUserPW(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailUserPW();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMailUserPW: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMailVerify(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailVerify();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMailVerify: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMailVerifyDate(Object expected)
	{
		isNotNull();
		dateAssert("EMailVerifyDate", actual.getEMailVerifyDate(), expected);
		return myself;
	}


	public SELF hasFailedLoginCount(int expected)
	{
		isNotNull();
		int actualField = actual.getFailedLoginCount();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FailedLoginCount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFax(String expected)
	{
		isNotNull();
		String actualField = actual.getFax();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Fax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAddMailTextAutomatically()
	{
		isNotNull();
		if (!actual.isAddMailTextAutomatically()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddMailTextAutomatically\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAddMailTextAutomatically()
	{
		isNotNull();
		if (actual.isAddMailTextAutomatically()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddMailTextAutomatically\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isExpired()
	{
		isNotNull();
		if (!actual.isExpired()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Expired\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotExpired()
	{
		isNotNull();
		if (actual.isExpired()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Expired\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFullBPAccess()
	{
		isNotNull();
		if (!actual.isFullBPAccess()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FullBPAccess\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFullBPAccess()
	{
		isNotNull();
		if (actual.isFullBPAccess()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FullBPAccess\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isLocked()
	{
		isNotNull();
		if (!actual.isLocked()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Locked\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotLocked()
	{
		isNotNull();
		if (actual.isLocked()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Locked\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasIsMenuAutoExpand(String expected)
	{
		isNotNull();
		String actualField = actual.getIsMenuAutoExpand();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IsMenuAutoExpand: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isNoExpire()
	{
		isNotNull();
		if (!actual.isNoExpire()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NoExpire\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotNoExpire()
	{
		isNotNull();
		if (actual.isNoExpire()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NoExpire\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isNoPasswordReset()
	{
		isNotNull();
		if (!actual.isNoPasswordReset()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NoPasswordReset\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotNoPasswordReset()
	{
		isNotNull();
		if (actual.isNoPasswordReset()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NoPasswordReset\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSalesLead()
	{
		isNotNull();
		if (!actual.isSalesLead()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SalesLead\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSalesLead()
	{
		isNotNull();
		if (actual.isSalesLead()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SalesLead\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSupportUser()
	{
		isNotNull();
		if (!actual.isSupportUser()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SupportUser\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSupportUser()
	{
		isNotNull();
		if (actual.isSupportUser()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SupportUser\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLastContact(Object expected)
	{
		isNotNull();
		dateAssert("LastContact", actual.getLastContact(), expected);
		return myself;
	}


	public SELF hasLastResult(String expected)
	{
		isNotNull();
		String actualField = actual.getLastResult();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LastResult: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLDAPUser(String expected)
	{
		isNotNull();
		String actualField = actual.getLDAPUser();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LDAPUser: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLeadSource(String expected)
	{
		isNotNull();
		String actualField = actual.getLeadSource();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LeadSource: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLeadSourceDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getLeadSourceDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LeadSourceDescription: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLeadStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getLeadStatus();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LeadStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLeadStatusDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getLeadStatusDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LeadStatusDescription: <%s>\nbut it was: <%s>",
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

	public SELF hasNotificationType(String expected)
	{
		isNotNull();
		String actualField = actual.getNotificationType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NotificationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getPassword();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Password: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPhone(String expected)
	{
		isNotNull();
		String actualField = actual.getPhone();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Phone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPhone2(String expected)
	{
		isNotNull();
		String actualField = actual.getPhone2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Phone2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_DefaultMailText_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_DefaultMailText_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_DefaultMailText_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSalt(String expected)
	{
		isNotNull();
		String actualField = actual.getSalt();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Salt: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSecurityQuestion(String expected)
	{
		isNotNull();
		String actualField = actual.getSecurityQuestion();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SecurityQuestion: <%s>\nbut it was: <%s>",
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

	public SELF hasTitle(String expected)
	{
		isNotNull();
		String actualField = actual.getTitle();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Title: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUserPIN(String expected)
	{
		isNotNull();
		String actualField = actual.getUserPIN();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UserPIN: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}