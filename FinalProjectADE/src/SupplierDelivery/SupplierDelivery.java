/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierDelivery;

/**
 *
 * @author whh
 */
public class SupplierDelivery {
    private int Id;
    private String supplierDeliveryName;
    private String supplierDeliveryPhoneNum;
    private String supplierDeliveryAddress;
    private static int count;
    
    public SupplierDelivery(){
        this.Id = this.count++;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getSupplierDeliveryName() {
        return supplierDeliveryName;
    }

    public void setSupplierDeliveryName(String supplierDeliveryName) {
        this.supplierDeliveryName = supplierDeliveryName;
    }

    public String getSupplierDeliveryPhoneNum() {
        return supplierDeliveryPhoneNum;
    }

    public void setSupplierDeliveryPhoneNum(String supplierDeliveryPhoneNum) {
        this.supplierDeliveryPhoneNum = supplierDeliveryPhoneNum;
    }

    public String getSupplierDeliveryAddress() {
        return supplierDeliveryAddress;
    }

    public void setSupplierDeliveryAddress(String supplierDeliveryAddress) {
        this.supplierDeliveryAddress = supplierDeliveryAddress;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SupplierDelivery.count = count;
    }
    
    
}
