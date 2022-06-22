/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_printtableformat;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_PrintTableFormat;

/** Generated assertion class for AD_PrintTableFormat
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_PrintTableFormatAssert<SELF extends AbstractAD_PrintTableFormatAssert<SELF, ACTUAL>, ACTUAL extends X_AD_PrintTableFormat>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_PrintTableFormatAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Image_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Image_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Image_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PrintTableFormat_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintTableFormat_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintTableFormat_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PrintTableFormat_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PrintTableFormat_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintTableFormat_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasFooterCenter(String expected)
	{
		isNotNull();
		String actualField = actual.getFooterCenter();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FooterCenter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFooterLeft(String expected)
	{
		isNotNull();
		String actualField = actual.getFooterLeft();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FooterLeft: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFooterRight(String expected)
	{
		isNotNull();
		String actualField = actual.getFooterRight();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FooterRight: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFunct_PrintFont_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getFunct_PrintFont_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Funct_PrintFont_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFunctBG_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getFunctBG_PrintColor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FunctBG_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFunctFG_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getFunctFG_PrintColor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FunctFG_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHdr_PrintFont_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHdr_PrintFont_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Hdr_PrintFont_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHdrLine_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHdrLine_PrintColor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HdrLine_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHdrStroke(Object expected)
	{
		isNotNull();
		bdAssert("HdrStroke", actual.getHdrStroke(), expected);
		return myself;
	}


	public SELF hasHdrStrokeType(String expected)
	{
		isNotNull();
		String actualField = actual.getHdrStrokeType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HdrStrokeType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHdrTextBG_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHdrTextBG_PrintColor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HdrTextBG_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHdrTextFG_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHdrTextFG_PrintColor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HdrTextFG_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHeaderCenter(String expected)
	{
		isNotNull();
		String actualField = actual.getHeaderCenter();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HeaderCenter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHeaderLeft(String expected)
	{
		isNotNull();
		String actualField = actual.getHeaderLeft();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HeaderLeft: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHeaderRight(String expected)
	{
		isNotNull();
		String actualField = actual.getHeaderRight();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HeaderRight: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isImageIsAttached()
	{
		isNotNull();
		if (!actual.isImageIsAttached()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ImageIsAttached\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotImageIsAttached()
	{
		isNotNull();
		if (actual.isImageIsAttached()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ImageIsAttached\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasImageURL(String expected)
	{
		isNotNull();
		String actualField = actual.getImageURL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ImageURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isDefault()
	{
		isNotNull();
		if (!actual.isDefault()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Default\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDefault()
	{
		isNotNull();
		if (actual.isDefault()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Default\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMultiLineHeader()
	{
		isNotNull();
		if (!actual.isMultiLineHeader()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MultiLineHeader\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMultiLineHeader()
	{
		isNotNull();
		if (actual.isMultiLineHeader()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MultiLineHeader\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPaintBoundaryLines()
	{
		isNotNull();
		if (!actual.isPaintBoundaryLines()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaintBoundaryLines\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPaintBoundaryLines()
	{
		isNotNull();
		if (actual.isPaintBoundaryLines()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaintBoundaryLines\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPaintHeaderLines()
	{
		isNotNull();
		if (!actual.isPaintHeaderLines()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaintHeaderLines\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPaintHeaderLines()
	{
		isNotNull();
		if (actual.isPaintHeaderLines()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaintHeaderLines\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPaintHLines()
	{
		isNotNull();
		if (!actual.isPaintHLines()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaintHLines\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPaintHLines()
	{
		isNotNull();
		if (actual.isPaintHLines()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaintHLines\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPaintVLines()
	{
		isNotNull();
		if (!actual.isPaintVLines()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PaintVLines\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPaintVLines()
	{
		isNotNull();
		if (actual.isPaintVLines()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PaintVLines\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPrintFunctionSymbols()
	{
		isNotNull();
		if (!actual.isPrintFunctionSymbols()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PrintFunctionSymbols\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPrintFunctionSymbols()
	{
		isNotNull();
		if (actual.isPrintFunctionSymbols()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PrintFunctionSymbols\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLine_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLine_PrintColor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Line_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLineStroke(Object expected)
	{
		isNotNull();
		bdAssert("LineStroke", actual.getLineStroke(), expected);
		return myself;
	}


	public SELF hasLineStrokeType(String expected)
	{
		isNotNull();
		String actualField = actual.getLineStrokeType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LineStrokeType: <%s>\nbut it was: <%s>",
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
}