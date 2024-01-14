 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.appointment.report;

import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.appointment.Appointment;

/**
 *
 * @author karthikv
 */
public class PatientReport {
private int reportNumber;    
private PatientProfile patientprofile;
private DoctorProfile doctorProfile;
private String symptoms;
private boolean allergies;
private boolean onmedication;
private boolean pastSurgeriesorhealthIssue;  
private boolean isSmoking;
private boolean isalcohol;
private String bloodPressure;
private String heartBeat;
private String addtional;
private String feedback;
private Appointment appointment;

    public boolean isAllergies() {
        return allergies;
    }

    public void setAllergies(boolean allergies) {
        this.allergies = allergies;
    }

    public boolean isOnmedication() {
        return onmedication;
    }

    public void setOnmedication(boolean onmedication) {
        this.onmedication = onmedication;
    }

    public boolean isPastSurgeriesorhealthIssue() {
        return pastSurgeriesorhealthIssue;
    }

    public void setPastSurgeriesorhealthIssue(boolean pastSurgeriesorhealthIssue) {
        this.pastSurgeriesorhealthIssue = pastSurgeriesorhealthIssue;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
    public String getAddtional() {
        return addtional;
    }

    public void setAddtional(String addtional) {
        this.addtional = addtional;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public PatientProfile getPatientprofile() {
        return patientprofile;
    }

    public void setPatientprofile(PatientProfile patientprofile) {
        this.patientprofile = patientprofile;
    }

    public DoctorProfile getDoctorProfile() {
        return doctorProfile;
    }

    public void setDoctorProfile(DoctorProfile doctorProfile) {
        this.doctorProfile = doctorProfile;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isIsSmoking() {
        return isSmoking;
    }

    public void setIsSmoking(boolean isSmoking) {
        this.isSmoking = isSmoking;
    }

    public boolean isIsalcohol() {
        return isalcohol;
    }

    public void setIsalcohol(boolean isalcohol) {
        this.isalcohol = isalcohol;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getHeartBeat() {
        return heartBeat;
    }

    public void setHeartBeat(String heartBeat) {
        this.heartBeat = heartBeat;
    }

    
   
    public PatientReport() {
    }

    public void setOnmedication(String addtionalInfo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

}
