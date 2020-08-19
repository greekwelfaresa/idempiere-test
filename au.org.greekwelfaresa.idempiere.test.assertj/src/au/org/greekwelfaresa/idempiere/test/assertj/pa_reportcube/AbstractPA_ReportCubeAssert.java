/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.pa_reportcube;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_PA_ReportCube;

/** Generated assertion class for PA_ReportCube
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractPA_ReportCubeAssert<SELF extends AbstractPA_ReportCubeAssert<SELF, ACTUAL>, ACTUAL extends X_PA_ReportCube>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractPA_ReportCubeAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF isActivityDim()
	{
		isNotNull();
		if (!actual.isActivityDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ActivityDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotActivityDim()
	{
		isNotNull();
		if (actual.isActivityDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ActivityDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isBPartnerDim()
	{
		isNotNull();
		if (!actual.isBPartnerDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BPartnerDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotBPartnerDim()
	{
		isNotNull();
		if (actual.isBPartnerDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BPartnerDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCampaignDim()
	{
		isNotNull();
		if (!actual.isCampaignDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CampaignDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCampaignDim()
	{
		isNotNull();
		if (actual.isCampaignDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CampaignDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isGLBudgetDim()
	{
		isNotNull();
		if (!actual.isGLBudgetDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be GLBudgetDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotGLBudgetDim()
	{
		isNotNull();
		if (actual.isGLBudgetDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be GLBudgetDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isLocFromDim()
	{
		isNotNull();
		if (!actual.isLocFromDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LocFromDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotLocFromDim()
	{
		isNotNull();
		if (actual.isLocFromDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LocFromDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isLocToDim()
	{
		isNotNull();
		if (!actual.isLocToDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LocToDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotLocToDim()
	{
		isNotNull();
		if (actual.isLocToDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LocToDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOrgTrxDim()
	{
		isNotNull();
		if (!actual.isOrgTrxDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OrgTrxDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOrgTrxDim()
	{
		isNotNull();
		if (actual.isOrgTrxDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OrgTrxDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isProductDim()
	{
		isNotNull();
		if (!actual.isProductDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ProductDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProductDim()
	{
		isNotNull();
		if (actual.isProductDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ProductDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isProjectDim()
	{
		isNotNull();
		if (!actual.isProjectDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ProjectDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProjectDim()
	{
		isNotNull();
		if (actual.isProjectDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ProjectDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isProjectPhaseDim()
	{
		isNotNull();
		if (!actual.isProjectPhaseDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ProjectPhaseDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProjectPhaseDim()
	{
		isNotNull();
		if (actual.isProjectPhaseDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ProjectPhaseDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isProjectTaskDim()
	{
		isNotNull();
		if (!actual.isProjectTaskDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ProjectTaskDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProjectTaskDim()
	{
		isNotNull();
		if (actual.isProjectTaskDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ProjectTaskDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSalesRegionDim()
	{
		isNotNull();
		if (!actual.isSalesRegionDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SalesRegionDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSalesRegionDim()
	{
		isNotNull();
		if (actual.isSalesRegionDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SalesRegionDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSubAcctDim()
	{
		isNotNull();
		if (!actual.isSubAcctDim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SubAcctDim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSubAcctDim()
	{
		isNotNull();
		if (actual.isSubAcctDim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SubAcctDim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUser1Dim()
	{
		isNotNull();
		if (!actual.isUser1Dim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be User1Dim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUser1Dim()
	{
		isNotNull();
		if (actual.isUser1Dim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be User1Dim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUser2Dim()
	{
		isNotNull();
		if (!actual.isUser2Dim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be User2Dim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUser2Dim()
	{
		isNotNull();
		if (actual.isUser2Dim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be User2Dim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUserElement1Dim()
	{
		isNotNull();
		if (!actual.isUserElement1Dim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UserElement1Dim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUserElement1Dim()
	{
		isNotNull();
		if (actual.isUserElement1Dim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UserElement1Dim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUserElement2Dim()
	{
		isNotNull();
		if (!actual.isUserElement2Dim()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UserElement2Dim\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUserElement2Dim()
	{
		isNotNull();
		if (actual.isUserElement2Dim()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UserElement2Dim\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLastRecalculated(Object expected)
	{
		isNotNull();
		dateAssert("LastRecalculated", actual.getLastRecalculated(), expected);
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

	public SELF hasPA_ReportCube_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportCube_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportCube_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_ReportCube_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_ReportCube_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportCube_UU: <%s>\nbut it was: <%s>",
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
}