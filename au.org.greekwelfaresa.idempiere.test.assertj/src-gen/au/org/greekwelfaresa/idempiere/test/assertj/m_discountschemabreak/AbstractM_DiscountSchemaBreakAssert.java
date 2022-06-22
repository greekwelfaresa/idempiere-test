/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.m_discountschemabreak;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_M_DiscountSchemaBreak;

/** Generated assertion class for M_DiscountSchemaBreak
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_DiscountSchemaBreakAssert<SELF extends AbstractM_DiscountSchemaBreakAssert<SELF, ACTUAL>, ACTUAL extends X_M_DiscountSchemaBreak>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_DiscountSchemaBreakAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasBreakDiscount(Object expected)
	{
		isNotNull();
		bdAssert("BreakDiscount", actual.getBreakDiscount(), expected);
		return myself;
	}


	public SELF hasBreakValue(Object expected)
	{
		isNotNull();
		bdAssert("BreakValue", actual.getBreakValue(), expected);
		return myself;
	}


	public SELF isBPartnerFlatDiscount()
	{
		isNotNull();
		if (!actual.isBPartnerFlatDiscount()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BPartnerFlatDiscount\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotBPartnerFlatDiscount()
	{
		isNotNull();
		if (actual.isBPartnerFlatDiscount()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BPartnerFlatDiscount\nbut it was",
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

	public SELF hasM_DiscountSchemaBreak_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchemaBreak_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchemaBreak_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_DiscountSchemaBreak_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_DiscountSchemaBreak_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchemaBreak_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
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