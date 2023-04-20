/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierManager;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class SupplierManagerDirectory {
    private ArrayList<SupplierManager> supplierManagersList;
    
    public SupplierManagerDirectory(){
        this.supplierManagersList = new ArrayList<>();
    }

    public ArrayList<SupplierManager> getSupplierManagersList() {
        return supplierManagersList;
    }

    public void setSupplierManagersList(ArrayList<SupplierManager> supplierManagersList) {
        this.supplierManagersList = supplierManagersList;
    }
    
    public boolean checkIfSupplierManagerUniques(String SupplierManager){
        for(SupplierManager supplierManager : supplierManagersList){
            if(supplierManager.getSupplierManagerName() == SupplierManager){
                return false;
            }
        }
        return true;
    }
    
    public SupplierManager createSupplierManager(String name, String address){
        SupplierManager supplierManager = new SupplierManager();
        if(checkIfSupplierManagerUniques(name)){
            supplierManager.setSupplierManagerName(name);
            supplierManager.setSupplierMangerAddress(address);
            supplierManagersList.add(supplierManager);
            return supplierManager;
        }
        return null;
    }
    
    public void deleteSupplierManager(SupplierManager supplierManager){
        supplierManagersList.remove(supplierManager);
    }
    
    public SupplierManager findSupplierManager(String supplierManagerName){
        for(SupplierManager supplierManager : supplierManagersList){
            if(supplierManager.getSupplierManagerName() == supplierManagerName){
                return supplierManager;
            }
        }
        return null;
    }
}
