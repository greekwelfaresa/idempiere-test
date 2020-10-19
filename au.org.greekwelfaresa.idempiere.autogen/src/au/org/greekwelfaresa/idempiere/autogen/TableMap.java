package au.org.greekwelfaresa.idempiere.autogen;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(service = TableMap.class)
class TableMap {

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
		map = new HashMap<>();
		map.put("person", new TableDescriptor("au.org.greekwelfaresa.idempiere.bpmodels.model",
				Paths.get("C:\\workspace\\idempiere-plugins\\au.org.greekwelfaresa.idempiere.bpmodels\\test")));
	}

	public TableDescriptor forTable(String t) {
		return map.get(t);
	}
}
