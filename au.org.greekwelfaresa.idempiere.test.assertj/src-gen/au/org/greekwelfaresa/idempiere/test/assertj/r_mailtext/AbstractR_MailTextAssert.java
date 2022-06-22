/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.r_mailtext;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_R_MailText;

/** Generated assertion class for R_MailText
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractR_MailTextAssert<SELF extends AbstractR_MailTextAssert<SELF, ACTUAL>, ACTUAL extends X_R_MailText>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractR_MailTextAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF isHtml()
	{
		isNotNull();
		if (!actual.isHtml()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Html\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHtml()
	{
		isNotNull();
		if (actual.isHtml()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Html\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasMailHeader(String expected)
	{
		isNotNull();
		String actualField = actual.getMailHeader();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MailHeader: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMailText2(String expected)
	{
		isNotNull();
		String actualField = actual.getMailText2();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MailText2: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMailText3(String expected)
	{
		isNotNull();
		String actualField = actual.getMailText3();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MailText3: <%s>\nbut it was: <%s>",
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

	public SELF hasR_MailText_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getR_MailText_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have R_MailText_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}