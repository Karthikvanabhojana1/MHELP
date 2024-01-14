/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.Profiles;

import com.enterprise.main.Entity.Person;

/**
 *
 * @author karthikv
 */
public class AdminProfile extends Profile {


    public AdminProfile(Person p) {

        super(p); 

    }
    @Override
    public String getRole(){
        return  "Admin";
    }

}
