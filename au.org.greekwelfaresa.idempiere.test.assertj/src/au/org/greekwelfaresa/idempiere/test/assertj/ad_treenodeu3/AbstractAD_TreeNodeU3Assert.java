/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_treenodeu3;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_TreeNodeU3;

/** Generated assertion class for AD_TreeNodeU3
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_TreeNodeU3Assert<SELF extends AbstractAD_TreeNodeU3Assert<SELF, ACTUAL>, ACTUAL extends X_AD_TreeNodeU3>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_TreeNodeU3Assert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Tree_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Tree_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Tree_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_TreeNodeU3_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_TreeNodeU3_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_TreeNodeU3_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasNode_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getNode_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Node_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasParent_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getParent_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Parent_ID: <%s>\nbut it was: <%s>",
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
}