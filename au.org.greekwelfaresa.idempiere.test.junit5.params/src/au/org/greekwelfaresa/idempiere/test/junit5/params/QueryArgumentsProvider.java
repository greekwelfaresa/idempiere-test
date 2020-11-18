package au.org.greekwelfaresa.idempiere.test.junit5.params;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;
import java.util.stream.Stream;

import org.adempiere.exceptions.DBException;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;
import org.junit.platform.commons.JUnitException;

import au.org.greekwelfaresa.idempiere.test.common.env.IDempiereEnv;
import au.org.greekwelfaresa.idempiere.test.junit5.IDempiereEnvExtension;

class QueryArgumentsProvider implements ArgumentsProvider, AnnotationConsumer<QuerySource> {

	private static final String IDEMPIERE_ENV_KEY = "idempiere.env";

	private QuerySource annotation;

	@Override
	public void accept(QuerySource annotation) {
		this.annotation = annotation;
	}

	@Override
	public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws DBException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		return getIDempiereEnv(context).query(annotation.value(), annotation.where(), (Object[])annotation.params()).list()
				.stream().limit(annotation.limit()).map(Arguments::of);
	}

	static IDempiereEnv getIDempiereEnv(ExtensionContext extensionContext) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Store store = extensionContext
				.getStore(Namespace.create(IDempiereEnvExtension.class, extensionContext.getUniqueId()));
		Class<?> closeableEnv = Stream.of(IDempiereEnvExtension.class.getDeclaredClasses()).filter(c -> c.getSimpleName().equals("CloseableEnv")).findFirst().orElseThrow(() -> new JUnitException("Couldn't find CloseableEnv class definition"));
		Object env = store.getOrDefault(IDEMPIERE_ENV_KEY, closeableEnv, null);
		if (env == null) {
			Optional<ExtensionContext> parent = extensionContext.getParent();
			
			if (parent.isPresent()) {
				return getIDempiereEnv(parent.get());
			}
			throw new JUnitException(
					"Cannot use @QuerySource in a class that's not using IDempiereEnvExtension: " + extensionContext);
		}
		Method m = closeableEnv.getMethod("getEnv");
		m.setAccessible(true);
		return (IDempiereEnv) m.invoke(env);
	}
}