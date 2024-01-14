/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.appointment.lab;

import com.enterprise.main.Entity.Person;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.Profiles.UserLabProfile;
import com.enterprise.main.appointment.Appointment;

/**
 *
 * @author karthikv
 */
public class LabReportmain {
private int reportNumber;    
private PatientProfile patientprofile;
private DoctorProfile doctorProfile;
private UserLabProfile userLab;
private Appointment appointment;
private String whiteBloodcells;

private String RBCs;
private String Hemoglobin;
private String sugarLeve;
private String bp;

    public LabReportmain() {
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

    public UserLabProfile getUserLab() {
        return userLab;
    }

    public void setUserLab(UserLabProfile userLab) {
        this.userLab = userLab;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public String getWhiteBloodcells() {
        return whiteBloodcells;
    }

    public void setWhiteBloodcells(String whiteBloodcells) {
        this.whiteBloodcells = whiteBloodcells;
    }

    public String getRBCs() {
        return RBCs;
    }

    public void setRBCs(String RBCs) {
        this.RBCs = RBCs;
    }

    public String getHemoglobin() {
        return Hemoglobin;
    }

    public void setHemoglobin(String Hemoglobin) {
        this.Hemoglobin = Hemoglobin;
    }

    public String getSugarLeve() {
        return sugarLeve;
    }

    public void setSugarLeve(String sugarLeve) {
        this.sugarLeve = sugarLeve;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }
    


}
