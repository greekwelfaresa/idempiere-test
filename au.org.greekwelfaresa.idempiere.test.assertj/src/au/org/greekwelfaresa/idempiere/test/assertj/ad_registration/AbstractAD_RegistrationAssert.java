/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_registration;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Registration;

/** Generated assertion class for AD_Registration
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_RegistrationAssert<SELF extends AbstractAD_RegistrationAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Registration>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_RegistrationAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Registration_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Registration_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Registration_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Registration_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Registration_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Registration_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_System_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_System_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_System_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Currency_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Currency_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Currency_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Location_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasIndustryInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getIndustryInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have IndustryInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAllowPublish()
	{
		isNotNull();
		if (!actual.isAllowPublish()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowPublish\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowPublish()
	{
		isNotNull();
		if (actual.isAllowPublish()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowPublish\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllowStatistics()
	{
		isNotNull();
		if (!actual.isAllowStatistics()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowStatistics\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowStatistics()
	{
		isNotNull();
		if (actual.isAllowStatistics()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowStatistics\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isInProduction()
	{
		isNotNull();
		if (!actual.isInProduction()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InProduction\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInProduction()
	{
		isNotNull();
		if (actual.isInProduction()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InProduction\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isRegistered()
	{
		isNotNull();
		if (!actual.isRegistered()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Registered\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotRegistered()
	{
		isNotNull();
		if (actual.isRegistered()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Registered\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasNumberEmployees(int expected)
	{
		isNotNull();
		int actualField = actual.getNumberEmployees();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NumberEmployees: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlatformInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getPlatformInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlatformInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRecord_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getRecord_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Record_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRemote_Addr(String expected)
	{
		isNotNull();
		String actualField = actual.getRemote_Addr();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Remote_Addr: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRemote_Host(String expected)
	{
		isNotNull();
		String actualField = actual.getRemote_Host();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Remote_Host: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSalesVolume(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesVolume();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SalesVolume: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasStartProductionDate(Object expected)
	{
		isNotNull();
		dateAssert("StartProductionDate", actual.getStartProductionDate(), expected);
		return myself;
	}

}