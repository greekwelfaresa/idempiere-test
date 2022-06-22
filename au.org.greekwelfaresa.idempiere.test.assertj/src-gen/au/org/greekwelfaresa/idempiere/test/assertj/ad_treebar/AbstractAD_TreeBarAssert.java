/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_treebar;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_TreeBar;

/** Generated assertion class for AD_TreeBar
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_TreeBarAssert<SELF extends AbstractAD_TreeBarAssert<SELF, ACTUAL>, ACTUAL extends X_AD_TreeBar>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_TreeBarAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Menu_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Menu_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Menu_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tree_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_TreeBar_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_TreeBar_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_TreeBar_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
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

	public SELF isFavourite()
	{
		isNotNull();
		if (!actual.isFavourite()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Favourite\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFavourite()
	{
		isNotNull();
		if (actual.isFavourite()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Favourite\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLoginOpenSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getLoginOpenSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LoginOpenSeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasNode_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getNode_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Node_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}