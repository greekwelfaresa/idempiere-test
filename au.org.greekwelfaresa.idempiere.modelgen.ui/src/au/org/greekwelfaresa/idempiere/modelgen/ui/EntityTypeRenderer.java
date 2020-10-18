package au.org.greekwelfaresa.idempiere.modelgen.ui;

import java.awt.Component;

import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

import org.compiere.model.MEntityType;

public class EntityTypeRenderer implements ListCellRenderer<MEntityType> {

	BasicComboBoxRenderer r = new BasicComboBoxRenderer();
	
	@Override
	public Component getListCellRendererComponent(JList<? extends MEntityType> list, MEntityType value, int index,
			boolean isSelected, boolean cellHasFocus) {
		return r.getListCellRendererComponent(list, value == null ? null : value.getName(), index, isSelected, cellHasFocus);
	}
}
