/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.Profiles;

import com.enterprise.main.Entity.Person;

public abstract class Profile {
    private Person person;

    public Profile(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public abstract String getRole();

    public boolean isMatch(int id) {
        return person.getId() == id;
    }
    public boolean isMatchName(String name) {
        return person.getUserName().equals(name);
    }
     public boolean isMatchmail(String mail) {
        return person.getEmailId().equals(mail);
    }
     public boolean isMatchuserId(String mail) {
        return person.getUserName().equals(mail);
    }
}
