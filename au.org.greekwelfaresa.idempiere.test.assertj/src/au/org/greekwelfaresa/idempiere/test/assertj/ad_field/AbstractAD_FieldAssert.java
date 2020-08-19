/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_field;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Field;

/** Generated assertion class for AD_Field
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_FieldAssert<SELF extends AbstractAD_FieldAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Field>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_FieldAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Field_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Field_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Field_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Field_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Field_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Field_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_FieldGroup_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_FieldGroup_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_FieldGroup_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_FieldStyle_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_FieldStyle_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_FieldStyle_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_LabelStyle_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LabelStyle_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_LabelStyle_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Reference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Reference_Value_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Reference_Value_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Reference_Value_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tab_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Val_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Val_Rule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Val_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasColumnSpan(int expected)
	{
		isNotNull();
		int actualField = actual.getColumnSpan();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnSpan: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDefaultValue(String expected)
	{
		isNotNull();
		String actualField = actual.getDefaultValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DefaultValue: <%s>\nbut it was: <%s>",
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

	public SELF hasDisplayLength(int expected)
	{
		isNotNull();
		int actualField = actual.getDisplayLength();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DisplayLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDisplayLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplayLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DisplayLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
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

	public SELF hasIncluded_Tab_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getIncluded_Tab_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Included_Tab_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAdvancedField()
	{
		isNotNull();
		if (!actual.isAdvancedField()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdvancedField\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAdvancedField()
	{
		isNotNull();
		if (actual.isAdvancedField()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdvancedField\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasIsAllowCopy(String expected)
	{
		isNotNull();
		String actualField = actual.getIsAllowCopy();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IsAllowCopy: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasIsAlwaysUpdateable(String expected)
	{
		isNotNull();
		String actualField = actual.getIsAlwaysUpdateable();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IsAlwaysUpdateable: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isCentrallyMaintained()
	{
		isNotNull();
		if (!actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CentrallyMaintained\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCentrallyMaintained()
	{
		isNotNull();
		if (actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CentrallyMaintained\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDefaultFocus()
	{
		isNotNull();
		if (!actual.isDefaultFocus()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DefaultFocus\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDefaultFocus()
	{
		isNotNull();
		if (actual.isDefaultFocus()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DefaultFocus\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDisplayed()
	{
		isNotNull();
		if (!actual.isDisplayed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Displayed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDisplayed()
	{
		isNotNull();
		if (actual.isDisplayed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Displayed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDisplayedGrid()
	{
		isNotNull();
		if (!actual.isDisplayedGrid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DisplayedGrid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDisplayedGrid()
	{
		isNotNull();
		if (actual.isDisplayedGrid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DisplayedGrid\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isEncrypted()
	{
		isNotNull();
		if (!actual.isEncrypted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Encrypted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotEncrypted()
	{
		isNotNull();
		if (actual.isEncrypted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Encrypted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFieldOnly()
	{
		isNotNull();
		if (!actual.isFieldOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FieldOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFieldOnly()
	{
		isNotNull();
		if (actual.isFieldOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FieldOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isHeading()
	{
		isNotNull();
		if (!actual.isHeading()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Heading\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHeading()
	{
		isNotNull();
		if (actual.isHeading()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Heading\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasIsMandatory(String expected)
	{
		isNotNull();
		String actualField = actual.getIsMandatory();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IsMandatory: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isQuickEntry()
	{
		isNotNull();
		if (!actual.isQuickEntry()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be QuickEntry\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotQuickEntry()
	{
		isNotNull();
		if (actual.isQuickEntry()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be QuickEntry\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isReadOnly()
	{
		isNotNull();
		if (!actual.isReadOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReadOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotReadOnly()
	{
		isNotNull();
		if (actual.isReadOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReadOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSameLine()
	{
		isNotNull();
		if (!actual.isSameLine()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SameLine\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSameLine()
	{
		isNotNull();
		if (actual.isSameLine()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SameLine\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasIsToolbarButton(String expected)
	{
		isNotNull();
		String actualField = actual.getIsToolbarButton();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IsToolbarButton: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasIsUpdateable(String expected)
	{
		isNotNull();
		String actualField = actual.getIsUpdateable();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IsUpdateable: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMandatoryLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getMandatoryLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MandatoryLogic: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
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

	public SELF hasNumLines(int expected)
	{
		isNotNull();
		int actualField = actual.getNumLines();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NumLines: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasObscureType(String expected)
	{
		isNotNull();
		String actualField = actual.getObscureType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ObscureType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlaceholder(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholder();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Placeholder: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasReadOnlyLogic(String expected)
	{
		isNotNull();
		String actualField = actual.getReadOnlyLogic();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ReadOnlyLogic: <%s>\nbut it was: <%s>",
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

	public SELF hasSeqNoGrid(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNoGrid();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNoGrid: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSortNo(Object expected)
	{
		isNotNull();
		bdAssert("SortNo", actual.getSortNo(), expected);
		return myself;
	}


	public SELF hasVFormat(String expected)
	{
		isNotNull();
		String actualField = actual.getVFormat();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VFormat: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasXPosition(int expected)
	{
		isNotNull();
		int actualField = actual.getXPosition();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have XPosition: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}