/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.appointment;

import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.appointment.report.PatientReport;
import java.util.Date;

/**
 *
 * @author karthikv
 */
public class Appointment {
    private int appointmentid;
    private String appointmentStatus = "Active";
    private PatientProfile patientProfile;
    private DoctorProfile doctorProfile;
    private Date date;
    private Date upcommingAppointment;
    private PatientReport report;
//   private Time

    public Appointment(int appointmentid, PatientProfile patientProfile, DoctorProfile doctorProfile, Date date, PatientReport report) {
        this.appointmentid = appointmentid;
        this.patientProfile = patientProfile;
        this.doctorProfile = doctorProfile;
        this.date = date;
        upcommingAppointment = date;
        this.report = report;
    }

  public  Appointment(int id, PatientProfile patientProfile, DoctorProfile doctorProfile, Date date) {
 this.appointmentid = id;
        this.patientProfile = patientProfile;
        this.doctorProfile = doctorProfile;
        this.date = date;
        upcommingAppointment = date;
        report=new PatientReport();

    }

    

    public Date getUpcommingAppointment() {
        return upcommingAppointment;
    }

    public void setUpcommingAppointment(Date upcommingAppointment) {
        this.upcommingAppointment = upcommingAppointment;
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

    public PatientReport getReport() {
        return report;
    }

    public void setReport(PatientReport report) {
        this.report = report;
    }
}
