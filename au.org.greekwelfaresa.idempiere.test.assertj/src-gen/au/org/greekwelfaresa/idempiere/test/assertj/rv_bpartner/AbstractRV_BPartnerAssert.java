/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.rv_bpartner;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_RV_BPartner;

/** Generated assertion class for RV_BPartner
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractRV_BPartnerAssert<SELF extends AbstractRV_BPartnerAssert<SELF, ACTUAL>, ACTUAL extends X_RV_BPartner>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractRV_BPartnerAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAcqusitionCost(Object expected)
	{
		isNotNull();
		bdAssert("AcqusitionCost", actual.getAcqusitionCost(), expected);
		return myself;
	}


	public SELF hasActualLifeTimeValue(Object expected)
	{
		isNotNull();
		bdAssert("ActualLifeTimeValue", actual.getActualLifeTimeValue(), expected);
		return myself;
	}


	public SELF hasAD_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_OrgBP_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgBP_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_OrgBP_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasAD_User_AD_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_AD_Org_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_AD_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_User_C_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_C_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_User_C_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_C_BPartner_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasad_user_created(Object expected)
	{
		isNotNull();
		dateAssert("ad_user_created", actual.getad_user_created(), expected);
		return myself;
	}


	public SELF hasAD_User_CreatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_CreatedBy();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_CreatedBy: <%s>\nbut it was: <%s>",
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

	public SELF isad_user_isactive()
	{
		isNotNull();
		if (!actual.isad_user_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ad_user_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotad_user_isactive()
	{
		isNotNull();
		if (actual.isad_user_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ad_user_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasad_user_updated(Object expected)
	{
		isNotNull();
		dateAssert("ad_user_updated", actual.getad_user_updated(), expected);
		return myself;
	}


	public SELF hasAD_User_UpdatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_UpdatedBy();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_UpdatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasad_user_value(String expected)
	{
		isNotNull();
		String actualField = actual.getad_user_value();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ad_user_value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAddress1(String expected)
	{
		isNotNull();
		String actualField = actual.getAddress1();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Address1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAddress2(String expected)
	{
		isNotNull();
		String actualField = actual.getAddress2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Address2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAddress3(String expected)
	{
		isNotNull();
		String actualField = actual.getAddress3();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Address3: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAddress4(String expected)
	{
		isNotNull();
		String actualField = actual.getAddress4();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Address4: <%s>\nbut it was: <%s>",
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


	public SELF hasBPartner_Parent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBPartner_Parent_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BPartner_Parent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBPContactGreeting(int expected)
	{
		isNotNull();
		int actualField = actual.getBPContactGreeting();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BPContactGreeting: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BP_C_TaxGroup_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_C_TaxGroup_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_C_TaxGroup_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_bp_dunninggrace(Object expected)
	{
		isNotNull();
		dateAssert("c_bp_dunninggrace", actual.getc_bp_dunninggrace(), expected);
		return myself;
	}


	public SELF hasC_BP_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Group_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isc_bp_ismanufacturer()
	{
		isNotNull();
		if (!actual.isc_bp_ismanufacturer()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_ismanufacturer\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_bp_ismanufacturer()
	{
		isNotNull();
		if (actual.isc_bp_ismanufacturer()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_ismanufacturer\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isc_bp_ispotaxexempt()
	{
		isNotNull();
		if (!actual.isc_bp_ispotaxexempt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_ispotaxexempt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_bp_ispotaxexempt()
	{
		isNotNull();
		if (actual.isc_bp_ispotaxexempt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_ispotaxexempt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasC_BP_Location_AD_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_AD_Org_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Location_AD_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BP_Location_C_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_C_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Location_C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BP_Location_C_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_C_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Location_C_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_bp_location_created(Object expected)
	{
		isNotNull();
		dateAssert("c_bp_location_created", actual.getc_bp_location_created(), expected);
		return myself;
	}


	public SELF hasC_BP_Location_CreatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_CreatedBy();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Location_CreatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_bp_location_fax(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_fax();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have c_bp_location_fax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isc_bp_location_isactive()
	{
		isNotNull();
		if (!actual.isc_bp_location_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_bp_location_isactive()
	{
		isNotNull();
		if (actual.isc_bp_location_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isc_bp_location_isbillto()
	{
		isNotNull();
		if (!actual.isc_bp_location_isbillto()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_isbillto\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_bp_location_isbillto()
	{
		isNotNull();
		if (actual.isc_bp_location_isbillto()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_isbillto\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasc_bp_location_isdn(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_isdn();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have c_bp_location_isdn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isc_bp_location_ispayfrom()
	{
		isNotNull();
		if (!actual.isc_bp_location_ispayfrom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_ispayfrom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_bp_location_ispayfrom()
	{
		isNotNull();
		if (actual.isc_bp_location_ispayfrom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_ispayfrom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isc_bp_location_isremitto()
	{
		isNotNull();
		if (!actual.isc_bp_location_isremitto()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_isremitto\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_bp_location_isremitto()
	{
		isNotNull();
		if (actual.isc_bp_location_isremitto()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_isremitto\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isc_bp_location_isshipto()
	{
		isNotNull();
		if (!actual.isc_bp_location_isshipto()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_bp_location_isshipto\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_bp_location_isshipto()
	{
		isNotNull();
		if (actual.isc_bp_location_isshipto()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_bp_location_isshipto\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasc_bp_location_name(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_name();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have c_bp_location_name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_bp_location_phone(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_phone();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have c_bp_location_phone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_bp_location_phone2(String expected)
	{
		isNotNull();
		String actualField = actual.getc_bp_location_phone2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have c_bp_location_phone2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BP_Location_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_SalesRegion_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Location_SalesRegion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_bp_location_updated(Object expected)
	{
		isNotNull();
		dateAssert("c_bp_location_updated", actual.getc_bp_location_updated(), expected);
		return myself;
	}


	public SELF hasC_BP_Location_UpdatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Location_UpdatedBy();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Location_UpdatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BP_Logo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Logo_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Logo_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_City_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_City_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_City_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_country_ad_language(String expected)
	{
		isNotNull();
		String actualField = actual.getc_country_ad_language();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have c_country_ad_language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Country_C_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Country_C_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Country_C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_country_description(String expected)
	{
		isNotNull();
		String actualField = actual.getc_country_description();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have c_country_description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Country_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Country_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Country_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isc_country_isactive()
	{
		isNotNull();
		if (!actual.isc_country_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_country_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_country_isactive()
	{
		isNotNull();
		if (actual.isc_country_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_country_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasC_Dunning_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Dunning_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Dunning_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_InvoiceSchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceSchedule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceSchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Location_AD_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_AD_Org_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Location_AD_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_location_created(Object expected)
	{
		isNotNull();
		dateAssert("c_location_created", actual.getc_location_created(), expected);
		return myself;
	}


	public SELF hasC_Location_CreatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_CreatedBy();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Location_CreatedBy: <%s>\nbut it was: <%s>",
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

	public SELF isc_location_isactive()
	{
		isNotNull();
		if (!actual.isc_location_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_location_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_location_isactive()
	{
		isNotNull();
		if (actual.isc_location_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_location_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasc_location_updated(Object expected)
	{
		isNotNull();
		dateAssert("c_location_updated", actual.getc_location_updated(), expected);
		return myself;
	}


	public SELF hasC_Location_UpdatedBy(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_UpdatedBy();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Location_UpdatedBy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Region_AD_Org_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Region_AD_Org_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Region_AD_Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Region_C_Country_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Region_C_Country_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Region_C_Country_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasc_region_description(String expected)
	{
		isNotNull();
		String actualField = actual.getc_region_description();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have c_region_description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Region_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Region_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Region_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isc_region_isactive()
	{
		isNotNull();
		if (!actual.isc_region_isactive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be c_region_isactive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotc_region_isactive()
	{
		isNotNull();
		if (actual.isc_region_isactive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be c_region_isactive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasCity(String expected)
	{
		isNotNull();
		String actualField = actual.getCity();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have City: <%s>\nbut it was: <%s>",
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

	public SELF hasContactDescription(String expected)
	{
		isNotNull();
		String actualField = actual.getContactDescription();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ContactDescription: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasContactName(String expected)
	{
		isNotNull();
		String actualField = actual.getContactName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ContactName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCountryCode(String expected)
	{
		isNotNull();
		String actualField = actual.getCountryCode();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CountryCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCountryName(String expected)
	{
		isNotNull();
		String actualField = actual.getCountryName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CountryName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDeliveryRule(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DeliveryRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDeliveryViaRule(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryViaRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DeliveryViaRule: <%s>\nbut it was: <%s>",
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

	public SELF hasDocumentCopies(int expected)
	{
		isNotNull();
		int actualField = actual.getDocumentCopies();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentCopies: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDUNS(String expected)
	{
		isNotNull();
		String actualField = actual.getDUNS();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DUNS: <%s>\nbut it was: <%s>",
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

	public SELF hasFirstSale(Object expected)
	{
		isNotNull();
		dateAssert("FirstSale", actual.getFirstSale(), expected);
		return myself;
	}


	public SELF hasFlatDiscount(Object expected)
	{
		isNotNull();
		bdAssert("FlatDiscount", actual.getFlatDiscount(), expected);
		return myself;
	}


	public SELF hasFreightCostRule(String expected)
	{
		isNotNull();
		String actualField = actual.getFreightCostRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FreightCostRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasInvoice_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getInvoice_PrintFormat_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Invoice_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasInvoiceRule(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isCustomer()
	{
		isNotNull();
		if (!actual.isCustomer()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Customer\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCustomer()
	{
		isNotNull();
		if (actual.isCustomer()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Customer\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDiscountPrinted()
	{
		isNotNull();
		if (!actual.isDiscountPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountPrinted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDiscountPrinted()
	{
		isNotNull();
		if (actual.isDiscountPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountPrinted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isEmployee()
	{
		isNotNull();
		if (!actual.isEmployee()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Employee\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotEmployee()
	{
		isNotNull();
		if (actual.isEmployee()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Employee\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOneTime()
	{
		isNotNull();
		if (!actual.isOneTime()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OneTime\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOneTime()
	{
		isNotNull();
		if (actual.isOneTime()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OneTime\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isProspect()
	{
		isNotNull();
		if (!actual.isProspect()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Prospect\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProspect()
	{
		isNotNull();
		if (actual.isProspect()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Prospect\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSalesRep()
	{
		isNotNull();
		if (!actual.isSalesRep()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SalesRep\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSalesRep()
	{
		isNotNull();
		if (actual.isSalesRep()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SalesRep\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTaxExempt()
	{
		isNotNull();
		if (!actual.isTaxExempt()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxExempt\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTaxExempt()
	{
		isNotNull();
		if (actual.isTaxExempt()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxExempt\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isVendor()
	{
		isNotNull();
		if (!actual.isVendor()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Vendor\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotVendor()
	{
		isNotNull();
		if (actual.isVendor()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Vendor\nbut it was",
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

	public SELF isLDAPUser()
	{
		isNotNull();
		if (!actual.isLDAPUser()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LDAPUser\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotLDAPUser()
	{
		isNotNull();
		if (actual.isLDAPUser()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LDAPUser\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_DiscountSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasNAICS(String expected)
	{
		isNotNull();
		String actualField = actual.getNAICS();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NAICS: <%s>\nbut it was: <%s>",
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

	public SELF hasName2(String expected)
	{
		isNotNull();
		String actualField = actual.getName2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name2: <%s>\nbut it was: <%s>",
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

	public SELF hasNumberEmployees(int expected)
	{
		isNotNull();
		int actualField = actual.getNumberEmployees();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NumberEmployees: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPaymentRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PaymentRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPaymentRulePO(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRulePO();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PaymentRulePO: <%s>\nbut it was: <%s>",
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

	public SELF hasPO_DiscountSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_DiscountSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PO_DiscountSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPO_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_PaymentTerm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PO_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPO_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_PriceList_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PO_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPOReference(String expected)
	{
		isNotNull();
		String actualField = actual.getPOReference();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have POReference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPostal(String expected)
	{
		isNotNull();
		String actualField = actual.getPostal();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Postal: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPostal_Add(String expected)
	{
		isNotNull();
		String actualField = actual.getPostal_Add();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Postal_Add: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPotentialLifeTimeValue(Object expected)
	{
		isNotNull();
		bdAssert("PotentialLifeTimeValue", actual.getPotentialLifeTimeValue(), expected);
		return myself;
	}


	public SELF hasRating(String expected)
	{
		isNotNull();
		String actualField = actual.getRating();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Rating: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasReferenceNo(String expected)
	{
		isNotNull();
		String actualField = actual.getReferenceNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ReferenceNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRegionName(String expected)
	{
		isNotNull();
		String actualField = actual.getRegionName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RegionName: <%s>\nbut it was: <%s>",
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

	public SELF hasSalesVolume(Object expected)
	{
		isNotNull();
		bdAssert("SalesVolume", actual.getSalesVolume(), expected);
		return myself;
	}


	public SELF isSendEMail()
	{
		isNotNull();
		if (!actual.isSendEMail()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendEMail\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSendEMail()
	{
		isNotNull();
		if (actual.isSendEMail()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendEMail\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasShareOfCustomer(int expected)
	{
		isNotNull();
		int actualField = actual.getShareOfCustomer();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShareOfCustomer: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasShelfLifeMinPct(int expected)
	{
		isNotNull();
		int actualField = actual.getShelfLifeMinPct();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShelfLifeMinPct: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSO_CreditAvailable(Object expected)
	{
		isNotNull();
		bdAssert("SO_CreditAvailable", actual.getSO_CreditAvailable(), expected);
		return myself;
	}


	public SELF hasSO_CreditLimit(Object expected)
	{
		isNotNull();
		bdAssert("SO_CreditLimit", actual.getSO_CreditLimit(), expected);
		return myself;
	}


	public SELF hasSO_CreditUsed(Object expected)
	{
		isNotNull();
		bdAssert("SO_CreditUsed", actual.getSO_CreditUsed(), expected);
		return myself;
	}


	public SELF hasSO_Description(String expected)
	{
		isNotNull();
		String actualField = actual.getSO_Description();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SO_Description: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSOCreditStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getSOCreditStatus();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SOCreditStatus: <%s>\nbut it was: <%s>",
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

	public SELF hasTaxID(String expected)
	{
		isNotNull();
		String actualField = actual.getTaxID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TaxID: <%s>\nbut it was: <%s>",
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

	public SELF hasTotalOpenBalance(Object expected)
	{
		isNotNull();
		bdAssert("TotalOpenBalance", actual.getTotalOpenBalance(), expected);
		return myself;
	}


	public SELF hasURL(String expected)
	{
		isNotNull();
		String actualField = actual.getURL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have URL: <%s>\nbut it was: <%s>",
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