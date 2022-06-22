/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_labelprinterfunction;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_LabelPrinterFunction;

/** Generated assertion class for AD_LabelPrinterFunction
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_LabelPrinterFunctionAssert<SELF extends AbstractAD_LabelPrinterFunctionAssert<SELF, ACTUAL>, ACTUAL extends X_AD_LabelPrinterFunction>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_LabelPrinterFunctionAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_LabelPrinter_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LabelPrinter_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_LabelPrinter_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_LabelPrinterFunction_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LabelPrinterFunction_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_LabelPrinterFunction_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_LabelPrinterFunction_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_LabelPrinterFunction_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_LabelPrinterFunction_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasFunctionPrefix(String expected)
	{
		isNotNull();
		String actualField = actual.getFunctionPrefix();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FunctionPrefix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFunctionSuffix(String expected)
	{
		isNotNull();
		String actualField = actual.getFunctionSuffix();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FunctionSuffix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isXYPosition()
	{
		isNotNull();
		if (!actual.isXYPosition()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be XYPosition\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotXYPosition()
	{
		isNotNull();
		if (actual.isXYPosition()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be XYPosition\nbut it was",
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

	public SELF hasXYSeparator(String expected)
	{
		isNotNull();
		String actualField = actual.getXYSeparator();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have XYSeparator: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}