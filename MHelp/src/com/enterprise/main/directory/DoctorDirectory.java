/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.directory;

import com.enterprise.main.Entity.Person;
import com.enterprise.main.Profiles.DoctorProfile;
import java.util.ArrayList;

/**
 *
 * @author karthikv
 */
public class DoctorDirectory {
        ArrayList<DoctorProfile> doctorList;
        
    public DoctorDirectory() {

        doctorList = new ArrayList();

    }
    
           public DoctorProfile newDoctorProfile(Person p) {

        DoctorProfile doctorProfile = new DoctorProfile(p);
        doctorList.add(doctorProfile);
        return doctorProfile;
    }

    public ArrayList<DoctorProfile> getDoctorList() {
        return doctorList;
    }
           
           
 public DoctorProfile findDoctor(int id) {

        for (DoctorProfile doctorProfile : doctorList) {

            if (doctorProfile.isMatch(id)) {
                return doctorProfile;
            }
        }
            return null; 
         }
 public DoctorProfile findDoctorbymail(String mail) {

        for (DoctorProfile doctorProfile : doctorList) {

            if (doctorProfile.isMatchmail(mail)) {
                return doctorProfile;
            }
        }
            return null; 
         }

    public void deleteAppointment(DoctorProfile profile) {
        
        doctorList.remove(profile);
    }

}
