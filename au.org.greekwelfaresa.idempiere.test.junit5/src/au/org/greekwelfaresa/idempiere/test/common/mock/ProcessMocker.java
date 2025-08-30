package au.org.greekwelfaresa.idempiere.test.common.mock;

import java.util.Properties;

import org.adempiere.util.IProcessUI;
import org.compiere.process.ProcessCall;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Trx;

public interface ProcessMocker extends AutoCloseable {

	default ProcessCall mockProcess(String processName) {
		return mockProcess(processName, pi -> {
			pi.setError(false);
			pi.setSummary("@OK@");
			return true;
		});
	}

	default ProcessCall mockProcess(Class<? extends ProcessCall> process) {
		return mockProcess(process.getName());
	}

	default ProcessCall mockProcess(String processName, OneArgProcessCall procCall) {
		return mockProcess(processName, (ThreeArgProcessCall) procCall);
	}

	default ProcessCall mockProcess(String processName, TwoArgProcessCall procCall) {
		return mockProcess(processName, (ThreeArgProcessCall) procCall);
	}

	ProcessCall mockProcess(String processName, ThreeArgProcessCall procCall);

	default ProcessCall mockProcess(Class<? extends ProcessCall> process, OneArgProcessCall procCall) {
		return mockProcess(process, (ThreeArgProcessCall) procCall);
	}

	default ProcessCall mockProcess(Class<? extends ProcessCall> process, TwoArgProcessCall procCall) {
		return mockProcess(process, (ThreeArgProcessCall) procCall);
	}

	default ProcessCall mockProcess(Class<? extends ProcessCall> process, ThreeArgProcessCall procCall) {
		return mockProcess(process.getName(), procCall);
	}

	void unmockProcess(String processName);

	default void unmockProcess(Class<? extends ProcessCall> process) {
		unmockProcess(process.getName());
	}

	/**
	 * Calls the original (unmocked) service. Must be called from within the context of a mocked
	 * process call invocation.
	 * @param ctx
	 * @param pi
	 * @param trxName
	 * @return
	 */
	default boolean startProcess(Properties ctx, ProcessInfo pi, Trx trxName) {
		throw new UnsupportedOperationException("Extension does not implement calling real process");
	}
	
	default IProcessUI getProcessUI() {
		throw new UnsupportedOperationException("Extension does not implement calling real process");
	}
}
