/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_tab;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Tab;

/** Generated assertion class for AD_Tab
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_TabAssert<SELF extends AbstractAD_TabAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Tab>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_TabAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasAD_ColumnSortOrder_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ColumnSortOrder_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ColumnSortOrder_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_ColumnSortYesNo_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ColumnSortYesNo_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ColumnSortYesNo_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_CtxHelp_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_CtxHelp_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_CtxHelp_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Image_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Image_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Image_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasAD_Tab_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Tab_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tab_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasAD_Window_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Window_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Window_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCommitWarning(String expected)
	{
		isNotNull();
		String actualField = actual.getCommitWarning();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CommitWarning: <%s>\nbut it was: <%s>",
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

	public SELF isHasTree()
	{
		isNotNull();
		if (!actual.isHasTree()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasTree\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHasTree()
	{
		isNotNull();
		if (actual.isHasTree()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasTree\nbut it was",
				getPODescription());
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

	public SELF isAdvancedTab()
	{
		isNotNull();
		if (!actual.isAdvancedTab()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdvancedTab\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAdvancedTab()
	{
		isNotNull();
		if (actual.isAdvancedTab()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdvancedTab\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isInfoTab()
	{
		isNotNull();
		if (!actual.isInfoTab()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InfoTab\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInfoTab()
	{
		isNotNull();
		if (actual.isInfoTab()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InfoTab\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isInsertRecord()
	{
		isNotNull();
		if (!actual.isInsertRecord()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InsertRecord\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInsertRecord()
	{
		isNotNull();
		if (actual.isInsertRecord()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InsertRecord\nbut it was",
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

	public SELF isSingleRow()
	{
		isNotNull();
		if (!actual.isSingleRow()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SingleRow\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSingleRow()
	{
		isNotNull();
		if (actual.isSingleRow()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SingleRow\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSortTab()
	{
		isNotNull();
		if (!actual.isSortTab()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SortTab\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSortTab()
	{
		isNotNull();
		if (actual.isSortTab()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SortTab\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTranslationTab()
	{
		isNotNull();
		if (!actual.isTranslationTab()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TranslationTab\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTranslationTab()
	{
		isNotNull();
		if (actual.isTranslationTab()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TranslationTab\nbut it was",
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

	public SELF hasOrderByClause(String expected)
	{
		isNotNull();
		String actualField = actual.getOrderByClause();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have OrderByClause: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasParent_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getParent_Column_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Parent_Column_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasTabLevel(int expected)
	{
		isNotNull();
		int actualField = actual.getTabLevel();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TabLevel: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTreeDisplayedOn(String expected)
	{
		isNotNull();
		String actualField = actual.getTreeDisplayedOn();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TreeDisplayedOn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWhereClause(String expected)
	{
		isNotNull();
		String actualField = actual.getWhereClause();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WhereClause: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}