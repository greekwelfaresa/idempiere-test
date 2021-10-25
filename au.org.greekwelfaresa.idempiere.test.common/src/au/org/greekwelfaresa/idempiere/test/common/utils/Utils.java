package au.org.greekwelfaresa.idempiere.test.common.utils;

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
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.compiere.Adempiere;
import org.compiere.model.ServerStateChangeEvent;
import org.compiere.model.ServerStateChangeListener;
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

	public static void waitForAdempiereStart() {
		CountDownLatch flag = new CountDownLatch(1);
		synchronized (Adempiere.class) {
			if (Adempiere.isStarted()) {
				return;
			} else {
				// Can't reference "this" from within a lamda expression - that's why this is an
				// anonymous inner class instead.
				final ServerStateChangeListener l = new ServerStateChangeListener() {
					@Override
					public void stateChange(ServerStateChangeEvent event) {
						if (event.getEventType() == ServerStateChangeEvent.SERVER_START) {
							flag.countDown();
							Adempiere.removeServerStateChangeListener(this);
						}
					}
				};
				Adempiere.addServerStateChangeListener(l);
			}
		}
		try {
			if (!flag.await(30, TimeUnit.SECONDS)) {
				throw new IllegalStateException("iDempiere still not started after 30s");
			}
		} catch (InterruptedException e) {
			throw new IllegalStateException("Interrupted while for iDempiere to start", e);
		}
	}

	public static CLogger injectMockLog(Object object) {
		CLogger orig = getField(object, "log");
		CLogger mockLog = spy(orig);
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

	@SuppressWarnings("unchecked")
	public static <R> R invoke(Object object, String method) {
		if (object == null) {
			throw new NullPointerException("object is null");
		}
		try {
			Method m = object.getClass().getDeclaredMethod(method);
			m.setAccessible(true);
			return (R) m.invoke(object);
		} catch (InvocationTargetException e) {
			throw Exceptions.duck(e.getTargetException());
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
	}

	@SuppressWarnings("unchecked")
	public static <R> R invoke(Object object, String method, Class<?>[] parameterTypes, Object... args) {
		if (object == null) {
			throw new NullPointerException("object is null");
		}
		try {
			Method m = object.getClass().getDeclaredMethod(method, parameterTypes);
			m.setAccessible(true);
			return (R) m.invoke(object, args);
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

	public static final DateFormat FMT = new SimpleDateFormat(FORMAT1);
	public static final DateFormat DT_FMT = new DateFormat() {
		private static final long serialVersionUID = 1L;
		final SimpleDateFormat sdf2 = new SimpleDateFormat(FORMAT2);

		@Override
		public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
			throw new UnsupportedOperationException();
		}

		@Override
		public Date parse(String source, ParsePosition pos) {
			if (source.length() - pos.getIndex() == FORMAT1.length())
				return FMT.parse(source, pos);
			return sdf2.parse(source, pos);
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

	// The db backend does not preserve milliseconds. For exact comparisons,
	// therefore,
	// we need to truncate our timestamps to whole seconds.
	public static Timestamp today() {
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(System.currentTimeMillis());
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		return new Timestamp(c.getTimeInMillis());
	}
}
