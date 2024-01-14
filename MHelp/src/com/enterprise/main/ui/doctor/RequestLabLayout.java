/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.enterprise.main.ui.doctor;

import com.enterprise.main.Business;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.Profiles.UserLabProfile;
import com.enterprise.main.appointment.Appointment;
import com.enterprise.main.appointment.AppointmentDirectory;
import com.enterprise.main.appointment.lab.LabAppointment;
import com.enterprise.main.appointment.lab.LabAppointmentList;
import com.enterprise.main.directory.UserLabDirectory;
import java.time.Instant;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthikv
 */
public class RequestLabLayout extends javax.swing.JPanel {

    /**
     * Creates new form RequestLabLayout
     */
    JPanel CardSequencePanel;
    Business business;
    DoctorProfile doctorsProfile;
    Properties properties;
    public RequestLabLayout(JPanel CardSequencePanel, Business business, DoctorProfile doctorsProfile, Properties properties) {

        initComponents();
        this.CardSequencePanel=CardSequencePanel;
        this.business=business;
        this.doctorsProfile=doctorsProfile;
        this.properties=properties;
        
        populateTable();
        
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
        jButton1 = new javax.swing.JButton();
        txtUserId = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lab Name", "Email Id", "Phone Number", "User Name"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
                 
                 

        if(row<0) {
            JOptionPane.showMessageDialog(this, "Please select a row.", "Error", JOptionPane.ERROR_MESSAGE);

            return;
        }
                         String id = (String) jTable1.getValueAt(row, 3);
UserLabProfile userLab=business.getUserlabDirectory().findLabString(id);
        
        if(business.getPatientdirectory().findPatientbyuserId(txtUserId.getText()).equals(null)) {
            JOptionPane.showMessageDialog(this, "Please select the correct userId");
            return;
        }
               UUID uuid = UUID.randomUUID();
            int userid = Math.abs(uuid.hashCode());
                    LabAppointment labAppointment = business.getLabAppointment().newAppointment(userid, business.getPatientdirectory().findPatientbyuserId(txtUserId.getText()), doctorsProfile, Date.from(Instant.now()),userLab);
                    
                    
                                JOptionPane.showMessageDialog(this, "Lab Appointment Sucessfull");

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        UserLabDirectory labappointmentList = business.getUserlabDirectory();
        model.setRowCount(0);
        
        
        
        for (UserLabProfile lab : labappointmentList.getLabList()) {
            
            
                 Object row[] = new Object[4];
            row[0]=lab.getPerson().getFirstName();
            row[1] = lab.getPerson().getEmailId();
            row[2] = lab.getPerson().getPhoneNumber();
            row[3] = lab.getPerson().getUserName();
           
            ((DefaultTableModel) jTable1.getModel()).addRow(row);
            
            
        }
    }
}
