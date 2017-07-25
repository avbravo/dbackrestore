package org.avbravo.nbdbdump.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.avbravo.nbdbdump.NbDbDumpDialog;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

// https://www.electrictoolbox.com/mysqldump-schema-only/
@ActionID(
        category = "Database",
        id = "org.avbravo.nbdbdump.actions.DumpDataWithMySQLDump"
)
@ActionRegistration(displayName = "#CTL_DumpDataWithMySQLDump")
@ActionReferences(value = {
    @ActionReference(path = "Databases/Explorer/Catalog/Actions", position = 460),
//    @ActionReference(path = "Databases/Explorer/Schema/Actions", position = 460),
    @ActionReference(path = "Databases/Explorer/Table/Actions", position = 460),
        @ActionReference(path = "Databases/Explorer/TableList/Actions", position = 460)
})
@Messages("CTL_DumpDataWithMySQLDump=Dump data with mysqldump")
public final class DumpDataWithMySQLDumpAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        NbDbDumpDialog backRestoreTopComponent = new NbDbDumpDialog();
        backRestoreTopComponent.setVisible(true);
    }
}