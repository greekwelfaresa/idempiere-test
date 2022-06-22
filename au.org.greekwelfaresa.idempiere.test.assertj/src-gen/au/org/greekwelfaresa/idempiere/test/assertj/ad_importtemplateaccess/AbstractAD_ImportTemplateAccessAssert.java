/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_importtemplateaccess;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_ImportTemplateAccess;

/** Generated assertion class for AD_ImportTemplateAccess
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_ImportTemplateAccessAssert<SELF extends AbstractAD_ImportTemplateAccessAssert<SELF, ACTUAL>, ACTUAL extends X_AD_ImportTemplateAccess>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_ImportTemplateAccessAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_ImportTemplate_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ImportTemplate_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ImportTemplate_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_ImportTemplateAccess_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_ImportTemplateAccess_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ImportTemplateAccess_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_ImportTemplateAccess_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_ImportTemplateAccess_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_ImportTemplateAccess_UU: <%s>\nbut it was: <%s>",
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

	public SELF isAllowInsert()
	{
		isNotNull();
		if (!actual.isAllowInsert()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowInsert\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowInsert()
	{
		isNotNull();
		if (actual.isAllowInsert()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowInsert\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllowMerge()
	{
		isNotNull();
		if (!actual.isAllowMerge()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowMerge\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowMerge()
	{
		isNotNull();
		if (actual.isAllowMerge()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowMerge\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAllowUpdate()
	{
		isNotNull();
		if (!actual.isAllowUpdate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowUpdate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowUpdate()
	{
		isNotNull();
		if (actual.isAllowUpdate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowUpdate\nbut it was",
				getPODescription());
		}
		return myself;
	}
}