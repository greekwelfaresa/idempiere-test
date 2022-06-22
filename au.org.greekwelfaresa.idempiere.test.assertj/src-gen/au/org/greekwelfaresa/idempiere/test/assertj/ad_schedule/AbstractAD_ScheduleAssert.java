/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_schedule;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_Schedule;

/** Generated assertion class for AD_Schedule
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_ScheduleAssert<SELF extends AbstractAD_ScheduleAssert<SELF, ACTUAL>, ACTUAL extends X_AD_Schedule>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_ScheduleAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_Schedule_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_Schedule_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Schedule_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Schedule_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_Schedule_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_Schedule_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCronPattern(String expected)
	{
		isNotNull();
		String actualField = actual.getCronPattern();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CronPattern: <%s>\nbut it was: <%s>",
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

	public SELF hasFrequency(int expected)
	{
		isNotNull();
		int actualField = actual.getFrequency();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Frequency: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasFrequencyType(String expected)
	{
		isNotNull();
		String actualField = actual.getFrequencyType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have FrequencyType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isIgnoreProcessingTime()
	{
		isNotNull();
		if (!actual.isIgnoreProcessingTime()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be IgnoreProcessingTime\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotIgnoreProcessingTime()
	{
		isNotNull();
		if (actual.isIgnoreProcessingTime()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be IgnoreProcessingTime\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isSystemSchedule()
	{
		isNotNull();
		if (!actual.isSystemSchedule()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be SystemSchedule\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotSystemSchedule()
	{
		isNotNull();
		if (actual.isSystemSchedule()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be SystemSchedule\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasMonthDay(int expected)
	{
		isNotNull();
		int actualField = actual.getMonthDay();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have MonthDay: <%s>\nbut it was: <%s>",
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

	public SELF hasRunOnlyOnIP(String expected)
	{
		isNotNull();
		String actualField = actual.getRunOnlyOnIP();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have RunOnlyOnIP: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasScheduleType(String expected)
	{
		isNotNull();
		String actualField = actual.getScheduleType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ScheduleType: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasWeekDay(String expected)
	{
		isNotNull();
		String actualField = actual.getWeekDay();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have WeekDay: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}