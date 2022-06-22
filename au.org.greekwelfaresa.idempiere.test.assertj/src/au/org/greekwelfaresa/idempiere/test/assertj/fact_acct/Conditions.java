package au.org.greekwelfaresa.idempiere.test.assertj.fact_acct;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;

import org.assertj.core.api.Condition;
import org.compiere.model.I_C_BPartner;
import org.compiere.model.I_C_ElementValue;
import org.compiere.model.I_M_Product;
import org.compiere.model.MFactAcct;

public class Conditions {

	public static Condition<MFactAcct> cr(String amt) {
		return cr(new BigDecimal(amt));
	}

	public static Condition<MFactAcct> cr(BigDecimal amt) {
		return new Condition<MFactAcct>("Credit amount: " + amt) {
			@Override
			public boolean matches(MFactAcct value) {
				if (value == null) {
					return false;
				}
				final BigDecimal bd = value.getAmtAcctCr();
				final BigDecimal comp = amt.setScale(bd.scale(), RoundingMode.HALF_UP);
				return bd.equals(comp);
			}
	
		};
	}

	public static Condition<MFactAcct> dr(String amt) {
		return dr(new BigDecimal(amt));
	}

	public static Condition<MFactAcct> dr(BigDecimal amt) {
		return new Condition<MFactAcct>("Debit amount: " + amt) {
			@Override
			public boolean matches(MFactAcct value) {
				if (value == null) {
					return false;
				}
				final BigDecimal bd = value.getAmtAcctDr();
				final BigDecimal comp = amt.setScale(bd.scale(), RoundingMode.HALF_UP);
				return bd.equals(comp);
			}
		};
	}

	public static Condition<MFactAcct> account(I_C_ElementValue acct) {
		return new Condition<MFactAcct>("Account: " + acct) {
			@Override
			public boolean matches(MFactAcct value) {
				return value != null && value.getMAccount().getAccount_ID() == acct.getC_ElementValue_ID();
			}

		};
	}

	public static Condition<MFactAcct> bp(I_C_BPartner bp) {
		return new Condition<MFactAcct>("BP: " + bp) {
			@Override
			public boolean matches(MFactAcct value) {
				return value != null
						&& value.getMAccount().getC_BPartner_ID() == (bp == null ? 0 : bp.getC_BPartner_ID());
			}
		};
	}

	public static Condition<MFactAcct> product(I_M_Product product) {
		return new Condition<MFactAcct>("Product: " + product) {
			@Override
			public boolean matches(MFactAcct value) {
				return value != null
						&& value.getMAccount().getM_Product_ID() == (product == null ? 0 : product.getM_Product_ID());
			}
		};
	}

	public static Condition<MFactAcct> dateAcct(Timestamp date) {
		return new Condition<MFactAcct>("DateAcct: " + date) {
			@Override
			public boolean matches(MFactAcct value) {
				return value != null
						&& value.getDateAcct().equals(date);
			}
		};
	}
}
