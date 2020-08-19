/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_country;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_Country;

/** Generated assertion class for C_Country
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_CountryAssert<SELF extends AbstractC_CountryAssert<SELF, ACTUAL>, ACTUAL extends X_C_Country>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_CountryAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF isAllowCitiesOutOfList()
	{
		isNotNull();
		if (!actual.isAllowCitiesOutOfList()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowCitiesOutOfList\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowCitiesOutOfList()
	{
		isNotNull();
		if (actual.isAllowCitiesOutOfList()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowCitiesOutOfList\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasC_Country_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Country_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Country_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Country_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Country_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Country_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasCaptureSequence(String expected)
	{
		isNotNull();
		String actualField = actual.getCaptureSequence();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CaptureSequence: <%s>\nbut it was: <%s>",
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

	public SELF hasDisplaySequence(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplaySequence();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DisplaySequence: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDisplaySequenceLocal(String expected)
	{
		isNotNull();
		String actualField = actual.getDisplaySequenceLocal();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DisplaySequenceLocal: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasExpressionBankAccountNo(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionBankAccountNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ExpressionBankAccountNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasExpressionBankRoutingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionBankRoutingNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ExpressionBankRoutingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasExpressionPhone(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionPhone();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ExpressionPhone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasExpressionPostal(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionPostal();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ExpressionPostal: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasExpressionPostal_Add(String expected)
	{
		isNotNull();
		String actualField = actual.getExpressionPostal_Add();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ExpressionPostal_Add: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isHasPostal_Add()
	{
		isNotNull();
		if (!actual.isHasPostal_Add()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasPostal_Add\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHasPostal_Add()
	{
		isNotNull();
		if (actual.isHasPostal_Add()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasPostal_Add\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isHasRegion()
	{
		isNotNull();
		if (!actual.isHasRegion()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasRegion\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHasRegion()
	{
		isNotNull();
		if (actual.isHasRegion()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasRegion\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAddressLinesLocalReverse()
	{
		isNotNull();
		if (!actual.isAddressLinesLocalReverse()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddressLinesLocalReverse\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAddressLinesLocalReverse()
	{
		isNotNull();
		if (actual.isAddressLinesLocalReverse()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddressLinesLocalReverse\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAddressLinesReverse()
	{
		isNotNull();
		if (!actual.isAddressLinesReverse()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddressLinesReverse\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAddressLinesReverse()
	{
		isNotNull();
		if (actual.isAddressLinesReverse()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddressLinesReverse\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPostcodeLookup()
	{
		isNotNull();
		if (!actual.isPostcodeLookup()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PostcodeLookup\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPostcodeLookup()
	{
		isNotNull();
		if (actual.isPostcodeLookup()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PostcodeLookup\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLookupClassName(String expected)
	{
		isNotNull();
		String actualField = actual.getLookupClassName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LookupClassName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLookupClientID(String expected)
	{
		isNotNull();
		String actualField = actual.getLookupClientID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LookupClientID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLookupPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getLookupPassword();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LookupPassword: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLookupUrl(String expected)
	{
		isNotNull();
		String actualField = actual.getLookupUrl();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LookupUrl: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMediaSize(String expected)
	{
		isNotNull();
		String actualField = actual.getMediaSize();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MediaSize: <%s>\nbut it was: <%s>",
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

	public SELF hasPlaceholderAddress1(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress1();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlaceholderAddress1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlaceholderAddress2(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlaceholderAddress2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlaceholderAddress3(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress3();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlaceholderAddress3: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlaceholderAddress4(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress4();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlaceholderAddress4: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlaceholderAddress5(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderAddress5();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlaceholderAddress5: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlaceholderCity(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderCity();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlaceholderCity: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlaceholderComments(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderComments();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlaceholderComments: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlaceholderPostal(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderPostal();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlaceholderPostal: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPlaceholderPostal_Add(String expected)
	{
		isNotNull();
		String actualField = actual.getPlaceholderPostal_Add();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PlaceholderPostal_Add: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRegionName(String expected)
	{
		isNotNull();
		String actualField = actual.getRegionName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RegionName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}