/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_tree;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Tree;

/** Generated assertion class for AD_Tree
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_TreeAssert<SELF extends AbstractAD_TreeAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Tree>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_TreeAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF hasAD_Tree_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Tree_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_UU: <%s>\nbut it was: <%s>",
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

	public SELF isAllNodes()
	{
		isNotNull();
		if (!actual.isAllNodes()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllNodes\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllNodes()
	{
		isNotNull();
		if (actual.isAllNodes()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllNodes\nbut it was",
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

	public SELF isLoadAllNodesImmediately()
	{
		isNotNull();
		if (!actual.isLoadAllNodesImmediately()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LoadAllNodesImmediately\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotLoadAllNodesImmediately()
	{
		isNotNull();
		if (actual.isLoadAllNodesImmediately()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LoadAllNodesImmediately\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTreeDrivenByValue()
	{
		isNotNull();
		if (!actual.isTreeDrivenByValue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TreeDrivenByValue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTreeDrivenByValue()
	{
		isNotNull();
		if (actual.isTreeDrivenByValue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TreeDrivenByValue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isValueDisplayed()
	{
		isNotNull();
		if (!actual.isValueDisplayed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ValueDisplayed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotValueDisplayed()
	{
		isNotNull();
		if (actual.isValueDisplayed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ValueDisplayed\nbut it was",
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

	public SELF hasTreeType(String expected)
	{
		isNotNull();
		String actualField = actual.getTreeType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TreeType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}