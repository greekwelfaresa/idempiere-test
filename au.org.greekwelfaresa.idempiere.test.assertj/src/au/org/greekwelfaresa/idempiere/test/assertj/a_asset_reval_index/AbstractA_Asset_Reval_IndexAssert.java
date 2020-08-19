/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.a_asset_reval_index;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_A_Asset_Reval_Index;

/** Generated assertion class for A_Asset_Reval_Index
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractA_Asset_Reval_IndexAssert<SELF extends AbstractA_Asset_Reval_IndexAssert<SELF, ACTUAL>, ACTUAL extends X_A_Asset_Reval_Index>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractA_Asset_Reval_IndexAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasA_Asset_Reval_Index_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Reval_Index_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Reval_Index_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Reval_Index_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Reval_Index_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Reval_Index_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Effective_Date(Object expected)
	{
		isNotNull();
		dateAssert("A_Effective_Date", actual.getA_Effective_Date(), expected);
		return myself;
	}


	public SELF hasA_Reval_Code(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Reval_Code();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Code: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Reval_Multiplier(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Reval_Multiplier();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Reval_Multiplier: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Reval_Rate(Object expected)
	{
		isNotNull();
		bdAssert("A_Reval_Rate", actual.getA_Reval_Rate(), expected);
		return myself;
	}

}