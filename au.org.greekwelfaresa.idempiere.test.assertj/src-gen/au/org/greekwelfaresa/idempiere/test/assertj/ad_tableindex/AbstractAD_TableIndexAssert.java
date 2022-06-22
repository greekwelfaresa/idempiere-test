/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_tableindex;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_TableIndex;

/** Generated assertion class for AD_TableIndex
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_TableIndexAssert<SELF extends AbstractAD_TableIndexAssert<SELF, ACTUAL>, ACTUAL extends X_AD_TableIndex>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_TableIndexAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Message_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Message_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Message_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Table_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Table_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_TableIndex_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_TableIndex_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_TableIndex_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_TableIndex_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_TableIndex_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_TableIndex_UU: <%s>\nbut it was: <%s>",
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

	public SELF hasEntityType(String expected)
	{
		isNotNull();
		String actualField = actual.getEntityType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EntityType: <%s>\nbut it was: <%s>",
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

	public SELF isCreateConstraint()
	{
		isNotNull();
		if (!actual.isCreateConstraint()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CreateConstraint\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCreateConstraint()
	{
		isNotNull();
		if (actual.isCreateConstraint()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CreateConstraint\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isKey()
	{
		isNotNull();
		if (!actual.isKey()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Key\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotKey()
	{
		isNotNull();
		if (actual.isKey()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Key\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isUnique()
	{
		isNotNull();
		if (!actual.isUnique()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Unique\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUnique()
	{
		isNotNull();
		if (actual.isUnique()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Unique\nbut it was",
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
}