/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.appointment.lab;

import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.Profiles.UserLabProfile;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author karthikv
 */
public class LabAppointmentList {
        public List<LabAppointment> labAppointmentList;
        
         public LabAppointmentList() {

        labAppointmentList = new ArrayList<>();
    }

    public List<LabAppointment> getLabAppointmentList() {
        return labAppointmentList;
    }

      public LabAppointment newAppointment(int id, PatientProfile patientProfile, DoctorProfile doctorProfile, Date date, UserLabProfile userLab) {
        LabAppointment appointment1 = new LabAppointment(id, patientProfile, doctorProfile, date,userLab);
        labAppointmentList.add(appointment1);
        return appointment1;
    }
    public void setLabAppointmentList(List<LabAppointment> labAppointmentList) {
        this.labAppointmentList = labAppointmentList;
    }
   public LabAppointment findAppointmentStatus(String status) {

        for (LabAppointment appointment : labAppointmentList) {

            if (appointment.getAppointmentStatus().equals(status)) {
                return appointment;
            }
        }
        return null;

}
    public LabAppointment findAppointmentId(int Id) {

        for (LabAppointment appointment : labAppointmentList) {

            if (appointment.getAppointmentid()==(Id)) {
                return appointment;
            }
        }
        return null;

}
   

     
     
     public PatientProfile findPatientbyAppointment(int id){
            for (LabAppointment appointment : labAppointmentList) {
               if(appointment.getAppointmentid()==id) {
                   return appointment.getPatientProfile();
               }
            }
        return null;
     }

     
     
     public void deleteAppointment(LabAppointment appointment){
    labAppointmentList.remove(appointment);
}
}