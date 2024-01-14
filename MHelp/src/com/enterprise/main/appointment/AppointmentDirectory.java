/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.appointment;

import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.appointment.Appointment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author karthikv
 */
public class AppointmentDirectory {

    public List<Appointment> appointmentList;

    public AppointmentDirectory() {

        appointmentList = new ArrayList<>();
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public Appointment newAppointment(int id, PatientProfile patientProfile, DoctorProfile doctorProfile, Date date) {
        Appointment appointment1 = new Appointment(id, patientProfile, doctorProfile, date);
        appointmentList.add(appointment1);
        return appointment1;
    }
    public Appointment findAppointmentbyId(int appointmentid) {

        for (Appointment appointment : appointmentList) {
            if (appointment.getAppointmentid() == appointmentid) {
                return appointment;
            }
        }
        return null;
    }

    public Appointment findAppointmentStatus(String status) {

        for (Appointment appointment : appointmentList) {

            if (appointment.getAppointmentStatus().equals(status)) {
                return appointment;
            }
        }
        return null;
    }
    public boolean anyActiveAppointmentDoctor(DoctorProfile doctor) {
                for (Appointment appointment : appointmentList) {
                    if(appointment.getDoctorProfile().getPerson().getId()== doctor.getPerson().getId()) {
                    if(appointment.getAppointmentStatus().equals("Active")) {
                        return true;
                    }
                    else{
                        return false;
                    }
                    }
                    
                }
       return false;
    }
    
     public boolean anyActiveAppointmentPatient(PatientProfile patient) {
                for (Appointment appointment : appointmentList) {
                    if(appointment.getPatientProfile().getPerson().getId()== patient.getPerson().getId()) {
                    if(appointment.getAppointmentStatus().equals("Active")) {
                        return true;
                    }
                    else{
                        return false;
                    }
                    }
                    
                }
       return false;
    }
     
     
     
     
     public PatientProfile findPatientbyAppointment(int id){
            for (Appointment appointment : appointmentList) {
               if(appointment.getAppointmentid()==id) {
                   return appointment.getPatientProfile();
               }
            }
        return null;
     }

     
     
     public void deleteAppointment(Appointment appointment){
    appointmentList.remove(appointment);
}

}
