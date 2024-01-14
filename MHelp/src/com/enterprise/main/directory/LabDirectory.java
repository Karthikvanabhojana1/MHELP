/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.directory;

import com.enterprise.main.Profiles.DoctorProfile;
import com.enterprise.main.Profiles.LabProfile;
import com.enterprise.main.Profiles.PatientProfile;
import java.util.Date;

/**
 *
 * @author shreyas
 */
public class LabDirectory {
    
    private int labTestId;
    private String labName;
    private String type;
    private Date dateOrdered;
    private Date dateCompleted;
    private String result;
    private DoctorProfile doctor;
    private Medicine medicine;
    private PatientProfile patient;
    private LabProfile lab;
    
    
    
    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }
    
    public int getLabTestId() {
        return labTestId;
    }
  

   

    public void setLabTestId(int labTestId) {
        this.labTestId = labTestId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public DoctorProfile getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorProfile doctor) {
        this.doctor = doctor;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public PatientProfile getPatient() {
        return patient;
    }

    public void setPatient(PatientProfile patient) {
        this.patient = patient;
    }
    
     public LabProfile getLab() {
        return lab;
    }

    public void setLab(LabProfile lab) {
        this.lab = lab;
    }

  
}


