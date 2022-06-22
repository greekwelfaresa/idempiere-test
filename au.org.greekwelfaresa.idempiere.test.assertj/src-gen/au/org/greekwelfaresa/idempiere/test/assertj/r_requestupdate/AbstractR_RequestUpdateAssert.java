/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.r_requestupdate;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_R_RequestUpdate;

/** Generated assertion class for R_RequestUpdate
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractR_RequestUpdateAssert<SELF extends AbstractR_RequestUpdateAssert<SELF, ACTUAL>, ACTUAL extends X_R_RequestUpdate>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractR_RequestUpdateAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasConfidentialTypeEntry(String expected)
	{
		isNotNull();
		String actualField = actual.getConfidentialTypeEntry();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfidentialTypeEntry: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEndTime(Object expected)
	{
		isNotNull();
		dateAssert("EndTime", actual.getEndTime(), expected);
		return myself;
	}


	public SELF hasM_ProductSpent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ProductSpent_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ProductSpent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasQtyInvoiced(Object expected)
	{
		isNotNull();
		bdAssert("QtyInvoiced", actual.getQtyInvoiced(), expected);
		return myself;
	}


	public SELF hasQtySpent(Object expected)
	{
		isNotNull();
		bdAssert("QtySpent", actual.getQtySpent(), expected);
		return myself;
	}


	public SELF hasR_Request_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_Request_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_Request_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_RequestUpdate_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_RequestUpdate_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_RequestUpdate_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_RequestUpdate_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_RequestUpdate_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_RequestUpdate_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasResult(String expected)
	{
		isNotNull();
		String actualField = actual.getResult();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Result: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasStartTime(Object expected)
	{
		isNotNull();
		dateAssert("StartTime", actual.getStartTime(), expected);
		return myself;
	}

}