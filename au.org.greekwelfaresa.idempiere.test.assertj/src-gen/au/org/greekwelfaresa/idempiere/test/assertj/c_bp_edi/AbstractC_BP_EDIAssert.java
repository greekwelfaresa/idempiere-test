/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_bp_edi;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_BP_EDI;

/** Generated assertion class for C_BP_EDI
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_BP_EDIAssert<SELF extends AbstractC_BP_EDIAssert<SELF, ACTUAL>, ACTUAL extends X_C_BP_EDI>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_BP_EDIAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF hasC_BP_EDI_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_BP_EDI_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_EDI_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_BP_EDI_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_BP_EDI_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_BP_EDI_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasCustomerNo(String expected)
	{
		isNotNull();
		String actualField = actual.getCustomerNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CustomerNo: <%s>\nbut it was: <%s>",
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

	public SELF hasEDIType(String expected)
	{
		isNotNull();
		String actualField = actual.getEDIType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EDIType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMail_Error_To(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_Error_To();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_Error_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMail_From(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_From();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_From: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMail_From_Pwd(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_From_Pwd();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_From_Pwd: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMail_From_Uid(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_From_Uid();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_From_Uid: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMail_Info_To(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_Info_To();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_Info_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasEMail_To(String expected)
	{
		isNotNull();
		String actualField = actual.getEMail_To();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EMail_To: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAudited()
	{
		isNotNull();
		if (!actual.isAudited()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Audited\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAudited()
	{
		isNotNull();
		if (actual.isAudited()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Audited\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isInfoSent()
	{
		isNotNull();
		if (!actual.isInfoSent()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InfoSent\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInfoSent()
	{
		isNotNull();
		if (actual.isInfoSent()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InfoSent\nbut it was",
				getPODescription());
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

	public SELF isReceiveInquiryReply()
	{
		isNotNull();
		if (!actual.isReceiveInquiryReply()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReceiveInquiryReply\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotReceiveInquiryReply()
	{
		isNotNull();
		if (actual.isReceiveInquiryReply()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReceiveInquiryReply\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isReceiveOrderReply()
	{
		isNotNull();
		if (!actual.isReceiveOrderReply()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ReceiveOrderReply\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotReceiveOrderReply()
	{
		isNotNull();
		if (actual.isReceiveOrderReply()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ReceiveOrderReply\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSendInquiry()
	{
		isNotNull();
		if (!actual.isSendInquiry()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendInquiry\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSendInquiry()
	{
		isNotNull();
		if (actual.isSendInquiry()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendInquiry\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSendOrder()
	{
		isNotNull();
		if (!actual.isSendOrder()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendOrder\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSendOrder()
	{
		isNotNull();
		if (actual.isSendOrder()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendOrder\nbut it was",
				getPODescription());
		}
		return myself;
	}
}