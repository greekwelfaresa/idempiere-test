/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.c_dunning;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_C_Dunning;

/** Generated assertion class for C_Dunning
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractC_DunningAssert<SELF extends AbstractC_DunningAssert<SELF, ACTUAL>, ACTUAL extends X_C_Dunning>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractC_DunningAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasC_Dunning_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getC_Dunning_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Dunning_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasC_Dunning_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getC_Dunning_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have C_Dunning_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isCreateLevelsSequentially()
	{
		isNotNull();
		if (!actual.isCreateLevelsSequentially()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateLevelsSequentially\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCreateLevelsSequentially()
	{
		isNotNull();
		if (actual.isCreateLevelsSequentially()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateLevelsSequentially\nbut it was",
				getPODescription());
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

	public SELF isSendDunningLetter()
	{
		isNotNull();
		if (!actual.isSendDunningLetter()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SendDunningLetter\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSendDunningLetter()
	{
		isNotNull();
		if (actual.isSendDunningLetter()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SendDunningLetter\nbut it was",
				getPODescription());
		}
		return myself;
	}
}