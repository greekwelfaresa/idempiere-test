/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.t_aging;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_T_Aging;

/** Generated assertion class for T_Aging
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractT_AgingAssert<SELF extends AbstractT_AgingAssert<SELF, ACTUAL>, ACTUAL extends X_T_Aging>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractT_AgingAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BP_Group_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Group_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Group_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isDateAcct()
	{
		isNotNull();
		if (!actual.isDateAcct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DateAcct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDateAcct()
	{
		isNotNull();
		if (actual.isDateAcct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DateAcct\nbut it was",
				getPODescription());
		}
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

	public SELF hasDue0(Object expected)
	{
		isNotNull();
		bdAssert("Due0", actual.getDue0(), expected);
		return myself;
	}


	public SELF hasDue0_30(Object expected)
	{
		isNotNull();
		bdAssert("Due0_30", actual.getDue0_30(), expected);
		return myself;
	}


	public SELF hasDue0_7(Object expected)
	{
		isNotNull();
		bdAssert("Due0_7", actual.getDue0_7(), expected);
		return myself;
	}


	public SELF hasDue1_7(Object expected)
	{
		isNotNull();
		bdAssert("Due1_7", actual.getDue1_7(), expected);
		return myself;
	}


	public SELF hasDue31_60(Object expected)
	{
		isNotNull();
		bdAssert("Due31_60", actual.getDue31_60(), expected);
		return myself;
	}


	public SELF hasDue31_Plus(Object expected)
	{
		isNotNull();
		bdAssert("Due31_Plus", actual.getDue31_Plus(), expected);
		return myself;
	}


	public SELF hasDue61_90(Object expected)
	{
		isNotNull();
		bdAssert("Due61_90", actual.getDue61_90(), expected);
		return myself;
	}


	public SELF hasDue61_Plus(Object expected)
	{
		isNotNull();
		bdAssert("Due61_Plus", actual.getDue61_Plus(), expected);
		return myself;
	}


	public SELF hasDue8_30(Object expected)
	{
		isNotNull();
		bdAssert("Due8_30", actual.getDue8_30(), expected);
		return myself;
	}


	public SELF hasDue91_Plus(Object expected)
	{
		isNotNull();
		bdAssert("Due91_Plus", actual.getDue91_Plus(), expected);
		return myself;
	}


	public SELF hasDueAmt(Object expected)
	{
		isNotNull();
		bdAssert("DueAmt", actual.getDueAmt(), expected);
		return myself;
	}


	public SELF hasDueDate(Object expected)
	{
		isNotNull();
		dateAssert("DueDate", actual.getDueDate(), expected);
		return myself;
	}


	public SELF hasInvoicedAmt(Object expected)
	{
		isNotNull();
		bdAssert("InvoicedAmt", actual.getInvoicedAmt(), expected);
		return myself;
	}


	public SELF isListInvoices()
	{
		isNotNull();
		if (!actual.isListInvoices()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ListInvoices\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotListInvoices()
	{
		isNotNull();
		if (actual.isListInvoices()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ListInvoices\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSOTrx()
	{
		isNotNull();
		if (!actual.isSOTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SOTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSOTrx()
	{
		isNotNull();
		if (actual.isSOTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SOTrx\nbut it was",
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


	public SELF hasPastDue1_30(Object expected)
	{
		isNotNull();
		bdAssert("PastDue1_30", actual.getPastDue1_30(), expected);
		return myself;
	}


	public SELF hasPastDue1_7(Object expected)
	{
		isNotNull();
		bdAssert("PastDue1_7", actual.getPastDue1_7(), expected);
		return myself;
	}


	public SELF hasPastDue31_60(Object expected)
	{
		isNotNull();
		bdAssert("PastDue31_60", actual.getPastDue31_60(), expected);
		return myself;
	}


	public SELF hasPastDue31_Plus(Object expected)
	{
		isNotNull();
		bdAssert("PastDue31_Plus", actual.getPastDue31_Plus(), expected);
		return myself;
	}


	public SELF hasPastDue61_90(Object expected)
	{
		isNotNull();
		bdAssert("PastDue61_90", actual.getPastDue61_90(), expected);
		return myself;
	}


	public SELF hasPastDue61_Plus(Object expected)
	{
		isNotNull();
		bdAssert("PastDue61_Plus", actual.getPastDue61_Plus(), expected);
		return myself;
	}


	public SELF hasPastDue8_30(Object expected)
	{
		isNotNull();
		bdAssert("PastDue8_30", actual.getPastDue8_30(), expected);
		return myself;
	}


	public SELF hasPastDue91_Plus(Object expected)
	{
		isNotNull();
		bdAssert("PastDue91_Plus", actual.getPastDue91_Plus(), expected);
		return myself;
	}


	public SELF hasPastDueAmt(Object expected)
	{
		isNotNull();
		bdAssert("PastDueAmt", actual.getPastDueAmt(), expected);
		return myself;
	}


	public SELF hasStatementDate(Object expected)
	{
		isNotNull();
		dateAssert("StatementDate", actual.getStatementDate(), expected);
		return myself;
	}


	public SELF hasT_Aging_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_Aging_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have T_Aging_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}