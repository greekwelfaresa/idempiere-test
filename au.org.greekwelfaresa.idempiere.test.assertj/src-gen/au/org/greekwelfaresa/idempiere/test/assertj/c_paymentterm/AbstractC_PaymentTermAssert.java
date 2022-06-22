/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_paymentterm;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_PaymentTerm;

/** Generated assertion class for C_PaymentTerm
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_PaymentTermAssert<SELF extends AbstractC_PaymentTermAssert<SELF, ACTUAL>, ACTUAL extends X_C_PaymentTerm>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_PaymentTermAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF isAfterDelivery()
	{
		isNotNull();
		if (!actual.isAfterDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AfterDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAfterDelivery()
	{
		isNotNull();
		if (actual.isAfterDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AfterDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaymentTerm_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_PaymentTerm_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasDiscount(Object expected)
	{
		isNotNull();
		bdAssert("Discount", actual.getDiscount(), expected);
		return myself;
	}


	public SELF hasDiscount2(Object expected)
	{
		isNotNull();
		bdAssert("Discount2", actual.getDiscount2(), expected);
		return myself;
	}


	public SELF hasDiscountDays(int expected)
	{
		isNotNull();
		int actualField = actual.getDiscountDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DiscountDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDiscountDays2(int expected)
	{
		isNotNull();
		int actualField = actual.getDiscountDays2();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DiscountDays2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDocumentNote(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNote();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNote: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFixMonthCutoff(int expected)
	{
		isNotNull();
		int actualField = actual.getFixMonthCutoff();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FixMonthCutoff: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFixMonthDay(int expected)
	{
		isNotNull();
		int actualField = actual.getFixMonthDay();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FixMonthDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFixMonthOffset(int expected)
	{
		isNotNull();
		int actualField = actual.getFixMonthOffset();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FixMonthOffset: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGraceDays(int expected)
	{
		isNotNull();
		int actualField = actual.getGraceDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GraceDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
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

	public SELF isDueFixed()
	{
		isNotNull();
		if (!actual.isDueFixed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DueFixed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDueFixed()
	{
		isNotNull();
		if (actual.isDueFixed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DueFixed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isNextBusinessDay()
	{
		isNotNull();
		if (!actual.isNextBusinessDay()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NextBusinessDay\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotNextBusinessDay()
	{
		isNotNull();
		if (actual.isNextBusinessDay()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NextBusinessDay\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isValid()
	{
		isNotNull();
		if (!actual.isValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Valid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotValid()
	{
		isNotNull();
		if (actual.isValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Valid\nbut it was",
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

	public SELF hasNetDay(String expected)
	{
		isNotNull();
		String actualField = actual.getNetDay();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NetDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasNetDays(int expected)
	{
		isNotNull();
		int actualField = actual.getNetDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NetDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPaymentTermUsage(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentTermUsage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PaymentTermUsage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
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