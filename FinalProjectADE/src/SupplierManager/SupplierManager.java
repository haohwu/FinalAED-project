/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierManager;

import Employee.EmployeeDirectory;

/**
 *
 * @author whh
 */
public class SupplierManager {
    private int Id;
    private String SupplierManagerName;
    private String SupplierManagerPhoneNum;
    private String supplierMangerAddress;
    private String supplierMangerEmail;
    private static int count;
    private EmployeeDirectory employeeDirectory;
    
    public SupplierManager(){
        this.Id = this.count++;
        this.employeeDirectory = new EmployeeDirectory();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getSupplierManagerName() {
        return SupplierManagerName;
    }

    public void setSupplierManagerName(String SupplierManagerName) {
        this.SupplierManagerName = SupplierManagerName;
    }

    public String getSupplierManagerPhoneNum() {
        return SupplierManagerPhoneNum;
    }

    public void setSupplierManagerPhoneNum(String SupplierManagerPhoneNum) {
        this.SupplierManagerPhoneNum = SupplierManagerPhoneNum;
    }

    public String getSupplierMangerAddress() {
        return supplierMangerAddress;
    }

    public void setSupplierMangerAddress(String supplierMangerAddress) {
        this.supplierMangerAddress = supplierMangerAddress;
    }

    public String getSupplierMangerEmail() {
        return supplierMangerEmail;
    }

    public void setSupplierMangerEmail(String supplierMangerEmail) {
        this.supplierMangerEmail = supplierMangerEmail;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SupplierManager.count = count;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    @Override
    public String toString(){
        return SupplierManagerName;
    }
}
