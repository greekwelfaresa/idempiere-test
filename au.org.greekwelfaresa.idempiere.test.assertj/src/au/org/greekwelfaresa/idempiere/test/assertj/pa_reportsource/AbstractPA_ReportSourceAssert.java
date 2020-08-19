/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.pa_reportsource;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_PA_ReportSource;

/** Generated assertion class for PA_ReportSource
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractPA_ReportSourceAssert<SELF extends AbstractPA_ReportSourceAssert<SELF, ACTUAL>, ACTUAL extends X_PA_ReportSource>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractPA_ReportSourceAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_ElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ElementValue_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_SalesRegion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SalesRegion_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_SalesRegion_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasElementType(String expected)
	{
		isNotNull();
		String actualField = actual.getElementType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ElementType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isIncludeNullsActivity()
	{
		isNotNull();
		if (!actual.isIncludeNullsActivity()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsActivity\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsActivity()
	{
		isNotNull();
		if (actual.isIncludeNullsActivity()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsActivity\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsBPartner()
	{
		isNotNull();
		if (!actual.isIncludeNullsBPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsBPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsBPartner()
	{
		isNotNull();
		if (actual.isIncludeNullsBPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsBPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsCampaign()
	{
		isNotNull();
		if (!actual.isIncludeNullsCampaign()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsCampaign\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsCampaign()
	{
		isNotNull();
		if (actual.isIncludeNullsCampaign()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsCampaign\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsElementValue()
	{
		isNotNull();
		if (!actual.isIncludeNullsElementValue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsElementValue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsElementValue()
	{
		isNotNull();
		if (actual.isIncludeNullsElementValue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsElementValue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsLocation()
	{
		isNotNull();
		if (!actual.isIncludeNullsLocation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsLocation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsLocation()
	{
		isNotNull();
		if (actual.isIncludeNullsLocation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsLocation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsOrg()
	{
		isNotNull();
		if (!actual.isIncludeNullsOrg()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsOrg\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsOrg()
	{
		isNotNull();
		if (actual.isIncludeNullsOrg()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsOrg\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsOrgTrx()
	{
		isNotNull();
		if (!actual.isIncludeNullsOrgTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsOrgTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsOrgTrx()
	{
		isNotNull();
		if (actual.isIncludeNullsOrgTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsOrgTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsProduct()
	{
		isNotNull();
		if (!actual.isIncludeNullsProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsProduct()
	{
		isNotNull();
		if (actual.isIncludeNullsProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsProject()
	{
		isNotNull();
		if (!actual.isIncludeNullsProject()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsProject\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsProject()
	{
		isNotNull();
		if (actual.isIncludeNullsProject()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsProject\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsSalesRegion()
	{
		isNotNull();
		if (!actual.isIncludeNullsSalesRegion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsSalesRegion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsSalesRegion()
	{
		isNotNull();
		if (actual.isIncludeNullsSalesRegion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsSalesRegion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsUserElement1()
	{
		isNotNull();
		if (!actual.isIncludeNullsUserElement1()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsUserElement1\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsUserElement1()
	{
		isNotNull();
		if (actual.isIncludeNullsUserElement1()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsUserElement1\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIncludeNullsUserElement2()
	{
		isNotNull();
		if (!actual.isIncludeNullsUserElement2()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IncludeNullsUserElement2\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIncludeNullsUserElement2()
	{
		isNotNull();
		if (actual.isIncludeNullsUserElement2()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IncludeNullsUserElement2\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasOrg_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOrg_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Org_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_ReportLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_ReportSource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportSource_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportSource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_ReportSource_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_ReportSource_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportSource_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUserElement1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUserElement1_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UserElement1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUserElement2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUserElement2_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UserElement2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}