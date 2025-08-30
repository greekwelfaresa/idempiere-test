package au.org.greekwelfaresa.idempiere.test.assertj;

import org.assertj.core.api.SoftAssertionsProvider;
import org.compiere.impexp.BankStatementMatchInfo;
import org.compiere.model.MAccount;
import org.compiere.model.PO;
import org.compiere.process.ProcessInfo;
import org.compiere.process.ProcessInfoLog;

import au.org.greekwelfaresa.idempiere.test.assertj.bankstatementmatchinfo.BankStatementMatchInfoAssert;
import au.org.greekwelfaresa.idempiere.test.assertj.maccount.AccountAssert;
import au.org.greekwelfaresa.idempiere.test.assertj.po.POAssert;
import au.org.greekwelfaresa.idempiere.test.assertj.processinfo.ProcessInfoAssert;
import au.org.greekwelfaresa.idempiere.test.assertj.processinfolog.ProcessInfoLogAssert;

public interface IDSoftAssertionsProvider extends SoftAssertionsProvider {
	default POAssert assertThat(PO a) {
		return proxy(POAssert.class, PO.class, a);
	}

	default ProcessInfoLogAssert assertThat(ProcessInfoLog a) {
		return proxy(ProcessInfoLogAssert.class, ProcessInfoLog.class, a);
	}

	default BankStatementMatchInfoAssert assertThat(BankStatementMatchInfo a) {
		return proxy(BankStatementMatchInfoAssert.class, BankStatementMatchInfo.class, a);
	}
	
	default ProcessInfoAssert assertThat(ProcessInfo a) {
		return proxy(ProcessInfoAssert.class, ProcessInfo.class, a);
	}

	default AccountAssert assertThat(MAccount a) {
		return proxy(AccountAssert.class, MAccount.class, a);
	}
}