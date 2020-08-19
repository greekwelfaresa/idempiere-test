/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.m_package;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_M_Package;

/** Generated assertion class for M_Package
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_PackageAssert<SELF extends AbstractM_PackageAssert<SELF, ACTUAL>, ACTUAL extends X_M_Package>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_PackageAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasBoxCount(int expected)
	{
		isNotNull();
		int actualField = actual.getBoxCount();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BoxCount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BP_ShippingAcct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_ShippingAcct_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_ShippingAcct_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_UOM_Length_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Length_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Length_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_UOM_Weight_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_UOM_Weight_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_UOM_Weight_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isCashOnDelivery()
	{
		isNotNull();
		if (!actual.isCashOnDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CashOnDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCashOnDelivery()
	{
		isNotNull();
		if (actual.isCashOnDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CashOnDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasDateReceived(Object expected)
	{
		isNotNull();
		dateAssert("DateReceived", actual.getDateReceived(), expected);
		return myself;
	}


	public SELF isDeliveryConfirmation()
	{
		isNotNull();
		if (!actual.isDeliveryConfirmation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DeliveryConfirmation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDeliveryConfirmation()
	{
		isNotNull();
		if (actual.isDeliveryConfirmation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DeliveryConfirmation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasDeliveryConfirmationType(String expected)
	{
		isNotNull();
		String actualField = actual.getDeliveryConfirmationType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DeliveryConfirmationType: <%s>\nbut it was: <%s>",
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

	public SELF hasDotHazardClassOrDivision(String expected)
	{
		isNotNull();
		String actualField = actual.getDotHazardClassOrDivision();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DotHazardClassOrDivision: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDryIceWeight(Object expected)
	{
		isNotNull();
		bdAssert("DryIceWeight", actual.getDryIceWeight(), expected);
		return myself;
	}


	public SELF hasDutiesShipperAccount(String expected)
	{
		isNotNull();
		String actualField = actual.getDutiesShipperAccount();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DutiesShipperAccount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEstimatedWeight(Object expected)
	{
		isNotNull();
		bdAssert("EstimatedWeight", actual.getEstimatedWeight(), expected);
		return myself;
	}


	public SELF hasFOB(String expected)
	{
		isNotNull();
		String actualField = actual.getFOB();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FOB: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFreightCharges(String expected)
	{
		isNotNull();
		String actualField = actual.getFreightCharges();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FreightCharges: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHandlingCharge(Object expected)
	{
		isNotNull();
		bdAssert("HandlingCharge", actual.getHandlingCharge(), expected);
		return myself;
	}


	public SELF hasHeight(Object expected)
	{
		isNotNull();
		bdAssert("Height", actual.getHeight(), expected);
		return myself;
	}


	public SELF hasHoldAddress_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getHoldAddress_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HoldAddress_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHomeDeliveryPremiumDate(Object expected)
	{
		isNotNull();
		dateAssert("HomeDeliveryPremiumDate", actual.getHomeDeliveryPremiumDate(), expected);
		return myself;
	}


	public SELF hasHomeDeliveryPremiumPhone(String expected)
	{
		isNotNull();
		String actualField = actual.getHomeDeliveryPremiumPhone();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HomeDeliveryPremiumPhone: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHomeDeliveryPremiumType(String expected)
	{
		isNotNull();
		String actualField = actual.getHomeDeliveryPremiumType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HomeDeliveryPremiumType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasInsurance(String expected)
	{
		isNotNull();
		String actualField = actual.getInsurance();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Insurance: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasInsuredAmount(Object expected)
	{
		isNotNull();
		bdAssert("InsuredAmount", actual.getInsuredAmount(), expected);
		return myself;
	}


	public SELF isAccessible()
	{
		isNotNull();
		if (!actual.isAccessible()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Accessible\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAccessible()
	{
		isNotNull();
		if (actual.isAccessible()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Accessible\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAddedHandling()
	{
		isNotNull();
		if (!actual.isAddedHandling()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AddedHandling\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAddedHandling()
	{
		isNotNull();
		if (actual.isAddedHandling()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AddedHandling\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isCargoAircraftOnly()
	{
		isNotNull();
		if (!actual.isCargoAircraftOnly()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CargoAircraftOnly\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCargoAircraftOnly()
	{
		isNotNull();
		if (actual.isCargoAircraftOnly()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CargoAircraftOnly\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDryIce()
	{
		isNotNull();
		if (!actual.isDryIce()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be DryIce\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDryIce()
	{
		isNotNull();
		if (actual.isDryIce()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be DryIce\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDutiable()
	{
		isNotNull();
		if (!actual.isDutiable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Dutiable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDutiable()
	{
		isNotNull();
		if (actual.isDutiable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Dutiable\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFutureDayShipment()
	{
		isNotNull();
		if (!actual.isFutureDayShipment()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FutureDayShipment\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFutureDayShipment()
	{
		isNotNull();
		if (actual.isFutureDayShipment()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FutureDayShipment\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isHazMat()
	{
		isNotNull();
		if (!actual.isHazMat()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HazMat\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHazMat()
	{
		isNotNull();
		if (actual.isHazMat()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HazMat\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isHoldAtLocation()
	{
		isNotNull();
		if (!actual.isHoldAtLocation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HoldAtLocation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHoldAtLocation()
	{
		isNotNull();
		if (actual.isHoldAtLocation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HoldAtLocation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIgnoreZipNotFound()
	{
		isNotNull();
		if (!actual.isIgnoreZipNotFound()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IgnoreZipNotFound\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIgnoreZipNotFound()
	{
		isNotNull();
		if (actual.isIgnoreZipNotFound()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IgnoreZipNotFound\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isIgnoreZipStateNotMatch()
	{
		isNotNull();
		if (!actual.isIgnoreZipStateNotMatch()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IgnoreZipStateNotMatch\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIgnoreZipStateNotMatch()
	{
		isNotNull();
		if (actual.isIgnoreZipStateNotMatch()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IgnoreZipStateNotMatch\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isResidential()
	{
		isNotNull();
		if (!actual.isResidential()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Residential\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotResidential()
	{
		isNotNull();
		if (actual.isResidential()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Residential\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSaturdayDelivery()
	{
		isNotNull();
		if (!actual.isSaturdayDelivery()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaturdayDelivery\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSaturdayDelivery()
	{
		isNotNull();
		if (actual.isSaturdayDelivery()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaturdayDelivery\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSaturdayPickup()
	{
		isNotNull();
		if (!actual.isSaturdayPickup()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SaturdayPickup\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSaturdayPickup()
	{
		isNotNull();
		if (actual.isSaturdayPickup()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SaturdayPickup\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isVerbalConfirmation()
	{
		isNotNull();
		if (!actual.isVerbalConfirmation()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be VerbalConfirmation\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotVerbalConfirmation()
	{
		isNotNull();
		if (actual.isVerbalConfirmation()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be VerbalConfirmation\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLatestPickupTime(Object expected)
	{
		isNotNull();
		dateAssert("LatestPickupTime", actual.getLatestPickupTime(), expected);
		return myself;
	}


	public SELF hasLength(Object expected)
	{
		isNotNull();
		bdAssert("Length", actual.getLength(), expected);
		return myself;
	}


	public SELF hasM_InOut_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_InOut_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_InOut_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Package_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_Package_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Package_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_Package_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_Package_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_Package_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasM_ShipperLabels_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperLabels_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShipperLabels_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_ShipperPackaging_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperPackaging_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShipperPackaging_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_ShipperPickupTypes_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShipperPickupTypes_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShipperPickupTypes_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_ShippingProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_ShippingProcessor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_ShippingProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasNotificationMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getNotificationMessage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NotificationMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasNotificationType(String expected)
	{
		isNotNull();
		String actualField = actual.getNotificationType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NotificationType: <%s>\nbut it was: <%s>",
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

	public SELF hasPrice(Object expected)
	{
		isNotNull();
		bdAssert("Price", actual.getPrice(), expected);
		return myself;
	}


	public SELF hasPriceActual(Object expected)
	{
		isNotNull();
		bdAssert("PriceActual", actual.getPriceActual(), expected);
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

	public SELF hasRateInquiryMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getRateInquiryMessage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RateInquiryMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasReceivedInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getReceivedInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ReceivedInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasShipDate(Object expected)
	{
		isNotNull();
		dateAssert("ShipDate", actual.getShipDate(), expected);
		return myself;
	}


	public SELF hasShipperAccount(String expected)
	{
		isNotNull();
		String actualField = actual.getShipperAccount();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShipperAccount: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasShippingRespMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getShippingRespMessage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ShippingRespMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSurcharges(Object expected)
	{
		isNotNull();
		bdAssert("Surcharges", actual.getSurcharges(), expected);
		return myself;
	}


	public SELF hasTotalPrice(Object expected)
	{
		isNotNull();
		bdAssert("TotalPrice", actual.getTotalPrice(), expected);
		return myself;
	}


	public SELF hasTrackingInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getTrackingInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TrackingInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTrackingNo(String expected)
	{
		isNotNull();
		String actualField = actual.getTrackingNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TrackingNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWeight(Object expected)
	{
		isNotNull();
		bdAssert("Weight", actual.getWeight(), expected);
		return myself;
	}


	public SELF hasWidth(Object expected)
	{
		isNotNull();
		bdAssert("Width", actual.getWidth(), expected);
		return myself;
	}

}