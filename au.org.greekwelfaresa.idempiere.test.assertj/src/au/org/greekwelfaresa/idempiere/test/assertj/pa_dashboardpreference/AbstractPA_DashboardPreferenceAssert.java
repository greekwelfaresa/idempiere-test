/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.pa_dashboardpreference;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_PA_DashboardPreference;

/** Generated assertion class for PA_DashboardPreference
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractPA_DashboardPreferenceAssert<SELF extends AbstractPA_DashboardPreferenceAssert<SELF, ACTUAL>, ACTUAL extends X_PA_DashboardPreference>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractPA_DashboardPreferenceAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
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

	public SELF hasColumnNo(int expected)
	{
		isNotNull();
		int actualField = actual.getColumnNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ColumnNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isCollapsedByDefault()
	{
		isNotNull();
		if (!actual.isCollapsedByDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CollapsedByDefault\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCollapsedByDefault()
	{
		isNotNull();
		if (actual.isCollapsedByDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CollapsedByDefault\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isShowInDashboard()
	{
		isNotNull();
		if (!actual.isShowInDashboard()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShowInDashboard\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotShowInDashboard()
	{
		isNotNull();
		if (actual.isShowInDashboard()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShowInDashboard\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLine(Object expected)
	{
		isNotNull();
		bdAssert("Line", actual.getLine(), expected);
		return myself;
	}


	public SELF hasPA_DashboardContent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_DashboardContent_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_DashboardContent_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_DashboardPreference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_DashboardPreference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_DashboardPreference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPA_DashboardPreference_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getPA_DashboardPreference_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_DashboardPreference_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}