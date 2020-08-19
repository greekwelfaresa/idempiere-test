/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.t_report;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_T_Report;

/** Generated assertion class for T_Report
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractT_ReportAssert<SELF extends AbstractT_ReportAssert<SELF, ACTUAL>, ACTUAL extends X_T_Report>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractT_ReportAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_PInstance_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_PInstance_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCol_0(Object expected)
	{
		isNotNull();
		bdAssert("Col_0", actual.getCol_0(), expected);
		return myself;
	}


	public SELF hasCol_1(Object expected)
	{
		isNotNull();
		bdAssert("Col_1", actual.getCol_1(), expected);
		return myself;
	}


	public SELF hasCol_10(Object expected)
	{
		isNotNull();
		bdAssert("Col_10", actual.getCol_10(), expected);
		return myself;
	}


	public SELF hasCol_11(Object expected)
	{
		isNotNull();
		bdAssert("Col_11", actual.getCol_11(), expected);
		return myself;
	}


	public SELF hasCol_12(Object expected)
	{
		isNotNull();
		bdAssert("Col_12", actual.getCol_12(), expected);
		return myself;
	}


	public SELF hasCol_13(Object expected)
	{
		isNotNull();
		bdAssert("Col_13", actual.getCol_13(), expected);
		return myself;
	}


	public SELF hasCol_14(Object expected)
	{
		isNotNull();
		bdAssert("Col_14", actual.getCol_14(), expected);
		return myself;
	}


	public SELF hasCol_15(Object expected)
	{
		isNotNull();
		bdAssert("Col_15", actual.getCol_15(), expected);
		return myself;
	}


	public SELF hasCol_16(Object expected)
	{
		isNotNull();
		bdAssert("Col_16", actual.getCol_16(), expected);
		return myself;
	}


	public SELF hasCol_17(Object expected)
	{
		isNotNull();
		bdAssert("Col_17", actual.getCol_17(), expected);
		return myself;
	}


	public SELF hasCol_18(Object expected)
	{
		isNotNull();
		bdAssert("Col_18", actual.getCol_18(), expected);
		return myself;
	}


	public SELF hasCol_19(Object expected)
	{
		isNotNull();
		bdAssert("Col_19", actual.getCol_19(), expected);
		return myself;
	}


	public SELF hasCol_2(Object expected)
	{
		isNotNull();
		bdAssert("Col_2", actual.getCol_2(), expected);
		return myself;
	}


	public SELF hasCol_20(Object expected)
	{
		isNotNull();
		bdAssert("Col_20", actual.getCol_20(), expected);
		return myself;
	}


	public SELF hasCol_3(Object expected)
	{
		isNotNull();
		bdAssert("Col_3", actual.getCol_3(), expected);
		return myself;
	}


	public SELF hasCol_4(Object expected)
	{
		isNotNull();
		bdAssert("Col_4", actual.getCol_4(), expected);
		return myself;
	}


	public SELF hasCol_5(Object expected)
	{
		isNotNull();
		bdAssert("Col_5", actual.getCol_5(), expected);
		return myself;
	}


	public SELF hasCol_6(Object expected)
	{
		isNotNull();
		bdAssert("Col_6", actual.getCol_6(), expected);
		return myself;
	}


	public SELF hasCol_7(Object expected)
	{
		isNotNull();
		bdAssert("Col_7", actual.getCol_7(), expected);
		return myself;
	}


	public SELF hasCol_8(Object expected)
	{
		isNotNull();
		bdAssert("Col_8", actual.getCol_8(), expected);
		return myself;
	}


	public SELF hasCol_9(Object expected)
	{
		isNotNull();
		bdAssert("Col_9", actual.getCol_9(), expected);
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

	public SELF hasFact_Acct_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getFact_Acct_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Fact_Acct_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLevelNo(int expected)
	{
		isNotNull();
		int actualField = actual.getLevelNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LevelNo: <%s>\nbut it was: <%s>",
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

	public SELF hasPA_ReportLine_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getPA_ReportLine_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have PA_ReportLine_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSeqNo(int expected)
	{
		isNotNull();
		int actualField = actual.getSeqNo();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SeqNo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasT_Report_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getT_Report_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have T_Report_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}