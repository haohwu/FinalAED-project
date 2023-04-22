/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierManager;

import Employee.EmployeeDirectory;
import Medicine.MedicineSupplierDirectory;
import SupplierDelivery.SupplierDelivery;
import SupplierDelivery.SupplierDeliveryDirectory;
import SupplierEmployee.SupplierEmployeeDirectory;
import SupplierOrder.SupplierOrder;
import SupplierOrder.SupplierOrderDirectory;

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
    private SupplierEmployeeDirectory supplierEmployeeDirectory;
    private SupplierOrderDirectory supplierOrderDirectory;
    private MedicineSupplierDirectory medicineSupplierDirectory;
    private SupplierDeliveryDirectory supplierDeliveryDirectroy;
    
    public SupplierManager(){
        this.Id = this.count++;
        this.employeeDirectory = new EmployeeDirectory();
        this.supplierEmployeeDirectory = new SupplierEmployeeDirectory();
        this.supplierOrderDirectory = new SupplierOrderDirectory();
        this.medicineSupplierDirectory = new MedicineSupplierDirectory();
        this.supplierDeliveryDirectroy = new SupplierDeliveryDirectory();
    }

    public SupplierDeliveryDirectory getSupplierDeliveryDirectroy() {
        return supplierDeliveryDirectroy;
    }

    public void setSupplierDeliveryDirectroy(SupplierDeliveryDirectory supplierDeliveryDirectroy) {
        this.supplierDeliveryDirectroy = supplierDeliveryDirectroy;
    }

    
    public SupplierEmployeeDirectory getSupplierEmployeeDirectory() {
        return supplierEmployeeDirectory;
    }

    public void setSupplierEmployeeDirectory(SupplierEmployeeDirectory supplierEmployeeDirectory) {
        this.supplierEmployeeDirectory = supplierEmployeeDirectory;
    }

    public SupplierOrderDirectory getSupplierOrderDirectory() {
        return supplierOrderDirectory;
    }

    public void setSupplierOrderDirectory(SupplierOrderDirectory supplierOrderDirectory) {
        this.supplierOrderDirectory = supplierOrderDirectory;
    }

    public MedicineSupplierDirectory getMedicineSupplierDirectory() {
        return medicineSupplierDirectory;
    }

    public void setMedicineSupplierDirectory(MedicineSupplierDirectory medicineSupplierDirectory) {
        this.medicineSupplierDirectory = medicineSupplierDirectory;
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
    public void deleteOrder(SupplierOrder supplierOrder)
    {
        this.getSupplierOrderDirectory().getSupplierOrderList().remove(supplierOrder);
    }
    public SupplierDelivery findSupplierDelivery(String DeliveryName)
    {
        for(SupplierDelivery supplierDelivery : this.supplierDeliveryDirectroy.getSupplierDeliverylist())
        {
            if(supplierDelivery.getSupplierDeliveryName() == DeliveryName)
            {
                return supplierDelivery;
            }
        }
        return null;
    }
}
