package au.org.greekwelfaresa.idempiere.test.common.utils;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.adempiere.base.Core;
import org.compiere.util.CCache;
import org.compiere.util.CLogger;
import org.osgi.test.common.exceptions.Exceptions;

public class Utils {

	static final public BigDecimal BD_ZERO = BigDecimal.valueOf(0.0);
	static final public BigDecimal BD_ONE = BigDecimal.valueOf(1.0);
	static final public BigDecimal BD_TWO = BigDecimal.valueOf(2.0);
	static final public BigDecimal BD_TEN = BigDecimal.valueOf(10.0);
	static final public BigDecimal BD_THIRTYTHREE = BigDecimal.valueOf(33.0);
	static final public BigDecimal BD_FIFTY = BigDecimal.valueOf(50.0);
	static final public BigDecimal BD_ONEHUNDRED = BigDecimal.valueOf(100.0);
	static final public BigDecimal BD_TWOHUNDRED = BigDecimal.valueOf(200.0);

	public static Timestamp timestamp(String ts) {
		return parseTS(ts);
	}

	public static CLogger injectMockLog(Object object) {
//		CLogger orig = getField(object, "log");
//		CLogger mockLog = spy(orig);
		CLogger mockLog = mock(CLogger.class);
		try {
			setField(object, "log", mockLog);
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
		return mockLog;
	}

	public static CLogger injectStaticMockLog(Class<?> clazz) {
		CLogger mockLog = spy((CLogger) getStaticField(clazz, "s_log"));
		try {
			setStaticField(clazz, "s_log", mockLog);
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
		return mockLog;
	}

	public static void setField(Object o, String field, Object v) {
		Field f = getField(o.getClass(), field);
		f.setAccessible(true);
		try {
			f.set(o, v);
		} catch (IllegalAccessException e) {
			throw Exceptions.duck(e);
		}
	}

	public static void setStaticField(Class<?> clazz, String field, Object v) {
		Field f = getField(clazz, field);
		f.setAccessible(true);
		try {
			f.set(null, v);
		} catch (IllegalAccessException e) {
			throw Exceptions.duck(e);
		}
	}

	public static Field getField(Class<?> clazz, String fieldName) {
		try {
			return clazz.getDeclaredField(fieldName);
		} catch (NoSuchFieldException e) {
			Class<?> superClass = clazz.getSuperclass();
			if (superClass == null) {
				throw Exceptions.duck(e);
			} else {
				return getField(superClass, fieldName);
			}
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T getField(Object o, String fieldName) {
		Field f = getField(o.getClass(), fieldName);
		f.setAccessible(true);
		try {
			return (T) f.get(o);
		} catch (IllegalAccessException e) {
			throw Exceptions.duck(e);
		}
	}

	@SuppressWarnings("unchecked")
	public static <T> T getStaticField(Class<?> clazz, String fieldName) {
		Field f = getField(clazz, fieldName);
		f.setAccessible(true);
		try {
			return (T) f.get(null);
		} catch (IllegalAccessException e) {
			throw Exceptions.duck(e);
		}
	}

	public static <R> R invoke(Object object, String method) {
		if (object == null) {
			throw new NullPointerException("object is null");
		}
		return invoke(object.getClass(), object, method);
	}

	@SuppressWarnings("unchecked")
	public static <R> R invoke(Class<?> c, Object object, String method) {
		if (object == null) {
			throw new NullPointerException("object is null");
		}
		try {
			try {
				Method m = c.getDeclaredMethod(method);
				m.setAccessible(true);
				return (R) m.invoke(object);
			} catch (NoSuchMethodException e) {
				if (c == Object.class) {
					throw Exceptions.duck(e);
				}
				return invoke(c.getSuperclass(), object, method);
			}
		} catch (InvocationTargetException e) {
			throw Exceptions.duck(e.getTargetException());
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
	}

	public static <R> R invoke(Object object, String method, Class<?>[] parameterTypes, Object... args) {
		if (object == null) {
			throw new NullPointerException("object is null");
		}
		return invoke(object.getClass(), object, method, parameterTypes, args);
	}

	@SuppressWarnings("unchecked")
	public static <R> R invoke(Class<?> c, Object object, String method, Class<?>[] parameterTypes, Object... args) {
		if (object == null) {
			throw new NullPointerException("object is null");
		}
		try {
			try {
				Method m = c.getDeclaredMethod(method, parameterTypes);
				m.setAccessible(true);
				return (R) m.invoke(object, args);
			} catch (NoSuchMethodException e) {
				if (c == Object.class) {
					throw Exceptions.duck(e);
				}
				return invoke(c.getSuperclass(), object, method, parameterTypes, args);
			}
		} catch (InvocationTargetException e) {
			throw Exceptions.duck(e.getTargetException());
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
	}

	@SuppressWarnings("unchecked")
	public static <R> R invokeStatic(Class<?> clazz, String method, Class<?>[] parameterTypes, Object... args) {
		if (clazz == null) {
			throw new NullPointerException("clazz is null");
		}
		try {
			if (parameterTypes == null) {
				parameterTypes = new Class<?>[0];
			}
			Method m = clazz.getDeclaredMethod(method, parameterTypes);
			m.setAccessible(true);
			return (R) m.invoke(null, args);
		} catch (InvocationTargetException e) {
			throw Exceptions.duck(e.getTargetException());
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
	}

	// Convenience method to turn human-readable string into seconds past epoch.
	public static long parseDateTimeLong(String ts) {
		try {
			return DT_FMT.parse(ts).getTime();
		} catch (ParseException e) {
			throw Exceptions.duck(e);
		}
	}

	public static Timestamp parseDateTime(String ts) {
		return ts == null ? null : new Timestamp(parseDateTimeLong(ts));
	}

	// Convenience method to turn human-readable string into seconds past epoch.
	public static long parseTSLong(String ts) {
		// FMT.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			return FMT.parse(ts).getTime();
		} catch (ParseException e) {
			throw Exceptions.duck(e);
		}
	}

	static final String FORMAT1 = "yyyy-MM-dd";
	static final String FORMAT2 = "yyyy-MM-dd HH:mm";
	static final String FORMAT3 = "yyyy-MM-dd HH:mm:ss";
	static final SimpleDateFormat SDF2 = new SimpleDateFormat(FORMAT2);
	static final SimpleDateFormat SDF3 = new SimpleDateFormat(FORMAT3);

	public static final DateFormat FMT = new SimpleDateFormat(FORMAT1);
	public static final DateFormat DT_FMT = new DateFormat() {
		private static final long serialVersionUID = 1L;

		@Override
		public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
			throw new UnsupportedOperationException();
		}

		@Override
		public Date parse(String source, ParsePosition pos) {
			final int length = source.length() - pos.getIndex();
			if (length == FORMAT1.length()) {
				return FMT.parse(source, pos);
			}
			if (length == FORMAT2.length()) {
				return SDF2.parse(source, pos);
			}
			return SDF3.parse(source, pos);
		}
	};

	public static Timestamp parseTS(String ts) {
		return ts == null ? null : new Timestamp(parseTSLong(ts));
	}

	// iDempiere doesn't store milliseconds, so for our assertion to work we need
	// to truncate our timestamp.
	public static final Timestamp truncTS(long millis) {
		long trunc = millis / 1000;
		return new Timestamp(trunc * 1000);
	}

	public static Timestamp datePart(Date date) {
		return datePart(date.getTime());
	}

	// Some db backend fields do not preserve the time part. For exact comparisons,
	// therefore, we need to truncate our timestamps to whole days.
	public static Timestamp datePart(long milliseconds) {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(milliseconds);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Timestamp(c.getTimeInMillis());
	}

	// The db backend does not preserve milliseconds. For exact comparisons,
	// therefore,
	// we need to truncate our timestamps to whole seconds.
	public static Timestamp today() {
		return datePart(System.currentTimeMillis());
	}

	public static void clearProcessCache() {
		try {
			// Clear the cache so that our new process factory gets used
			Field cacheField = Core.class.getDeclaredField("s_processFactoryCache");
			cacheField.setAccessible(true);
			CCache<?, ?> cache = (CCache<?, ?>) cacheField.get(null);
			cache.clear();
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
	}
}
