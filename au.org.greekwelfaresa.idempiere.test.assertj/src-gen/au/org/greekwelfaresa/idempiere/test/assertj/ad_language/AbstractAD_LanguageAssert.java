/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_language;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Language;

/** Generated assertion class for AD_Language
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_LanguageAssert<SELF extends AbstractAD_LanguageAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Language>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_LanguageAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Language(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Language: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Language_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Language_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Language_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Language_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Language_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Language_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PrintPaper_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintPaper_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintPaper_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCountryCode(String expected)
	{
		isNotNull();
		String actualField = actual.getCountryCode();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CountryCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDatePattern(String expected)
	{
		isNotNull();
		String actualField = actual.getDatePattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DatePattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isBaseLanguage()
	{
		isNotNull();
		if (!actual.isBaseLanguage()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BaseLanguage\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotBaseLanguage()
	{
		isNotNull();
		if (actual.isBaseLanguage()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BaseLanguage\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDecimalPoint()
	{
		isNotNull();
		if (!actual.isDecimalPoint()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DecimalPoint\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDecimalPoint()
	{
		isNotNull();
		if (actual.isDecimalPoint()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DecimalPoint\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isLoginLocale()
	{
		isNotNull();
		if (!actual.isLoginLocale()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LoginLocale\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotLoginLocale()
	{
		isNotNull();
		if (actual.isLoginLocale()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LoginLocale\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSystemLanguage()
	{
		isNotNull();
		if (!actual.isSystemLanguage()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SystemLanguage\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSystemLanguage()
	{
		isNotNull();
		if (actual.isSystemLanguage()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SystemLanguage\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLanguageISO(String expected)
	{
		isNotNull();
		String actualField = actual.getLanguageISO();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LanguageISO: <%s>\nbut it was: <%s>",
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

	public SELF hasPrintName(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PrintName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTimePattern(String expected)
	{
		isNotNull();
		String actualField = actual.getTimePattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TimePattern: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}