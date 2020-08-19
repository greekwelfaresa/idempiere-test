/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_salesstage;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_SalesStage;

/** Generated assertion class for C_SalesStage
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_SalesStageAssert<SELF extends AbstractC_SalesStageAssert<SELF, ACTUAL>, ACTUAL extends X_C_SalesStage>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_SalesStageAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_SalesStage_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SalesStage_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_SalesStage_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_SalesStage_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_SalesStage_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_SalesStage_UU: <%s>\nbut it was: <%s>",
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

	public SELF isClosed()
	{
		isNotNull();
		if (!actual.isClosed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Closed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotClosed()
	{
		isNotNull();
		if (actual.isClosed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Closed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isWon()
	{
		isNotNull();
		if (!actual.isWon()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Won\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotWon()
	{
		isNotNull();
		if (actual.isWon()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Won\nbut it was",
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

	public SELF hasProbability(Object expected)
	{
		isNotNull();
		bdAssert("Probability", actual.getProbability(), expected);
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