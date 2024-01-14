package com.enterprise.main.directory;

import com.enterprise.main.Profiles.PharmacyProfile;
import java.util.ArrayList;

public class PharmacyDirectory {
    private ArrayList<PharmacyProfile> pharmaList;
    private MedicineCatalog sharedMedicineCatalog;  

    public ArrayList<PharmacyProfile> getPharmaList() {
        return pharmaList;
    }

    public void setPharmaList(ArrayList<PharmacyProfile> pharmaList) {
        this.pharmaList = pharmaList;
    }

    public PharmacyDirectory() {
        pharmaList = new ArrayList();
        sharedMedicineCatalog = new MedicineCatalog(new ArrayList<>());
    }

    public PharmacyDirectory(ArrayList<PharmacyProfile> pharmaList, MedicineCatalog sharedMedicineCatalog) {
        this.pharmaList = pharmaList;
        this.sharedMedicineCatalog = sharedMedicineCatalog;
    }

    public void addPharmacyProfile(PharmacyProfile pharmacyProfile) {
        pharmaList.add(pharmacyProfile);
    }

    public MedicineCatalog getMedicineCatalog() {
        return sharedMedicineCatalog;
    }
}
