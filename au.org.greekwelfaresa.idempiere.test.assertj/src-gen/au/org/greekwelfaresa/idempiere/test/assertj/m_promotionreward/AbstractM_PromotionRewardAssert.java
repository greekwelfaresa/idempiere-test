/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.m_promotionreward;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_M_PromotionReward;

/** Generated assertion class for M_PromotionReward
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_PromotionRewardAssert<SELF extends AbstractM_PromotionRewardAssert<SELF, ACTUAL>, ACTUAL extends X_M_PromotionReward>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_PromotionRewardAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAmount(Object expected)
	{
		isNotNull();
		bdAssert("Amount", actual.getAmount(), expected);
		return myself;
	}


	public SELF hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDistributionSorting(String expected)
	{
		isNotNull();
		String actualField = actual.getDistributionSorting();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DistributionSorting: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isForAllDistribution()
	{
		isNotNull();
		if (!actual.isForAllDistribution()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ForAllDistribution\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotForAllDistribution()
	{
		isNotNull();
		if (actual.isForAllDistribution()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ForAllDistribution\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSameDistribution()
	{
		isNotNull();
		if (!actual.isSameDistribution()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SameDistribution\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSameDistribution()
	{
		isNotNull();
		if (actual.isSameDistribution()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SameDistribution\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_Promotion_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Promotion_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Promotion_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_PromotionDistribution_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PromotionDistribution_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PromotionDistribution_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_PromotionReward_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PromotionReward_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PromotionReward_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_PromotionReward_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_PromotionReward_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PromotionReward_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_TargetDistribution_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_TargetDistribution_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_TargetDistribution_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public SELF hasRewardType(String expected)
	{
		isNotNull();
		String actualField = actual.getRewardType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RewardType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
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
}