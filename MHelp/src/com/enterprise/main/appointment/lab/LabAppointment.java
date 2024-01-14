/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.appointment.lab;

import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.Profiles.UserLabProfile;
import com.enterprise.main.appointment.report.PatientReport;
import java.util.Date;

/**
 *
 * @author karthikv
 */
public class LabAppointment {
     private int appointmentid;
    private String appointmentStatus = "Active";
    private PatientProfile patientProfile;
    private UserLabProfile userLab;
    private DoctorProfile doctorProfile;
    private Date date;
    private LabReportmain report;
    
     public LabAppointment(int appointmentid, PatientProfile patientProfile, DoctorProfile doctorProfile,UserLabProfile userLab, Date date, LabReportmain report) {
        this.appointmentid = appointmentid;
        this.patientProfile = patientProfile;
        this.doctorProfile = doctorProfile;
        this.userLab=userLab;
        this.date = date;
        this.report = report;
    }
     
     public  LabAppointment(int id, PatientProfile patientProfile, DoctorProfile doctorProfile, Date date, UserLabProfile userLab) {
 this.appointmentid = id;
        this.patientProfile = patientProfile;
        this.doctorProfile = doctorProfile;
        this.date = date;
        this.userLab=userLab;
        report=new LabReportmain();

    }

    public UserLabProfile getUserLab() {
        return userLab;
    }

    public void setUserLab(UserLabProfile userLab) {
        this.userLab = userLab;
    }

    public int getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(int appointmentid) {
        this.appointmentid = appointmentid;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public PatientProfile getPatientProfile() {
        return patientProfile;
    }

    public void setPatientProfile(PatientProfile patientProfile) {
        this.patientProfile = patientProfile;
    }

    public DoctorProfile getDoctorProfile() {
        return doctorProfile;
    }

    public void setDoctorProfile(DoctorProfile doctorProfile) {
        this.doctorProfile = doctorProfile;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LabReportmain getReport() {
        return report;
    }

    public void setReport(LabReportmain report) {
        this.report = report;
    }
     
     
}
