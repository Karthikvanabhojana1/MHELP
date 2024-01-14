/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.enterprise.main.ui.CreateAccount;

import com.enterprise.main.Business;
import com.enterprise.main.Entity.Person;
import com.enterprise.main.HomePage;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.directory.DoctorDirectory;
import com.enterprise.main.usermanagement.UserAccount;
import com.enterprise.main.usermanagement.UserAccountDirectory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
public class CreateDoctorsAccount extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorsAccount
     */
       javax.swing.JPanel CardSequencePanel;
    Business business;
    Properties properties;
    public CreateDoctorsAccount(Business business,JPanel CardSequencePanel,Properties properties) {
        initComponents();
        this.properties=properties;
        this.business=business;
        this.CardSequencePanel=CardSequencePanel;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSpciality = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEducation = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        textDate = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Create Account");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name");

        jLabel4.setText("Email Id:");

        jLabel5.setText("User Name:");

        jLabel6.setText("Password:");

        jLabel7.setText("Confirm Password:");

        jLabel8.setText("Phone Number");

        btnSubmit.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSubmit.setText("Create Account");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel10.setText("City");

        jLabel11.setText("Speciality");

        txtSpciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpcialityActionPerformed(evt);
            }
        });

        jLabel9.setText("Education");

        jLabel12.setText("Started Practice on");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel12)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(273, 273, 273)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmailId)
                                .addComponent(txtUserName)
                                .addComponent(txtPhoneNumber)
                                .addComponent(textDate)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(317, 317, 317)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLastName)
                                .addComponent(txtFirstName)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7))
                            .addGap(273, 273, 273)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtConfirmPassword)
                                .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCity)
                                .addComponent(txtSpciality)
                                .addComponent(txtEducation)))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailId)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtUserName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPhoneNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(textDate))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtSpciality))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtEducation))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtCity))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String city=txtCity.getText();
        String password = txtPassword.getText();
        String confirmpassword = txtConfirmPassword.getText();
        String firstname = txtFirstName.getText();
        String lastname = txtLastName.getText();
        String useremail = txtEmailId.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String userName = txtUserName.getText();
        String datevalue=textDate.getText();
        String speciality=txtSpciality.getText();
        String education =txtEducation.getText();
        String rating="0";
         UUID uuid = UUID.randomUUID();
        int userid = Math.abs(uuid.hashCode());
        
            if (firstname.isEmpty() || lastname.isEmpty() || useremail.isEmpty() || userName.isEmpty() ||
            phoneNumber.isEmpty() || datevalue.isEmpty() || speciality.isEmpty() || education.isEmpty() ||
            password.isEmpty() || confirmpassword.isEmpty() || city.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all the fields.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        if (firstname.isEmpty() || lastname.isEmpty() || useremail.isEmpty() || userName.isEmpty()
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
        
        
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedDate = LocalDate.parse(datevalue, formatter);
           String url =properties.getProperty("url");
//        
        String userdbName = properties.getProperty("userdbName");
        String pass = properties.getProperty("passwordDB");
        

        
        DoctorDirectory doctorDirectory=business.getDoctorDirectory();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,userdbName,pass);
             Statement statement = connection.createStatement();
//             String sql="INSERT INTO PERSON values("+userid+","+firstname+","+lastname+","+useremail+","+phoneNumber+","+password+","+userName+","+status+")";
//                          String sql="INSERT INTO PERSON values("+userid+","+firstname+","+lastname+","+useremail+","+phoneNumber+")";
String sql = "INSERT INTO Doctors VALUES ('" + userid + "','" + firstname + "','" + lastname + "','" +
             useremail + "','" + phoneNumber + "','" + city + "','" + password + "','" + userName + "','" + parsedDate + "','" + speciality + "','" + education + "','" + rating + "')";




Person person= new Person( userid,  firstname,  lastname,  useremail,  phoneNumber,  city,  password,  userName);



   DoctorProfile doctorsprofile= doctorDirectory.newDoctorProfile(person);
   doctorsprofile.setEducation(education);
   doctorsprofile.setSpeciality(speciality);
   doctorsprofile.setYearOfExperience(datevalue);
            UserAccount ua1 = uadirectory.newUserAccount(doctorsprofile, userName, password);

             statement.executeUpdate(sql);
             JOptionPane.showMessageDialog(this, "New Profile has been created");
        
        } catch (Exception ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtSpcialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpcialityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpcialityActionPerformed
                                       
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
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField textDate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtEducation;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSpciality;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
