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

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.compiere.Adempiere;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import au.org.greekwelfaresa.idempiere.modelgen.ModelAssertionGenerator;

@Component(property = { "main.thread=true" })
public class AssertionsGeneratorApplication implements Runnable {

	String[] args;

	@Reference(target = "(launcher.arguments=*)")
	void args(Object object, Map<String, Object> map) {
		args = (String[]) map.get("launcher.arguments");
	}

	@Override
	public void run() {
		System.err.println("run was called: " + Arrays.toString(args));
		if (args.length == 5) {
			Adempiere.startup(false);
			String folder = args[0];
			String modelPackageName = args[1];
			String assertionsPackageName = args[2];
			String entityType = args[3];
			String tableName = args[4];
			try {
				ModelAssertionGenerator.generateSource(folder, modelPackageName, assertionsPackageName, entityType,
						tableName);
			} catch (IOException e) {
				System.err.println("Error trying to create assertions");
				e.printStackTrace();
			}
		} else if (args.length != 0) {
			System.out.println(
					"usage: ModelGenerator folder modelPackageName assertionsPackageName entityType tableName");
		} else {
			// Initialise iDempiere in the background so that it can start while the user
			// is still filling out the information.
			Thread startupThread = new Thread(() -> Adempiere.startup(false));
			startupThread.start();
			try {
				AssertionsGeneratorDialog dialog = new AssertionsGeneratorDialog(startupThread);
				dialog.setModal(true);
				dialog.pack();
				dialog.setLocationRelativeTo(null);
				dialog.setVisible(true);
			} catch (Exception e) {
				StringWriter w = new StringWriter();
				PrintWriter pw = new PrintWriter(w);
				e.printStackTrace(pw);
				JOptionPane.showMessageDialog(new JFrame(),
						"Error trying to open assertions generator dialog: \n" + w.toString(), "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
