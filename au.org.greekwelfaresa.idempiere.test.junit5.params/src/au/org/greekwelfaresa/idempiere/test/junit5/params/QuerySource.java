package au.org.greekwelfaresa.idempiere.test.junit5.params;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.compiere.model.PO;
import org.junit.jupiter.params.provider.ArgumentsSource;

@Retention(RUNTIME)
@Target({ ANNOTATION_TYPE, METHOD })
@ArgumentsSource(QueryArgumentsProvider.class)
public @interface QuerySource {
	/**
	 * The type of result to return from the query
	 * @return
	 */
	Class<? extends PO> value();
	
	/**
	 * The where clause to use in the query string 
	 * @return
	 */
	String where() default "";
	
	String[] params() default {};

	/**
	 * The maximum number of query results to return. Default
	 * is {@code Long.MAX_VALUE} (effectively no limit).
	 * @return The maximum number of query results to return.
	 */
	long limit() default Long.MAX_VALUE;

	/**
	 * Specifies whether or not to apply the access filter when retrieving query results.
	 * Default is <tt>true</tt> (apply the access filter).
	 * 
	 * @return Flag indicating whether to apply the access filter.
	 */
	boolean accessFilter() default true;
}
