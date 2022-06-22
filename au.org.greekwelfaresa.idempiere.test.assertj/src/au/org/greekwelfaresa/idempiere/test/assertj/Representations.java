package au.org.greekwelfaresa.idempiere.test.assertj;

import java.util.HashSet;
import java.util.Set;

import org.assertj.core.presentation.Representation;
import org.assertj.core.presentation.StandardRepresentation;
import org.compiere.model.MAccount;
import org.compiere.model.MFactAcct;
import org.compiere.util.DB;

public final class Representations {
	private Representations() {
	}

	public static final Representation FACT_ACCT = new StandardRepresentation() {
		@Override
		public String toStringOf(Object object) {
			if (object instanceof MFactAcct) {
				MFactAcct fact = (MFactAcct) object;
				return "[" + fact.get_ID() + "-Dr=" + fact.getAmtSourceDr() + "|" + fact.getAmtAcctDr() + ",Cr="
						+ fact.getAmtSourceCr() + "|" + fact.getAmtAcctCr() + "," + fact.getMAccount() + "]";
			}
			return super.toStringOf(object);
		}
	};

	public static Representation factAcct(String... dimensions) {
		final Set<String> set = new HashSet<>();

		for (String dim : dimensions) {
			set.add(dim);
		}
		return factAcct(set);
	}

	public static Representation validCombination(Set<String> dimension) {

		return new StandardRepresentation() {
			@Override
			public String toStringOf(Object object) {
				if (object instanceof MAccount) {
					MAccount acct = (MAccount) object;
					final StringBuilder sb = new StringBuilder();
					sb.append('[').append(acct.get_ID());

					if (dimension.contains("Schema")) {
						sb.append(",Schema=").append(acct.getC_AcctSchema_ID());
					}
					if (dimension.contains("Org")) {
						sb.append(",Org=").append(acct.getAD_Org_ID());
					}
					if (dimension.contains("Acct")) {
						sb.append(",Acct=")
								.append(DB.getSQLValueString(acct.get_TrxName(),
										"SELECT Name from C_ElementValue WHERE C_ElementValue_ID=?",
										acct.getAccount_ID()));
					}
					if (dimension.contains("SubAcct")) {
						sb.append(",SubAcct=")
								.append(DB.getSQLValueString(acct.get_TrxName(),
										"SELECT Name from C_SubAcct WHERE C_SubAcct_ID=?", acct.getC_SubAcct_ID()));
					}
					if (dimension.contains("Product")) {
						sb.append(",Product=")
								.append(DB.getSQLValueString(acct.get_TrxName(),
										"SELECT Name from M_Product WHERE M_Product_ID=?", acct.getM_Product_ID()));
					}
					if (dimension.contains("BP")) {
						sb.append(",BP=")
								.append(DB.getSQLValueString(acct.get_TrxName(),
										"SELECT Name from C_BPartner WHERE C_BPartner_ID=?", acct.getC_BPartner_ID()));
					}
//			if (getAD_OrgTrx_ID() != 0)
//				sb.append(",AD_OrgTrx_ID=").append(getAD_OrgTrx_ID());
//			if (getC_LocFrom_ID() != 0)
//				sb.append(",C_LocFrom_ID=").append(getC_LocFrom_ID());
//			if (getC_LocTo_ID() != 0)
//				sb.append(",C_LocTo_ID=").append(getC_LocTo_ID());
//			if (getC_SalesRegion_ID() != 0)
//				sb.append(",C_SalesRegion_ID=").append(getC_SalesRegion_ID());
//			if (getC_Project_ID() != 0)
//				sb.append(",C_Project_ID=").append(getC_Project_ID());
//			if (getC_Campaign_ID() != 0)
//				sb.append(",C_Campaign_ID=").append(getC_Campaign_ID());
//			if (getC_Activity_ID() != 0)
//				sb.append(",C_Activity_ID=").append(getC_Activity_ID());
//			if (getUser1_ID() != 0)
//				sb.append(",User1_ID=").append(getUser1_ID());
//			if (getUser2_ID() != 0)
//				sb.append(",User2_ID=").append(getUser2_ID());
//			if (getUserElement1_ID() != 0)
//				sb.append(",UserElement1_ID=").append(getUserElement1_ID());
//			if (getUserElement2_ID() != 0)
//				sb.append(",UserElement2_ID=").append(getUserElement2_ID());
//
//				account  account, boolean bpartner, )

					return sb.append(']').toString();
				}
				return super.toStringOf(object);
			}
		};
	}

	public static Representation factAcct(Set<String> dimensions) {

		final Representation vc = validCombination(dimensions);

		return new StandardRepresentation() {
			@Override
			public String toStringOf(Object object) {
				if (object instanceof MFactAcct) {
					MFactAcct fact = (MFactAcct) object;
					return "[" + fact.get_ID() + "-Dr=" + fact.getAmtSourceDr() + "|" + fact.getAmtAcctDr() + ",Cr="
							+ fact.getAmtSourceCr() + "|" + fact.getAmtAcctCr() + ",Qty=" + fact.getQty() + ","
							+ vc.toStringOf(fact.getMAccount()) + "]";
				}
				return super.toStringOf(object);
			}
		};
	}
}
