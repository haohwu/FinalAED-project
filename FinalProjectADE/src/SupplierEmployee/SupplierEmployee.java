/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierEmployee;

/**
 *
 *
 */
public class SupplierEmployee {
    private int Id;
    private String supplierEmployeeName;
    private String supplierEmployeePhoneNum;
    private String supplierEmployeeAddress;
    private static int count;
    public SupplierEmployee(){
        this.Id = this.count++;
    }
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getSupplierEmployeeName() {
        return supplierEmployeeName;
    }
    public void setSupplierEmployeeName(String supplierEmployeeName) {
        this.supplierEmployeeName = supplierEmployeeName;
    }
    public String getSupplierEmployeePhoneNum() {
        return supplierEmployeePhoneNum;
    }
    public void setSupplierEmployeePhoneNum(String supplierEmployeePhoneNum) {
        this.supplierEmployeePhoneNum = supplierEmployeePhoneNum;
    }
    public String getSupplierEmployeeAddress() {
        return supplierEmployeeAddress;
    }
    public void setSupplierEmployeeAddress(String supplierEmployeeAddress) {
        this.supplierEmployeeAddress = supplierEmployeeAddress;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        SupplierEmployee.count = count;
    }
    @Override
    public String toString(){
        return supplierEmployeeName;
    }
}