/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_invoiceschedule;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_InvoiceSchedule;

/** Generated assertion class for C_InvoiceSchedule
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_InvoiceScheduleAssert<SELF extends AbstractC_InvoiceScheduleAssert<SELF, ACTUAL>, ACTUAL extends X_C_InvoiceSchedule>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_InvoiceScheduleAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAmt(Object expected)
	{
		isNotNull();
		bdAssert("Amt", actual.getAmt(), expected);
		return myself;
	}


	public SELF hasC_InvoiceSchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoiceSchedule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceSchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_InvoiceSchedule_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_InvoiceSchedule_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoiceSchedule_UU: <%s>\nbut it was: <%s>",
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

	public SELF isEvenInvoiceWeek()
	{
		isNotNull();
		if (!actual.isEvenInvoiceWeek()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EvenInvoiceWeek\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotEvenInvoiceWeek()
	{
		isNotNull();
		if (actual.isEvenInvoiceWeek()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EvenInvoiceWeek\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasInvoiceDay(int expected)
	{
		isNotNull();
		int actualField = actual.getInvoiceDay();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasInvoiceDayCutoff(int expected)
	{
		isNotNull();
		int actualField = actual.getInvoiceDayCutoff();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceDayCutoff: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasInvoiceFrequency(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceFrequency();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceFrequency: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasInvoiceWeekDay(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceWeekDay();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceWeekDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasInvoiceWeekDayCutoff(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceWeekDayCutoff();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceWeekDayCutoff: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAmount()
	{
		isNotNull();
		if (!actual.isAmount()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Amount\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAmount()
	{
		isNotNull();
		if (actual.isAmount()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Amount\nbut it was",
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