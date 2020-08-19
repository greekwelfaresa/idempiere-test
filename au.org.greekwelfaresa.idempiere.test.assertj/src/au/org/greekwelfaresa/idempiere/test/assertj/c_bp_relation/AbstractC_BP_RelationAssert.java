/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_bp_relation;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_BP_Relation;

/** Generated assertion class for C_BP_Relation
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_BP_RelationAssert<SELF extends AbstractC_BP_RelationAssert<SELF, ACTUAL>, ACTUAL extends X_C_BP_Relation>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_BP_RelationAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_BP_Relation_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_Relation_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Relation_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BP_Relation_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BP_Relation_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_Relation_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BPartnerRelation_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartnerRelation_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartnerRelation_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BPartnerRelation_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartnerRelation_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartnerRelation_Location_ID: <%s>\nbut it was: <%s>",
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

	public SELF isBillTo()
	{
		isNotNull();
		if (!actual.isBillTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BillTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotBillTo()
	{
		isNotNull();
		if (actual.isBillTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BillTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPayFrom()
	{
		isNotNull();
		if (!actual.isPayFrom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PayFrom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPayFrom()
	{
		isNotNull();
		if (actual.isPayFrom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PayFrom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isRemitTo()
	{
		isNotNull();
		if (!actual.isRemitTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RemitTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotRemitTo()
	{
		isNotNull();
		if (actual.isRemitTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RemitTo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isShipTo()
	{
		isNotNull();
		if (!actual.isShipTo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShipTo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotShipTo()
	{
		isNotNull();
		if (actual.isShipTo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShipTo\nbut it was",
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
}