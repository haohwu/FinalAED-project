/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierDeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class SupplierDeliveryManDirectory {

    private ArrayList<Business.SupplierDeliveryMan.SupplierDeliveryMan> supplierDeliveryManList;

    public SupplierDeliveryManDirectory() {
        supplierDeliveryManList = new ArrayList();
    }

    public ArrayList<Business.SupplierDeliveryMan.SupplierDeliveryMan> getSupplierDeliveryManList() {
        return supplierDeliveryManList;
    }

    public Business.SupplierDeliveryMan.SupplierDeliveryMan createSupplierDeliveryMan(String name, String phone, String address) {
        Business.SupplierDeliveryMan.SupplierDeliveryMan supplierDeliveryMan = new Business.SupplierDeliveryMan.SupplierDeliveryMan();
        supplierDeliveryMan.setName(name);
        supplierDeliveryMan.setPhone(phone);
        supplierDeliveryMan.setAddress(address);
        supplierDeliveryManList.add(supplierDeliveryMan);
        return supplierDeliveryMan;
    }

}
