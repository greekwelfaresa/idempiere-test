package au.org.greekwelfaresa.idempiere.test.junit5.test;

import java.lang.reflect.Method;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Properties;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.compiere.util.Env;
import au.org.greekwelfaresa.idempiere.test.junit5.IDempiereEnvExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;

import au.org.greekwelfaresa.idempiere.test.common.annotation.InjectIDempiereEnv;
import au.org.greekwelfaresa.idempiere.test.common.env.IDempiereEnv;

@ExtendWith(SoftAssertionsExtension.class)
@ExtendWith(IDempiereEnvExtension.class)
public class IDempiereEnvExtension_HierarchicalTest extends AssertCtx {

	@InjectIDempiereEnv
	static IDempiereEnv ENV;

	static IDempiereEnv ENV_UNANNOTATED;

	@ExtendWith(SoftAssertionsExtension.class)
	@ExtendWith(IDempiereEnvExtension.class)
	public static class DefaultStatic extends AssertCtx {
		@InjectIDempiereEnv
		static IDempiereEnv DEFAULT_ENV;

		@Test
		public void withStaticFieldInjection_setsDefaults(SoftAssertions softly) {
			this.softly = softly;
			assertCtxDefaults(DEFAULT_ENV);
			assertCallerClass(DEFAULT_ENV);
		}
	}

//	@ExtendWith(SoftAssertionsExtension.class)
//	@ExtendWith(IDempiereEnvExtension.class)
//	public static class ConfiguredStatic extends AssertCtx {
//		@InjectIDempiereEnv(clientId = 111, orgId = 222, userId = 333, roleId = 444, warehouseId = 555)
//		static IDempiereEnv ENV;
//
//		@Test
//		public void withStaticFieldInjection_setsValues(SoftAssertions softly) {
//			this.softly = softly;
//			assertCtx(ENV, 111, 222, 100, 102, 103, true);
//		}
//	}
//

	@InjectIDempiereEnv
	IDempiereEnv fieldEnv;

	IDempiereEnv fieldEnvUnannotated;

	@Test
	void withParameterInjection_setsDefaults(SoftAssertions softly, @InjectIDempiereEnv IDempiereEnv env) {
		this.softly = softly;
		assertCtxDefaults(env);
		softly.assertThat(env.getParentEnv()).as("parent").isSameAs(ENV);
		assertCaller(env);
	}

	@Test
	void withFieldInjection_setsDefaults(SoftAssertions softly) {
		this.softly = softly;
		assertCtxDefaults(fieldEnv);
		softly.assertThat(fieldEnv.getParentEnv()).as("parent").isSameAs(ENV);
		assertCaller(fieldEnv);
	}

	@Test
	void unannotatedFields_doNotGetInjected(SoftAssertions softly) {
		softly.assertThat(ENV_UNANNOTATED).as("static").isNull();
		softly.assertThat(fieldEnvUnannotated).as("nonstatic").isNull();
	}

	@ExtendWith(IDempiereEnvExtension.class)
	@ExtendWith(SoftAssertionsExtension.class)
	public static class ConfiguredFields extends AssertCtx {
		@InjectIDempiereEnv(timestamp = "2020-02-02")
		IDempiereEnv env;
		
		@Test
		void annotationOnField_setsTime(SoftAssertions softly) {
			this.softly = softly;
			assertCtx(env, 11, 11, 100, 102, 103, true, LocalDate.of(2020, 2, 2));
		}
	}
	
	@ExtendWith(IDempiereEnvExtension.class)
	@ExtendWith(SoftAssertionsExtension.class)
	public static class ConfiguredParameters extends AssertCtx {
		@Test
		void annotationOnParameter_setsTime(SoftAssertions softly, @InjectIDempiereEnv(timestamp = "2020-02-02") IDempiereEnv env) {
			this.softly = softly;
			assertCtx(env, 11, 11, 100, 102, 103, true, LocalDate.of(2020, 2, 2));
		}
	}
	
	@Nested
	@TestInstance(Lifecycle.PER_CLASS)
	public class NestedTest_WithBeforeAllInjected {

		@InjectIDempiereEnv
		IDempiereEnv nestedEnv;

		IDempiereEnv beforeAllEnv;

		@BeforeAll
		void beforeAll(@InjectIDempiereEnv IDempiereEnv env) {
			softly = new SoftAssertions();
			softly.assertThat(beforeAllEnv).as("beforeAllEnv shouldn't be set").isNull();
			beforeAllEnv = env;
			softly.assertThat(env).as("env").isSameAs(nestedEnv);
			assertCtxDefaults(env);
			softly.assertThat(env.getParentEnv()).as("parent").isSameAs(ENV);
			assertCallerClass(env);
			softly.assertAll();
		}

		@Test
		public void withFieldInjection_onNestedTest_setsDefault(SoftAssertions softly) {
			IDempiereEnvExtension_HierarchicalTest.this.softly = softly;

			assertCtxDefaults(nestedEnv);
			softly.assertThat(nestedEnv).as("same").isSameAs(fieldEnv);
			softly.assertThat(nestedEnv.getParentEnv()).as("parent").isSameAs(beforeAllEnv);
			assertCaller(nestedEnv);
		}

		@Test
		public void withParameterInjection_onNestedTest_setsDefault(SoftAssertions softly,
				@InjectIDempiereEnv IDempiereEnv nestedParam) {
			IDempiereEnvExtension_HierarchicalTest.this.softly = softly;

			assertCtxDefaults(nestedParam);
			softly.assertThat(nestedParam.getParentEnv()).as("parent").isSameAs(beforeAllEnv);
			assertCaller(nestedParam);
		}
	}

	@Nested
	public class NestedTest_WithNoBeforeAll {

		@InjectIDempiereEnv
		IDempiereEnv nestedEnv;

		@Test
		public void withFieldInjection_onNestedTest_setsDefault(SoftAssertions softly) {
			IDempiereEnvExtension_HierarchicalTest.this.softly = softly;

			assertCtxDefaults(nestedEnv);
			softly.assertThat(nestedEnv).as("same").isSameAs(fieldEnv);
			softly.assertThat(nestedEnv.getParentEnv()).as("parent").isSameAs(ENV);
			assertCaller(nestedEnv);
		}

		@Test
		public void withParameterInjection_onNestedTest_setsDefault(SoftAssertions softly,
				@InjectIDempiereEnv IDempiereEnv nestedParam) {
			IDempiereEnvExtension_HierarchicalTest.this.softly = softly;

			assertCtxDefaults(nestedParam);
			softly.assertThat(nestedParam.getParentEnv()).as("parent").isSameAs(ENV);
			assertCaller(nestedParam);
		}
	}
}

abstract class AssertCtx {
	SoftAssertions softly;

	String testMethodName;
	String testClassName;

	@BeforeEach
	void beforeEach(TestInfo info) {
		testMethodName = info.getTestMethod().map(Method::getName).orElse(null);
		testClassName = info.getTestClass().map(Class::getName).orElse(null);
	}

	void assertCtxDefaults(IDempiereEnv env) {
		assertCtx(env, 11, 11, 100, 102, 103, true, LocalDate.now());
	}

	void assertCtx(IDempiereEnv env, int clientId, int orgId, int userId, int roleId, int warehouseId,
			boolean autoRollback, LocalDate date) {
		Properties ctx = env.getCtx();
		softly.assertThat(ctx.get(Env.AD_CLIENT_ID)).as("clientId").isEqualTo(String.valueOf(clientId));
		softly.assertThat(ctx.get(Env.AD_ORG_ID)).as("orgId").isEqualTo(String.valueOf(orgId));
		softly.assertThat(ctx.get(Env.AD_USER_ID)).as("userId").isEqualTo(String.valueOf(userId));
		softly.assertThat(ctx.get(Env.AD_ROLE_ID)).as("roleId").isEqualTo(String.valueOf(roleId));
		softly.assertThat(ctx.get(Env.M_WAREHOUSE_ID)).as("warehouseId").isEqualTo(String.valueOf(warehouseId));
		softly.assertThat(env.isAutoRollback()).as("autoRollback").isEqualTo(autoRollback);
		softly.assertThat(env.getDate()).as("date")
				.isEqualToIgnoringHours(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
	}

	void assertCaller(IDempiereEnv env) {
		final StackTraceElement caller = Thread.currentThread().getStackTrace()[2];
		softly.assertThat(env.getName()).as("methodName").isEqualTo(caller.getMethodName());
		softly.assertThat(env.getClassName()).as("className").isEqualTo(caller.getClassName());
	}

	void assertCallerClass(IDempiereEnv env) {
		final StackTraceElement caller = Thread.currentThread().getStackTrace()[2];
		softly.assertThat(env.getName()).as("methodName").isNull();
		softly.assertThat(env.getClassName()).as("className").isEqualTo(caller.getClassName());
	}
}
