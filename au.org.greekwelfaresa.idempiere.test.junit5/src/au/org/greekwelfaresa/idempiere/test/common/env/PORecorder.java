package au.org.greekwelfaresa.idempiere.test.common.env;

import static org.adempiere.base.event.IEventManager.EVENT_DATA;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_NEW;
import static org.osgi.service.event.EventConstants.EVENT_TOPIC;

import java.util.Dictionary;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.compiere.model.PO;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.osgi.test.common.dictionary.Dictionaries;

public class PORecorder implements EventHandler, AutoCloseable {

	final String trxName;
	final ServiceRegistration<EventHandler> reg;
	
	public PORecorder(String trxName) {
		this.trxName = trxName;
		BundleContext bc = FrameworkUtil.getBundle(PORecorder.class).getBundleContext();
		Dictionary<String, Object> props = Dictionaries.dictionaryOf(EVENT_TOPIC, PO_AFTER_NEW);
		reg = bc.registerService(EventHandler.class, this, props);
	}
	
	@Override
	public void handleEvent(Event event) {
		PO po = (PO) event.getProperty(EVENT_DATA);

		if (trxName == null || trxName.equals(po.get_TrxName())) {
			events.add(event);
		}
	}
	
	List<Event> events = new CopyOnWriteArrayList<>();
	
	public List<Event> getEvents() {
		return events;
	}

	public <T extends PO> List<T> getPOs(Class<T> clazz) {
		return getPOStream(clazz).collect(Collectors.toList());
	}

	public <T extends PO> Stream<T> getPOStream(Class<T> clazz) {
		return getEvents()
				.stream()
				.map(e -> e.getProperty(EVENT_DATA))
				.filter(clazz::isInstance)
				.map(clazz::cast);
	}
	
	public <T extends PO> T getRequiredFirstPO(Class<T> clazz) {
		return getFirstPO(clazz).get();
	}
	
	public <T extends PO> Optional<T> getFirstPO(Class<T> clazz) {
		return getPOStream(clazz).findFirst();
	}
	
	@Override
	public void close() {
		reg.unregister();
	}
}