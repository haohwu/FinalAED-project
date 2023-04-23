/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class PharmacyDirectory {
    private ArrayList<Pharmacy> pharmacyList;

    public PharmacyDirectory() {
        pharmacyList = new ArrayList();
    }
    
    public Pharmacy createPharmacy(String name, String address){
        Pharmacy pharmacy = new Pharmacy();
        if(this.checkIfPharmacyIsUnique(name))
        {
            pharmacy.setName(name);
            pharmacy.setAddress(address);
            pharmacyList.add(pharmacy);
            return pharmacy;
        }
        return null;
    }

    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }
    
    public boolean checkIfPharmacyIsUnique(String pharmacy){
        for (Pharmacy p : pharmacyList){
            if (p.getName().equals(pharmacy))
                return false;
        }
        return true;
    }
    
    public void deletePharmacy(Pharmacy p)
    {
        pharmacyList.remove(p);        
    }
    
    public Pharmacy findPharmacy(String name)
    {
        for(Pharmacy p : pharmacyList)
        {
            if(p.getName().equals(name))
            {
                return p;
            }
        }
        return null;
    }

    
    
}




