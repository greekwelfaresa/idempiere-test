/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_chargetype_doctype;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_ChargeType_DocType;

/** Generated assertion class for C_ChargeType_DocType
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_ChargeType_DocTypeAssert<SELF extends AbstractC_ChargeType_DocTypeAssert<SELF, ACTUAL>, ACTUAL extends X_C_ChargeType_DocType>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_ChargeType_DocTypeAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_ChargeType_DocType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_ChargeType_DocType_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ChargeType_DocType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ChargeType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ChargeType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ChargeType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAllowNegative()
	{
		isNotNull();
		if (!actual.isAllowNegative()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowNegative\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowNegative()
	{
		isNotNull();
		if (actual.isAllowNegative()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowNegative\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllowPositive()
	{
		isNotNull();
		if (!actual.isAllowPositive()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowPositive\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowPositive()
	{
		isNotNull();
		if (actual.isAllowPositive()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowPositive\nbut it was",
				getPODescription());
		}
		return myself;
	}
}