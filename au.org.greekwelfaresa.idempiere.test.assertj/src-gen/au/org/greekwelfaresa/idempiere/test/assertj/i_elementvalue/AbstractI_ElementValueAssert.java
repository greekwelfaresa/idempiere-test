/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.i_elementvalue;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_I_ElementValue;

/** Generated assertion class for I_ElementValue
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractI_ElementValueAssert<SELF extends AbstractI_ElementValueAssert<SELF, ACTUAL>, ACTUAL extends X_I_ElementValue>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractI_ElementValueAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAccountSign(String expected)
	{
		isNotNull();
		String actualField = actual.getAccountSign();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AccountSign: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAccountType(String expected)
	{
		isNotNull();
		String actualField = actual.getAccountType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AccountType: <%s>\nbut it was: <%s>",
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

	public SELF hasC_Element_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Element_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Element_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDefault_Account(String expected)
	{
		isNotNull();
		String actualField = actual.getDefault_Account();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Default_Account: <%s>\nbut it was: <%s>",
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

	public SELF hasElementName(String expected)
	{
		isNotNull();
		String actualField = actual.getElementName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ElementName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasI_ElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getI_ElementValue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_ElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasI_ElementValue_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getI_ElementValue_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_ElementValue_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasI_ErrorMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getI_ErrorMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have I_ErrorMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isI_IsImported()
	{
		isNotNull();
		if (!actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be I_IsImported\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotI_IsImported()
	{
		isNotNull();
		if (actual.isI_IsImported()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be I_IsImported\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDocControlled()
	{
		isNotNull();
		if (!actual.isDocControlled()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DocControlled\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDocControlled()
	{
		isNotNull();
		if (actual.isDocControlled()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DocControlled\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
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

	public SELF hasParentElementValue_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getParentElementValue_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ParentElementValue_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasParentValue(String expected)
	{
		isNotNull();
		String actualField = actual.getParentValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ParentValue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isPostActual()
	{
		isNotNull();
		if (!actual.isPostActual()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostActual\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPostActual()
	{
		isNotNull();
		if (actual.isPostActual()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostActual\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPostBudget()
	{
		isNotNull();
		if (!actual.isPostBudget()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostBudget\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPostBudget()
	{
		isNotNull();
		if (actual.isPostBudget()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostBudget\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPostEncumbrance()
	{
		isNotNull();
		if (!actual.isPostEncumbrance()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostEncumbrance\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPostEncumbrance()
	{
		isNotNull();
		if (actual.isPostEncumbrance()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostEncumbrance\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPostStatistical()
	{
		isNotNull();
		if (!actual.isPostStatistical()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostStatistical\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPostStatistical()
	{
		isNotNull();
		if (actual.isPostStatistical()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostStatistical\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}