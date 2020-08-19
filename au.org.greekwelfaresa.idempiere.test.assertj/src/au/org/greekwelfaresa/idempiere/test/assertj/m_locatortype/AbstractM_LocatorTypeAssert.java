/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.m_locatortype;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_M_LocatorType;

/** Generated assertion class for M_LocatorType
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_LocatorTypeAssert<SELF extends AbstractM_LocatorTypeAssert<SELF, ACTUAL>, ACTUAL extends X_M_LocatorType>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_LocatorTypeAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAvailableForReplenishment()
	{
		isNotNull();
		if (!actual.isAvailableForReplenishment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AvailableForReplenishment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAvailableForReplenishment()
	{
		isNotNull();
		if (actual.isAvailableForReplenishment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AvailableForReplenishment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAvailableForReservation()
	{
		isNotNull();
		if (!actual.isAvailableForReservation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AvailableForReservation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAvailableForReservation()
	{
		isNotNull();
		if (actual.isAvailableForReservation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AvailableForReservation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAvailableForShipping()
	{
		isNotNull();
		if (!actual.isAvailableForShipping()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AvailableForShipping\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAvailableForShipping()
	{
		isNotNull();
		if (actual.isAvailableForShipping()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AvailableForShipping\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_LocatorType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_LocatorType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_LocatorType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_LocatorType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_LocatorType_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_LocatorType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
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