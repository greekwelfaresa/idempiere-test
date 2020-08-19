/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.gl_distribution;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_GL_Distribution;

/** Generated assertion class for GL_Distribution
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractGL_DistributionAssert<SELF extends AbstractGL_DistributionAssert<SELF, ACTUAL>, ACTUAL extends X_GL_Distribution>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractGL_DistributionAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAccount_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Account_ID: <%s>\nbut it was: <%s>",
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

	public SELF isAnyAcct()
	{
		isNotNull();
		if (!actual.isAnyAcct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyAcct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyAcct()
	{
		isNotNull();
		if (actual.isAnyAcct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyAcct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyActivity()
	{
		isNotNull();
		if (!actual.isAnyActivity()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyActivity\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyActivity()
	{
		isNotNull();
		if (actual.isAnyActivity()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyActivity\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyBPartner()
	{
		isNotNull();
		if (!actual.isAnyBPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyBPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyBPartner()
	{
		isNotNull();
		if (actual.isAnyBPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyBPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyCampaign()
	{
		isNotNull();
		if (!actual.isAnyCampaign()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyCampaign\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyCampaign()
	{
		isNotNull();
		if (actual.isAnyCampaign()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyCampaign\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyLocFrom()
	{
		isNotNull();
		if (!actual.isAnyLocFrom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyLocFrom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyLocFrom()
	{
		isNotNull();
		if (actual.isAnyLocFrom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyLocFrom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyLocTo()
	{
		isNotNull();
		if (!actual.isAnyLocTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyLocTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyLocTo()
	{
		isNotNull();
		if (actual.isAnyLocTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyLocTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyOrg()
	{
		isNotNull();
		if (!actual.isAnyOrg()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyOrg\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyOrg()
	{
		isNotNull();
		if (actual.isAnyOrg()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyOrg\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyOrgTrx()
	{
		isNotNull();
		if (!actual.isAnyOrgTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyOrgTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyOrgTrx()
	{
		isNotNull();
		if (actual.isAnyOrgTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyOrgTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyProduct()
	{
		isNotNull();
		if (!actual.isAnyProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyProduct()
	{
		isNotNull();
		if (actual.isAnyProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyProject()
	{
		isNotNull();
		if (!actual.isAnyProject()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyProject\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyProject()
	{
		isNotNull();
		if (actual.isAnyProject()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyProject\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnySalesRegion()
	{
		isNotNull();
		if (!actual.isAnySalesRegion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnySalesRegion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnySalesRegion()
	{
		isNotNull();
		if (actual.isAnySalesRegion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnySalesRegion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyUser1()
	{
		isNotNull();
		if (!actual.isAnyUser1()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyUser1\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyUser1()
	{
		isNotNull();
		if (actual.isAnyUser1()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyUser1\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAnyUser2()
	{
		isNotNull();
		if (!actual.isAnyUser2()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AnyUser2\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAnyUser2()
	{
		isNotNull();
		if (actual.isAnyUser2()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AnyUser2\nbut it was",
				getPODescription());
		}
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

	public SELF hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_LocFrom_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocFrom_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_LocFrom_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_LocTo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_LocTo_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_LocTo_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasGL_Distribution_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Distribution_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_Distribution_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGL_Distribution_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_Distribution_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_Distribution_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isCreateReversal()
	{
		isNotNull();
		if (!actual.isCreateReversal()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateReversal\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCreateReversal()
	{
		isNotNull();
		if (actual.isCreateReversal()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateReversal\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
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

	public SELF hasPercentTotal(Object expected)
	{
		isNotNull();
		bdAssert("PercentTotal", actual.getPercentTotal(), expected);
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

	public SELF hasUser1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser1_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUser2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser2_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}