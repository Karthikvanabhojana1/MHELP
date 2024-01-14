/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.Profiles;

import com.enterprise.main.Entity.Person;
import com.enterprise.main.appointment.Appointment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author karthikv
 */
public class DoctorProfile extends Profile{
    private String yearOfExperience;
    private String speciality;
    private String education;
    private int rating;
    private String status="Active";

    private int cost=800;
    private String meetingLink="zoom.com";
    private List<Appointment> appointmentDoctorlist=new ArrayList<>();
        private int totalRatings;
    private int numberOfFeedbacks;

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return totalRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public int getNumberOfFeedbacks() {
        return numberOfFeedbacks;
    }
    
    public void setNumberOfFeedbacks(int numberOfFeedbacks) {
        this.numberOfFeedbacks = numberOfFeedbacks;
    }

    public double calculateAverageRating() {
        if (numberOfFeedbacks > 0) {
            return (double) totalRatings / numberOfFeedbacks;
        } else {
            return 0.0; 
        }
    }

    public void addRating(int rating) {
        totalRatings += rating;
        numberOfFeedbacks++;
    }

 
    public String getMeetingLink() {
        return meetingLink;
    }

    public void setMeetingLink(String meetingLink) {
        this.meetingLink = meetingLink;
    }

    public List<Appointment> getAppointmentDoctorlist() {
        return appointmentDoctorlist;
    }

    public void setAppointmentDoctorlist(List<Appointment> appointmentDoctorlist) {
        this.appointmentDoctorlist = appointmentDoctorlist;
    }

    
  public Appointment newDoctorAppointment(int id, PatientProfile patientProfile, DoctorProfile doctorProfile, Date date) {
        Appointment appointment1 = new Appointment(id, patientProfile, doctorProfile, date);
        appointmentDoctorlist.add(appointment1);
        return appointment1;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(String yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    

    
    
      public DoctorProfile(Person person) {

        super(person);
    }
    public String getRole(){
        return  "Admin";
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
      
   
}
