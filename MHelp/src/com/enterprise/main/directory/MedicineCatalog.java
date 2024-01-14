/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enterprise.main.directory;

import java.util.ArrayList;

/**
 *
 * @author shrey
 */
public class MedicineCatalog {
    
    private ArrayList<Medicine> medicineCatalog;

    public MedicineCatalog(ArrayList<Medicine> medicineCatalog) {
        this.medicineCatalog = medicineCatalog;
    }

    public ArrayList<Medicine> getMedicineCatalog() {
        return medicineCatalog;
    }

    public void setMedicineCatalog(ArrayList<Medicine> medicineCatalog) {
        this.medicineCatalog = medicineCatalog;
    }
    
        public Medicine addMedicine() {
        Medicine p = new Medicine();
        medicineCatalog.add(p);
        return p;
    }
        
         public void removeMedicine(Medicine m) {
        medicineCatalog.remove(m);
    }
         public Medicine searchMedicine(int id) {
        for (Medicine medicine : medicineCatalog) {
            if (medicine.getMedId() == id) {
                return medicine;
            }
        }
        return null;
    }
         
    public ArrayList<Medicine> searchMedicineByNameOrId(String searchText) {
        ArrayList<Medicine> searchResults = new ArrayList<>();

        for (Medicine medicine : medicineCatalog) {
            String medName = medicine.getMedName().toLowerCase();
            String medId = String.valueOf(medicine.getMedId()).toLowerCase();

            if (medName.contains(searchText) || medId.contains(searchText)) {
                searchResults.add(medicine);
            }
        }

        return searchResults;
    }
         
          public void updateMedicine(Medicine updatedMedicine) {
        Medicine existingMedicine = searchMedicine(updatedMedicine.getMedId());
        if (existingMedicine != null) {
            existingMedicine.setMedName(updatedMedicine.getMedName());
            existingMedicine.setExpiryDate(updatedMedicine.getExpiryDate());
            existingMedicine.setPrice(updatedMedicine.getPrice());
            existingMedicine.setMedAvail(updatedMedicine.isMedAvail());
        }
    }
   
}
