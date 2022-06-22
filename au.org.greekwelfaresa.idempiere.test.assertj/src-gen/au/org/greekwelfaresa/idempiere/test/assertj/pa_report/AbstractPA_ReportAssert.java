/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.pa_report;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_PA_Report;

/** Generated assertion class for PA_Report
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractPA_ReportAssert<SELF extends AbstractPA_ReportAssert<SELF, ACTUAL>, ACTUAL extends X_PA_Report>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractPA_ReportAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_PrintFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormat_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_AcctSchema_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_AcctSchema_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_AcctSchema_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Calendar_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Calendar_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Calendar_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasJasperProcess_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getJasperProcess_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have JasperProcess_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isListSources()
	{
		isNotNull();
		if (!actual.isListSources()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ListSources\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotListSources()
	{
		isNotNull();
		if (actual.isListSources()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ListSources\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isListSourcesXTrx()
	{
		isNotNull();
		if (!actual.isListSourcesXTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ListSourcesXTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotListSourcesXTrx()
	{
		isNotNull();
		if (actual.isListSourcesXTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ListSourcesXTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isListTrx()
	{
		isNotNull();
		if (!actual.isListTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ListTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotListTrx()
	{
		isNotNull();
		if (actual.isListTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ListTrx\nbut it was",
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

	public SELF hasPA_Report_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_Report_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_Report_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_Report_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_Report_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_Report_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_ReportColumnSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportColumnSet_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportColumnSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_ReportCube_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportCube_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportCube_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_ReportLineSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportLineSet_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportLineSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}