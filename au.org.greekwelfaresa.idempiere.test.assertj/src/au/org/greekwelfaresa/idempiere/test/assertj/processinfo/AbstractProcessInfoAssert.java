package au.org.greekwelfaresa.idempiere.test.assertj.processinfo;

import java.io.File;
import java.util.Objects;

import org.adempiere.util.IProcessUI;
import org.compiere.model.MTable;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.util.Env;

import au.org.greekwelfaresa.idempiere.test.assertj.AbstractIDAssert;

public abstract class AbstractProcessInfoAssert<SELF extends AbstractProcessInfoAssert<SELF, ACTUAL>, ACTUAL extends ProcessInfo>
		extends AbstractIDAssert<SELF, ACTUAL> {

	public AbstractProcessInfoAssert(ACTUAL actual, Class<SELF> selfType) {
		super(actual, selfType);
	}

	protected String getDescription() {
		return "ProcessInfo";
	}

	public SELF hasTable_ID(int expected) {
		isNotNull();
		int actualField = actual.getTable_ID();
		if (actualField != expected) {
			MTable expectedTable = MTable.get(Env.getCtx(), expected);
			if (expectedTable == null || expectedTable.is_new()) {
				throw new IllegalArgumentException("Unknown table ID: " + expected);
			}
			MTable actualTable = MTable.get(Env.getCtx(), actualField);

			failWithActualExpectedAndMessage(actualTable.getName(), expectedTable.getName(),
					"\nExpecting process info for table\n <%s>\nbut it was for <%s>", expectedTable.getName(),
					actualTable.getName());
		}
		return myself;
	}

	public SELF hasLanguageID(int expected) {
		isNotNull();
		int actualField = actual.getLanguageID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo:\n to have LanguageID: <%d>\nbut it was: <%d>", expected, actualField);
		}
		return myself;
	}

	public SELF hasTransactionName(String expected) {
		String actualField = actual.getTransactionName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have trx\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF hasReportType(String expected) {
		String actualField = actual.getReportType();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have ReportType\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF isSummary() {
		isNotNull();
		if (!actual.isSummary()) {
			failWithMessage("\nExpecting ProcessInfo to be Summary\nbut it was not");
		}
		return myself;
	}

	public SELF isNotSummary() {
		isNotNull();
		if (actual.isSummary()) {
			failWithMessage("\nExpecting ProcessInfo to not be Summary\nbut it was");
		}
		return myself;
	}

	public SELF hasSummary(String expected) {
		String actualField = actual.getSummary();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have Summary\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF isError() {
		isNotNull();
		if (!actual.isError()) {
			failWithMessage("\nExpecting ProcessInfo to be Error\nbut it was not");
		}
		return myself;
	}

	public SELF isNotError() {
		isNotNull();
		if (actual.isError()) {
			failWithMessage("\nExpecting ProcessInfo to not be Error\nbut it was");
		}
		return myself;
	}

	public SELF isBatch() {
		isNotNull();
		if (!actual.isBatch()) {
			failWithMessage("\nExpecting ProcessInfo to be Batch\nbut it was not");
		}
		return myself;
	}

	public SELF isNotBatch() {
		isNotNull();
		if (actual.isBatch()) {
			failWithMessage("\nExpecting ProcessInfo to not be Batch\nbut it was");
		}
		return myself;
	}

	public SELF isTimeout() {
		isNotNull();
		if (!actual.isTimeout()) {
			failWithMessage("\nExpecting ProcessInfo to be Timeout\nbut it was not");
		}
		return myself;
	}

	public SELF isNotTimeout() {
		isNotNull();
		if (actual.isTimeout()) {
			failWithMessage("\nExpecting ProcessInfo to not be Timeout\nbut it was");
		}
		return myself;
	}

	public SELF hasAD_PInstance_ID(int expected) {
		isNotNull();
		int actualField = actual.getAD_PInstance_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo:\n to have AD_PInstance_ID: <%d>\nbut it was: <%d>", expected,
					actualField);
		}
		return myself;
	}

	public SELF hasAD_InfoWindow_ID(int expected) {
		isNotNull();
		int actualField = actual.getAD_InfoWindow_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo:\n to have AD_InfoWindow_ID: <%d>\nbut it was: <%d>", expected,
					actualField);
		}
		return myself;
	}

	public SELF hasAD_Process_ID(int expected) {
		isNotNull();
		int actualField = actual.getAD_Process_ID();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo:\n to have AD_Process_ID: <%d>\nbut it was: <%d>", expected, actualField);
		}
		return myself;
	}

	public SELF hasClassName(String expected) {
		String actualField = actual.getClassName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have ClassName\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF hasEstSeconds(int expected) {
		isNotNull();
		int actualField = actual.getEstSeconds();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo:\n to have EstSeconds: <%d>\nbut it was: <%d>", expected, actualField);
		}
		return myself;
	}

	public SELF hasTitle(String expected) {
		String actualField = actual.getTitle();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have Title\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_Client_ID(Integer expected) {
		isNotNull();
		Integer actualField = actual.getAD_Client_ID();
		if (!Objects.equals(actualField, expected)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo:\n to have AD_Client_ID: <%s>\nbut it was: <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF hasAD_User_ID(Integer expected) {
		isNotNull();
		Integer actualField = actual.getAD_User_ID();
		if (!Objects.equals(actualField, expected)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo:\n to have AD_User_ID: <%s>\nbut it was: <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF hasProcessParameter(String parameterName, Object expected) {
		isNotNull();
		for (ProcessInfoParameter param : actual.getParameter()) {
			if (parameterName.equals(param.getParameterName())) {
				Object actualParameter = param.getParameter();
				if (!Objects.equals(expected, actualParameter)) {
					failWithActualExpectedAndMessage(actualParameter, expected,
							"\nExpecting ProcessInfo\nto have parameter <%s>\nwith value\n <%s>\nbut it was\n <%s>",
							parameterName, expected, actualParameter);
					return myself;
				}
			}
		}
		failWithMessage(
				"\nExpecting ProcessInfo\nto have parameter <%s>\nwith value\n <%s>\nbut there was no parameter with that name",
				parameterName, expected);
		return myself;
	}

	public SELF hasProcessParameterRange(String parameterName, Object expected, Object expectedTo) {
		isNotNull();
		for (ProcessInfoParameter param : actual.getParameter()) {
			if (parameterName.equals(param.getParameterName())) {
				Object actualParameter = param.getParameter();
				Object actualParameterTo = param.getParameter_To();
				if (!Objects.equals(expected, actualParameter) || !Objects.equals(actualParameterTo, expectedTo)) {
					failWithActualExpectedAndMessage(actualParameter, expected,
							"\nExpecting ProcessInfo\nto have parameter <%s>\nwith value range\n <%s> to <%s>\nbut it was\n <%s> to <%s>",
							parameterName, expected, expectedTo, actualParameter, actualParameterTo);
					return myself;
				}
			}
		}
		failWithMessage(
				"\nExpecting ProcessInfo\nto have parameter <%s>\nwith value range\n <%s> to <%s>\nbut there was no parameter with that name",
				parameterName, expected, expectedTo);
		return myself;
	}

	public SELF hasAD_Process_UU(String expected) {
		String actualField = actual.getAD_Process_UU();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have AD_Process_UU\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF isPrintPreview() {
		isNotNull();
		if (!actual.isPrintPreview()) {
			failWithMessage("\nExpecting ProcessInfo to be PrintPreview\nbut it was not");
		}
		return myself;
	}

	public SELF isNotPrintPreview() {
		isNotNull();
		if (actual.isPrintPreview()) {
			failWithMessage("\nExpecting ProcessInfo to not be PrintPreview\nbut it was");
		}
		return myself;
	}

	public SELF isReportingProcess() {
		isNotNull();
		if (!actual.isReportingProcess()) {
			failWithMessage("\nExpecting ProcessInfo to be ReportingProcess\nbut it was not");
		}
		return myself;
	}

	public SELF isNotReportingProcess() {
		isNotNull();
		if (actual.isReportingProcess()) {
			failWithMessage("\nExpecting ProcessInfo to not be ReportingProcess\nbut it was");
		}
		return myself;
	}

	public SELF hasPDFReport(File expected) {
		File actualField = actual.getPDFReport();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have PDFReport\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF isExport() {
		isNotNull();
		if (!actual.isExport()) {
			failWithMessage("\nExpecting ProcessInfo to be Export\nbut it was not");
		}
		return myself;
	}

	public SELF isNotExport() {
		isNotNull();
		if (actual.isExport()) {
			failWithMessage("\nExpecting ProcessInfo to not be Export\nbut it was");
		}
		return myself;
	}

	public SELF hasExportFileExtension(String expected) {
		String actualField = actual.getExportFileExtension();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have ExportFileExtension\n <%s>\nbut it was\n <%s>", expected,
					actualField);
		}
		return myself;
	}

	public SELF hasExportFile(File expected) {
		File actualField = actual.getExportFile();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have ExportFile\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF hasRowCount(int expected) {
		isNotNull();
		int actualField = actual.getRowCount();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have RowCount: <%d>\nbut it was: <%d>", expected, actualField);
		}
		return myself;
	}

	public SELF hasPDFFileName(String expected) {
		String actualField = actual.getPDFFileName();
		if (!Objects.equals(expected, actualField)) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have ExportFile\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF hasProcessUI(IProcessUI expected) {
		IProcessUI actualField = actual.getProcessUI();
		if (expected != actualField) {
			failWithActualExpectedAndMessage(actualField, expected,
					"\nExpecting ProcessInfo\nto have ProcessUI\n <%s>\nbut it was\n <%s>", expected, actualField);
		}
		return myself;
	}

	public SELF hasRecord_ID(int expected) {
		isNotNull();
		int actualID = actual.getRecord_ID();
		if (actualID != expected) {
			failWithActualExpectedAndMessage(actualID, expected,
					"\nExpecting ProcessInfo to have Record_ID: <%d>\nbut it was: <%d>", expected, actualID);
		}
		return myself;
	}
}
