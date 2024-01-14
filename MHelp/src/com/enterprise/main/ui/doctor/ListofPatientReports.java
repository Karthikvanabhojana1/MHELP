/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.enterprise.main.ui.doctor;

import com.enterprise.main.Business;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.appointment.Appointment;
import com.enterprise.main.appointment.AppointmentDirectory;
import com.enterprise.main.appointment.report.PatientReport;
import java.awt.CardLayout;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthikv
 */
public class ListofPatientReports extends javax.swing.JPanel {

    /**
     * Creates new form ListofPatientReports
     */
 
        JPanel jpanelWorkArea;
    Business business;
    DoctorProfile doctorsProfile;
    Properties properties;
    PatientProfile patient;
    /**
     * Creates new form PatientDetailsSection
     */
    public ListofPatientReports(JPanel jpanelWorkArea, Business business, DoctorProfile doctorsProfile, Properties properties, PatientProfile patient) {
        initComponents();
            this.properties=properties;
        this.jpanelWorkArea=jpanelWorkArea;
        this.business=business;
        this.doctorsProfile=doctorsProfile;
        this.patient=patient;
        
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReports = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Reports");

        tblReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Doctors Name", "Appointmenrt Number", "Report Summary"
            }
        ));
        jScrollPane1.setViewportView(tblReports);

        jButton1.setText("View More Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton2)
                .addGap(261, 261, 261)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        int row = tblReports.getSelectedRow();
        if(row<0) {
                JOptionPane.showMessageDialog(this, "Please select a row to View Appointment Details.", "Error", JOptionPane.ERROR_MESSAGE);
    
            return;
        }
        
        int appointmentId = (int) tblReports.getValueAt(row, 2);
        System.out.println(appointmentId);
        Appointment appointment=business.getAppointmentDirectory().findAppointmentbyId(appointmentId);
        System.out.println(appointment.getAppointmentid());
//        
PatientReport patientReport=appointment.getReport();
        
        
        DisplayPatientReport listofPatientReports=new DisplayPatientReport(jpanelWorkArea,business,doctorsProfile,properties,patient,patientReport, appointmentId);
        jpanelWorkArea.add("PatientDetailsSection", listofPatientReports);
        CardLayout layout=(CardLayout) jpanelWorkArea.getLayout();
        layout.next(jpanelWorkArea);  
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jpanelWorkArea.remove(this);
        ((java.awt.CardLayout) jpanelWorkArea.getLayout()).next(jpanelWorkArea);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReports;
    // End of variables declaration//GEN-END:variables

    private void populate() {
           DefaultTableModel model = (DefaultTableModel) tblReports.getModel();
        AppointmentDirectory appointmentDirectory = business.getAppointmentDirectory();
        model.setRowCount(0);

        for (Appointment appointment : appointmentDirectory.getAppointmentList()) {
            if(appointment.getPatientProfile().getPerson().getId()==patient.getPerson().getId()) {
                if(!appointment.getAppointmentStatus().equals("Active")) {
                 Object row[] = new Object[6];
            PatientProfile patientprofile=appointmentDirectory.findPatientbyAppointment(appointment.getAppointmentid());
            row[0] = patientprofile.getPerson().getFirstName()+ " " +patientprofile.getPerson().getLastName();
            row[1] = doctorsProfile.getPerson().getFirstName()+ " " +doctorsProfile.getPerson().getLastName();
            row[2] = appointment.getAppointmentid();
            row[3] = appointment.getReport().getFeedback();
            ((DefaultTableModel) tblReports.getModel()).addRow(row);
            }
            }
        }
    }

}
