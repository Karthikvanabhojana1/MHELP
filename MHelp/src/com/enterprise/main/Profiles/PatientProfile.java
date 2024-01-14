/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.Profiles;

import com.enterprise.main.Entity.Person;
import com.enterprise.main.appointment.Appointment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author karthikv
 */
public class PatientProfile extends Profile {
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGeneder(String geneder) {
        this.gender = geneder;
    }
    
       private List<Appointment> appointmentParentlist=new ArrayList<>();
      public PatientProfile(Person person) {

        super(person);
    }

    public List<Appointment> getAppointmentParentlist() {
        return appointmentParentlist;
    }

    public void setAppointmentParentlist(List<Appointment> appointmentParentlist) {
        this.appointmentParentlist = appointmentParentlist;
    }
      
      public Appointment newPatientAppointment(int id, PatientProfile patientProfile, DoctorProfile doctorProfile, Date date) {
        Appointment appointment1 = new Appointment(id, patientProfile, doctorProfile, date);
        appointmentParentlist.add(appointment1);
        return appointment1;
    }
      
    public String getRole(){
        return  "Admin";
    }
}
