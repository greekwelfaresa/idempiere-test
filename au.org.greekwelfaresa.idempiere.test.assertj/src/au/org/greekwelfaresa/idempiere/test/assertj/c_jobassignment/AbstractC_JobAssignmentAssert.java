/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_jobassignment;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_JobAssignment;

/** Generated assertion class for C_JobAssignment
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_JobAssignmentAssert<SELF extends AbstractC_JobAssignmentAssert<SELF, ACTUAL>, ACTUAL extends X_C_JobAssignment>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_JobAssignmentAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Job_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Job_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Job_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_JobAssignment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_JobAssignment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_JobAssignment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_JobAssignment_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_JobAssignment_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_JobAssignment_UU: <%s>\nbut it was: <%s>",
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

}