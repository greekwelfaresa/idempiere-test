/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_broadcastmessage;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_BroadcastMessage;

/** Generated assertion class for AD_BroadcastMessage
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_BroadcastMessageAssert<SELF extends AbstractAD_BroadcastMessageAssert<SELF, ACTUAL>, ACTUAL extends X_AD_BroadcastMessage>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_BroadcastMessageAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_BroadcastMessage_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_BroadcastMessage_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_BroadcastMessage_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_BroadcastMessage_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_BroadcastMessage_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_BroadcastMessage_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Role_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Role_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Role_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasBroadcastFrequency(String expected)
	{
		isNotNull();
		String actualField = actual.getBroadcastFrequency();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BroadcastFrequency: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBroadcastMessage(String expected)
	{
		isNotNull();
		String actualField = actual.getBroadcastMessage();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BroadcastMessage: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasBroadcastType(String expected)
	{
		isNotNull();
		String actualField = actual.getBroadcastType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have BroadcastType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasExpiration(Object expected)
	{
		isNotNull();
		dateAssert("Expiration", actual.getExpiration(), expected);
		return myself;
	}


	public SELF isExpired()
	{
		isNotNull();
		if (!actual.isExpired()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Expired\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotExpired()
	{
		isNotNull();
		if (actual.isExpired()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Expired\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isPublished()
	{
		isNotNull();
		if (!actual.isPublished()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Published\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotPublished()
	{
		isNotNull();
		if (actual.isPublished()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Published\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isLogAcknowledge()
	{
		isNotNull();
		if (!actual.isLogAcknowledge()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LogAcknowledge\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotLogAcknowledge()
	{
		isNotNull();
		if (actual.isLogAcknowledge()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LogAcknowledge\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasNotification_Client_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getNotification_Client_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Notification_Client_ID: <%s>\nbut it was: <%s>",
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

	public SELF hasTarget(String expected)
	{
		isNotNull();
		String actualField = actual.getTarget();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Target: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}