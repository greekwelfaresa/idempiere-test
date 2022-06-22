/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.s_resourceassignment;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_S_ResourceAssignment;

/** Generated assertion class for S_ResourceAssignment
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractS_ResourceAssignmentAssert<SELF extends AbstractS_ResourceAssignmentAssert<SELF, ACTUAL>, ACTUAL extends X_S_ResourceAssignment>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractS_ResourceAssignmentAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAssignDateFrom(Object expected)
	{
		isNotNull();
		dateAssert("AssignDateFrom", actual.getAssignDateFrom(), expected);
		return myself;
	}


	public SELF hasAssignDateTo(Object expected)
	{
		isNotNull();
		dateAssert("AssignDateTo", actual.getAssignDateTo(), expected);
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

	public SELF isConfirmed()
	{
		isNotNull();
		if (!actual.isConfirmed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Confirmed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotConfirmed()
	{
		isNotNull();
		if (actual.isConfirmed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Confirmed\nbut it was",
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

	public SELF hasQty(Object expected)
	{
		isNotNull();
		bdAssert("Qty", actual.getQty(), expected);
		return myself;
	}


	public SELF hasS_Resource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_Resource_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_Resource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasS_ResourceAssignment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ResourceAssignment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceAssignment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasS_ResourceAssignment_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getS_ResourceAssignment_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceAssignment_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}