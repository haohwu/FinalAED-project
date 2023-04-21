/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class PharmacyDirectory {
    private ArrayList<Pharmacy> pharmacyList;
    
    public PharmacyDirectory(){
        this.pharmacyList = new ArrayList<>();
    }

    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(ArrayList<Pharmacy> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }
    
    
}
