/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_bankaccount_processor;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_BankAccount_Processor;

/** Generated assertion class for C_BankAccount_Processor
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_BankAccount_ProcessorAssert<SELF extends AbstractC_BankAccount_ProcessorAssert<SELF, ACTUAL>, ACTUAL extends X_C_BankAccount_Processor>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_BankAccount_ProcessorAssert (ACTUAL actual, Class<SELF> selfType)
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

	public SELF hasC_BankAccount_Processor_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BankAccount_Processor_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BankAccount_Processor_UU: <%s>\nbut it was: <%s>",
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

	public SELF isPPAcceptAMEX()
	{
		isNotNull();
		if (!actual.isPPAcceptAMEX()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptAMEX\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptAMEX()
	{
		isNotNull();
		if (actual.isPPAcceptAMEX()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptAMEX\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPPAcceptATM()
	{
		isNotNull();
		if (!actual.isPPAcceptATM()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptATM\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptATM()
	{
		isNotNull();
		if (actual.isPPAcceptATM()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptATM\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPPAcceptCheck()
	{
		isNotNull();
		if (!actual.isPPAcceptCheck()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptCheck\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptCheck()
	{
		isNotNull();
		if (actual.isPPAcceptCheck()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptCheck\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPPAcceptCorporate()
	{
		isNotNull();
		if (!actual.isPPAcceptCorporate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptCorporate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptCorporate()
	{
		isNotNull();
		if (actual.isPPAcceptCorporate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptCorporate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPPAcceptDiners()
	{
		isNotNull();
		if (!actual.isPPAcceptDiners()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptDiners\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptDiners()
	{
		isNotNull();
		if (actual.isPPAcceptDiners()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptDiners\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPPAcceptDirectDebit()
	{
		isNotNull();
		if (!actual.isPPAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptDirectDebit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptDirectDebit()
	{
		isNotNull();
		if (actual.isPPAcceptDirectDebit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptDirectDebit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPPAcceptDirectDeposit()
	{
		isNotNull();
		if (!actual.isPPAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptDirectDeposit\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptDirectDeposit()
	{
		isNotNull();
		if (actual.isPPAcceptDirectDeposit()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptDirectDeposit\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPPAcceptDiscover()
	{
		isNotNull();
		if (!actual.isPPAcceptDiscover()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptDiscover\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptDiscover()
	{
		isNotNull();
		if (actual.isPPAcceptDiscover()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptDiscover\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPPAcceptMC()
	{
		isNotNull();
		if (!actual.isPPAcceptMC()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptMC\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptMC()
	{
		isNotNull();
		if (actual.isPPAcceptMC()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptMC\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPPAcceptVisa()
	{
		isNotNull();
		if (!actual.isPPAcceptVisa()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be PPAcceptVisa\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPPAcceptVisa()
	{
		isNotNull();
		if (actual.isPPAcceptVisa()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be PPAcceptVisa\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasMinimumAmt(Object expected)
	{
		isNotNull();
		bdAssert("MinimumAmt", actual.getMinimumAmt(), expected);
		return myself;
	}


	public SELF hasPartnerID(String expected)
	{
		isNotNull();
		String actualField = actual.getPartnerID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PartnerID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getPassword();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Password: <%s>\nbut it was: <%s>",
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

	public SELF hasUserID(String expected)
	{
		isNotNull();
		String actualField = actual.getUserID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UserID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasVendorID(String expected)
	{
		isNotNull();
		String actualField = actual.getVendorID();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have VendorID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}