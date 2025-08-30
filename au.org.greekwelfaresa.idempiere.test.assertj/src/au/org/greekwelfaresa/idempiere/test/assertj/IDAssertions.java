package au.org.greekwelfaresa.idempiere.test.assertj;

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

public class IDAssertions {
	private IDAssertions() {}

	public static POAssert assertThat(PO a) {
		return new POAssert(a);
	}

	public static ProcessInfoLogAssert assertThat(ProcessInfoLog a) {
		return new ProcessInfoLogAssert(a);
	}

	public static BankStatementMatchInfoAssert assertThat(BankStatementMatchInfo a) {
		return new BankStatementMatchInfoAssert(a);
	}

	public static ProcessInfoAssert assertThat(ProcessInfo a) {
		return new ProcessInfoAssert(a);
	}

	public static AccountAssert assertThat(MAccount a) {
		return new AccountAssert(a);
	}
}