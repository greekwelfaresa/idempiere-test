/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_userpreference;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_UserPreference;

/** Generated assertion class for AD_UserPreference
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_UserPreferenceAssert<SELF extends AbstractAD_UserPreferenceAssert<SELF, ACTUAL>, ACTUAL extends X_AD_UserPreference>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_UserPreferenceAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasAD_UserPreference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_UserPreference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_UserPreference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_UserPreference_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_UserPreference_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_UserPreference_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAutoCommit()
	{
		isNotNull();
		if (!actual.isAutoCommit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoCommit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAutoCommit()
	{
		isNotNull();
		if (actual.isAutoCommit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoCommit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasAutomaticDecimalPlacesForAmoun(int expected)
	{
		isNotNull();
		int actualField = actual.getAutomaticDecimalPlacesForAmoun();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AutomaticDecimalPlacesForAmoun: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAutoNew()
	{
		isNotNull();
		if (!actual.isAutoNew()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoNew\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAutoNew()
	{
		isNotNull();
		if (actual.isAutoNew()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoNew\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDetailedZoomAcross()
	{
		isNotNull();
		if (!actual.isDetailedZoomAcross()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DetailedZoomAcross\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDetailedZoomAcross()
	{
		isNotNull();
		if (actual.isDetailedZoomAcross()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DetailedZoomAcross\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUseSimilarTo()
	{
		isNotNull();
		if (!actual.isUseSimilarTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseSimilarTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUseSimilarTo()
	{
		isNotNull();
		if (actual.isUseSimilarTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseSimilarTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isToggleOnDoubleClick()
	{
		isNotNull();
		if (!actual.isToggleOnDoubleClick()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ToggleOnDoubleClick\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotToggleOnDoubleClick()
	{
		isNotNull();
		if (actual.isToggleOnDoubleClick()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ToggleOnDoubleClick\nbut it was",
				getPODescription());
		}
		return myself;
	}
}