/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.gl_distributionline;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_GL_DistributionLine;

/** Generated assertion class for GL_DistributionLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractGL_DistributionLineAssert<SELF extends AbstractGL_DistributionLineAssert<SELF, ACTUAL>, ACTUAL extends X_GL_DistributionLine>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractGL_DistributionLineAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasGL_DistributionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_DistributionLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_DistributionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGL_DistributionLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_DistributionLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_DistributionLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLine(int expected)
	{
		isNotNull();
		int actualField = actual.getLine();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Line: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
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

	public SELF isOverwriteAcct()
	{
		isNotNull();
		if (!actual.isOverwriteAcct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteAcct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteAcct()
	{
		isNotNull();
		if (actual.isOverwriteAcct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteAcct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteActivity()
	{
		isNotNull();
		if (!actual.isOverwriteActivity()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteActivity\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteActivity()
	{
		isNotNull();
		if (actual.isOverwriteActivity()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteActivity\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteBPartner()
	{
		isNotNull();
		if (!actual.isOverwriteBPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteBPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteBPartner()
	{
		isNotNull();
		if (actual.isOverwriteBPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteBPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteCampaign()
	{
		isNotNull();
		if (!actual.isOverwriteCampaign()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteCampaign\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteCampaign()
	{
		isNotNull();
		if (actual.isOverwriteCampaign()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteCampaign\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteLocFrom()
	{
		isNotNull();
		if (!actual.isOverwriteLocFrom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteLocFrom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteLocFrom()
	{
		isNotNull();
		if (actual.isOverwriteLocFrom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteLocFrom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteLocTo()
	{
		isNotNull();
		if (!actual.isOverwriteLocTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteLocTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteLocTo()
	{
		isNotNull();
		if (actual.isOverwriteLocTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteLocTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteOrg()
	{
		isNotNull();
		if (!actual.isOverwriteOrg()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteOrg\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteOrg()
	{
		isNotNull();
		if (actual.isOverwriteOrg()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteOrg\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteOrgTrx()
	{
		isNotNull();
		if (!actual.isOverwriteOrgTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteOrgTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteOrgTrx()
	{
		isNotNull();
		if (actual.isOverwriteOrgTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteOrgTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteProduct()
	{
		isNotNull();
		if (!actual.isOverwriteProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteProduct()
	{
		isNotNull();
		if (actual.isOverwriteProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteProject()
	{
		isNotNull();
		if (!actual.isOverwriteProject()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteProject\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteProject()
	{
		isNotNull();
		if (actual.isOverwriteProject()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteProject\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteSalesRegion()
	{
		isNotNull();
		if (!actual.isOverwriteSalesRegion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteSalesRegion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteSalesRegion()
	{
		isNotNull();
		if (actual.isOverwriteSalesRegion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteSalesRegion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteUser1()
	{
		isNotNull();
		if (!actual.isOverwriteUser1()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteUser1\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteUser1()
	{
		isNotNull();
		if (actual.isOverwriteUser1()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteUser1\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteUser2()
	{
		isNotNull();
		if (!actual.isOverwriteUser2()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteUser2\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteUser2()
	{
		isNotNull();
		if (actual.isOverwriteUser2()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteUser2\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasPercent(Object expected)
	{
		isNotNull();
		bdAssert("Percent", actual.getPercent(), expected);
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