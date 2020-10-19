package au.org.greekwelfaresa.idempiere.autogen;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.adempiere.util.ModelClassGenerator;
import org.adempiere.util.ModelInterfaceGenerator;
import org.compiere.model.I_AD_Table;

@Component(service = TableMap.class)
public class TableMap {

	Map<String, TableDescriptor> map;

	static class TableDescriptor {
		String modelPackage;
		Path root;

		TableDescriptor(String pkg, Path root) {
			modelPackage = pkg;
			this.root = root;
		}
	}

	@Activate
	void activate() {
		System.err.println("Activating tablemap");
		map = new HashMap<>();
		
		
		map.put("BPModels", new TableDescriptor("au.org.greekwelfaresa.idempiere.bpmodels.model",
				Paths.get("D:\\workspace\\idempiere-plugins\\au.org.greekwelfaresa.idempiere.bpmodels\\test")));
	}

	TableDescriptor forTable(String t) {
		return map.get(t);
	}
	
	void updateTable(I_AD_Table table) {
		final String entityType = table.getEntityType();
		TableDescriptor td = map.get(entityType);
		if (td != null) {
			final String tableName = table.getTableName();
			System.err.println("callback for table: " + entityType);
			System.err.println("Generating interface: " + td.root.toString() + ", " + td.modelPackage);
			ModelInterfaceGenerator.generateSource(td.root.toAbsolutePath().toString(), td.modelPackage, table.getEntityType(), tableName, table.getEntityType());
			ModelClassGenerator.generateSource(td.root.toAbsolutePath().toString(), td.modelPackage, table.getEntityType(), tableName, table.getEntityType());
		} else {
			System.err.println("No model generation for table name: " + table.getName());
		}
	}
}
