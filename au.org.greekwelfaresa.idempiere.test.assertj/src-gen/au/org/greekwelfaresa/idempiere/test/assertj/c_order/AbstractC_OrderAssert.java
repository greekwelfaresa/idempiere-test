/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_order;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_Order;

/** Generated assertion class for C_Order
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_OrderAssert<SELF extends AbstractC_OrderAssert<SELF, ACTUAL>, ACTUAL extends X_C_Order>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_OrderAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_OrgTrx_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_OrgTrx_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_OrgTrx_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAmountRefunded(Object expected)
	{
		isNotNull();
		bdAssert("AmountRefunded", actual.getAmountRefunded(), expected);
		return myself;
	}


	public SELF hasAmountTendered(Object expected)
	{
		isNotNull();
		bdAssert("AmountTendered", actual.getAmountTendered(), expected);
		return myself;
	}


	public SELF hasBill_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBill_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Bill_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBill_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBill_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Bill_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBill_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getBill_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Bill_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Activity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Activity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Activity_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_BPartner_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BPartner_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BPartner_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Campaign_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Campaign_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Campaign_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_CashLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CashLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CashLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_CashPlanLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_CashPlanLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_CashPlanLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Charge_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Charge_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Charge_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_ConversionType_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_ConversionType_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_ConversionType_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_DocTypeTarget_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_DocTypeTarget_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_DocTypeTarget_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Opportunity_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Opportunity_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Opportunity_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Order_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Order_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Order_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Order_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Order_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_OrderSource_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_OrderSource_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_OrderSource_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Payment_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Payment_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Payment_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaymentTerm_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentTerm_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentTerm_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_POS_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_POS_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_POS_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Project_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Project_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Project_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasChargeAmt(Object expected)
	{
		isNotNull();
		bdAssert("ChargeAmt", actual.getChargeAmt(), expected);
		return myself;
	}


	public SELF hasDateAcct(Object expected)
	{
		isNotNull();
		dateAssert("DateAcct", actual.getDateAcct(), expected);
		return myself;
	}


	public SELF hasDateOrdered(Object expected)
	{
		isNotNull();
		dateAssert("DateOrdered", actual.getDateOrdered(), expected);
		return myself;
	}


	public SELF hasDatePrinted(Object expected)
	{
		isNotNull();
		dateAssert("DatePrinted", actual.getDatePrinted(), expected);
		return myself;
	}


	public SELF hasDatePromised(Object expected)
	{
		isNotNull();
		dateAssert("DatePromised", actual.getDatePromised(), expected);
		return myself;
	}


	public SELF hasDeliveryRule(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DeliveryRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDeliveryViaRule(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryViaRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DeliveryViaRule: <%s>\nbut it was: <%s>",
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

	public SELF hasDocStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getDocStatus();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDocumentNo(String expected)
	{
		isNotNull();
		String actualField = actual.getDocumentNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DocumentNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDropShip_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDropShip_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DropShip_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDropShip_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDropShip_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DropShip_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDropShip_User_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getDropShip_User_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DropShip_User_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFreightAmt(Object expected)
	{
		isNotNull();
		bdAssert("FreightAmt", actual.getFreightAmt(), expected);
		return myself;
	}


	public SELF hasFreightCostRule(String expected)
	{
		isNotNull();
		String actualField = actual.getFreightCostRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FreightCostRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasGrandTotal(Object expected)
	{
		isNotNull();
		bdAssert("GrandTotal", actual.getGrandTotal(), expected);
		return myself;
	}


	public SELF hasInvoiceRule(String expected)
	{
		isNotNull();
		String actualField = actual.getInvoiceRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have InvoiceRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isApproved()
	{
		isNotNull();
		if (!actual.isApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Approved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotApproved()
	{
		isNotNull();
		if (actual.isApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Approved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCreditApproved()
	{
		isNotNull();
		if (!actual.isCreditApproved()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreditApproved\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCreditApproved()
	{
		isNotNull();
		if (actual.isCreditApproved()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreditApproved\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDelivered()
	{
		isNotNull();
		if (!actual.isDelivered()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Delivered\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDelivered()
	{
		isNotNull();
		if (actual.isDelivered()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Delivered\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDiscountPrinted()
	{
		isNotNull();
		if (!actual.isDiscountPrinted()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DiscountPrinted\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDiscountPrinted()
	{
		isNotNull();
		if (actual.isDiscountPrinted()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DiscountPrinted\nbut it was",
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

	public SELF isInvoiced()
	{
		isNotNull();
		if (!actual.isInvoiced()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Invoiced\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInvoiced()
	{
		isNotNull();
		if (actual.isInvoiced()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Invoiced\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPayScheduleValid()
	{
		isNotNull();
		if (!actual.isPayScheduleValid()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PayScheduleValid\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPayScheduleValid()
	{
		isNotNull();
		if (actual.isPayScheduleValid()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PayScheduleValid\nbut it was",
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

	public SELF isPriviledgedRate()
	{
		isNotNull();
		if (!actual.isPriviledgedRate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PriviledgedRate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPriviledgedRate()
	{
		isNotNull();
		if (actual.isPriviledgedRate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PriviledgedRate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSelected()
	{
		isNotNull();
		if (!actual.isSelected()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Selected\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSelected()
	{
		isNotNull();
		if (actual.isSelected()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Selected\nbut it was",
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

	public SELF isTaxIncluded()
	{
		isNotNull();
		if (!actual.isTaxIncluded()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be TaxIncluded\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTaxIncluded()
	{
		isNotNull();
		if (actual.isTaxIncluded()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be TaxIncluded\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isTransferred()
	{
		isNotNull();
		if (!actual.isTransferred()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Transferred\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotTransferred()
	{
		isNotNull();
		if (actual.isTransferred()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Transferred\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLink_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getLink_Order_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Link_Order_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasM_PriceList_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_PriceList_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_PriceList_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Shipper_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Shipper_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Shipper_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Warehouse_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Warehouse_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Warehouse_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPay_BPartner_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPay_BPartner_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Pay_BPartner_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPay_Location_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPay_Location_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Pay_Location_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPaymentRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPaymentRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PaymentRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPOReference(String expected)
	{
		isNotNull();
		String actualField = actual.getPOReference();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have POReference: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPriorityRule(String expected)
	{
		isNotNull();
		String actualField = actual.getPriorityRule();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PriorityRule: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isProcessed()
	{
		isNotNull();
		if (!actual.isProcessed()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Processed\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotProcessed()
	{
		isNotNull();
		if (actual.isProcessed()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Processed\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasProcessedOn(Object expected)
	{
		isNotNull();
		bdAssert("ProcessedOn", actual.getProcessedOn(), expected);
		return myself;
	}


	public SELF hasPromotionCode(String expected)
	{
		isNotNull();
		String actualField = actual.getPromotionCode();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PromotionCode: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasQuotationOrder_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getQuotationOrder_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have QuotationOrder_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRef_Order_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getRef_Order_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Ref_Order_ID: <%s>\nbut it was: <%s>",
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

	public SELF isSendEMail()
	{
		isNotNull();
		if (!actual.isSendEMail()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendEMail\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSendEMail()
	{
		isNotNull();
		if (actual.isSendEMail()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendEMail\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasTotalLines(Object expected)
	{
		isNotNull();
		bdAssert("TotalLines", actual.getTotalLines(), expected);
		return myself;
	}


	public SELF hasUser1_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser1_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User1_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUser2_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getUser2_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have User2_ID: <%s>\nbut it was: <%s>",
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