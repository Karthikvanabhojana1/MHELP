/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.Profiles;

import com.enterprise.main.Entity.Person;

/**
 *
 * @author shreyas
 */
public class LabProfile extends Profile {
      private String labName;
    private String labAddress;
    private String email;
    private String password;
    
    public LabProfile(String labName, String labAddress, String email, String password) {
        super(new Person()); 
        this.labName = labName;
        this.labAddress = labAddress;
        this.email = email;
        this.password = password;
        
        
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabAddress() {
        return labAddress;
    }

    public void setLabAddress(String labAddress) {
        this.labAddress = labAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
     public LabProfile(Person person) {

        super(person);
    }
    public String getRole(){
        
        return  "Admin";
    }
      
   
}
