/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_column;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Column;

/** Generated assertion class for AD_Column
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_ColumnAssert<SELF extends AbstractAD_ColumnAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Column>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_ColumnAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Chart_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Chart_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Chart_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
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

	public SELF hasAD_Column_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Column_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Column_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Element_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Element_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Element_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Process_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Process_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Process_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasCallout(String expected)
	{
		isNotNull();
		String actualField = actual.getCallout();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Callout: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasColumnName(String expected)
	{
		isNotNull();
		String actualField = actual.getColumnName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasColumnSQL(String expected)
	{
		isNotNull();
		String actualField = actual.getColumnSQL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnSQL: <%s>\nbut it was: <%s>",
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

	public SELF hasFieldLength(int expected)
	{
		isNotNull();
		int actualField = actual.getFieldLength();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FieldLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFKConstraintName(String expected)
	{
		isNotNull();
		String actualField = actual.getFKConstraintName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FKConstraintName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFKConstraintType(String expected)
	{
		isNotNull();
		String actualField = actual.getFKConstraintType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FKConstraintType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFormatPattern(String expected)
	{
		isNotNull();
		String actualField = actual.getFormatPattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FormatPattern: <%s>\nbut it was: <%s>",
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

	public SELF isAllowCopy()
	{
		isNotNull();
		if (!actual.isAllowCopy()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowCopy\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowCopy()
	{
		isNotNull();
		if (actual.isAllowCopy()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowCopy\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllowLogging()
	{
		isNotNull();
		if (!actual.isAllowLogging()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowLogging\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowLogging()
	{
		isNotNull();
		if (actual.isAllowLogging()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowLogging\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAlwaysUpdateable()
	{
		isNotNull();
		if (!actual.isAlwaysUpdateable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AlwaysUpdateable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAlwaysUpdateable()
	{
		isNotNull();
		if (actual.isAlwaysUpdateable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AlwaysUpdateable\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAutocomplete()
	{
		isNotNull();
		if (!actual.isAutocomplete()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Autocomplete\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAutocomplete()
	{
		isNotNull();
		if (actual.isAutocomplete()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Autocomplete\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isHtml()
	{
		isNotNull();
		if (!actual.isHtml()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Html\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHtml()
	{
		isNotNull();
		if (actual.isHtml()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Html\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIdentifier()
	{
		isNotNull();
		if (!actual.isIdentifier()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Identifier\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIdentifier()
	{
		isNotNull();
		if (actual.isIdentifier()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Identifier\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isKey()
	{
		isNotNull();
		if (!actual.isKey()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Key\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotKey()
	{
		isNotNull();
		if (actual.isKey()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Key\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMandatory()
	{
		isNotNull();
		if (!actual.isMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Mandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMandatory()
	{
		isNotNull();
		if (actual.isMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Mandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isParent()
	{
		isNotNull();
		if (!actual.isParent()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Parent\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotParent()
	{
		isNotNull();
		if (actual.isParent()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Parent\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSecure()
	{
		isNotNull();
		if (!actual.isSecure()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Secure\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSecure()
	{
		isNotNull();
		if (actual.isSecure()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Secure\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSelectionColumn()
	{
		isNotNull();
		if (!actual.isSelectionColumn()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelectionColumn\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSelectionColumn()
	{
		isNotNull();
		if (actual.isSelectionColumn()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelectionColumn\nbut it was",
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

	public SELF isTranslated()
	{
		isNotNull();
		if (!actual.isTranslated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Translated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTranslated()
	{
		isNotNull();
		if (actual.isTranslated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Translated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUpdateable()
	{
		isNotNull();
		if (!actual.isUpdateable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Updateable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUpdateable()
	{
		isNotNull();
		if (actual.isUpdateable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Updateable\nbut it was",
				getPODescription());
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

	public SELF hasPA_DashboardContent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_DashboardContent_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_DashboardContent_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasSeqNoSelection(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNoSelection();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNoSelection: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasValueMax(String expected)
	{
		isNotNull();
		String actualField = actual.getValueMax();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ValueMax: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasValueMin(String expected)
	{
		isNotNull();
		String actualField = actual.getValueMin();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ValueMin: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasVersion(Object expected)
	{
		isNotNull();
		bdAssert("Version", actual.getVersion(), expected);
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
}