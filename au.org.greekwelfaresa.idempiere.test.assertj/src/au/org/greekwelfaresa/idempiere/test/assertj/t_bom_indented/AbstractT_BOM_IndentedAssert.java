/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.t_bom_indented;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_T_BOM_Indented;

/** Generated assertion class for T_BOM_Indented
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractT_BOM_IndentedAssert<SELF extends AbstractT_BOM_IndentedAssert<SELF, ACTUAL>, ACTUAL extends X_T_BOM_Indented>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractT_BOM_IndentedAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasCost(Object expected)
	{
		isNotNull();
		bdAssert("Cost", actual.getCost(), expected);
		return myself;
	}


	public SELF hasCostFuture(Object expected)
	{
		isNotNull();
		bdAssert("CostFuture", actual.getCostFuture(), expected);
		return myself;
	}


	public SELF hasCurrentCostPrice(Object expected)
	{
		isNotNull();
		bdAssert("CurrentCostPrice", actual.getCurrentCostPrice(), expected);
		return myself;
	}


	public SELF hasCurrentCostPriceLL(Object expected)
	{
		isNotNull();
		bdAssert("CurrentCostPriceLL", actual.getCurrentCostPriceLL(), expected);
		return myself;
	}


	public SELF hasFutureCostPrice(Object expected)
	{
		isNotNull();
		bdAssert("FutureCostPrice", actual.getFutureCostPrice(), expected);
		return myself;
	}


	public SELF hasFutureCostPriceLL(Object expected)
	{
		isNotNull();
		bdAssert("FutureCostPriceLL", actual.getFutureCostPriceLL(), expected);
		return myself;
	}


	public SELF hasLevelNo(int expected)
	{
		isNotNull();
		int actualField = actual.getLevelNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LevelNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLevels(String expected)
	{
		isNotNull();
		String actualField = actual.getLevels();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Levels: <%s>\nbut it was: <%s>",
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

	public SELF hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public SELF hasQtyBOM(Object expected)
	{
		isNotNull();
		bdAssert("QtyBOM", actual.getQtyBOM(), expected);
		return myself;
	}


	public SELF hasSel_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSel_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Sel_Product_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasT_BOM_Indented_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getT_BOM_Indented_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have T_BOM_Indented_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasT_BOM_Indented_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_BOM_Indented_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have T_BOM_Indented_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}