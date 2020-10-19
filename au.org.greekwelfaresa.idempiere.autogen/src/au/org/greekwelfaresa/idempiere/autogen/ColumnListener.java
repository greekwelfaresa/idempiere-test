package au.org.greekwelfaresa.idempiere.autogen;

import static org.adempiere.base.event.IEventManager.EVENT_DATA;
import static org.adempiere.base.event.IEventTopics.PO_BEFORE_CHANGE;
import static org.adempiere.base.event.IEventTopics.PO_BEFORE_NEW;

import org.compiere.model.I_AD_Column;
import org.compiere.model.I_AD_Table;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

@Component(property = { EventConstants.EVENT_TOPIC + "=" + PO_BEFORE_CHANGE,
		EventConstants.EVENT_TOPIC + "=" + PO_BEFORE_NEW,
		EventConstants.EVENT_FILTER + "=(tableName=" + I_AD_Column.Table_Name + ")" })
public class ColumnListener implements EventHandler {

	@Reference
	TableMap tableNameMap;
	
	@Override
	public void handleEvent(Event event) {
		System.err.println("Here we are!");
		I_AD_Column column = (I_AD_Column) event.getProperty(EVENT_DATA);
		I_AD_Table table = column.getAD_Table();
		tableNameMap.updateTable(table);
	}
}
