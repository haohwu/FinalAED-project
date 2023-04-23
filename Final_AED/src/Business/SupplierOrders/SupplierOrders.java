/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierOrders;

import Business.Pharmacy.Pharmacy;
import Business.SupplierDeliveryMan.SupplierDeliveryMan;
import Business.SupplierMedicineItem.SupplierMedicineItem;
import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 *
 * @author whh
 */
public class SupplierOrders {
    private Pharmacy pharmacy;
    private int orderId;
    private LocalDateTime orderDate;
    private static int count = 1;
    private ArrayList<SupplierMedicineItem> suppliermedicineItemList;
    private SupplierDeliveryMan supplierDeliveryMan;
    private int totalAmount;
    private String message;
    private boolean status;
    
    public SupplierOrders() {
        orderId = count;
        count++;
        this.orderDate = LocalDateTime.now();
        this.suppliermedicineItemList = new ArrayList<SupplierMedicineItem>();
        this.message = "";
        this.status = false;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public ArrayList<SupplierMedicineItem> getSupplierMedicineItemList() {
        return suppliermedicineItemList;
    }

    public SupplierDeliveryMan getSupplierDeliveryMan() {
        return supplierDeliveryMan;
    }

    public void setSupplierDeliveryMan(SupplierDeliveryMan supplierDeliveryMan) {
        this.supplierDeliveryMan = supplierDeliveryMan;
    }

    public int getOrderId() {
        return orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }
    
    public void deleteSupplierMedicineItem(SupplierMedicineItem smi)
    {
        suppliermedicineItemList.remove(smi);
    }
    
    public int calculateTotalAmount()
    {
        int sum = 0;
        for(SupplierMedicineItem smi : this.getSupplierMedicineItemList())
        {
            sum = sum + smi.getPrice();
        }
        this.totalAmount = sum;
        return sum;
    }
    
    public void addItem(SupplierMedicineItem smi)
    {
        suppliermedicineItemList.add(smi);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return Integer.toString(orderId);
    }   
  
}
