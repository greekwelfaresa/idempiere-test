/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.gl_journalgeneratorline;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_GL_JournalGeneratorLine;

/** Generated assertion class for GL_JournalGeneratorLine
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractGL_JournalGeneratorLineAssert<SELF extends AbstractGL_JournalGeneratorLineAssert<SELF, ACTUAL>, ACTUAL extends X_GL_JournalGeneratorLine>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractGL_JournalGeneratorLineAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAmtMultiplier(Object expected)
	{
		isNotNull();
		bdAssert("AmtMultiplier", actual.getAmtMultiplier(), expected);
		return myself;
	}


	public SELF hasBPColumn(String expected)
	{
		isNotNull();
		String actualField = actual.getBPColumn();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BPColumn: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBPDimensionType(String expected)
	{
		isNotNull();
		String actualField = actual.getBPDimensionType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BPDimensionType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ElementValueCR_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValueCR_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ElementValueCR_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ElementValueDR_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ElementValueDR_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ElementValueDR_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasGL_JournalGenerator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_JournalGenerator_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_JournalGenerator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGL_JournalGeneratorLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_JournalGeneratorLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_JournalGeneratorLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGL_JournalGeneratorLine_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getGL_JournalGeneratorLine_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_JournalGeneratorLine_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHelp(String expected)
	{
		isNotNull();
		String actualField = actual.getHelp();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Help: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isCopyAllDimensions()
	{
		isNotNull();
		if (!actual.isCopyAllDimensions()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CopyAllDimensions\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCopyAllDimensions()
	{
		isNotNull();
		if (actual.isCopyAllDimensions()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CopyAllDimensions\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSameProduct()
	{
		isNotNull();
		if (!actual.isSameProduct()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SameProduct\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSameProduct()
	{
		isNotNull();
		if (actual.isSameProduct()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SameProduct\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasRoundFactor(int expected)
	{
		isNotNull();
		int actualField = actual.getRoundFactor();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RoundFactor: <%s>\nbut it was: <%s>",
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
}