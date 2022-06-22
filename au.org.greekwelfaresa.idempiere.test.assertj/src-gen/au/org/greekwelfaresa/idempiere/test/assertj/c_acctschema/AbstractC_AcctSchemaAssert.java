/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_acctschema;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_AcctSchema;

/** Generated assertion class for C_AcctSchema
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_AcctSchemaAssert<SELF extends AbstractC_AcctSchemaAssert<SELF, ACTUAL>, ACTUAL extends X_C_AcctSchema>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_AcctSchemaAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_OrgOnly_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgOnly_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_OrgOnly_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAutoPeriodControl()
	{
		isNotNull();
		if (!actual.isAutoPeriodControl()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoPeriodControl\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAutoPeriodControl()
	{
		isNotNull();
		if (actual.isAutoPeriodControl()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoPeriodControl\nbut it was",
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

	public SELF hasC_AcctSchema_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_AcctSchema_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasC_Period_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Period_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Period_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCommitmentType(String expected)
	{
		isNotNull();
		String actualField = actual.getCommitmentType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CommitmentType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCostingLevel(String expected)
	{
		isNotNull();
		String actualField = actual.getCostingLevel();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CostingLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCostingMethod(String expected)
	{
		isNotNull();
		String actualField = actual.getCostingMethod();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CostingMethod: <%s>\nbut it was: <%s>",
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

	public SELF hasGAAP(String expected)
	{
		isNotNull();
		String actualField = actual.getGAAP();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GAAP: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isHasAlias()
	{
		isNotNull();
		if (!actual.isHasAlias()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasAlias\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHasAlias()
	{
		isNotNull();
		if (actual.isHasAlias()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasAlias\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isHasCombination()
	{
		isNotNull();
		if (!actual.isHasCombination()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasCombination\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHasCombination()
	{
		isNotNull();
		if (actual.isHasCombination()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasCombination\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAccrual()
	{
		isNotNull();
		if (!actual.isAccrual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Accrual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAccrual()
	{
		isNotNull();
		if (actual.isAccrual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Accrual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAdjustCOGS()
	{
		isNotNull();
		if (!actual.isAdjustCOGS()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdjustCOGS\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAdjustCOGS()
	{
		isNotNull();
		if (actual.isAdjustCOGS()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdjustCOGS\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllowNegativePosting()
	{
		isNotNull();
		if (!actual.isAllowNegativePosting()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowNegativePosting\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowNegativePosting()
	{
		isNotNull();
		if (actual.isAllowNegativePosting()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowNegativePosting\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDiscountCorrectsTax()
	{
		isNotNull();
		if (!actual.isDiscountCorrectsTax()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountCorrectsTax\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDiscountCorrectsTax()
	{
		isNotNull();
		if (actual.isDiscountCorrectsTax()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountCorrectsTax\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isExplicitCostAdjustment()
	{
		isNotNull();
		if (!actual.isExplicitCostAdjustment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ExplicitCostAdjustment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotExplicitCostAdjustment()
	{
		isNotNull();
		if (actual.isExplicitCostAdjustment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ExplicitCostAdjustment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPostIfClearingEqual()
	{
		isNotNull();
		if (!actual.isPostIfClearingEqual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostIfClearingEqual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPostIfClearingEqual()
	{
		isNotNull();
		if (actual.isPostIfClearingEqual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostIfClearingEqual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPostServices()
	{
		isNotNull();
		if (!actual.isPostServices()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostServices\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPostServices()
	{
		isNotNull();
		if (actual.isPostServices()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostServices\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTradeDiscountPosted()
	{
		isNotNull();
		if (!actual.isTradeDiscountPosted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TradeDiscountPosted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTradeDiscountPosted()
	{
		isNotNull();
		if (actual.isTradeDiscountPosted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TradeDiscountPosted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_CostType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostType_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasPeriod_OpenFuture(int expected)
	{
		isNotNull();
		int actualField = actual.getPeriod_OpenFuture();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Period_OpenFuture: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPeriod_OpenHistory(int expected)
	{
		isNotNull();
		int actualField = actual.getPeriod_OpenHistory();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Period_OpenHistory: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSeparator(String expected)
	{
		isNotNull();
		String actualField = actual.getSeparator();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Separator: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTaxCorrectionType(String expected)
	{
		isNotNull();
		String actualField = actual.getTaxCorrectionType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TaxCorrectionType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}