/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.directory;

import com.enterprise.main.Entity.Person;
import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.UserLabProfile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author karthikv
 */
public class UserLabDirectory {
    List<UserLabProfile> labList;
    
    
          
    public UserLabDirectory() {

        labList = new ArrayList();

    }
    
           public UserLabProfile newLabProfile(Person p) {

        UserLabProfile labProfile = new UserLabProfile(p);
        labList.add(labProfile);
        return labProfile;
    }

    public List<UserLabProfile> getLabList() {
        return labList;
    }

 
           
           
 public UserLabProfile findLabString(String userId) {

        for (UserLabProfile userLabProfile : labList) {

            if (userLabProfile.isMatchuserId(userId)) {
                return userLabProfile;
            }
        }
            return null; 
 }
    public void deleteProfile(UserLabProfile userprofile) {
        
        labList.remove(userprofile);
    }

}
