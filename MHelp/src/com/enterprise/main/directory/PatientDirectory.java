/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.directory;

import com.enterprise.main.Entity.Person;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.PatientProfile;
import com.enterprise.main.appointment.Appointment;
import java.util.ArrayList;

/**
 *
 * @author karthikv
 */
public class PatientDirectory {
            ArrayList<PatientProfile> patientList;

    public PatientDirectory() {

        patientList = new ArrayList();

    }
    
    public PatientProfile newPatientProfile(Person p) {

        PatientProfile patientProfile = new PatientProfile(p);
        patientList.add(patientProfile);
        return patientProfile;
    }

    public ArrayList<PatientProfile> getPatientList() {
        return patientList;
    }
    
    
 public PatientProfile findPatient(int id) {

        for (PatientProfile patientProfile : patientList) {

            if (patientProfile.isMatch(id)) {
                return patientProfile;
            }
        }
            return null; 
         }
  public PatientProfile findPatientbyuserId(String userid) {

        for (PatientProfile patientProfile : patientList) {

            if (patientProfile.isMatchuserId(userid)) {
                return patientProfile;
            }
        }
            return null; 
         }
 
 public void deleteAppointment(PatientProfile patientprofile){
    patientList.remove(patientprofile);
}


}
