/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_elementvalue;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_ElementValue;

/** Generated assertion class for C_ElementValue
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_ElementValueAssert<SELF extends AbstractC_ElementValueAssert<SELF, ACTUAL>, ACTUAL extends X_C_ElementValue>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_ElementValueAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasBPartnerType(String expected)
	{
		isNotNull();
		String actualField = actual.getBPartnerType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BPartnerType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankAccount_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BankAccount_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_ElementValue_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_ElementValue_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ElementValue_UU: <%s>\nbut it was: <%s>",
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

	public SELF isBankAccount()
	{
		isNotNull();
		if (!actual.isBankAccount()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BankAccount\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotBankAccount()
	{
		isNotNull();
		if (actual.isBankAccount()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BankAccount\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDetailBPartner()
	{
		isNotNull();
		if (!actual.isDetailBPartner()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DetailBPartner\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDetailBPartner()
	{
		isNotNull();
		if (actual.isDetailBPartner()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DetailBPartner\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDetailProduct()
	{
		isNotNull();
		if (!actual.isDetailProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DetailProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDetailProduct()
	{
		isNotNull();
		if (actual.isDetailProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DetailProduct\nbut it was",
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

	public SELF isForeignCurrency()
	{
		isNotNull();
		if (!actual.isForeignCurrency()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ForeignCurrency\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotForeignCurrency()
	{
		isNotNull();
		if (actual.isForeignCurrency()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ForeignCurrency\nbut it was",
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

	public SELF hasValidFrom(Object expected)
	{
		isNotNull();
		dateAssert("ValidFrom", actual.getValidFrom(), expected);
		return myself;
	}


	public SELF hasValidTo(Object expected)
	{
		isNotNull();
		dateAssert("ValidTo", actual.getValidTo(), expected);
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