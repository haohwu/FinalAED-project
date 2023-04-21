/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierOrder;

import Medicine.MedicineSupplier;
import Pharmacy.Pharmacy;
import SupplierDelivery.SupplierDelivery;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author whh
 */
public class SupplierOrder {
    private int Id;
    private String detail;
    private int amount;
    private boolean orderStatus;
    private Date orderDate;
    private Pharmacy pharmacy;
    private SupplierDelivery supplierDelivery;
    private ArrayList<MedicineSupplier> medicineSupplierList;
    
    private static int count;
    
    public SupplierOrder(){
        this.Id = count++;
        this.detail = "";
        this.orderStatus = false;
        this.medicineSupplierList = new ArrayList<MedicineSupplier>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public SupplierDelivery getSupplierDelivery() {
        return supplierDelivery;
    }

    public void setSupplierDelivery(SupplierDelivery supplierDelivery) {
        this.supplierDelivery = supplierDelivery;
    }

    public ArrayList<MedicineSupplier> getMedicineSupplierList() {
        return medicineSupplierList;
    }

    public void setMedicineSupplierList(ArrayList<MedicineSupplier> medicineSupplierList) {
        this.medicineSupplierList = medicineSupplierList;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        SupplierOrder.count = count;
    }
    
    @Override
    public String toString(){
        return Integer.toString(Id);
    }
}
