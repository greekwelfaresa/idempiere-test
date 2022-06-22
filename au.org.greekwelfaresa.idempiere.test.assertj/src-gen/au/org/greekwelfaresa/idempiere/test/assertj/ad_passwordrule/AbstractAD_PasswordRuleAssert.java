/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_passwordrule;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_PasswordRule;

/** Generated assertion class for AD_PasswordRule
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_PasswordRuleAssert<SELF extends AbstractAD_PasswordRuleAssert<SELF, ACTUAL>, ACTUAL extends X_AD_PasswordRule>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_PasswordRuleAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_PasswordRule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PasswordRule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PasswordRule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PasswordRule_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PasswordRule_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PasswordRule_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAlphabeticalCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getAlphabeticalCharacter();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AlphabeticalCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAlphabeticalSequence(int expected)
	{
		isNotNull();
		int actualField = actual.getAlphabeticalSequence();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AlphabeticalSequence: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDays_Reuse_Password(int expected)
	{
		isNotNull();
		int actualField = actual.getDays_Reuse_Password();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Days_Reuse_Password: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDigitCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getDigitCharacter();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DigitCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isDictMatchBackwards()
	{
		isNotNull();
		if (!actual.isDictMatchBackwards()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DictMatchBackwards\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDictMatchBackwards()
	{
		isNotNull();
		if (actual.isDictMatchBackwards()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DictMatchBackwards\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUserNameRule()
	{
		isNotNull();
		if (!actual.isUserNameRule()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UserNameRule\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUserNameRule()
	{
		isNotNull();
		if (actual.isUserNameRule()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UserNameRule\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUsingDictionary()
	{
		isNotNull();
		if (!actual.isUsingDictionary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UsingDictionary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUsingDictionary()
	{
		isNotNull();
		if (actual.isUsingDictionary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UsingDictionary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isWhitespace()
	{
		isNotNull();
		if (!actual.isWhitespace()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Whitespace\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotWhitespace()
	{
		isNotNull();
		if (actual.isWhitespace()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Whitespace\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLowercaseCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getLowercaseCharacter();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LowercaseCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMaxLength(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxLength();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MaxLength: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMinLength(int expected)
	{
		isNotNull();
		int actualField = actual.getMinLength();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MinLength: <%s>\nbut it was: <%s>",
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

	public SELF hasNonAlphaNumericCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getNonAlphaNumericCharacter();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NonAlphaNumericCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasNumericalSequence(int expected)
	{
		isNotNull();
		int actualField = actual.getNumericalSequence();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NumericalSequence: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPathDictionary(String expected)
	{
		isNotNull();
		String actualField = actual.getPathDictionary();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PathDictionary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasQWERTYSequence(int expected)
	{
		isNotNull();
		int actualField = actual.getQWERTYSequence();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have QWERTYSequence: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRepeatCharacterRegex(int expected)
	{
		isNotNull();
		int actualField = actual.getRepeatCharacterRegex();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RepeatCharacterRegex: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUppercaseCharacter(int expected)
	{
		isNotNull();
		int actualField = actual.getUppercaseCharacter();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UppercaseCharacter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}