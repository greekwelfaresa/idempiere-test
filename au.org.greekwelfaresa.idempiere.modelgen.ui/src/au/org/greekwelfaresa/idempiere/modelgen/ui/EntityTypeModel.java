package au.org.greekwelfaresa.idempiere.modelgen.ui;

import java.util.Collections;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import org.compiere.model.MEntityType;
import org.compiere.model.Query;
import org.compiere.util.Env;

public class EntityTypeModel extends AbstractListModel<MEntityType> implements ComboBoxModel<MEntityType> {

	Thread mStartupThread;
	
	public EntityTypeModel(Thread startupThread) {
		mStartupThread = startupThread;
	}

	List<MEntityType> types;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private void initModel() {
		if (types != null) {
			return;
		}
		synchronized (mStartupThread) {
			try {
				if (mStartupThread.isAlive()) {
					mStartupThread.join();
				}
			} catch (InterruptedException e) {
				types = Collections.emptyList();
				return;
			}
		}
		types = new Query(Env.getCtx(), MEntityType.Table_Name, "true", null).list();
	}
	
	@Override
	public int getSize() {
		initModel();
		return types.size();
	}

	@Override
	public MEntityType getElementAt(int index) {
		initModel();
		return types.get(index);
	}

	MEntityType selected;
	
	@Override
	public void setSelectedItem(Object anItem) {
		selected = (MEntityType)anItem;
	}

	@Override
	public MEntityType getSelectedItem() {
		return selected;
	}
}
