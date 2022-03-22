package au.org.greekwelfaresa.idempiere.test.common.env;

import static org.adempiere.base.event.IEventManager.EVENT_DATA;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_NEW;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_CHANGE;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_DELETE;
import static org.compiere.model.I_C_BPartner.COLUMNNAME_Name;
import static org.osgi.service.event.EventConstants.EVENT_TOPIC;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Objects;

import org.compiere.model.I_C_BPartner;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.util.Msg;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
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

		if (Objects.equals(po.get_TrxName(), trxName)) {
			events.add(event);
		}
	}
	
	List<Event> events = new ArrayList<>();
	
	public List<Event> getEvents() {
		return events;
	}

	@Override
	public void close() {
		reg.unregister();
	}
}