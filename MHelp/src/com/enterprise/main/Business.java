package com.enterprise.main;

import com.enterprise.main.appointment.AppointmentDirectory;
import com.enterprise.main.appointment.lab.LabAppointmentList;
import com.enterprise.main.directory.AdminDirectory;
import com.enterprise.main.directory.DoctorDirectory;
import com.enterprise.main.directory.LabDirectory;
import com.enterprise.main.directory.PatientDirectory;
import com.enterprise.main.directory.PharmacyDirectory;  
import com.enterprise.main.directory.UserLabDirectory;
import com.enterprise.main.usermanagement.UserAccountDirectory;

/**
 *
 * @author karthikv
 */
public class Business {
    UserLabDirectory userlabDirectory;
    UserAccountDirectory userAccountDirectory;
    DoctorDirectory doctorDirectory;
    PatientDirectory patientdirectory;
    PharmacyDirectory pharmacyDirectory;  
    AppointmentDirectory appointmentDirectory;
    LabDirectory labDirectory;
    AdminDirectory adminDirectory;
    LabAppointmentList labAppointment;
    public Business (){
        userAccountDirectory = new UserAccountDirectory();
        doctorDirectory = new DoctorDirectory();
        patientdirectory = new PatientDirectory();
        pharmacyDirectory = new PharmacyDirectory();  
        appointmentDirectory=new AppointmentDirectory();
        pharmacyDirectory = new PharmacyDirectory(); 
        labDirectory = new LabDirectory();
        adminDirectory=new AdminDirectory(this);
        userlabDirectory=new UserLabDirectory();
        labAppointment=new LabAppointmentList();
    }

    public LabAppointmentList getLabAppointment() {
        return labAppointment;
    }

    public UserLabDirectory getUserlabDirectory() {
        return userlabDirectory;
    }

    public AdminDirectory getAdminDirectory() {
        return adminDirectory;
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
    }


    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public PatientDirectory getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(PatientDirectory patientdirectory) {
        this.patientdirectory = patientdirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }
    
    public LabDirectory getLabDirectory() {
        return labDirectory;
    }

    public void setLabDirectory(LabDirectory labDirectory) {
        this.labDirectory = labDirectory;
    }
}