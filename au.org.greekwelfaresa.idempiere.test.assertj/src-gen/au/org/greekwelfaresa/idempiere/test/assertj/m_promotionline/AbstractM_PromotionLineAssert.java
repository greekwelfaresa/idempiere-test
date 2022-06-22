/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.m_promotionline;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_M_PromotionLine;

/** Generated assertion class for M_PromotionLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_PromotionLineAssert<SELF extends AbstractM_PromotionLineAssert<SELF, ACTUAL>, ACTUAL extends X_M_PromotionLine>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_PromotionLineAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF isMandatoryPL()
	{
		isNotNull();
		if (!actual.isMandatoryPL()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MandatoryPL\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMandatoryPL()
	{
		isNotNull();
		if (actual.isMandatoryPL()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MandatoryPL\nbut it was",
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

	public SELF hasM_PromotionGroup_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PromotionGroup_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PromotionGroup_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_PromotionLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PromotionLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PromotionLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_PromotionLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_PromotionLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PromotionLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMinimumAmt(Object expected)
	{
		isNotNull();
		bdAssert("MinimumAmt", actual.getMinimumAmt(), expected);
		return myself;
	}

}