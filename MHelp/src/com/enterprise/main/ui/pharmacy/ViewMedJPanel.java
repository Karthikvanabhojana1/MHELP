/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.enterprise.main.ui.pharmacy;

import com.enterprise.main.Business;
import com.enterprise.main.Profiles.PharmacyProfile;
import com.enterprise.main.directory.Medicine;
import com.enterprise.main.directory.MedicineCatalog;
import com.enterprise.main.directory.PharmacyDirectory;
import com.enterprise.main.ui.CreateAccount.CreatePharmaCoAccount;
import com.enterprise.main.ui.patient.BookingAppointment;
import java.awt.CardLayout;
import java.util.Properties;
import javax.print.attribute.standard.MediaSize;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shrey
 */
public class ViewMedJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddMedJPanel
     */
  
   javax.swing.JPanel CardSequencePanel;
   Business business;
    PharmacyProfile pharmacyProfile;
    Properties properties;
    

    /**
     * Creates new form ViewMedJPanel
     */
    public ViewMedJPanel(JPanel CardSequencePanel,Business business, PharmacyProfile pharmacyProfile, Properties properties) {
        initComponents();
        
        this.CardSequencePanel=CardSequencePanel;
        this.business=business;
        this.pharmacyProfile = pharmacyProfile;
        this.properties=properties;
        
        
    }
        public void refreshMedicineTable() {
  PharmacyDirectory pharmacyDirectory = business.getPharmacyDirectory(); 
    MedicineCatalog medicineCatalog = pharmacyDirectory.getMedicineCatalog();

        // Populate the table with medicine data
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Medicine medicine : medicineCatalog.getMedicineCatalog()) {
            Object[] row = {medicine.getMedName(), medicine.getMedId(), medicine.getExpiryDate(), medicine.isMedAvail(), medicine.getPrice()};
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNewMed = new javax.swing.JButton();
        btnRefreshTable = new javax.swing.JButton();
        btnDeleteMed = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Medicine Id", "Expiry Date", "Stock Availaibility", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnNewMed.setText("New Medicine");
        btnNewMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMedActionPerformed(evt);
            }
        });

        btnRefreshTable.setText("Refresh Table");
        btnRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableActionPerformed(evt);
            }
        });

        btnDeleteMed.setText("Delete Medicine");
        btnDeleteMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnRefreshTable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnNewMed)
                        .addGap(148, 148, 148)
                        .addComponent(btnDeleteMed)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewMed)
                    .addComponent(btnDeleteMed))
                .addGap(18, 18, 18)
                .addComponent(btnRefreshTable)
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMedActionPerformed
        // TODO add your handling code here:
          ManageMedJPanel manageMedJPanel=new ManageMedJPanel(CardSequencePanel,business,pharmacyProfile,properties);
        CardSequencePanel.add("ManageMedJPanel", manageMedJPanel);
        CardLayout layout=(CardLayout) CardSequencePanel.getLayout();
        layout.next(CardSequencePanel);
    }//GEN-LAST:event_btnNewMedActionPerformed

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        // TODO add your handling code here:
         refreshMedicineTable();
    }//GEN-LAST:event_btnRefreshTableActionPerformed

    private void btnDeleteMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMedActionPerformed
        // TODO add your handling code here:
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow >= 0) {
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this medicine?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            PharmacyDirectory pharmacyDirectory = business.getPharmacyDirectory();
            MedicineCatalog medicineCatalog = pharmacyDirectory.getMedicineCatalog();
            Medicine medicineToDelete = medicineCatalog.getMedicineCatalog().get(selectedRow);

            medicineCatalog.removeMedicine(medicineToDelete);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(selectedRow);

            JOptionPane.showMessageDialog(this, "Medicine deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
    }
  
    }//GEN-LAST:event_btnDeleteMedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteMed;
    private javax.swing.JButton btnNewMed;
    private javax.swing.JButton btnRefreshTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}