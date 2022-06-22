/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_userremuneration;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_UserRemuneration;

/** Generated assertion class for C_UserRemuneration
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_UserRemunerationAssert<SELF extends AbstractC_UserRemunerationAssert<SELF, ACTUAL>, ACTUAL extends X_C_UserRemuneration>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_UserRemunerationAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Remuneration_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Remuneration_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Remuneration_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UserRemuneration_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UserRemuneration_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UserRemuneration_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UserRemuneration_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_UserRemuneration_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UserRemuneration_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasGrossRAmt(Object expected)
	{
		isNotNull();
		bdAssert("GrossRAmt", actual.getGrossRAmt(), expected);
		return myself;
	}


	public SELF hasGrossRCost(Object expected)
	{
		isNotNull();
		bdAssert("GrossRCost", actual.getGrossRCost(), expected);
		return myself;
	}


	public SELF hasOvertimeAmt(Object expected)
	{
		isNotNull();
		bdAssert("OvertimeAmt", actual.getOvertimeAmt(), expected);
		return myself;
	}


	public SELF hasOvertimeCost(Object expected)
	{
		isNotNull();
		bdAssert("OvertimeCost", actual.getOvertimeCost(), expected);
		return myself;
	}


	public SELF hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}


	public SELF hasValidTo(Object expected)
	{
		isNotNull();
		dateAssert("ValidTo", actual.getValidTo(), expected);
		return myself;
	}

}