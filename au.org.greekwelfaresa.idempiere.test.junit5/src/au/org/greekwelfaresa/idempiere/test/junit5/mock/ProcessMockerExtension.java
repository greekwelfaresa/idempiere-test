package au.org.greekwelfaresa.idempiere.test.junit5.mock;

import static au.org.greekwelfaresa.idempiere.test.common.utils.Utils.clearProcessCache;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.osgi.framework.Constants.SERVICE_RANKING;
import static org.osgi.test.common.inject.FieldInjector.assertFieldIsOfType;
import static org.osgi.test.common.inject.FieldInjector.assertParameterIsOfType;
import static org.osgi.test.common.inject.FieldInjector.findAnnotatedFields;
import static org.osgi.test.common.inject.FieldInjector.findAnnotatedNonStaticFields;
import static org.osgi.test.common.inject.FieldInjector.setField;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import org.compiere.process.ProcessInfo;
import org.compiere.util.Trx;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.platform.commons.util.ExceptionUtils;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.Filter;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.util.tracker.ServiceTracker;

import au.org.greekwelfaresa.idempiere.test.common.annotation.InjectProcessMocker;
import au.org.greekwelfaresa.idempiere.test.common.mock.ProcessMocker;
import au.org.greekwelfaresa.idempiere.test.common.mock.ThreeArgProcessCall;

public class ProcessMockerExtension implements BeforeAllCallback, BeforeEachCallback, ParameterResolver {
	private static final Object PROCESS_MOCKER_KEY = "idempiere.processmocker";

	@Override
	public void beforeAll(ExtensionContext extensionContext) throws Exception {
		if (extensionContext.getTestInstance().isPresent()) {
			beforeEach(extensionContext);
		} else {
			List<Field> fields = findAnnotatedFields(extensionContext.getRequiredTestClass(), InjectProcessMocker.class,
					m -> Modifier.isStatic(m.getModifiers()));

			fields.forEach(field -> {
				assertFieldIsOfType(field, ProcessMocker.class, InjectProcessMocker.class,
						ExtensionConfigurationException::new);
				setField(field, null, getProcessMockerOrComputeIfAbsent(extensionContext));
			});
		}
	}

	private static class CloseableMocker implements ProcessMocker, IProcessFactory {

		private final int serviceRanking;
		private final ServiceTracker<IProcessFactory, IProcessFactory> tracker;

		public CloseableMocker(ExtensionContext extensionContext) {
			Optional<ExtensionContext> current = extensionContext.getParent();
			CloseableMocker parentCloseableMocker = null;
			while (current.isPresent()) {
				parentCloseableMocker = getProcessMocker(current.get());
				if (parentCloseableMocker != null) {
					break;
				}
				current = current.get().getParent();
			}
			final BundleContext bc = BundleContextExtension.getBundleContext(extensionContext);
			final String filter = String.format("(&(%s=%s)(!(my.own.factory=true)))", Constants.OBJECTCLASS,
					IProcessFactory.class.getName());
			try {
				Filter osgiFilter = FrameworkUtil.createFilter(filter);

				tracker = new ServiceTracker<>(bc, osgiFilter, null);
				tracker.open();
				if (parentCloseableMocker != null) {
					serviceRanking = parentCloseableMocker.serviceRanking + 10;
				} else {
					ServiceReference<IProcessFactory> ref = tracker.getServiceReference();
					if (ref == null) {
						serviceRanking = 1000;
					} else {
						final Integer existingRanking = (Integer) ref.getProperty(SERVICE_RANKING);
						if (existingRanking == null) {
							serviceRanking = 1000;
						} else {
							serviceRanking = existingRanking + 10;
						}
					}
				}
				Dictionary<String, Object> props = new Hashtable<>();
				props.put(SERVICE_RANKING, serviceRanking);
				props.put("my.own.factory", "true");
				bc.registerService(IProcessFactory.class, this, props);
			} catch (InvalidSyntaxException ise) {
				throw ExceptionUtils.throwAsUncheckedException(ise);
			}
		}

		Map<String, ProcessCall> callMap = new ConcurrentHashMap<>();

		@Override
		public void close() throws Exception {
			tracker.close();
			callMap.clear();
			clearProcessCache();
		}

		ThreadLocal<String> startProcessContext = new ThreadLocal<>();
//		ThreadLocal<Map<String, IProcessUI>> processUIContext = new ThreadLocal<>();

		@Override
		public ProcessCall mockProcess(String processName, ThreeArgProcessCall processCall) {
			ProcessCall proc = mock(ProcessCall.class);
			when(proc.startProcess(any(), any(), any())).thenAnswer(inv -> {
				startProcessContext.set(processName);
				try {
					return processCall.startProcess((Properties) inv.getArgument(0), (ProcessInfo) inv.getArgument(1),
							(Trx) inv.getArgument(2));
				} finally {
					startProcessContext.set(null);
				}
			});
//			doAnswer(inv -> {
//				final IProcessUI ui = (IProcessUI) inv.getArgument(0);
//				processUIContext.get().put(processName, ui);
//				return null;
//			}).when(proc).setProcessUI(any());
			callMap.put(processName, proc);
			clearProcessCache();
			return proc;
		}

		@Override
		public void unmockProcess(String processName) {
			callMap.remove(processName);
			clearProcessCache();
		}

		@Override
		public ProcessCall newProcessInstance(String className) {
			return callMap.getOrDefault(className, null);
		}

		static final IProcessFactory[] PROCFACTORY_ARR = new IProcessFactory[0];
		
		@Override
		public boolean startProcess(Properties ctx, ProcessInfo pi, Trx trxName) {
			final String callContext = startProcessContext.get();
			if (callContext == null) {
				throw new IllegalStateException("Can only call startProcess() from the context of a mocked method");
			}
			final IProcessFactory[] factories = tracker.getServices(PROCFACTORY_ARR);
			for (IProcessFactory factory : factories) {
				final ProcessCall proc = factory.newProcessInstance(callContext);
				if (proc != null) {
					return proc.startProcess(ctx, pi, trxName);
				}
			}
			throw new IllegalStateException("No such ProcessCall: " + callContext);
		}

		/**
		 * Calls the original (unmocked) service. Must be called from within the context of a mocked
		 * process call invocation.
		 * @param processUI
		 */
//		@Override
//		public IProcessUI getProcessUI() {
//			Map<String, IProcessUI> uis = startProcessContext.get();
//			if (uis == null) {
//				throw new IllegalStateException("Can only call getProcessUI() from within the context of a mocked method");
//			}
//			return uis.get(uis)
//		}
	}

	static Store getStore(ExtensionContext extensionContext) {
		return extensionContext
				.getStore(Namespace.create(ProcessMockerExtension.class, extensionContext.getUniqueId()));
	}

	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		List<Field> fields;
		for (Object instance : context.getRequiredTestInstances().getAllInstances()) {
			final Class<?> testClass = instance.getClass();
			fields = findAnnotatedNonStaticFields(testClass, InjectProcessMocker.class);

			if (fields.size() > 1) {
				throw new ExtensionConfigurationException("Multiple @InjectProcessMocker fields not supported ("
						+ fields.stream().map(f -> "[" + f.getName() + "]").collect(Collectors.joining(", ")) + ")");
			}

			fields.forEach(field -> {
				assertFieldIsOfType(field, ProcessMocker.class, InjectProcessMocker.class,
						ExtensionConfigurationException::new);
				setField(field, instance, getProcessMockerOrComputeIfAbsent(context));
			});
		}
	}

	public static ProcessMocker getProcessMockerOrComputeIfAbsent(ExtensionContext extensionContext) {
		return getStore(extensionContext).getOrComputeIfAbsent(PROCESS_MOCKER_KEY,
				key -> new CloseableMocker(extensionContext), CloseableMocker.class);
	}

	private static CloseableMocker getProcessMocker(ExtensionContext extensionContext) {
		return getStore(extensionContext).get(PROCESS_MOCKER_KEY, CloseableMocker.class);
	}

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		if (!parameterContext.isAnnotated(InjectProcessMocker.class)) {
			return false;
		}
		assertParameterIsOfType(parameterContext.getParameter().getType(), ProcessMocker.class,
				InjectProcessMocker.class, ParameterResolutionException::new);
		return true;
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {
		Class<?> parameterType = parameterContext.getParameter().getType();

		if (parameterContext.isAnnotated(InjectProcessMocker.class)) {
			assertParameterIsOfType(parameterType, ProcessMocker.class, InjectProcessMocker.class,
					ParameterResolutionException::new);
			return getProcessMockerOrComputeIfAbsent(extensionContext);
		}

		throw new ExtensionConfigurationException("No parameter types known to ProcessMockerExtension were found");
	}
}
