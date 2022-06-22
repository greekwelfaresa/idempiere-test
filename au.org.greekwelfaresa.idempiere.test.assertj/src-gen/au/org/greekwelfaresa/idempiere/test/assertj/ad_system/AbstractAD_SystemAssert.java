/** Generated Assertion Class - DO NOT CHANGE */
package au.org.greekwelfaresa.idempiere.test.assertj.ad_system;

import au.org.greekwelfaresa.idempiere.test.assertj.po.AbstractPOAssert;
import java.util.Objects;
import javax.annotation.Generated;
import org.compiere.model.X_AD_System;

/** Generated assertion class for AD_System
 *  @author idempiere-test (generated) 
 *  @version Release 6.2 - $Id$ */
@Generated("class au.org.greekwelfaresa.idempiere.test.generator.ModelAssertionGenerator")
public abstract class AbstractAD_SystemAssert<SELF extends AbstractAD_SystemAssert<SELF, ACTUAL>, ACTUAL extends X_AD_System>
	extends AbstractPOAssert<SELF, ACTUAL>
{

    /** Standard Constructor */
    public AbstractAD_SystemAssert (ACTUAL actual, Class<SELF> selfType)
    {
      super (actual, selfType);
    }


	public SELF hasAD_System_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getAD_System_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_System_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_System_UU(String expected)
	{
		isNotNull();
		String actualField = actual.getAD_System_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have AD_System_UU: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasCustomPrefix(String expected)
	{
		isNotNull();
		String actualField = actual.getCustomPrefix();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have CustomPrefix: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDBAddress(String expected)
	{
		isNotNull();
		String actualField = actual.getDBAddress();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DBAddress: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasDBInstance(String expected)
	{
		isNotNull();
		String actualField = actual.getDBInstance();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have DBInstance: <%s>\nbut it was: <%s>",
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

	public SELF hasEncryptionKey(String expected)
	{
		isNotNull();
		String actualField = actual.getEncryptionKey();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have EncryptionKey: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasIDRangeEnd(Object expected)
	{
		isNotNull();
		bdAssert("IDRangeEnd", actual.getIDRangeEnd(), expected);
		return myself;
	}


	public SELF hasIDRangeStart(Object expected)
	{
		isNotNull();
		bdAssert("IDRangeStart", actual.getIDRangeStart(), expected);
		return myself;
	}


	public SELF hasInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Info: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF isAllowStatistics()
	{
		isNotNull();
		if (!actual.isAllowStatistics()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AllowStatistics\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAllowStatistics()
	{
		isNotNull();
		if (actual.isAllowStatistics()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AllowStatistics\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isAutoErrorReport()
	{
		isNotNull();
		if (!actual.isAutoErrorReport()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be AutoErrorReport\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotAutoErrorReport()
	{
		isNotNull();
		if (actual.isAutoErrorReport()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be AutoErrorReport\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFailOnBuildDiffer()
	{
		isNotNull();
		if (!actual.isFailOnBuildDiffer()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FailOnBuildDiffer\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFailOnBuildDiffer()
	{
		isNotNull();
		if (actual.isFailOnBuildDiffer()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FailOnBuildDiffer\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isFailOnMissingModelValidator()
	{
		isNotNull();
		if (!actual.isFailOnMissingModelValidator()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be FailOnMissingModelValidator\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotFailOnMissingModelValidator()
	{
		isNotNull();
		if (actual.isFailOnMissingModelValidator()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be FailOnMissingModelValidator\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF isJustMigrated()
	{
		isNotNull();
		if (!actual.isJustMigrated()) {
			failWithMessage("\nExpecting PO:\n  <%s>\nto be JustMigrated\nbut it was not",
				getPODescription());
		}
		return myself;
	}

	public SELF isNotJustMigrated()
	{
		isNotNull();
		if (actual.isJustMigrated()) {
			failWithMessage("\nExpecting PO: \n  <%s>\n to not be JustMigrated\nbut it was",
				getPODescription());
		}
		return myself;
	}

	public SELF hasLastBuildInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getLastBuildInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LastBuildInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLastMigrationScriptApplied(String expected)
	{
		isNotNull();
		String actualField = actual.getLastMigrationScriptApplied();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LastMigrationScriptApplied: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLDAPDomain(String expected)
	{
		isNotNull();
		String actualField = actual.getLDAPDomain();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LDAPDomain: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasLDAPHost(String expected)
	{
		isNotNull();
		String actualField = actual.getLDAPHost();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have LDAPHost: <%s>\nbut it was: <%s>",
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

	public SELF hasNoProcessors(int expected)
	{
		isNotNull();
		int actualField = actual.getNoProcessors();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have NoProcessors: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasOldName(String expected)
	{
		isNotNull();
		String actualField = actual.getOldName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have OldName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasPassword(String expected)
	{
		isNotNull();
		String actualField = actual.getPassword();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Password: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasProfileInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getProfileInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ProfileInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasRecord_ID(int expected)
	{
		isNotNull();
		int actualField = actual.getRecord_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Record_ID: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasReleaseNo(String expected)
	{
		isNotNull();
		String actualField = actual.getReleaseNo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have ReleaseNo: <%s>\nbut it was: <%s>",
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

	public SELF hasStatisticsInfo(String expected)
	{
		isNotNull();
		String actualField = actual.getStatisticsInfo();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have StatisticsInfo: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSummary(String expected)
	{
		isNotNull();
		String actualField = actual.getSummary();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Summary: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSupportEMail(String expected)
	{
		isNotNull();
		String actualField = actual.getSupportEMail();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SupportEMail: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSupportExpDate(Object expected)
	{
		isNotNull();
		dateAssert("SupportExpDate", actual.getSupportExpDate(), expected);
		return myself;
	}


	public SELF hasSupportUnits(int expected)
	{
		isNotNull();
		int actualField = actual.getSupportUnits();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SupportUnits: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasSystemStatus(String expected)
	{
		isNotNull();
		String actualField = actual.getSystemStatus();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have SystemStatus: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasUserName(String expected)
	{
		isNotNull();
		String actualField = actual.getUserName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have UserName: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}

	public SELF hasVersion(String expected)
	{
		isNotNull();
		String actualField = actual.getVersion();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected, "\nExpecting PO: \n  <%s>\n to have Version: <%s>\nbut it was: <%s>",
				getPODescription(), expected, actualField);
		}
		return myself;
	}
}