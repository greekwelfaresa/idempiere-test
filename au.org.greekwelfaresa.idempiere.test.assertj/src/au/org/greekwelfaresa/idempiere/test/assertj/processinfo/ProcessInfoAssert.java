package au.org.greekwelfaresa.idempiere.test.assertj.processinfo;

import org.compiere.process.ProcessInfo;

public class ProcessInfoAssert
	extends AbstractProcessInfoAssert<ProcessInfoAssert, ProcessInfo> {

	public ProcessInfoAssert(ProcessInfo actual) {
		super(actual, ProcessInfoAssert.class);
	}
}
