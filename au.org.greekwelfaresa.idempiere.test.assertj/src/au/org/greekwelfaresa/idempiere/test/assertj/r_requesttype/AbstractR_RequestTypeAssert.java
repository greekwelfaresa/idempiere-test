/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.r_requesttype;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_R_RequestType;

/** Generated assertion class for R_RequestType
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractR_RequestTypeAssert<SELF extends AbstractR_RequestTypeAssert<SELF, ACTUAL>, ACTUAL extends X_R_RequestType>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractR_RequestTypeAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAutoDueDateDays(int expected)
	{
		isNotNull();
		int actualField = actual.getAutoDueDateDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AutoDueDateDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasConfidentialType(String expected)
	{
		isNotNull();
		String actualField = actual.getConfidentialType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ConfidentialType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasContentColor(String expected)
	{
		isNotNull();
		String actualField = actual.getContentColor();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ContentColor: <%s>\nbut it was: <%s>",
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

	public SELF hasDueDateTolerance(int expected)
	{
		isNotNull();
		int actualField = actual.getDueDateTolerance();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DueDateTolerance: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHeaderColor(String expected)
	{
		isNotNull();
		String actualField = actual.getHeaderColor();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HeaderColor: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAutoChangeRequest()
	{
		isNotNull();
		if (!actual.isAutoChangeRequest()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoChangeRequest\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAutoChangeRequest()
	{
		isNotNull();
		if (actual.isAutoChangeRequest()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoChangeRequest\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isConfidentialInfo()
	{
		isNotNull();
		if (!actual.isConfidentialInfo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ConfidentialInfo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotConfidentialInfo()
	{
		isNotNull();
		if (actual.isConfidentialInfo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ConfidentialInfo\nbut it was",
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

	public SELF isEMailWhenDue()
	{
		isNotNull();
		if (!actual.isEMailWhenDue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EMailWhenDue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotEMailWhenDue()
	{
		isNotNull();
		if (actual.isEMailWhenDue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EMailWhenDue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isEMailWhenOverdue()
	{
		isNotNull();
		if (!actual.isEMailWhenOverdue()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be EMailWhenOverdue\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotEMailWhenOverdue()
	{
		isNotNull();
		if (actual.isEMailWhenOverdue()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be EMailWhenOverdue\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIndexed()
	{
		isNotNull();
		if (!actual.isIndexed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Indexed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIndexed()
	{
		isNotNull();
		if (actual.isIndexed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Indexed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isInvoiced()
	{
		isNotNull();
		if (!actual.isInvoiced()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Invoiced\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInvoiced()
	{
		isNotNull();
		if (actual.isInvoiced()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Invoiced\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
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

	public SELF hasR_RequestType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_RequestType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_RequestType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_RequestType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_RequestType_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_RequestType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_StatusCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_StatusCategory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_StatusCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}