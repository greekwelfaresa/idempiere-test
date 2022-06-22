/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_doctype;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_DocType;

/** Generated assertion class for C_DocType
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_DocTypeAssert<SELF extends AbstractC_DocTypeAssert<SELF, ACTUAL>, ACTUAL extends X_C_DocType>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_DocTypeAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasC_DocType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DocType_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_DocType_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocType_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DocTypeDifference_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeDifference_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeDifference_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DocTypeInvoice_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeInvoice_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeInvoice_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DocTypeProforma_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeProforma_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeProforma_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_DocTypeShipment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeShipment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeShipment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDefiniteSequence_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDefiniteSequence_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DefiniteSequence_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasDocBaseType(String expected)
	{
		isNotNull();
		String actualField = actual.getDocBaseType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocBaseType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDocNoSequence_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDocNoSequence_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocNoSequence_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDocSubTypeInv(String expected)
	{
		isNotNull();
		String actualField = actual.getDocSubTypeInv();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocSubTypeInv: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDocSubTypeSO(String expected)
	{
		isNotNull();
		String actualField = actual.getDocSubTypeSO();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocSubTypeSO: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDocumentCopies(int expected)
	{
		isNotNull();
		int actualField = actual.getDocumentCopies();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentCopies: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDocumentNote(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNote();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNote: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGL_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getGL_Category_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GL_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isHasCharges()
	{
		isNotNull();
		if (!actual.isHasCharges()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasCharges\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHasCharges()
	{
		isNotNull();
		if (actual.isHasCharges()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasCharges\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isHasProforma()
	{
		isNotNull();
		if (!actual.isHasProforma()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HasProforma\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHasProforma()
	{
		isNotNull();
		if (actual.isHasProforma()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HasProforma\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isChargeOrProductMandatory()
	{
		isNotNull();
		if (!actual.isChargeOrProductMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChargeOrProductMandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotChargeOrProductMandatory()
	{
		isNotNull();
		if (actual.isChargeOrProductMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChargeOrProductMandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCreateCounter()
	{
		isNotNull();
		if (!actual.isCreateCounter()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateCounter\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCreateCounter()
	{
		isNotNull();
		if (actual.isCreateCounter()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateCounter\nbut it was",
				getPODescription());
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

	public SELF isDefaultCounterDoc()
	{
		isNotNull();
		if (!actual.isDefaultCounterDoc()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DefaultCounterDoc\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDefaultCounterDoc()
	{
		isNotNull();
		if (actual.isDefaultCounterDoc()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DefaultCounterDoc\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDocNoControlled()
	{
		isNotNull();
		if (!actual.isDocNoControlled()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DocNoControlled\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDocNoControlled()
	{
		isNotNull();
		if (actual.isDocNoControlled()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DocNoControlled\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIndexed()
	{
		isNotNull();
		if (!actual.isIndexed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Indexed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIndexed()
	{
		isNotNull();
		if (actual.isIndexed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Indexed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isInTransit()
	{
		isNotNull();
		if (!actual.isInTransit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InTransit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInTransit()
	{
		isNotNull();
		if (actual.isInTransit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InTransit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteDateOnComplete()
	{
		isNotNull();
		if (!actual.isOverwriteDateOnComplete()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteDateOnComplete\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteDateOnComplete()
	{
		isNotNull();
		if (actual.isOverwriteDateOnComplete()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteDateOnComplete\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOverwriteSeqOnComplete()
	{
		isNotNull();
		if (!actual.isOverwriteSeqOnComplete()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OverwriteSeqOnComplete\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOverwriteSeqOnComplete()
	{
		isNotNull();
		if (actual.isOverwriteSeqOnComplete()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OverwriteSeqOnComplete\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPickQAConfirm()
	{
		isNotNull();
		if (!actual.isPickQAConfirm()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PickQAConfirm\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPickQAConfirm()
	{
		isNotNull();
		if (actual.isPickQAConfirm()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PickQAConfirm\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPrepareSplitDocument()
	{
		isNotNull();
		if (!actual.isPrepareSplitDocument()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PrepareSplitDocument\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPrepareSplitDocument()
	{
		isNotNull();
		if (actual.isPrepareSplitDocument()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PrepareSplitDocument\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isShipConfirm()
	{
		isNotNull();
		if (!actual.isShipConfirm()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ShipConfirm\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotShipConfirm()
	{
		isNotNull();
		if (actual.isShipConfirm()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ShipConfirm\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSOTrx()
	{
		isNotNull();
		if (!actual.isSOTrx()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SOTrx\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSOTrx()
	{
		isNotNull();
		if (actual.isSOTrx()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SOTrx\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSplitWhenDifference()
	{
		isNotNull();
		if (!actual.isSplitWhenDifference()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SplitWhenDifference\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSplitWhenDifference()
	{
		isNotNull();
		if (actual.isSplitWhenDifference()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SplitWhenDifference\nbut it was",
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
}