/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharmacy;

import Delivery.Delivery;
import Delivery.DeliveryDirectory;
import Employee.EmployeeDirectory;
import Medicine.MedicineDirectory;
import Order.Order;
import Order.OrderDirectory;
import SupplierOrder.SupplierOrder;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class Pharmacy {
    private int Id;
    private String pharmacyName;
    private String pharmacyPhoneNum;
    private String pharmacyEmail;
    private String pharmacyAddress;
    private DeliveryDirectory deliveryDirectory;
    private OrderDirectory orderDirectory;
    private EmployeeDirectory employeeDirectory;
    private MedicineDirectory medicineDirectory;
    private ArrayList<SupplierOrder> supplierOrdersList;
    
    private static int count;
    
    public Pharmacy(){
        this.Id = this.count++;
        this.deliveryDirectory = new DeliveryDirectory();
        this.orderDirectory = new OrderDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.medicineDirectory = new MedicineDirectory();
        this.supplierOrdersList = new ArrayList<SupplierOrder>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getPharmacyPhoneNum() {
        return pharmacyPhoneNum;
    }

    public void setPharmacyPhoneNum(String pharmacyPhoneNum) {
        this.pharmacyPhoneNum = pharmacyPhoneNum;
    }

    public String getPharmacyEmail() {
        return pharmacyEmail;
    }

    public void setPharmacyEmail(String pharmacyEmail) {
        this.pharmacyEmail = pharmacyEmail;
    }

    public String getPharmacyAddress() {
        return pharmacyAddress;
    }

    public void setPharmacyAddress(String pharmacyAddress) {
        this.pharmacyAddress = pharmacyAddress;
    }

    public DeliveryDirectory getDeliveryDirectory() {
        return deliveryDirectory;
    }

    public void setDeliveryDirectory(DeliveryDirectory deliveryDirectory) {
        this.deliveryDirectory = deliveryDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }

    public ArrayList<SupplierOrder> getSupplierOrdersList() {
        return supplierOrdersList;
    }

    public void setSupplierOrdersList(ArrayList<SupplierOrder> supplierOrdersList) {
        this.supplierOrdersList = supplierOrdersList;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Pharmacy.count = count;
    }
    
    @Override
    public String toString(){
        return pharmacyName;
    }
    
    public Delivery findDelivery(String deliveryManName){
        for(Delivery delivery: this.deliveryDirectory.getDeliveryList()){
            if(delivery.getDeliveryName() == deliveryManName){
                return delivery;
            }
        }
        return null;
    }
    
    public void deleteOrder(Order order){
       this.getOrderDirectory().getOrderList().remove(order);
    }
}
