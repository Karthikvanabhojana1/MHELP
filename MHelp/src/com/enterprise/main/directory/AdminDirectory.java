/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.directory;

import com.enterprise.main.Business;
import com.enterprise.main.Entity.Person;
import com.enterprise.main.Profiles.AdminProfile;
import java.util.ArrayList;

/**
 *
 * @author karthikv
 */
public class AdminDirectory {
    
    Business business;
    ArrayList<AdminProfile> employeelist;

    public AdminDirectory(Business d) {

        business = d;
        employeelist = new ArrayList();

    }

    public AdminProfile newAdminProfile(Person p) {

        AdminProfile sp = new AdminProfile(p);
        employeelist.add(sp);
        return sp;
    }

    public AdminProfile findadmin(int id) {

        for (AdminProfile sp : employeelist) {

if(sp.getPerson().getId()==id){
    return sp; 
}
        }
            return null; 
         }
}
