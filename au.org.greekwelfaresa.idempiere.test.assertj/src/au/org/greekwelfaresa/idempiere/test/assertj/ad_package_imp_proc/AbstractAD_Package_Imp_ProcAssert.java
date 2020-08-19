/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_package_imp_proc;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Package_Imp_Proc;

/** Generated assertion class for AD_Package_Imp_Proc
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_Package_Imp_ProcAssert<SELF extends AbstractAD_Package_Imp_ProcAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Package_Imp_Proc>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_Package_Imp_ProcAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF isAD_Override_Dict()
	{
		isNotNull();
		if (!actual.isAD_Override_Dict()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AD_Override_Dict\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAD_Override_Dict()
	{
		isNotNull();
		if (actual.isAD_Override_Dict()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AD_Override_Dict\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasAD_Package_Dir(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Dir();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Dir: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Package_Imp_Proc_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Package_Imp_Proc_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Proc_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Package_Imp_Proc_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Imp_Proc_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Imp_Proc_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Package_Source(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Source();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Source: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Package_Source_Type(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Package_Source_Type();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Package_Source_Type: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDateProcessed(Object expected)
	{
		isNotNull();
		dateAssert("DateProcessed", actual.getDateProcessed(), expected);
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

	public SELF hasP_Msg(String expected)
	{
		isNotNull();
		String actualField = actual.getP_Msg();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have P_Msg: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}