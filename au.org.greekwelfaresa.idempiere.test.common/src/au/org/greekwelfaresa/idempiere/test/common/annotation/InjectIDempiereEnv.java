package au.org.greekwelfaresa.idempiere.test.common.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({
	FIELD, PARAMETER
})
@Retention(RUNTIME)
@Documented
public @interface InjectIDempiereEnv {
	
	int clientId() default 11;
	
	int orgId() default 11;
	
	int userId() default 100;
	
	int roleId() default 102;
	
	int warehouseId() default 103;
	
	boolean autoRollback() default true;
	
	String timestamp() default "";
}