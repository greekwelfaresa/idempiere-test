package au.org.greekwelfaresa.idempiere.test.common.mock;

import java.util.Properties;

import org.compiere.process.ProcessInfo;
import org.compiere.util.Trx;

public interface MockInvocationContext {

	boolean invokeRealProcess(Properties ctx, ProcessInfo info, Trx trx);
	
}
