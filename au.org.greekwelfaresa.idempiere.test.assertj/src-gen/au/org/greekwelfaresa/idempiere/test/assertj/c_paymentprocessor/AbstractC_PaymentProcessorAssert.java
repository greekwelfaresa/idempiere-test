/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_paymentprocessor;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_PaymentProcessor;

/** Generated assertion class for C_PaymentProcessor
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_PaymentProcessorAssert<SELF extends AbstractC_PaymentProcessorAssert<SELF, ACTUAL>, ACTUAL extends X_C_PaymentProcessor>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_PaymentProcessorAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF isAcceptAMEX()
	{
		isNotNull();
		if (!actual.isAcceptAMEX()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptAMEX\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptAMEX()
	{
		isNotNull();
		if (actual.isAcceptAMEX()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptAMEX\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAcceptATM()
	{
		isNotNull();
		if (!actual.isAcceptATM()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptATM\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptATM()
	{
		isNotNull();
		if (actual.isAcceptATM()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptATM\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAcceptCheck()
	{
		isNotNull();
		if (!actual.isAcceptCheck()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptCheck\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptCheck()
	{
		isNotNull();
		if (actual.isAcceptCheck()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptCheck\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAcceptCorporate()
	{
		isNotNull();
		if (!actual.isAcceptCorporate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptCorporate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptCorporate()
	{
		isNotNull();
		if (actual.isAcceptCorporate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptCorporate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAcceptDiners()
	{
		isNotNull();
		if (!actual.isAcceptDiners()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDiners\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptDiners()
	{
		isNotNull();
		if (actual.isAcceptDiners()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDiners\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAcceptDirectDebit()
	{
		isNotNull();
		if (!actual.isAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDirectDebit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptDirectDebit()
	{
		isNotNull();
		if (actual.isAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDirectDebit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAcceptDirectDeposit()
	{
		isNotNull();
		if (!actual.isAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDirectDeposit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptDirectDeposit()
	{
		isNotNull();
		if (actual.isAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDirectDeposit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAcceptDiscover()
	{
		isNotNull();
		if (!actual.isAcceptDiscover()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptDiscover\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptDiscover()
	{
		isNotNull();
		if (actual.isAcceptDiscover()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptDiscover\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAcceptMC()
	{
		isNotNull();
		if (!actual.isAcceptMC()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptMC\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptMC()
	{
		isNotNull();
		if (actual.isAcceptMC()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptMC\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAcceptVisa()
	{
		isNotNull();
		if (!actual.isAcceptVisa()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AcceptVisa\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAcceptVisa()
	{
		isNotNull();
		if (actual.isAcceptVisa()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AcceptVisa\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasAD_Sequence_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Sequence_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Sequence_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BankAccount_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BankAccount_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BankAccount_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasC_PaymentProcessor_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_PaymentProcessor_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentProcessor_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_PaymentProcessor_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_PaymentProcessor_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_PaymentProcessor_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCommission(Object expected)
	{
		isNotNull();
		bdAssert("Commission", actual.getCommission(), expected);
		return myself;
	}


	public SELF hasCostPerTrx(Object expected)
	{
		isNotNull();
		bdAssert("CostPerTrx", actual.getCostPerTrx(), expected);
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

	public SELF hasHostAddress(String expected)
	{
		isNotNull();
		String actualField = actual.getHostAddress();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HostAddress: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasHostPort(int expected)
	{
		isNotNull();
		int actualField = actual.getHostPort();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have HostPort: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMinimumAmt(Object expected)
	{
		isNotNull();
		bdAssert("MinimumAmt", actual.getMinimumAmt(), expected);
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

	public SELF hasPayProcessorClass(String expected)
	{
		isNotNull();
		String actualField = actual.getPayProcessorClass();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PayProcessorClass: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasProxyAddress(String expected)
	{
		isNotNull();
		String actualField = actual.getProxyAddress();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ProxyAddress: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasProxyLogon(String expected)
	{
		isNotNull();
		String actualField = actual.getProxyLogon();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ProxyLogon: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasProxyPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getProxyPassword();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ProxyPassword: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasProxyPort(int expected)
	{
		isNotNull();
		int actualField = actual.getProxyPort();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ProxyPort: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isRequireVV()
	{
		isNotNull();
		if (!actual.isRequireVV()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be RequireVV\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotRequireVV()
	{
		isNotNull();
		if (actual.isRequireVV()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be RequireVV\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasTrxType(String expected)
	{
		isNotNull();
		String actualField = actual.getTrxType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TrxType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}