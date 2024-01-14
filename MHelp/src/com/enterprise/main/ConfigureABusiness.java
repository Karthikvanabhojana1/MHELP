/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main;

import com.enterprise.main.Entity.Person;
import com.enterprise.main.Profiles.AdminProfile;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.Profiles.UserLabProfile;
import com.enterprise.main.appointment.Appointment;
import com.enterprise.main.appointment.AppointmentDirectory;
import com.enterprise.main.appointment.report.PatientReport;
import com.enterprise.main.directory.AdminDirectory;
import com.enterprise.main.directory.DoctorDirectory;
import com.enterprise.main.directory.PatientDirectory;
import com.enterprise.main.directory.UserLabDirectory;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.enterprise.main.usermanagement.UserAccountDirectory;
import com.enterprise.main.usermanagement.UserAccount;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.io.OutputStream;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;

/**
 *
 * @author karthikv
 */
public class ConfigureABusiness {

    static Business initialize() throws Exception {
        System.out.println("com.enterprise.main.ConfigureABusiness.initialize()");
        Business business = new Business();
        PatientDirectory patientDirectory = business.getPatientdirectory();
        DoctorDirectory doctorDirectory = business.getDoctorDirectory();
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        Person person001 = new Person(101, "Admin", "Admin", "admin@gmail.com", "9999999999", "Boston", "Admin,cafmin", "admin");
        ArrayList<DoctorProfile> doctorlist = doctorDirectory.getDoctorList();
        ArrayList<PatientProfile> patientList = patientDirectory.getPatientList();
//        AdminDirectory adminDirect=business.getAdminDirectory();

//        AdminProfile adminProfile=adminDirect.newAdminProfile(person001);
//        UserAccount ua2 = uadirectory.newUserAccount(adminProfile, "admin", "XXXX");
        Properties p = new Properties();
//        OutputStream os = new FileOutputStream("dataConfig.properties");
//        p.setProperty("url", "jdbc:mysql://localhost:3306/mydoctor");
//        p.setProperty("userdbName", "root");
//        p.setProperty("passwordDB", "k19971998");
//        p.store(os, null);
        InputStream is = new FileInputStream("dataConfig.properties");
        p.load(is);
        String url = p.getProperty("url");
//        
        String userdbName = p.getProperty("userdbName");
        String pass = p.getProperty("passwordDB");

        try ( Connection connection = DriverManager.getConnection(url, userdbName, pass);  PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PERSON");  ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String emailId = resultSet.getString("emailId");
                String phoneNumber = resultSet.getString("phoneNumber");
                String password = resultSet.getString("password");
                String userName = resultSet.getString("userName");
                String status = resultSet.getString("status");
                String city = resultSet.getString("city");

                Person person = new Person(id, firstName, lastName, emailId, phoneNumber, city, password, userName);
//                Person person = new Person(id, name, email);

                if (status.equals("Patient")) {
                    PatientProfile patientprofile = patientDirectory.newPatientProfile(person);
                    UserAccount ua = uadirectory.newUserAccount(patientprofile, userName, password);

                }

//else if(status.equals("Doctor")){
//   DoctorProfile doctorsprofile= doctorDirectory.newDoctorProfile(person);
//            UserAccount ua1 = uadirectory.newUserAccount(doctorsprofile, userName, password);
//    System.out.println(doctorDirectory.getDoctorList().size());
//        System.out.println(uadirectory.getUserAccountList().size());
//    
//}
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Doctor Loading the Data from SQL to the list that we have created
        try ( Connection connection = DriverManager.getConnection(url, userdbName, pass);  PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Doctors");  ResultSet resultSet = preparedStatement.executeQuery()) {
            String formattedDate = "";
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String emailId = resultSet.getString("emailId");
                String phoneNumber = resultSet.getString("phoneNumber");
                String password = resultSet.getString("password");
                String userName = resultSet.getString("userName");
                String city = resultSet.getString("city");
                String specialization = resultSet.getString("speciality");
                String education = resultSet.getString("education");
                int rating = resultSet.getInt("rating");
                try {
                    Date dateFromResultSet = resultSet.getDate("yearOfExperience");

                    java.util.Date utilDate = new java.util.Date(dateFromResultSet.getTime());

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    formattedDate = dateFormat.format(utilDate);

                    System.out.println("Formatted Date String: " + formattedDate);
                } catch (Exception e) {
                    e.printStackTrace(); // Handle the exception appropriately
                }
                Person person = new Person(id, firstName, lastName, emailId, phoneNumber, city, password, userName);

                DoctorProfile doctorsprofile = doctorDirectory.newDoctorProfile(person);
                doctorsprofile.setEducation(education);
                doctorsprofile.setSpeciality(specialization);
                doctorsprofile.setYearOfExperience(formattedDate);
                doctorsprofile.setRating(rating);

                UserAccount ua = uadirectory.newUserAccount(doctorsprofile, userName, password);
                System.out.println(doctorDirectory.getDoctorList().size());
                System.out.println(uadirectory.getUserAccountList().size());

            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

        //Appointment
        try ( Connection connection = DriverManager.getConnection(url, userdbName, pass);  PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Appointments");  ResultSet resultSet = preparedStatement.executeQuery()) {
            String formattedDate = "";
            while (resultSet.next()) {
                int id = resultSet.getInt("appointmentid");
                String appointmentstatus = resultSet.getString("appointmentStatus");
                int patientId = resultSet.getInt("patientId");
                int doctorId = resultSet.getInt("doctorId");
                Date date = resultSet.getDate("date");

                AppointmentDirectory appointmentdir = business.getAppointmentDirectory();
                Appointment appointment = appointmentdir.newAppointment(id, business.getPatientdirectory().findPatient(patientId), business.getDoctorDirectory().findDoctor(doctorId), date);

                appointmentdir.findAppointmentbyId(id).setAppointmentStatus(appointmentstatus);

                System.out.println("value after pushing" + appointment.getAppointmentid());
//          
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }

        //report 
        try ( Connection connection = DriverManager.getConnection(url, userdbName, pass)) {
            String selectSql = "SELECT * FROM mydoctor.patientreports";

            try ( PreparedStatement preparedStatement = connection.prepareStatement(selectSql)) {
                try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int reportNumber = resultSet.getInt("reportNumber");
                        int patientId = resultSet.getInt("patientid");
                        int doctorId = resultSet.getInt("doctorid");
                        String symptoms = resultSet.getString("symptoms");
                        boolean allergies = resultSet.getBoolean("allergies");
                        boolean onMedication = resultSet.getBoolean("onmedication");
                        boolean pastSurgeriesOrHealthIssue = resultSet.getBoolean("pastSurgeriesorhealthIssue");
                        boolean isSmoking = resultSet.getBoolean("isSmoking");
                        boolean isAlcohol = resultSet.getBoolean("isalcohol");
                        String bloodPressure = resultSet.getString("bloodPressure");
                        String heartBeat = resultSet.getString("heartBeat");
                        String additional = resultSet.getString("additional");
                        String feedback = resultSet.getString("feedback");
                        int appointmentId = resultSet.getInt("appointment");

                        AppointmentDirectory appointmentdir = business.getAppointmentDirectory();
                        Appointment apppointment = appointmentdir.findAppointmentbyId(appointmentId);

                        PatientReport patientReport = apppointment.getReport();
                        patientReport.setAddtional(additional);
                        patientReport.setAllergies(allergies);
                        patientReport.setFeedback(feedback);
                        patientReport.setPastSurgeriesorhealthIssue(pastSurgeriesOrHealthIssue);

                        patientReport.setPatientprofile(business.getPatientdirectory().findPatient(patientId));
                        patientReport.setDoctorProfile(business.getDoctorDirectory().findDoctor(doctorId));
                        patientReport.setAppointment(apppointment);
                        patientReport.setIsSmoking(isSmoking);
                        patientReport.setBloodPressure(bloodPressure);
                        patientReport.setIsalcohol(isAlcohol);
                        patientReport.setOnmedication(onMedication);
                        patientReport.setSymptoms(symptoms);
                        System.out.println("Report Number: " + reportNumber);
                        System.out.println("Patient ID: " + patientId);
                        System.out.println("Doctor ID: " + doctorId);
                        System.out.println("Symptoms: " + symptoms);
                        System.out.println("Allergies: " + allergies);
                        System.out.println("On Medication: " + onMedication);
                        System.out.println("Past Surgeries or Health Issue: " + pastSurgeriesOrHealthIssue);
                        System.out.println("Is Smoking: " + isSmoking);
                        System.out.println("Is Alcohol: " + isAlcohol);
                        System.out.println("Blood Pressure: " + bloodPressure);
                        System.out.println("Heart Beat: " + heartBeat);
                        System.out.println("Additional: " + additional);
                        System.out.println("Feedback: " + feedback);
                        System.out.println("Appointment ID: " + appointmentId);
                        System.out.println("----------------------------");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Connection connection = DriverManager.getConnection(url, userdbName, pass);

            // SQL query to select all columns from LabClass
            String sql = "SELECT * FROM Lab";

            // Create a PreparedStatement
            try ( PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

                // Execute the query
                try ( ResultSet resultSet = preparedStatement.executeQuery()) {

                    // Iterate through the result set and print the values
                    while (resultSet.next()) {
                        int labId = resultSet.getInt("LabId");
                        String labName = resultSet.getString("LabName");
                        String email = resultSet.getString("Email");
                        String phoneNumber = resultSet.getString("PhoneNumber");
                        String userName = resultSet.getString("UserName");
                        String passwordValue = resultSet.getString("Password");
                        String location = resultSet.getString("Location");

                        // Print or process the retrieved values
                        System.out.println("LabId: " + labId + ", LabName: " + labName + ", Email: " + email
                                + ", PhoneNumber: " + phoneNumber + ", UserName: " + userName
                                + ", Password: " + passwordValue + ", Location: " + location);

                        UserLabDirectory userlabDir = business.getUserlabDirectory();
                        Person person = new Person(labId, labName, "", email, phoneNumber, location, passwordValue, userName);

                        UserLabProfile userLab = userlabDir.newLabProfile(person);
                        UserAccount ua = uadirectory.newUserAccount(userLab, userName, passwordValue);

                    }
                }
            }

            // Close the connection
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception as needed
        }

        return business;
    }
}
