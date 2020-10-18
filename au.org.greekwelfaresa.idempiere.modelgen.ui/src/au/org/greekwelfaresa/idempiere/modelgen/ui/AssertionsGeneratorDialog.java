/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2010 Heng Sin Low                							  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package au.org.greekwelfaresa.idempiere.modelgen.ui;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.compiere.Adempiere;
import org.compiere.model.MEntityType;

import au.org.greekwelfaresa.idempiere.modelgen.ModelAssertionGenerator;

/**
 *
 * @author hengsin
 *
 */
public class AssertionsGeneratorDialog extends JDialog implements ActionListener {

	/**
	 * default generated serial version Id
	 */
	private static final long serialVersionUID = -6107458487243136365L;
	private JButton bGenerate;
	private JButton bCancel;
	private JButton bFolder;
	private JTextField fFolderName;
	private JTextField fModelPackageName;
	private JTextField fAssertionsPackageName;
	private JTextField fTableName;
	private JCheckBox fGenerateEntry;
	private JCheckBox fGenerateSoftEntry;
	private JComboBox<MEntityType> fEntityType;
	private Thread mStartupThread;
	private EntityTypeModel mEntityType;
	
	public AssertionsGeneratorDialog(Thread startupThread) throws IOException {
		super();
		mStartupThread = startupThread;
		setTitle("Assertions Class Generator");
		BorderLayout layout = new BorderLayout();
		this.getContentPane().setLayout(layout);
		Panel confirmPanel = new Panel();
		this.getContentPane().add(confirmPanel, BorderLayout.SOUTH);
		Panel mainPanel = new Panel();
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new GridLayout(6, 2));

		Panel filePanel = new Panel();
		filePanel.setLayout(new BorderLayout());
		Path defaultPath = Paths.get(Adempiere.getAdempiereHome(), "../au.org.greekwelfaresa.idempiere.test.assertj/src");
		String defaultPathString = defaultPath.toRealPath().toString();
		fFolderName = new JTextField(defaultPathString);
		filePanel.add(fFolderName, BorderLayout.CENTER);
		bFolder = new JButton("...");
		bFolder.setMargin(new Insets(0, 0, 0, 0));
		filePanel.add(bFolder, BorderLayout.EAST);
		mainPanel.add(new JLabel("Source Folder"));
		mainPanel.add(filePanel);
		bFolder.addActionListener(this);

		mainPanel.add(new JLabel("Model Package Name"));
		fModelPackageName = new JTextField("org.compiere.model");
		mainPanel.add(fModelPackageName);

		mainPanel.add(new JLabel("Assertions Package Name"));
		fAssertionsPackageName = new JTextField("au.org.greekwelfaresa.idempiere.test.assertj");
		mainPanel.add(fAssertionsPackageName);

		mainPanel.add(new JLabel("Table Name"));
		fTableName = new JTextField("AD_ReplaceThis%");
		mainPanel.add(fTableName);

		mainPanel.add(new JLabel("Entity Type"));
		fEntityType = new JComboBox<>();
		mEntityType = new EntityTypeModel(mStartupThread);
		fEntityType.setModel(mEntityType);
		fEntityType.setRenderer(new EntityTypeRenderer());
//		fEntityType = new JTextField("D");
		mainPanel.add(fEntityType);

		fGenerateEntry = new JCheckBox("Generate Entry Point");
		fGenerateEntry.setSelected(true);
		mainPanel.add(fGenerateEntry);
		fGenerateSoftEntry = new JCheckBox("Generate Class");
		fGenerateSoftEntry.setSelected(true);
		mainPanel.add(fGenerateSoftEntry);

		bGenerate = new JButton("Generate Source");
		confirmPanel.add(bGenerate);
		bCancel = new JButton("Cancel");
		confirmPanel.add(bCancel);
		bGenerate.addActionListener(this);
		bCancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bGenerate) {
			String folder = fFolderName.getText();
			if (folder == null || folder.trim().length() == 0) {
				JOptionPane.showMessageDialog(this, "Please enter source folder name where the generated assertions will be written", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String modelPackageName = fModelPackageName.getText();
			if (modelPackageName == null || modelPackageName.trim().length() == 0) {
				JOptionPane.showMessageDialog(this, "Please enter the package where the generated model classes reside", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String assertionsPackageName = fAssertionsPackageName.getText();
			if (assertionsPackageName == null || assertionsPackageName.trim().length() == 0) {
				JOptionPane.showMessageDialog(this, "Please enter the package where the generated assertions will be written", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String tableName = fTableName.getText();
			if (tableName == null || tableName.trim().length() == 0) {
				JOptionPane.showMessageDialog(this, "Please enter table name filter", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			MEntityType entityType = mEntityType.getSelectedItem();
			if (entityType == null) {
				JOptionPane.showMessageDialog(this, "Please select entity type", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
			if (fGenerateEntry.isSelected()) {
				//ModelInterfaceGenerator.generateSource(folder, packageName, entityType, tableName);
			}
			try {
				mStartupThread.join();
				ModelAssertionGenerator.generateSource(folder, modelPackageName, assertionsPackageName, entityType.getEntityType(), tableName);
			} catch (InterruptedException ex) {
				JOptionPane.showMessageDialog(this, "Interrupted while waiting for iDempiere to start", "Error", JOptionPane.ERROR_MESSAGE);
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(this, "Error while creating the assertions: " + e, "Error", JOptionPane.ERROR_MESSAGE);
			}
			this.dispose();
		} else if (e.getSource() == bCancel) {
			this.dispose();
		} else if (e.getSource() == bFolder) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int state = fileChooser.showOpenDialog(this);
			if (state == JFileChooser.APPROVE_OPTION) {
				fFolderName.setText(fileChooser.getSelectedFile().getAbsolutePath());
			}
		}
	}

}
