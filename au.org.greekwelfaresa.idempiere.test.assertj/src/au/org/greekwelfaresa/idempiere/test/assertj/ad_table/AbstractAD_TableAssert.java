/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_table;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Table;

/** Generated assertion class for AD_Table
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_TableAssert<SELF extends AbstractAD_TableAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Table>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_TableAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAccessLevel(String expected)
	{
		isNotNull();
		String actualField = actual.getAccessLevel();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AccessLevel: <%s>\nbut it was: <%s>",
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

	public SELF hasAD_Table_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Table_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Table_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Val_Rule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Val_Rule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Val_Rule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Window_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Window_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Window_ID: <%s>\nbut it was: <%s>",
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

	public SELF isCentrallyMaintained()
	{
		isNotNull();
		if (!actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be CentrallyMaintained\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotCentrallyMaintained()
	{
		isNotNull();
		if (actual.isCentrallyMaintained()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be CentrallyMaintained\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isChangeLog()
	{
		isNotNull();
		if (!actual.isChangeLog()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be ChangeLog\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotChangeLog()
	{
		isNotNull();
		if (actual.isChangeLog()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be ChangeLog\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isDeleteable()
	{
		isNotNull();
		if (!actual.isDeleteable()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Deleteable\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotDeleteable()
	{
		isNotNull();
		if (actual.isDeleteable()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Deleteable\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isHighVolume()
	{
		isNotNull();
		if (!actual.isHighVolume()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be HighVolume\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotHighVolume()
	{
		isNotNull();
		if (actual.isHighVolume()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be HighVolume\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSecurityEnabled()
	{
		isNotNull();
		if (!actual.isSecurityEnabled()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SecurityEnabled\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSecurityEnabled()
	{
		isNotNull();
		if (actual.isSecurityEnabled()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SecurityEnabled\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isView()
	{
		isNotNull();
		if (!actual.isView()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be View\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotView()
	{
		isNotNull();
		if (actual.isView()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be View\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLoadSeq(int expected)
	{
		isNotNull();
		int actualField = actual.getLoadSeq();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LoadSeq: <%s>\nbut it was: <%s>",
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

	public SELF hasPO_Window_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPO_Window_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PO_Window_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasReplicationType(String expected)
	{
		isNotNull();
		String actualField = actual.getReplicationType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ReplicationType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasTableName(String expected)
	{
		isNotNull();
		String actualField = actual.getTableName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have TableName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}