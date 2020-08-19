/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.m_attributeset;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_M_AttributeSet;

/** Generated assertion class for M_AttributeSet
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractM_AttributeSetAssert<SELF extends AbstractM_AttributeSetAssert<SELF, ACTUAL>, ACTUAL extends X_M_AttributeSet>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractM_AttributeSetAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
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

	public SELF hasGuaranteeDays(int expected)
	{
		isNotNull();
		int actualField = actual.getGuaranteeDays();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have GuaranteeDays: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAutoGenerateLot()
	{
		isNotNull();
		if (!actual.isAutoGenerateLot()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoGenerateLot\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAutoGenerateLot()
	{
		isNotNull();
		if (actual.isAutoGenerateLot()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoGenerateLot\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isGuaranteeDate()
	{
		isNotNull();
		if (!actual.isGuaranteeDate()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be GuaranteeDate\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotGuaranteeDate()
	{
		isNotNull();
		if (actual.isGuaranteeDate()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be GuaranteeDate\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isGuaranteeDateMandatory()
	{
		isNotNull();
		if (!actual.isGuaranteeDateMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be GuaranteeDateMandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotGuaranteeDateMandatory()
	{
		isNotNull();
		if (actual.isGuaranteeDateMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be GuaranteeDateMandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isInstanceAttribute()
	{
		isNotNull();
		if (!actual.isInstanceAttribute()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be InstanceAttribute\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotInstanceAttribute()
	{
		isNotNull();
		if (actual.isInstanceAttribute()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be InstanceAttribute\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isLot()
	{
		isNotNull();
		if (!actual.isLot()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be Lot\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotLot()
	{
		isNotNull();
		if (actual.isLot()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be Lot\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isLotMandatory()
	{
		isNotNull();
		if (!actual.isLotMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be LotMandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotLotMandatory()
	{
		isNotNull();
		if (actual.isLotMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be LotMandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSerNo()
	{
		isNotNull();
		if (!actual.isSerNo()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SerNo\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSerNo()
	{
		isNotNull();
		if (actual.isSerNo()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SerNo\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSerNoMandatory()
	{
		isNotNull();
		if (!actual.isSerNoMandatory()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SerNoMandatory\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSerNoMandatory()
	{
		isNotNull();
		if (actual.isSerNoMandatory()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SerNoMandatory\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLotCharEOverwrite(String expected)
	{
		isNotNull();
		String actualField = actual.getLotCharEOverwrite();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LotCharEOverwrite: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLotCharSOverwrite(String expected)
	{
		isNotNull();
		String actualField = actual.getLotCharSOverwrite();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LotCharSOverwrite: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_AttributeSet_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_AttributeSet_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_AttributeSet_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_AttributeSet_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getM_AttributeSet_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_AttributeSet_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_LotCtl_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_LotCtl_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_LotCtl_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasM_SerNoCtl_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getM_SerNoCtl_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have M_SerNoCtl_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasMandatoryType(String expected)
	{
		isNotNull();
		String actualField = actual.getMandatoryType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MandatoryType: <%s>\nbut it was: <%s>",
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

	public SELF hasSerNoCharEOverwrite(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNoCharEOverwrite();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SerNoCharEOverwrite: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSerNoCharSOverwrite(String expected)
	{
		isNotNull();
		String actualField = actual.getSerNoCharSOverwrite();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SerNoCharSOverwrite: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isUseGuaranteeDateForMPolicy()
	{
		isNotNull();
		if (!actual.isUseGuaranteeDateForMPolicy()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be UseGuaranteeDateForMPolicy\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotUseGuaranteeDateForMPolicy()
	{
		isNotNull();
		if (actual.isUseGuaranteeDateForMPolicy()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be UseGuaranteeDateForMPolicy\nbut it was",
				getPODescription());
		}
		return myself;
	}
}