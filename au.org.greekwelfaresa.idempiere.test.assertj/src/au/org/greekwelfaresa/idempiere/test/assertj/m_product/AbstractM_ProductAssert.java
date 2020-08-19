/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.m_product;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_M_Product;

/** Generated assertion class for M_Product
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_ProductAssert<SELF extends AbstractM_ProductAssert<SELF, ACTUAL>, ACTUAL extends X_M_Product>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_ProductAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_RevenueRecognition_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_RevenueRecognition_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_RevenueRecognition_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_SubscriptionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_SubscriptionType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_SubscriptionType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_TaxCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_TaxCategory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_TaxCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasClassification(String expected)
	{
		isNotNull();
		String actualField = actual.getClassification();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Classification: <%s>\nbut it was: <%s>",
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

	public SELF hasDescriptionURL(String expected)
	{
		isNotNull();
		String actualField = actual.getDescriptionURL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DescriptionURL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isDiscontinued()
	{
		isNotNull();
		if (!actual.isDiscontinued()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Discontinued\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDiscontinued()
	{
		isNotNull();
		if (actual.isDiscontinued()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Discontinued\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasDiscontinuedAt(Object expected)
	{
		isNotNull();
		dateAssert("DiscontinuedAt", actual.getDiscontinuedAt(), expected);
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

	public SELF hasGroup1(String expected)
	{
		isNotNull();
		String actualField = actual.getGroup1();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Group1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGroup2(String expected)
	{
		isNotNull();
		String actualField = actual.getGroup2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Group2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGuaranteeDays(int expected)
	{
		isNotNull();
		int actualField = actual.getGuaranteeDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GuaranteeDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGuaranteeDaysMin(int expected)
	{
		isNotNull();
		int actualField = actual.getGuaranteeDaysMin();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GuaranteeDaysMin: <%s>\nbut it was: <%s>",
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

	public SELF isBOM()
	{
		isNotNull();
		if (!actual.isBOM()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be BOM\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotBOM()
	{
		isNotNull();
		if (actual.isBOM()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be BOM\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDropShip()
	{
		isNotNull();
		if (!actual.isDropShip()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DropShip\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDropShip()
	{
		isNotNull();
		if (actual.isDropShip()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DropShip\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isExcludeAutoDelivery()
	{
		isNotNull();
		if (!actual.isExcludeAutoDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ExcludeAutoDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotExcludeAutoDelivery()
	{
		isNotNull();
		if (actual.isExcludeAutoDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ExcludeAutoDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isInvoicePrintDetails()
	{
		isNotNull();
		if (!actual.isInvoicePrintDetails()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InvoicePrintDetails\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInvoicePrintDetails()
	{
		isNotNull();
		if (actual.isInvoicePrintDetails()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InvoicePrintDetails\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isKanban()
	{
		isNotNull();
		if (!actual.isKanban()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Kanban\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotKanban()
	{
		isNotNull();
		if (actual.isKanban()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Kanban\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isManufactured()
	{
		isNotNull();
		if (!actual.isManufactured()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Manufactured\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotManufactured()
	{
		isNotNull();
		if (actual.isManufactured()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Manufactured\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isOwnBox()
	{
		isNotNull();
		if (!actual.isOwnBox()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be OwnBox\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotOwnBox()
	{
		isNotNull();
		if (actual.isOwnBox()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be OwnBox\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPhantom()
	{
		isNotNull();
		if (!actual.isPhantom()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Phantom\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPhantom()
	{
		isNotNull();
		if (actual.isPhantom()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Phantom\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPickListPrintDetails()
	{
		isNotNull();
		if (!actual.isPickListPrintDetails()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PickListPrintDetails\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPickListPrintDetails()
	{
		isNotNull();
		if (actual.isPickListPrintDetails()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PickListPrintDetails\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPurchased()
	{
		isNotNull();
		if (!actual.isPurchased()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Purchased\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPurchased()
	{
		isNotNull();
		if (actual.isPurchased()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Purchased\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSelfService()
	{
		isNotNull();
		if (!actual.isSelfService()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SelfService\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSelfService()
	{
		isNotNull();
		if (actual.isSelfService()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SelfService\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSold()
	{
		isNotNull();
		if (!actual.isSold()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Sold\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSold()
	{
		isNotNull();
		if (actual.isSold()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Sold\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isStocked()
	{
		isNotNull();
		if (!actual.isStocked()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Stocked\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotStocked()
	{
		isNotNull();
		if (actual.isStocked()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Stocked\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSummary()
	{
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Summary\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSummary()
	{
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Summary\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isVerified()
	{
		isNotNull();
		if (!actual.isVerified()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Verified\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotVerified()
	{
		isNotNull();
		if (actual.isVerified()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Verified\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isWebStoreFeatured()
	{
		isNotNull();
		if (!actual.isWebStoreFeatured()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be WebStoreFeatured\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotWebStoreFeatured()
	{
		isNotNull();
		if (actual.isWebStoreFeatured()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be WebStoreFeatured\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasM_AttributeSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSet_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_AttributeSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_AttributeSetInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSetInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_AttributeSetInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_FreightCategory_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_FreightCategory_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_FreightCategory_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Locator_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Locator_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Locator_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_PartType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PartType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PartType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Product_Category_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_Category_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_Category_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Product_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Product_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Product_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Product_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Product_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasProductType(String expected)
	{
		isNotNull();
		String actualField = actual.getProductType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ProductType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasR_MailText_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getR_MailText_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_MailText_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasS_ExpenseType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_ExpenseType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_ExpenseType_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasS_Resource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getS_Resource_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have S_Resource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSalesRep_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getSalesRep_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SalesRep_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasShelfDepth(int expected)
	{
		isNotNull();
		int actualField = actual.getShelfDepth();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShelfDepth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasShelfHeight(Object expected)
	{
		isNotNull();
		bdAssert("ShelfHeight", actual.getShelfHeight(), expected);
		return myself;
	}


	public SELF hasShelfWidth(int expected)
	{
		isNotNull();
		int actualField = actual.getShelfWidth();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShelfWidth: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSKU(String expected)
	{
		isNotNull();
		String actualField = actual.getSKU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SKU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUnitsPerPack(int expected)
	{
		isNotNull();
		int actualField = actual.getUnitsPerPack();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UnitsPerPack: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUnitsPerPallet(Object expected)
	{
		isNotNull();
		bdAssert("UnitsPerPallet", actual.getUnitsPerPallet(), expected);
		return myself;
	}


	public SELF hasUPC(String expected)
	{
		isNotNull();
		String actualField = actual.getUPC();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UPC: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasValue(String expected)
	{
		isNotNull();
		String actualField = actual.getValue();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Value: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasVersionNo(String expected)
	{
		isNotNull();
		String actualField = actual.getVersionNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VersionNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasVolume(Object expected)
	{
		isNotNull();
		bdAssert("Volume", actual.getVolume(), expected);
		return myself;
	}


	public SELF hasWeight(Object expected)
	{
		isNotNull();
		bdAssert("Weight", actual.getWeight(), expected);
		return myself;
	}

}