/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_ldapprocessorlog;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_LdapProcessorLog;

/** Generated assertion class for AD_LdapProcessorLog
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_LdapProcessorLogAssert<SELF extends AbstractAD_LdapProcessorLogAssert<SELF, ACTUAL>, ACTUAL extends X_AD_LdapProcessorLog>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_LdapProcessorLogAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_LdapProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LdapProcessor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_LdapProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_LdapProcessorLog_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_LdapProcessorLog_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_LdapProcessorLog_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_LdapProcessorLog_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_LdapProcessorLog_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_LdapProcessorLog_UU: <%s>\nbut it was: <%s>",
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

	public SELF isError()
	{
		isNotNull();
		if (!actual.isError()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Error\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotError()
	{
		isNotNull();
		if (actual.isError()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Error\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasReference(String expected)
	{
		isNotNull();
		String actualField = actual.getReference();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Reference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSummary(String expected)
	{
		isNotNull();
		String actualField = actual.getSummary();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Summary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTextMsg(String expected)
	{
		isNotNull();
		String actualField = actual.getTextMsg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TextMsg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}