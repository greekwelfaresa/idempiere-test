package au.org.greekwelfaresa.idempiere.autogen;

import static org.adempiere.base.event.IEventManager.EVENT_DATA;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_CHANGE;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_DELETE;
import static org.adempiere.base.event.IEventTopics.PO_AFTER_NEW;

import org.adempiere.util.ModelClassGenerator;
import org.adempiere.util.ModelInterfaceGenerator;

import org.compiere.model.I_AD_Table;
import org.compiere.model.MTable;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import au.org.greekwelfaresa.idempiere.autogen.TableMap.TableDescriptor;

@Component(property = { EventConstants.EVENT_TOPIC + "=" + PO_AFTER_CHANGE,
		EventConstants.EVENT_TOPIC + "=" + PO_AFTER_DELETE,
		EventConstants.EVENT_TOPIC + "=" + PO_AFTER_NEW,
		EventConstants.EVENT_FILTER + "=(tableName=" + I_AD_Table.Table_Name + ")" })
public class TableListener implements EventHandler {

	@Reference
	TableMap tableNameMap;
	
	@Override
	public void handleEvent(Event event) {
		MTable table = (MTable) event.getProperty(EVENT_DATA);

		final String tableName = table.getName();
		TableDescriptor td = tableNameMap.forTable(tableName);
		ModelInterfaceGenerator.generateSource(td.root.toAbsolutePath().toString(), td.modelPackage, table.getEntityType(), tableName, table.getEntityType());
		ModelClassGenerator.generateSource(td.root.toAbsolutePath().toString(), td.modelPackage, table.getEntityType(), tableName, table.getEntityType());
	}
}
