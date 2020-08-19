/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.a_asset_group;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_A_Asset_Group;

/** Generated assertion class for A_Asset_Group
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractA_Asset_GroupAssert<SELF extends AbstractA_Asset_GroupAssert<SELF, ACTUAL>, ACTUAL extends X_A_Asset_Group>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractA_Asset_GroupAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasA_Asset_Class_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Class_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Class_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Group_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Group_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getA_Asset_Group_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Group_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasA_Asset_Type_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getA_Asset_Type_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have A_Asset_Type_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isCreateAsActive()
	{
		isNotNull();
		if (!actual.isCreateAsActive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateAsActive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCreateAsActive()
	{
		isNotNull();
		if (actual.isCreateAsActive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateAsActive\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDepreciated()
	{
		isNotNull();
		if (!actual.isDepreciated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Depreciated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDepreciated()
	{
		isNotNull();
		if (actual.isDepreciated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Depreciated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFixedAsset()
	{
		isNotNull();
		if (!actual.isFixedAsset()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FixedAsset\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFixedAsset()
	{
		isNotNull();
		if (actual.isFixedAsset()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FixedAsset\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOneAssetPerUOM()
	{
		isNotNull();
		if (!actual.isOneAssetPerUOM()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OneAssetPerUOM\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOneAssetPerUOM()
	{
		isNotNull();
		if (actual.isOneAssetPerUOM()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OneAssetPerUOM\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOwned()
	{
		isNotNull();
		if (!actual.isOwned()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Owned\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOwned()
	{
		isNotNull();
		if (actual.isOwned()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Owned\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTrackIssues()
	{
		isNotNull();
		if (!actual.isTrackIssues()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TrackIssues\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTrackIssues()
	{
		isNotNull();
		if (actual.isTrackIssues()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TrackIssues\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasName(String expected)
	{
		isNotNull();
		String actualField = actual.getName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Name: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}