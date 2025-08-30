package au.org.greekwelfaresa.idempiere.test.common.mock;

import java.util.Properties;

import org.compiere.process.ProcessInfo;
import org.compiere.util.Trx;

/**
 * ProcessCall interface for mocks that allows you to use a lambda.
 */
@FunctionalInterface
public interface OneArgProcessCall extends ThreeArgProcessCall {

	boolean startProcess(ProcessInfo pi);
	
	@Override
	default boolean startProcess(Properties ctx, ProcessInfo pi, Trx trx) {
		return startProcess(pi);
	}
}
