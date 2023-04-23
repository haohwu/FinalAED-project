/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class SupplierDirectory {
    
    private ArrayList<Business.Supplier.Supplier> supplierList;

    public SupplierDirectory() {
        supplierList = new ArrayList();
    }
    
    public Business.Supplier.Supplier createSupplier(String name, String address){
        Business.Supplier.Supplier supplier = new Business.Supplier.Supplier();
        if(this.checkIfSupplierIsUnique(name))
        {
            supplier.setName(name);
            supplier.setAddress(address);
            supplierList.add(supplier);
            return supplier;
        }
        return null;
    }

    public ArrayList<Business.Supplier.Supplier> getSupplierList() {
        return supplierList;
    }
    
    public boolean checkIfSupplierIsUnique(String supplier){
        for (Business.Supplier.Supplier s : supplierList){
            if (s.getName().equals(supplier))
                return false;
        }
        return true;
    }
    
    
    
    public void deleteSupplier(Business.Supplier.Supplier s)
    {
        supplierList.remove(s);        
    }
    
    public Business.Supplier.Supplier findSupplier(String name)
    {
        for(Business.Supplier.Supplier s : supplierList)
        {
            if(s.getName().equals(name))
            {
                return s;
            }
        }
        return null;
    }

    
}
