/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.a_asset_spread;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_A_Asset_Spread;

/** Generated assertion class for A_Asset_Spread
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractA_Asset_SpreadAssert<SELF extends AbstractA_Asset_SpreadAssert<SELF, ACTUAL>, ACTUAL extends X_A_Asset_Spread>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractA_Asset_SpreadAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasA_Asset_Spread_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Spread_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Spread_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Spread_Type(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Spread_Type();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Spread_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Spread_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Spread_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Spread_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Period_1(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_1", actual.getA_Period_1(), expected);
		return myself;
	}


	public SELF hasA_Period_10(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_10", actual.getA_Period_10(), expected);
		return myself;
	}


	public SELF hasA_Period_11(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_11", actual.getA_Period_11(), expected);
		return myself;
	}


	public SELF hasA_Period_12(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_12", actual.getA_Period_12(), expected);
		return myself;
	}


	public SELF hasA_Period_13(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_13", actual.getA_Period_13(), expected);
		return myself;
	}


	public SELF hasA_Period_14(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_14", actual.getA_Period_14(), expected);
		return myself;
	}


	public SELF hasA_Period_2(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_2", actual.getA_Period_2(), expected);
		return myself;
	}


	public SELF hasA_Period_3(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_3", actual.getA_Period_3(), expected);
		return myself;
	}


	public SELF hasA_Period_4(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_4", actual.getA_Period_4(), expected);
		return myself;
	}


	public SELF hasA_Period_5(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_5", actual.getA_Period_5(), expected);
		return myself;
	}


	public SELF hasA_Period_6(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_6", actual.getA_Period_6(), expected);
		return myself;
	}


	public SELF hasA_Period_7(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_7", actual.getA_Period_7(), expected);
		return myself;
	}


	public SELF hasA_Period_8(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_8", actual.getA_Period_8(), expected);
		return myself;
	}


	public SELF hasA_Period_9(Object expected)
	{
		isNotNull();
		bdAssert("A_Period_9", actual.getA_Period_9(), expected);
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
}