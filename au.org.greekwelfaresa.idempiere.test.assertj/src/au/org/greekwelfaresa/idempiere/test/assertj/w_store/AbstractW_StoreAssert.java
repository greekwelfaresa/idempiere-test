/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.w_store;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_W_Store;

/** Generated assertion class for W_Store
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractW_StoreAssert<SELF extends AbstractW_StoreAssert<SELF, ACTUAL>, ACTUAL extends X_W_Store>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractW_StoreAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF hasEMailFooter(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailFooter();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMailFooter: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMailHeader(String expected)
	{
		isNotNull();
		String actualField = actual.getEMailHeader();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMailHeader: <%s>\nbut it was: <%s>",
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

	public SELF isMenuAssets()
	{
		isNotNull();
		if (!actual.isMenuAssets()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuAssets\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuAssets()
	{
		isNotNull();
		if (actual.isMenuAssets()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuAssets\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuContact()
	{
		isNotNull();
		if (!actual.isMenuContact()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuContact\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuContact()
	{
		isNotNull();
		if (actual.isMenuContact()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuContact\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuInterests()
	{
		isNotNull();
		if (!actual.isMenuInterests()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuInterests\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuInterests()
	{
		isNotNull();
		if (actual.isMenuInterests()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuInterests\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuInvoices()
	{
		isNotNull();
		if (!actual.isMenuInvoices()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuInvoices\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuInvoices()
	{
		isNotNull();
		if (actual.isMenuInvoices()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuInvoices\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuOrders()
	{
		isNotNull();
		if (!actual.isMenuOrders()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuOrders\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuOrders()
	{
		isNotNull();
		if (actual.isMenuOrders()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuOrders\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuPayments()
	{
		isNotNull();
		if (!actual.isMenuPayments()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuPayments\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuPayments()
	{
		isNotNull();
		if (actual.isMenuPayments()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuPayments\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuRegistrations()
	{
		isNotNull();
		if (!actual.isMenuRegistrations()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuRegistrations\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuRegistrations()
	{
		isNotNull();
		if (actual.isMenuRegistrations()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuRegistrations\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuRequests()
	{
		isNotNull();
		if (!actual.isMenuRequests()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuRequests\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuRequests()
	{
		isNotNull();
		if (actual.isMenuRequests()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuRequests\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuRfQs()
	{
		isNotNull();
		if (!actual.isMenuRfQs()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuRfQs\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuRfQs()
	{
		isNotNull();
		if (actual.isMenuRfQs()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuRfQs\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isMenuShipments()
	{
		isNotNull();
		if (!actual.isMenuShipments()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be MenuShipments\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotMenuShipments()
	{
		isNotNull();
		if (actual.isMenuShipments()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be MenuShipments\nbut it was",
				getPODescription());
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

	public SELF hasStylesheet(String expected)
	{
		isNotNull();
		String actualField = actual.getStylesheet();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Stylesheet: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasURL(String expected)
	{
		isNotNull();
		String actualField = actual.getURL();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have URL: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasW_Store_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getW_Store_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have W_Store_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasW_Store_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getW_Store_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have W_Store_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWebContext(String expected)
	{
		isNotNull();
		String actualField = actual.getWebContext();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WebContext: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWebInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getWebInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WebInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWebOrderEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getWebOrderEMail();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WebOrderEMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWebParam1(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam1();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WebParam1: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWebParam2(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WebParam2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWebParam3(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam3();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WebParam3: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWebParam4(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam4();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WebParam4: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWebParam5(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam5();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WebParam5: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWebParam6(String expected)
	{
		isNotNull();
		String actualField = actual.getWebParam6();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WebParam6: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWStoreEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getWStoreEMail();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WStoreEMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWStoreUser(String expected)
	{
		isNotNull();
		String actualField = actual.getWStoreUser();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WStoreUser: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWStoreUserPW(String expected)
	{
		isNotNull();
		String actualField = actual.getWStoreUserPW();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WStoreUserPW: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}