/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_paymentallocate;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_PaymentAllocate;

/** Generated assertion class for C_PaymentAllocate
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_PaymentAllocateAssert<SELF extends AbstractC_PaymentAllocateAssert<SELF, ACTUAL>, ACTUAL extends X_C_PaymentAllocate>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_PaymentAllocateAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAmount(Object expected)
	{
		isNotNull();
		bdAssert("Amount", actual.getAmount(), expected);
		return myself;
	}


	public SELF hasC_AllocationLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AllocationLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AllocationLine_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_PaymentAllocate_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentAllocate_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentAllocate_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaymentAllocate_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_PaymentAllocate_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentAllocate_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDiscountAmt(Object expected)
	{
		isNotNull();
		bdAssert("DiscountAmt", actual.getDiscountAmt(), expected);
		return myself;
	}


	public SELF hasInvoiceAmt(Object expected)
	{
		isNotNull();
		bdAssert("InvoiceAmt", actual.getInvoiceAmt(), expected);
		return myself;
	}


	public SELF hasOverUnderAmt(Object expected)
	{
		isNotNull();
		bdAssert("OverUnderAmt", actual.getOverUnderAmt(), expected);
		return myself;
	}


	public SELF hasRemainingAmt(Object expected)
	{
		isNotNull();
		bdAssert("RemainingAmt", actual.getRemainingAmt(), expected);
		return myself;
	}


	public SELF hasWriteOffAmt(Object expected)
	{
		isNotNull();
		bdAssert("WriteOffAmt", actual.getWriteOffAmt(), expected);
		return myself;
	}

}