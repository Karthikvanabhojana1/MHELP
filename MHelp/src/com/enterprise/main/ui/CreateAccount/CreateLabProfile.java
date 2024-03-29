/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.enterprise.main.ui.CreateAccount;

import com.enterprise.main.Business;
import com.enterprise.main.Entity.Person;
import com.enterprise.main.HomePage;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.UserLabProfile;
import com.enterprise.main.usermanagement.UserAccount;
import com.enterprise.main.usermanagement.UserAccountDirectory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author karthikv
 */
public class CreateLabProfile extends javax.swing.JPanel {
    /**
     * Creates new form CreateLabProfile
     */
    
    Business business;
    JPanel CardSequencePanel;
    Properties properties;
    public CreateLabProfile(Business business, JPanel CardSequencePanel, Properties properties) {

        initComponents();
        this.business=business;
        this.CardSequencePanel=CardSequencePanel;
        this.properties=properties;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtLabName = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtLabPhoneNumber = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtConfirmPassowrd = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lab Account");

        jLabel2.setText("Lab Name");

        jLabel3.setText("Lab Location");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Lab Email Id:");

        jLabel5.setText("UserName:");

        jLabel6.setText("Lab Phone Number:");

        jLabel7.setText("Password");

        jLabel8.setText("Confirm Password");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtConfirmPassowrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPassowrdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConfirmPassowrd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLabName)
                            .addComponent(txtLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txtLabPhoneNumber)
                            .addComponent(txtPassword))))
                .addGap(138, 138, 138))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtConfirmPassowrd, txtEmail, txtLabName, txtLabPhoneNumber, txtLocation, txtPassword, txtUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLabName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLabPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtConfirmPassowrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jButton1)
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtConfirmPassowrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPassowrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPassowrdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
           String city=txtLocation.getText();
        String password = txtPassword.getText();
        String confirmpassword = txtConfirmPassowrd.getText();
        String firstname = txtLabName.getText();
        String useremail = txtEmail.getText();
        String phoneNumber = txtLabPhoneNumber.getText();
        String userName = txtUserName.getText();
        
        
        
        if (firstname.isEmpty()  || useremail.isEmpty() || userName.isEmpty()
                || phoneNumber.isEmpty() || password.isEmpty() || confirmpassword.isEmpty() || city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isValidEmail(useremail)) {
            JOptionPane.showMessageDialog(this, "Invalid email format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!isValidPhoneNumber(phoneNumber)) {
            JOptionPane.showMessageDialog(this, "Invalid phone number format", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!isValidPassword(password)) {
            JOptionPane.showMessageDialog(this, "Password Not Valid", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!password.equals(confirmpassword)) {
            JOptionPane.showMessageDialog(this, "Password and confirm password do not match", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        if (uadirectory.isUsernameTaken(userName)) {
            JOptionPane.showMessageDialog(this, "Username is already taken, please choose a different one.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
               UUID uuid = UUID.randomUUID();
        int userid = Math.abs(uuid.hashCode());
        
        
        Person person= new Person( userid,  firstname,  "",  useremail,  phoneNumber,  city,  password,  userName);

        
        UserLabProfile labProfile=business.getUserlabDirectory().newLabProfile(person);
        
         UserAccount ua1 = uadirectory.newUserAccount(labProfile, userName, password);
         
          String url =properties.getProperty("url");
//        
        String userdbName = properties.getProperty("userdbName");
        String pass = properties.getProperty("passwordDB");
        
try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,userdbName,pass);
             Statement statement = connection.createStatement();
//             String sql="INSERT INTO PERSON values("+userid+","+firstname+","+lastname+","+useremail+","+phoneNumber+","+password+","+userName+","+status+")";
//                          String sql="INSERT INTO PERSON values("+userid+","+firstname+","+lastname+","+useremail+","+phoneNumber+")";
            String sql = "INSERT INTO Lab (LabName, Email, PhoneNumber, UserName, Password, Location) VALUES (?, ?, ?, ?, ?, ?)";


PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Set parameter values
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, useremail);
            preparedStatement.setString(3, phoneNumber);
            preparedStatement.setString(4, userName);
            preparedStatement.setString(5, password);
            preparedStatement.setString(6, city);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();

            // Check if the insertion was successful
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }

             statement.executeUpdate(sql);
             JOptionPane.showMessageDialog(this, "New Profile has been created");
        
        } catch (Exception ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
             JOptionPane.showMessageDialog(this, "New Profile has been created");
//        
    }//GEN-LAST:event_jButton1ActionPerformed

 private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    private boolean isValidPassword(String password) {
        // Password must be at least 8 characters long and include at least one uppercase letter, one lowercase letter, one digit, and one special character
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return password.matches(passwordRegex);
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^(\\d{10}|\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4}|\\(\\d{3}\\)[-\\s]?\\d{3}[-\\s]?\\d{4})$";
        return phoneNumber.matches(phoneRegex);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtConfirmPassowrd;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLabName;
    private javax.swing.JTextField txtLabPhoneNumber;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
