/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_toolbarbutton;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_ToolBarButton;

/** Generated assertion class for AD_ToolBarButton
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_ToolBarButtonAssert<SELF extends AbstractAD_ToolBarButtonAssert<SELF, ACTUAL>, ACTUAL extends X_AD_ToolBarButton>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_ToolBarButtonAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAction(String expected)
	{
		isNotNull();
		String actualField = actual.getAction();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Action: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasActionClassName(String expected)
	{
		isNotNull();
		String actualField = actual.getActionClassName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ActionClassName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasActionName(String expected)
	{
		isNotNull();
		String actualField = actual.getActionName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ActionName: <%s>\nbut it was: <%s>",
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

	public SELF hasAD_ToolBarButton_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ToolBarButton_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ToolBarButton_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_ToolBarButton_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_ToolBarButton_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ToolBarButton_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasComponentName(String expected)
	{
		isNotNull();
		String actualField = actual.getComponentName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ComponentName: <%s>\nbut it was: <%s>",
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

	public SELF isAddSeparator()
	{
		isNotNull();
		if (!actual.isAddSeparator()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddSeparator\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAddSeparator()
	{
		isNotNull();
		if (actual.isAddSeparator()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddSeparator\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAdvancedButton()
	{
		isNotNull();
		if (!actual.isAdvancedButton()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AdvancedButton\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAdvancedButton()
	{
		isNotNull();
		if (actual.isAdvancedButton()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AdvancedButton\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCustomization()
	{
		isNotNull();
		if (!actual.isCustomization()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Customization\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCustomization()
	{
		isNotNull();
		if (actual.isCustomization()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Customization\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasKeyStroke_KeyCode(int expected)
	{
		isNotNull();
		int actualField = actual.getKeyStroke_KeyCode();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have KeyStroke_KeyCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasKeyStroke_Modifiers(int expected)
	{
		isNotNull();
		int actualField = actual.getKeyStroke_Modifiers();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have KeyStroke_Modifiers: <%s>\nbut it was: <%s>",
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
}