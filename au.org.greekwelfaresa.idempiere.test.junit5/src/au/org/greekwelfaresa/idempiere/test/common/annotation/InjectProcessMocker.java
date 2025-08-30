package au.org.greekwelfaresa.idempiere.test.common.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.junit.jupiter.api.extension.ExtendWith;

import au.org.greekwelfaresa.idempiere.test.junit5.mock.ProcessMockerExtension;

@Target({ FIELD, PARAMETER })
@Retention(RUNTIME)
@ExtendWith(ProcessMockerExtension.class)
@Documented
public @interface InjectProcessMocker {
}