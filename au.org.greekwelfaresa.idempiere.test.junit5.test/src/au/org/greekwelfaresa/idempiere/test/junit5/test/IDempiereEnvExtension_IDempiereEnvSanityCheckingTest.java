package au.org.greekwelfaresa.idempiere.test.junit5.test;

import static au.org.greekwelfaresa.idempiere.test.junit5.testutils.TestKitUtils.assertThatTest;

import au.org.greekwelfaresa.idempiere.test.junit5.IDempiereEnvExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.jupiter.api.extension.ParameterResolutionException;

import au.org.greekwelfaresa.idempiere.test.common.annotation.InjectIDempiereEnv;
import au.org.greekwelfaresa.idempiere.test.common.env.IDempiereEnv;

public class IDempiereEnvExtension_IDempiereEnvSanityCheckingTest {

	@ExtendWith(IDempiereEnvExtension.class)
	static class TestBase {
		@Test
		void myTest() {}
	}

	@ExtendWith(IDempiereEnvExtension.class)
	static class IncorrectParameterType {
		@Test
		void myParameterTest(@InjectIDempiereEnv String param) {}
	}

	@Test
	void annotatedParameter_withIncorrectType_throwsException() {
		assertThatTest(IncorrectParameterType.class).isInstanceOf(ParameterResolutionException.class)
			.hasMessageEndingWith(
				"Can only resolve @InjectIDempiereEnv parameter of type au.org.greekwelfaresa.idempiere.test.common.env.IDempiereEnv but was: java.lang.String");
	}

	static class IncorrectFieldType extends TestBase {

		@InjectIDempiereEnv
		String myField;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedField_withIncorrectType_throwsException() {
		assertThatTest(IncorrectFieldType.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessage(
				"[myField] Can only resolve @InjectIDempiereEnv field of type au.org.greekwelfaresa.idempiere.test.common.env.IDempiereEnv but was: java.lang.String");
	}

	static class IncorrectStaticFieldType extends TestBase {

		@InjectIDempiereEnv
		static String myStaticField;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedStaticField_withIncorrectType_throwsException() {
		assertThatTest(IncorrectStaticFieldType.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessage(
				"[myStaticField] Can only resolve @InjectIDempiereEnv field of type au.org.greekwelfaresa.idempiere.test.common.env.IDempiereEnv but was: java.lang.String");
	}

	static class FinalStaticField extends TestBase {
		@InjectIDempiereEnv
		static final IDempiereEnv bc = null;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedStaticField_thatIsFinal_throwsException() {
		assertThatTest(FinalStaticField.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessageMatching("@InjectIDempiereEnv field \\[bc\\] must not be .*final.*");
	}

	static class FinalField extends TestBase {
		@InjectIDempiereEnv
		final IDempiereEnv bc = null;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedField_thatIsFinal_throwsException() {
		assertThatTest(FinalField.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessageMatching("@InjectIDempiereEnv field \\[bc\\] must not be .*final.*");
	}

	static class PrivateField extends TestBase {
		@InjectIDempiereEnv
		private IDempiereEnv bc = null;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedField_thatIsPrivate_throwsException() {
		assertThatTest(PrivateField.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessageMatching("@InjectIDempiereEnv field \\[bc\\] must not be .*private.*");
	}

	static class StaticPrivateField extends TestBase {
		@InjectIDempiereEnv
		static private IDempiereEnv bc = null;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void annotatedStaticField_thatIsPrivate_throwsException() {
		assertThatTest(StaticPrivateField.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessageMatching("@InjectIDempiereEnv field \\[bc\\] must not be .*private.*");
	}
	
	static class MultipleAnnotatedFields extends TestBase {
		@InjectIDempiereEnv
		IDempiereEnv field1;
		
		@InjectIDempiereEnv
		IDempiereEnv field2;

		@Override
		@Test
		void myTest() {}
	}

	@Test
	void multipleAnnotatedFields_throwsException() {
		assertThatTest(MultipleAnnotatedFields.class).isInstanceOf(ExtensionConfigurationException.class)
			.hasMessageMatching("Multiple @InjectIDempiereEnv fields not supported \\(\\[field1\\], \\[field2\\]\\)");
	}
}
