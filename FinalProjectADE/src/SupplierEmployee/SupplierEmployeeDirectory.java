/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierEmployee;


import java.util.ArrayList;
/**
 *
 * @author Pratik Poojari
 */
public class SupplierEmployeeDirectory {
    private ArrayList<SupplierEmployee> supplierEmployeeList;
    public SupplierEmployeeDirectory(){
        this.supplierEmployeeList = new ArrayList<>();
    }
    public ArrayList<SupplierEmployee> getSupplierEmployeeList() {
        return supplierEmployeeList;
    }
    public void setSupplierEmployeeList(ArrayList<SupplierEmployee> supplierEmployeeList) {
        this.supplierEmployeeList = supplierEmployeeList;
    }
    public SupplierEmployee createSupplierEmployee(String supplierEmployeeName, String supplierEmployeePhoneNum, String supplierEmployeeAddress){
        SupplierEmployee supplierEmployee = new SupplierEmployee();
        supplierEmployee.setSupplierEmployeeName(supplierEmployeeName);
        supplierEmployee.setSupplierEmployeePhoneNum(supplierEmployeePhoneNum);
        supplierEmployee.setSupplierEmployeeAddress(supplierEmployeeName);
        supplierEmployeeList.add(supplierEmployee);
        return supplierEmployee;
    }
    public void deleteSupplierEmployee(SupplierEmployee supplierEmployee){
        supplierEmployeeList.remove(supplierEmployee);
    }
    public boolean checkIfSupplierEmployeeUnique(String SupplierEmployeeName){
        for(SupplierEmployee supplierEmployee : supplierEmployeeList){
            if(supplierEmployee.getSupplierEmployeeName() == SupplierEmployeeName){
                return false;
            }
        }
        return true;
    }
}