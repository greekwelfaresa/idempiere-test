package au.org.greekwelfaresa.idempiere.test.common.utils;

import static org.mockito.Mockito.mock;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		CLogger mockLog = mock(CLogger.class);
		try {
			setField(object, "log", mockLog);
		} catch (Exception e) {
			throw Exceptions.duck(e);
		}
		return mockLog;
	}
	

	public static CLogger injectStaticMockLog(Class<?> clazz) {
		CLogger mockLog = mock(CLogger.class);
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
			return (T)f.get(o);
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
			return (R)m.invoke(object);
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
			return (R)m.invoke(object, args);
		} catch (InvocationTargetException e) {
			throw Exceptions.duck(e.getTargetException());
		} catch (Exception e) {
			throw Exceptions.duck(e);
		} 
	}
	
	// Convenience method to turn human-readable string into seconds past epoch.
	public static long parseTSLong(String ts) {
	//			FMT.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			return FMT.parse(ts).getTime();
		} catch (ParseException e) {
			throw Exceptions.duck(e);
		}
	}

	public static Timestamp parseTS(String ts) {
		return ts == null ? null : new Timestamp(parseTSLong(ts));
	}

	public static DateFormat FMT = new SimpleDateFormat("yyyy-MM-dd");
}
