/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.dbackrestore;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionRegistration;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionID;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

@ActionID(category = "Build",
id = "org.avbravo.dbackrestore.DBackRestore")
@ActionRegistration(iconBase = "org/avbravo/dbackrestore/restoredb.png",
displayName = "#CTL_DBackRestore")
@ActionReferences({
    @ActionReference(path = "Toolbars/File", position = 0)
})
@Messages("CTL_DBackRestore=DBackRestore")
public final class DBackRestore implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        TopComponent tc = WindowManager.getDefault().findTopComponent("DBackRestoreTopComponent");
                tc.open();
                tc.requestActive();
    }
}
