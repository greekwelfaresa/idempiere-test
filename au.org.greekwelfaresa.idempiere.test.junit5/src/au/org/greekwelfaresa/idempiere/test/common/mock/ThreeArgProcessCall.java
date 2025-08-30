package au.org.greekwelfaresa.idempiere.test.common.mock;

import org.adempiere.util.IProcessUI;
import org.compiere.process.ProcessCall;

/**
 * ProcessCall interface for mocks that allows you to use a lambda.
 */
@FunctionalInterface
public interface ThreeArgProcessCall extends ProcessCall {

	@Override
	default void setProcessUI(IProcessUI procUI) {
		throw new IllegalStateException("Should not be called");
	}
}
