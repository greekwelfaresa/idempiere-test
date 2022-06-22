/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.pa_reportcolumn;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_PA_ReportColumn;

/** Generated assertion class for PA_ReportColumn
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractPA_ReportColumnAssert<SELF extends AbstractPA_ReportColumnAssert<SELF, ACTUAL>, ACTUAL extends X_PA_ReportColumn>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractPA_ReportColumnAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasCalculationType(String expected)
	{
		isNotNull();
		String actualField = actual.getCalculationType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CalculationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasColumnType(String expected)
	{
		isNotNull();
		String actualField = actual.getColumnType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCurrencyType(String expected)
	{
		isNotNull();
		String actualField = actual.getCurrencyType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CurrencyType: <%s>\nbut it was: <%s>",
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

	public SELF hasFactor(String expected)
	{
		isNotNull();
		String actualField = actual.getFactor();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Factor: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFormatPattern(String expected)
	{
		isNotNull();
		String actualField = actual.getFormatPattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FormatPattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGL_Budget_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Budget_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_Budget_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAdhocConversion()
	{
		isNotNull();
		if (!actual.isAdhocConversion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdhocConversion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAdhocConversion()
	{
		isNotNull();
		if (actual.isAdhocConversion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdhocConversion\nbut it was",
				getPODescription());
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

	public SELF isPrinted()
	{
		isNotNull();
		if (!actual.isPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Printed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPrinted()
	{
		isNotNull();
		if (actual.isPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Printed\nbut it was",
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

	public SELF hasOper_1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOper_1_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Oper_1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasOper_2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getOper_2_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Oper_2_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasOper_2_LineName(String expected)
	{
		isNotNull();
		String actualField = actual.getOper_2_LineName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Oper_2_LineName: <%s>\nbut it was: <%s>",
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

	public SELF hasPA_ReportColumn_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportColumn_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportColumn_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_ReportColumn_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_ReportColumn_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportColumn_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_ReportColumnSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportColumnSet_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportColumnSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPAAmountType(String expected)
	{
		isNotNull();
		String actualField = actual.getPAAmountType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PAAmountType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPAPeriodType(String expected)
	{
		isNotNull();
		String actualField = actual.getPAPeriodType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PAPeriodType: <%s>\nbut it was: <%s>",
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

	public SELF hasRelativePeriod(Object expected)
	{
		isNotNull();
		bdAssert("RelativePeriod", actual.getRelativePeriod(), expected);
		return myself;
	}


	public SELF hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
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