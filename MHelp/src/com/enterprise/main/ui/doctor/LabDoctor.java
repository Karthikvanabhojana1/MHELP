/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.enterprise.main.ui.doctor;

import com.enterprise.main.Business;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.appointment.lab.LabAppointment;
import com.enterprise.main.appointment.lab.LabAppointmentList;
import com.enterprise.main.appointment.lab.LabReportmain;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthikv
 */
public class LabDoctor extends javax.swing.JPanel {

    /**
     * Creates new form LabDoctor
     */
    
    JPanel CardSequencePanel;
    Business business;
    Properties properties;
    DoctorProfile doctorsProfile;
    public LabDoctor(JPanel CardSequencePanel, Business business, Properties properties, DoctorProfile doctorsProfile) {

        initComponents();
        this.CardSequencePanel=CardSequencePanel;
        this.business=business;
        this.properties=properties;
        this.doctorsProfile=doctorsProfile;
        populate();
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblPending = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        tblPending.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient Username", "Appointment Id", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblPending);

        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(339, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:\

        int row = tblPending.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(this, "Please select a row.", "Error", JOptionPane.ERROR_MESSAGE);

            return;
        }
        int appointmentId = (int) tblPending.getValueAt(row, 2);
        LabAppointment labappointment=business.getLabAppointment().findAppointmentId(appointmentId);
        LabReportmain labmain=labappointment.getReport();
        LabReportDoctorsSide landingPageLab = new LabReportDoctorsSide(CardSequencePanel, business,doctorsProfile,labmain,labappointment,properties);
        
        
        CardSequencePanel.removeAll();
        CardSequencePanel.add("Lab", landingPageLab);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPending;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        
        
        
           DefaultTableModel model = (DefaultTableModel) tblPending.getModel();
        LabAppointmentList labAppointlist = business.getLabAppointment();
        model.setRowCount(0);  
        for (LabAppointment appointment : labAppointlist.getLabAppointmentList()) {
            if(appointment.getDoctorProfile().getPerson().getId()==doctorsProfile.getPerson().getId()) {
                     Object row[] = new Object[4];
            row[0]= appointment.getPatientProfile().getPerson().getFirstName();
            row[1] =appointment.getPatientProfile().getPerson().getUserName();
            row[2] = appointment.getAppointmentid();
            row[3] =appointment.getAppointmentStatus();
           
            ((DefaultTableModel) tblPending.getModel()).addRow(row);
            }
    }
    }
}
