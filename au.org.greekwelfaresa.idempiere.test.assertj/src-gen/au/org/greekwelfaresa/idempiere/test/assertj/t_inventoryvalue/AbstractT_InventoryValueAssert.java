/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.t_inventoryvalue;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_T_InventoryValue;

/** Generated assertion class for T_InventoryValue
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractT_InventoryValueAssert<SELF extends AbstractT_InventoryValueAssert<SELF, ACTUAL>, ACTUAL extends X_T_InventoryValue>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractT_InventoryValueAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasCost(Object expected)
	{
		isNotNull();
		bdAssert("Cost", actual.getCost(), expected);
		return myself;
	}


	public SELF hasCostAmt(Object expected)
	{
		isNotNull();
		bdAssert("CostAmt", actual.getCostAmt(), expected);
		return myself;
	}


	public SELF hasCostStandard(Object expected)
	{
		isNotNull();
		bdAssert("CostStandard", actual.getCostStandard(), expected);
		return myself;
	}


	public SELF hasCostStandardAmt(Object expected)
	{
		isNotNull();
		bdAssert("CostStandardAmt", actual.getCostStandardAmt(), expected);
		return myself;
	}


	public SELF hasDateValue(Object expected)
	{
		isNotNull();
		dateAssert("DateValue", actual.getDateValue(), expected);
		return myself;
	}


	public SELF hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_CostElement_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostElement_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostElement_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_PriceList_Version_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_Version_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PriceList_Version_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPriceLimit(Object expected)
	{
		isNotNull();
		bdAssert("PriceLimit", actual.getPriceLimit(), expected);
		return myself;
	}


	public SELF hasPriceLimitAmt(Object expected)
	{
		isNotNull();
		bdAssert("PriceLimitAmt", actual.getPriceLimitAmt(), expected);
		return myself;
	}


	public SELF hasPriceList(Object expected)
	{
		isNotNull();
		bdAssert("PriceList", actual.getPriceList(), expected);
		return myself;
	}


	public SELF hasPriceListAmt(Object expected)
	{
		isNotNull();
		bdAssert("PriceListAmt", actual.getPriceListAmt(), expected);
		return myself;
	}


	public SELF hasPricePO(Object expected)
	{
		isNotNull();
		bdAssert("PricePO", actual.getPricePO(), expected);
		return myself;
	}


	public SELF hasPricePOAmt(Object expected)
	{
		isNotNull();
		bdAssert("PricePOAmt", actual.getPricePOAmt(), expected);
		return myself;
	}


	public SELF hasPriceStd(Object expected)
	{
		isNotNull();
		bdAssert("PriceStd", actual.getPriceStd(), expected);
		return myself;
	}


	public SELF hasPriceStdAmt(Object expected)
	{
		isNotNull();
		bdAssert("PriceStdAmt", actual.getPriceStdAmt(), expected);
		return myself;
	}


	public SELF hasQtyOnHand(Object expected)
	{
		isNotNull();
		bdAssert("QtyOnHand", actual.getQtyOnHand(), expected);
		return myself;
	}


	public SELF hasT_InventoryValue_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_InventoryValue_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have T_InventoryValue_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}