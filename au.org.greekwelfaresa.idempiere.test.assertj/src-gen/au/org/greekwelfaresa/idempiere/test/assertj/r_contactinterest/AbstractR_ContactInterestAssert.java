/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.r_contactinterest;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_R_ContactInterest;

/** Generated assertion class for R_ContactInterest
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractR_ContactInterestAssert<SELF extends AbstractR_ContactInterestAssert<SELF, ACTUAL>, ACTUAL extends X_R_ContactInterest>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractR_ContactInterestAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasOptOutDate(Object expected)
	{
		isNotNull();
		dateAssert("OptOutDate", actual.getOptOutDate(), expected);
		return myself;
	}


	public SELF hasR_ContactInterest_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_ContactInterest_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_ContactInterest_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_InterestArea_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_InterestArea_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_InterestArea_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSubscribeDate(Object expected)
	{
		isNotNull();
		dateAssert("SubscribeDate", actual.getSubscribeDate(), expected);
		return myself;
	}

}