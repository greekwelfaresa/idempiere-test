/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.m_discountschemaline;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_M_DiscountSchemaLine;

/** Generated assertion class for M_DiscountSchemaLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_DiscountSchemaLineAssert<SELF extends AbstractM_DiscountSchemaLineAssert<SELF, ACTUAL>, ACTUAL extends X_M_DiscountSchemaLine>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_DiscountSchemaLineAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF hasC_ConversionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ConversionType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ConversionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasClassification(String expected)
	{
		isNotNull();
		String actualField = actual.getClassification();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Classification: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasConversionDate(Object expected)
	{
		isNotNull();
		dateAssert("ConversionDate", actual.getConversionDate(), expected);
		return myself;
	}


	public SELF hasGroup1(String expected)
	{
		isNotNull();
		String actualField = actual.getGroup1();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Group1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGroup2(String expected)
	{
		isNotNull();
		String actualField = actual.getGroup2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Group2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLimit_AddAmt(Object expected)
	{
		isNotNull();
		bdAssert("Limit_AddAmt", actual.getLimit_AddAmt(), expected);
		return myself;
	}


	public SELF hasLimit_Base(String expected)
	{
		isNotNull();
		String actualField = actual.getLimit_Base();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Limit_Base: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLimit_Discount(Object expected)
	{
		isNotNull();
		bdAssert("Limit_Discount", actual.getLimit_Discount(), expected);
		return myself;
	}


	public SELF hasLimit_Fixed(Object expected)
	{
		isNotNull();
		bdAssert("Limit_Fixed", actual.getLimit_Fixed(), expected);
		return myself;
	}


	public SELF hasLimit_MaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("Limit_MaxAmt", actual.getLimit_MaxAmt(), expected);
		return myself;
	}


	public SELF hasLimit_MinAmt(Object expected)
	{
		isNotNull();
		bdAssert("Limit_MinAmt", actual.getLimit_MinAmt(), expected);
		return myself;
	}


	public SELF hasLimit_Rounding(String expected)
	{
		isNotNull();
		String actualField = actual.getLimit_Rounding();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Limit_Rounding: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasList_AddAmt(Object expected)
	{
		isNotNull();
		bdAssert("List_AddAmt", actual.getList_AddAmt(), expected);
		return myself;
	}


	public SELF hasList_Base(String expected)
	{
		isNotNull();
		String actualField = actual.getList_Base();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have List_Base: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasList_Discount(Object expected)
	{
		isNotNull();
		bdAssert("List_Discount", actual.getList_Discount(), expected);
		return myself;
	}


	public SELF hasList_Fixed(Object expected)
	{
		isNotNull();
		bdAssert("List_Fixed", actual.getList_Fixed(), expected);
		return myself;
	}


	public SELF hasList_MaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("List_MaxAmt", actual.getList_MaxAmt(), expected);
		return myself;
	}


	public SELF hasList_MinAmt(Object expected)
	{
		isNotNull();
		bdAssert("List_MinAmt", actual.getList_MinAmt(), expected);
		return myself;
	}


	public SELF hasList_Rounding(String expected)
	{
		isNotNull();
		String actualField = actual.getList_Rounding();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have List_Rounding: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
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

	public SELF hasM_DiscountSchemaLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_DiscountSchemaLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchemaLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_DiscountSchemaLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_DiscountSchemaLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_DiscountSchemaLine_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasStd_AddAmt(Object expected)
	{
		isNotNull();
		bdAssert("Std_AddAmt", actual.getStd_AddAmt(), expected);
		return myself;
	}


	public SELF hasStd_Base(String expected)
	{
		isNotNull();
		String actualField = actual.getStd_Base();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Std_Base: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasStd_Discount(Object expected)
	{
		isNotNull();
		bdAssert("Std_Discount", actual.getStd_Discount(), expected);
		return myself;
	}


	public SELF hasStd_Fixed(Object expected)
	{
		isNotNull();
		bdAssert("Std_Fixed", actual.getStd_Fixed(), expected);
		return myself;
	}


	public SELF hasStd_MaxAmt(Object expected)
	{
		isNotNull();
		bdAssert("Std_MaxAmt", actual.getStd_MaxAmt(), expected);
		return myself;
	}


	public SELF hasStd_MinAmt(Object expected)
	{
		isNotNull();
		bdAssert("Std_MinAmt", actual.getStd_MinAmt(), expected);
		return myself;
	}


	public SELF hasStd_Rounding(String expected)
	{
		isNotNull();
		String actualField = actual.getStd_Rounding();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Std_Rounding: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}