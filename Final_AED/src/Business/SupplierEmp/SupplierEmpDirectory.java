/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierEmp;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class SupplierEmpDirectory {

    private ArrayList<Business.SupplierEmp.SupplierEmp> supplierEmpList;

    public SupplierEmpDirectory() {
        supplierEmpList = new ArrayList();
    }

    public ArrayList<Business.SupplierEmp.SupplierEmp> getSupplierEmpList() {
        return supplierEmpList;
    }

    public Business.SupplierEmp.SupplierEmp createSupplierEmp(String name, String address, String phone) {
        if (this.checkIfSupplierEmpIsUnique(name)) {
            Business.SupplierEmp.SupplierEmp supplierEmp = new Business.SupplierEmp.SupplierEmp();
            supplierEmp.setName(name);
            supplierEmp.setAddress(address);
            supplierEmp.setPhone(phone);
            supplierEmpList.add(supplierEmp);
            return supplierEmp;
        }
        return null;
    }

    public boolean checkIfSupplierEmpIsUnique(String username) {
        for (Business.SupplierEmp.SupplierEmp sa : supplierEmpList) {
            if (sa.getName().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public void deleteSupplierEmp(Business.SupplierEmp.SupplierEmp se) {
        supplierEmpList.remove(se);
    }

}
