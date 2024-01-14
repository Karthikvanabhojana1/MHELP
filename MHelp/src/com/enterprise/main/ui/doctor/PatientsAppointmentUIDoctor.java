/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.enterprise.main.ui.doctor;

import com.enterprise.main.Business;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.appointment.Appointment;
import java.awt.CardLayout;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author karthikv
 */
public class PatientsAppointmentUIDoctor extends javax.swing.JPanel {

    JPanel jpanelWorkArea;
    Business business;
    DoctorProfile doctorsProfile;
    Appointment appointment;
    PatientProfile patient;
    Properties properties;

    /**
     * Creates new form PatientsAppointmentUIDoctor
     */
    public PatientsAppointmentUIDoctor(JPanel jpanelWorkArea, Business business, DoctorProfile doctorsProfile, Appointment appointment, PatientProfile patient, Properties properties) {
        initComponents();
        this.jpanelWorkArea = jpanelWorkArea;
        this.business = business;
        this.doctorsProfile = doctorsProfile;
        this.appointment = appointment;
        this.patient = patient;
        this.properties = properties;
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

        txtPatientsName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtZoomLink = new javax.swing.JTextField();
        btnCompleteAppointment = new javax.swing.JButton();
        txtCity = new javax.swing.JTextField();
        labelIcon = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        txtPatientsName.setEditable(false);
        txtPatientsName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtGender.setEditable(false);
        txtGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        txtEmailId.setEditable(false);
        txtEmailId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtPhoneNumber.setEditable(false);
        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        txtZoomLink.setEditable(false);
        txtZoomLink.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnCompleteAppointment.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCompleteAppointment.setText("Completed Appointment");
        btnCompleteAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteAppointmentActionPerformed(evt);
            }
        });

        txtCity.setEditable(false);
        txtCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        labelIcon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnCancel.setText("Cancel Appointment");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel1.setText("ZoomLink");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(labelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCity)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnCompleteAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPhoneNumber)
                    .addComponent(txtPatientsName)
                    .addComponent(txtGender)
                    .addComponent(txtEmailId)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtZoomLink, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPatientsName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtZoomLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(302, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnCompleteAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteAppointmentActionPerformed
          PatientReportForm patientReportForm=new PatientReportForm(jpanelWorkArea,business,doctorsProfile,properties,patient,appointment);
        jpanelWorkArea.add("CompletedAppointmentUI", patientReportForm);
        CardLayout layout=(CardLayout) jpanelWorkArea.getLayout();
        layout.next(jpanelWorkArea);
    


    }//GEN-LAST:event_btnCompleteAppointmentActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int appointmentIdToUpdate = appointment.getAppointmentid();
        String newStatus = "Canceled";
        String url = properties.getProperty("url");
        String userdbName = properties.getProperty("userdbName");
        String pass = properties.getProperty("passwordDB");
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to Finish the Appointment with  " + patient.getPerson().getFirstName() + " " + patient.getPerson().getLastName(), "Confirm Cancellation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            Appointment appointment2 = business.getAppointmentDirectory().findAppointmentbyId(appointment.getAppointmentid());
            appointment2.setAppointmentStatus("Cancelled");
            try ( Connection connection = DriverManager.getConnection(url, userdbName, pass)) {
                String updateQuery = "UPDATE mydoctor.Appointments SET appointmentStatus = ? WHERE appointmentid = ?";
                try ( PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                    preparedStatement.setString(1, newStatus);
                    preparedStatement.setInt(2, appointmentIdToUpdate);
                    int rowsAffected = preparedStatement.executeUpdate();
                    System.out.println(rowsAffected + " row(s) updated.");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(this, "The Appointment for " + patient.getPerson().getFirstName() + " " + patient.getPerson().getLastName() + " was Cancelled");
        
        
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCompleteAppointment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtPatientsName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtZoomLink;
    // End of variables declaration//GEN-END:variables

    private void populate() {

        txtCity.setText(patient.getPerson().getCity());
        txtEmailId.setText(patient.getPerson().getEmailId());
        txtPatientsName.setText(patient.getPerson().getFirstName() + " " + patient.getPerson().getLastName());
        txtPhoneNumber.setText(patient.getPerson().getPhoneNumber());
        txtZoomLink.setText(doctorsProfile.getMeetingLink());
        txtCity.setText(patient.getPerson().getCity());
        lblImage.setIcon(new ImageIcon(this.getClass().getResource("/Images/patientMale.png")));
        labelIcon.setIcon(new ImageIcon(this.getClass().getResource("/Images/locationicon.png")));
txtGender.setText(patient.getGender());
    }
}
