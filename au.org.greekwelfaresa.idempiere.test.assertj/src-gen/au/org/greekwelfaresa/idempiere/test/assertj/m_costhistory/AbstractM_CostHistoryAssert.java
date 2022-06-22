/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.m_costhistory;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_M_CostHistory;

/** Generated assertion class for M_CostHistory
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_CostHistoryAssert<SELF extends AbstractM_CostHistoryAssert<SELF, ACTUAL>, ACTUAL extends X_M_CostHistory>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_CostHistoryAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF hasM_CostDetail_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostDetail_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostDetail_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasM_CostHistory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_CostHistory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostHistory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_CostHistory_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_CostHistory_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_CostHistory_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
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

	public SELF hasNewCAmt(Object expected)
	{
		isNotNull();
		bdAssert("NewCAmt", actual.getNewCAmt(), expected);
		return myself;
	}


	public SELF hasNewCostPrice(Object expected)
	{
		isNotNull();
		bdAssert("NewCostPrice", actual.getNewCostPrice(), expected);
		return myself;
	}


	public SELF hasNewCQty(Object expected)
	{
		isNotNull();
		bdAssert("NewCQty", actual.getNewCQty(), expected);
		return myself;
	}


	public SELF hasNewQty(Object expected)
	{
		isNotNull();
		bdAssert("NewQty", actual.getNewQty(), expected);
		return myself;
	}


	public SELF hasOldCAmt(Object expected)
	{
		isNotNull();
		bdAssert("OldCAmt", actual.getOldCAmt(), expected);
		return myself;
	}


	public SELF hasOldCostPrice(Object expected)
	{
		isNotNull();
		bdAssert("OldCostPrice", actual.getOldCostPrice(), expected);
		return myself;
	}


	public SELF hasOldCQty(Object expected)
	{
		isNotNull();
		bdAssert("OldCQty", actual.getOldCQty(), expected);
		return myself;
	}


	public SELF hasOldQty(Object expected)
	{
		isNotNull();
		bdAssert("OldQty", actual.getOldQty(), expected);
		return myself;
	}

}