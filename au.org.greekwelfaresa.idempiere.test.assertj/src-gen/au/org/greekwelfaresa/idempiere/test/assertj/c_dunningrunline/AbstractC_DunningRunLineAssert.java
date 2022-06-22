/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_dunningrunline;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_DunningRunLine;

/** Generated assertion class for C_DunningRunLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_DunningRunLineAssert<SELF extends AbstractC_DunningRunLineAssert<SELF, ACTUAL>, ACTUAL extends X_C_DunningRunLine>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_DunningRunLineAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAmt(Object expected)
	{
		isNotNull();
		bdAssert("Amt", actual.getAmt(), expected);
		return myself;
	}


	public SELF hasC_DunningRunEntry_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DunningRunEntry_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DunningRunEntry_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DunningRunLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DunningRunLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DunningRunLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DunningRunLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_DunningRunLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DunningRunLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Invoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Invoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Invoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_InvoicePaySchedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_InvoicePaySchedule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_InvoicePaySchedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Payment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasConvertedAmt(Object expected)
	{
		isNotNull();
		bdAssert("ConvertedAmt", actual.getConvertedAmt(), expected);
		return myself;
	}


	public SELF hasDaysDue(int expected)
	{
		isNotNull();
		int actualField = actual.getDaysDue();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DaysDue: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFeeAmt(Object expected)
	{
		isNotNull();
		bdAssert("FeeAmt", actual.getFeeAmt(), expected);
		return myself;
	}


	public SELF hasInterestAmt(Object expected)
	{
		isNotNull();
		bdAssert("InterestAmt", actual.getInterestAmt(), expected);
		return myself;
	}


	public SELF isInDispute()
	{
		isNotNull();
		if (!actual.isInDispute()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InDispute\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInDispute()
	{
		isNotNull();
		if (actual.isInDispute()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InDispute\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasOpenAmt(Object expected)
	{
		isNotNull();
		bdAssert("OpenAmt", actual.getOpenAmt(), expected);
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

	public SELF hasTimesDunned(int expected)
	{
		isNotNull();
		int actualField = actual.getTimesDunned();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TimesDunned: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTotalAmt(Object expected)
	{
		isNotNull();
		bdAssert("TotalAmt", actual.getTotalAmt(), expected);
		return myself;
	}

}