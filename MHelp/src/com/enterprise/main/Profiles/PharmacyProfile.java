
package com.enterprise.main.Profiles;

import com.enterprise.main.Entity.Person;
import com.enterprise.main.directory.MedicineCatalog;
import java.util.ArrayList;



public class PharmacyProfile extends Profile {
    private String companyName;
    private String companyAddress;
    private String email;
    private String password;
    private MedicineCatalog pharmacyMedicineCatalog;

    public PharmacyProfile(String companyName, String companyAddress, String email, String password) {
        super(new Person());
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.email = email;
        this.password = password;
        this.pharmacyMedicineCatalog = new MedicineCatalog(new ArrayList<>());
    }

    public MedicineCatalog getPharmacyMedicineCatalog() {
        return pharmacyMedicineCatalog;
    }

    public void setPharmacyMedicineCatalog(MedicineCatalog pharmacyMedicineCatalog) {
        this.pharmacyMedicineCatalog = pharmacyMedicineCatalog;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
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

    @Override
    public String getRole() {
        return "Admin";
    }

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
}}
