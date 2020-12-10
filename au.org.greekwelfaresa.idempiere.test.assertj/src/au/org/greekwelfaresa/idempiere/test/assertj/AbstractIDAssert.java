package au.org.greekwelfaresa.idempiere.test.assertj;

import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.timestamp;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

import org.assertj.core.api.AbstractAssert;

public abstract class AbstractIDAssert<SELF extends AbstractIDAssert<SELF, ACTUAL>, ACTUAL>
		extends AbstractAssert<SELF, ACTUAL> {

	public static boolean exactlyEqual(BigDecimal num1, long num2) {
		try {
			return num1 != null && num2 == num1.longValueExact();
		} catch (ArithmeticException e) {
			return false;
		}
	}

	public AbstractIDAssert(ACTUAL actual, Class<SELF> selfType) {
		super(actual, selfType);
	}

	protected void dateAssert(String fieldName, Timestamp actualField, Object expected) {
		Timestamp expectedField;
		if (expected == null) {
			expectedField = null;
		} else if (expected instanceof String) {
			expectedField = timestamp((String)expected);
		} else if (expected instanceof Timestamp) {
			expectedField = (Timestamp)expected;
		} else {
			long millis;
			if (expected instanceof Instant) {
				millis = ((Instant) expected).toEpochMilli();
			} else if (expected instanceof Date) {
				millis = ((Date) expected).getTime();
			} else if (expected instanceof Number) {
				millis = ((Number) expected).longValue();
			} else {
				throw new IllegalArgumentException("expected was of an unsupported type: " + expected.getClass() + ", " + expected);
			}
			expectedField = new Timestamp(millis);
		}
		if (!Objects.equals(actualField, expectedField)) {
			failWithActualExpectedAndMessage(actualField, expectedField, "\nExpecting %s\n to have %s:\n <%s>\nbut it was:\n <%s>",
				getDescription(), fieldName, expectedField, actualField);
		}
	}

	abstract protected String getDescription();
	
	protected void bdAssert(String fieldName, BigDecimal actualField, Object expected) {
		BigDecimal expectedField = null;
		if (expected instanceof BigDecimal) {
			expectedField = (BigDecimal)expected;
		} else if (expected instanceof CharSequence) {
			expectedField = new BigDecimal(expected.toString());
		} else if (expected instanceof Long ||
				   expected instanceof Integer ||
				   expected instanceof Short ||
				   expected instanceof Byte) {
			if (actualField != null) {
				long expectedNum = ((Number)expected).longValue();
				try {
					if (expectedNum == actualField.longValueExact()) {
						return;
					}
				} catch (ArithmeticException e) {
					failWithActualExpectedAndMessage(actualField, expected, "\nExpecting %s\n to have %s:\n <%s>\nbut it was:\n <%s>\n" +
							"and could not be converted to a long",
							getDescription(), fieldName, expected, actualField);
				}
			}
			failWithActualExpectedAndMessage(expected, actualField, "\nExpecting %s\n to have %s: <%s>\nbut it was: <%s>",
					getDescription(), fieldName, expected, actualField);
		}
		if (actualField == null) {
			if (expectedField != null) {
				failWithActualExpectedAndMessage(actualField, expectedField, "\nExpecting %s\n to have %s: <%s>\nbut it was null",
						getDescription(), fieldName, expectedField);
			}
		} else if (actualField.compareTo(expectedField) != 0) {
			failWithActualExpectedAndMessage(actualField, expectedField, "\nExpecting %s\n to have %s: <%s>\nbut it was: <%s>",
				getDescription(), fieldName, expectedField, actualField);
		}
	}

}