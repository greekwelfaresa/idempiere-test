/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_printformatitem;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_PrintFormatItem;

/** Generated assertion class for AD_PrintFormatItem
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_PrintFormatItemAssert<SELF extends AbstractAD_PrintFormatItemAssert<SELF, ACTUAL>, ACTUAL extends X_AD_PrintFormatItem>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_PrintFormatItemAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Column_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Column_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Column_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PrintColor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintColor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintColor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PrintFont_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFont_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintFont_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
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

	public SELF hasAD_PrintFormatChild_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormatChild_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintFormatChild_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PrintFormatItem_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintFormatItem_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintFormatItem_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PrintFormatItem_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_PrintFormatItem_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintFormatItem_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_PrintGraph_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PrintGraph_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PrintGraph_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasArcDiameter(int expected)
	{
		isNotNull();
		int actualField = actual.getArcDiameter();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ArcDiameter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBarcodeType(String expected)
	{
		isNotNull();
		String actualField = actual.getBarcodeType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BarcodeType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBelowColumn(int expected)
	{
		isNotNull();
		int actualField = actual.getBelowColumn();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BelowColumn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFieldAlignmentType(String expected)
	{
		isNotNull();
		String actualField = actual.getFieldAlignmentType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FieldAlignmentType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFormatPattern(String expected)
	{
		isNotNull();
		String actualField = actual.getFormatPattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FormatPattern: <%s>\nbut it was: <%s>",
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

	public SELF isAveraged()
	{
		isNotNull();
		if (!actual.isAveraged()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Averaged\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAveraged()
	{
		isNotNull();
		if (actual.isAveraged()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Averaged\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCentrallyMaintained()
	{
		isNotNull();
		if (!actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CentrallyMaintained\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCentrallyMaintained()
	{
		isNotNull();
		if (actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CentrallyMaintained\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCounted()
	{
		isNotNull();
		if (!actual.isCounted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Counted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCounted()
	{
		isNotNull();
		if (actual.isCounted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Counted\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDesc()
	{
		isNotNull();
		if (!actual.isDesc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Desc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDesc()
	{
		isNotNull();
		if (actual.isDesc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Desc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDeviationCalc()
	{
		isNotNull();
		if (!actual.isDeviationCalc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DeviationCalc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDeviationCalc()
	{
		isNotNull();
		if (actual.isDeviationCalc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DeviationCalc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFilledRectangle()
	{
		isNotNull();
		if (!actual.isFilledRectangle()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FilledRectangle\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFilledRectangle()
	{
		isNotNull();
		if (actual.isFilledRectangle()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FilledRectangle\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFixedWidth()
	{
		isNotNull();
		if (!actual.isFixedWidth()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FixedWidth\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFixedWidth()
	{
		isNotNull();
		if (actual.isFixedWidth()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FixedWidth\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isGroupBy()
	{
		isNotNull();
		if (!actual.isGroupBy()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be GroupBy\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotGroupBy()
	{
		isNotNull();
		if (actual.isGroupBy()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be GroupBy\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isHeightOneLine()
	{
		isNotNull();
		if (!actual.isHeightOneLine()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HeightOneLine\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHeightOneLine()
	{
		isNotNull();
		if (actual.isHeightOneLine()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HeightOneLine\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isImageField()
	{
		isNotNull();
		if (!actual.isImageField()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ImageField\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotImageField()
	{
		isNotNull();
		if (actual.isImageField()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ImageField\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMaxCalc()
	{
		isNotNull();
		if (!actual.isMaxCalc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MaxCalc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMaxCalc()
	{
		isNotNull();
		if (actual.isMaxCalc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MaxCalc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMinCalc()
	{
		isNotNull();
		if (!actual.isMinCalc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MinCalc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMinCalc()
	{
		isNotNull();
		if (actual.isMinCalc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MinCalc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isNextLine()
	{
		isNotNull();
		if (!actual.isNextLine()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NextLine\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotNextLine()
	{
		isNotNull();
		if (actual.isNextLine()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NextLine\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isNextPage()
	{
		isNotNull();
		if (!actual.isNextPage()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be NextPage\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotNextPage()
	{
		isNotNull();
		if (actual.isNextPage()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be NextPage\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOrderBy()
	{
		isNotNull();
		if (!actual.isOrderBy()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OrderBy\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOrderBy()
	{
		isNotNull();
		if (actual.isOrderBy()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OrderBy\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPageBreak()
	{
		isNotNull();
		if (!actual.isPageBreak()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PageBreak\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPageBreak()
	{
		isNotNull();
		if (actual.isPageBreak()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PageBreak\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPrintBarcodeText()
	{
		isNotNull();
		if (!actual.isPrintBarcodeText()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PrintBarcodeText\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPrintBarcodeText()
	{
		isNotNull();
		if (actual.isPrintBarcodeText()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PrintBarcodeText\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPrinted()
	{
		isNotNull();
		if (!actual.isPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Printed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPrinted()
	{
		isNotNull();
		if (actual.isPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Printed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isRelativePosition()
	{
		isNotNull();
		if (!actual.isRelativePosition()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RelativePosition\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotRelativePosition()
	{
		isNotNull();
		if (actual.isRelativePosition()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RelativePosition\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isRunningTotal()
	{
		isNotNull();
		if (!actual.isRunningTotal()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RunningTotal\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotRunningTotal()
	{
		isNotNull();
		if (actual.isRunningTotal()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RunningTotal\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSetNLPosition()
	{
		isNotNull();
		if (!actual.isSetNLPosition()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SetNLPosition\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSetNLPosition()
	{
		isNotNull();
		if (actual.isSetNLPosition()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SetNLPosition\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSummarized()
	{
		isNotNull();
		if (!actual.isSummarized()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summarized\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSummarized()
	{
		isNotNull();
		if (actual.isSummarized()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summarized\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSuppressNull()
	{
		isNotNull();
		if (!actual.isSuppressNull()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SuppressNull\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSuppressNull()
	{
		isNotNull();
		if (actual.isSuppressNull()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SuppressNull\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSuppressRepeats()
	{
		isNotNull();
		if (!actual.isSuppressRepeats()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SuppressRepeats\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSuppressRepeats()
	{
		isNotNull();
		if (actual.isSuppressRepeats()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SuppressRepeats\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isVarianceCalc()
	{
		isNotNull();
		if (!actual.isVarianceCalc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be VarianceCalc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotVarianceCalc()
	{
		isNotNull();
		if (actual.isVarianceCalc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be VarianceCalc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLineAlignmentType(String expected)
	{
		isNotNull();
		String actualField = actual.getLineAlignmentType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LineAlignmentType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLineWidth(int expected)
	{
		isNotNull();
		int actualField = actual.getLineWidth();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LineWidth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMaxHeight(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxHeight();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MaxHeight: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMaxWidth(int expected)
	{
		isNotNull();
		int actualField = actual.getMaxWidth();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MaxWidth: <%s>\nbut it was: <%s>",
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

	public SELF hasPrintAreaType(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintAreaType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PrintAreaType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPrintFormatType(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintFormatType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PrintFormatType: <%s>\nbut it was: <%s>",
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

	public SELF hasPrintNameSuffix(String expected)
	{
		isNotNull();
		String actualField = actual.getPrintNameSuffix();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PrintNameSuffix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRunningTotalLines(int expected)
	{
		isNotNull();
		int actualField = actual.getRunningTotalLines();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RunningTotalLines: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasShapeType(String expected)
	{
		isNotNull();
		String actualField = actual.getShapeType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShapeType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSortNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSortNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SortNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasXPosition(int expected)
	{
		isNotNull();
		int actualField = actual.getXPosition();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have XPosition: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasXSpace(int expected)
	{
		isNotNull();
		int actualField = actual.getXSpace();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have XSpace: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasYPosition(int expected)
	{
		isNotNull();
		int actualField = actual.getYPosition();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have YPosition: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasYSpace(int expected)
	{
		isNotNull();
		int actualField = actual.getYSpace();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have YSpace: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}