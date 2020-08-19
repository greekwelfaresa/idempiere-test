/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.s_resourcetype;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_S_ResourceType;

/** Generated assertion class for S_ResourceType
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractS_ResourceTypeAssert<SELF extends AbstractS_ResourceTypeAssert<SELF, ACTUAL>, ACTUAL extends X_S_ResourceType>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractS_ResourceTypeAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF isAllowUoMFractions()
	{
		isNotNull();
		if (!actual.isAllowUoMFractions()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowUoMFractions\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowUoMFractions()
	{
		isNotNull();
		if (actual.isAllowUoMFractions()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowUoMFractions\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasC_TaxCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TaxCategory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_TaxCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasChargeableQty(int expected)
	{
		isNotNull();
		int actualField = actual.getChargeableQty();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ChargeableQty: <%s>\nbut it was: <%s>",
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

	public SELF isDateSlot()
	{
		isNotNull();
		if (!actual.isDateSlot()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DateSlot\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDateSlot()
	{
		isNotNull();
		if (actual.isDateSlot()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DateSlot\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSingleAssignment()
	{
		isNotNull();
		if (!actual.isSingleAssignment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SingleAssignment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSingleAssignment()
	{
		isNotNull();
		if (actual.isSingleAssignment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SingleAssignment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTimeSlot()
	{
		isNotNull();
		if (!actual.isTimeSlot()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TimeSlot\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTimeSlot()
	{
		isNotNull();
		if (actual.isTimeSlot()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TimeSlot\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
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

	public SELF isOnFriday()
	{
		isNotNull();
		if (!actual.isOnFriday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnFriday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOnFriday()
	{
		isNotNull();
		if (actual.isOnFriday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnFriday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOnMonday()
	{
		isNotNull();
		if (!actual.isOnMonday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnMonday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOnMonday()
	{
		isNotNull();
		if (actual.isOnMonday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnMonday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOnSaturday()
	{
		isNotNull();
		if (!actual.isOnSaturday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnSaturday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOnSaturday()
	{
		isNotNull();
		if (actual.isOnSaturday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnSaturday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOnSunday()
	{
		isNotNull();
		if (!actual.isOnSunday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnSunday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOnSunday()
	{
		isNotNull();
		if (actual.isOnSunday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnSunday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOnThursday()
	{
		isNotNull();
		if (!actual.isOnThursday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnThursday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOnThursday()
	{
		isNotNull();
		if (actual.isOnThursday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnThursday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOnTuesday()
	{
		isNotNull();
		if (!actual.isOnTuesday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnTuesday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOnTuesday()
	{
		isNotNull();
		if (actual.isOnTuesday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnTuesday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOnWednesday()
	{
		isNotNull();
		if (!actual.isOnWednesday()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OnWednesday\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOnWednesday()
	{
		isNotNull();
		if (actual.isOnWednesday()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OnWednesday\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasS_ResourceType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ResourceType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasS_ResourceType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getS_ResourceType_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ResourceType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTimeSlotEnd(Object expected)
	{
		isNotNull();
		dateAssert("TimeSlotEnd", actual.getTimeSlotEnd(), expected);
		return myself;
	}


	public SELF hasTimeSlotStart(Object expected)
	{
		isNotNull();
		dateAssert("TimeSlotStart", actual.getTimeSlotStart(), expected);
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