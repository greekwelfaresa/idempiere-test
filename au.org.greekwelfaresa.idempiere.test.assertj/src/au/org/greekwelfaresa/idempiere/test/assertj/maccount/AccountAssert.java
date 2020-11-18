package au.org.greekwelfaresa.idempiere.test.assertj.maccount;

import org.compiere.model.MAccount;

public class AccountAssert extends AbstractAccountAssert<AccountAssert, MAccount> {
	public AccountAssert(MAccount actual) {
		super(actual, AccountAssert.class);
	}
}
