/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupplierOrder;

import Pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class SupplierOrderDirectory {

    private ArrayList<SupplierOrder> supplierOrderList;

    public SupplierOrderDirectory() {
        this.supplierOrderList = new ArrayList<>();
    }

    public ArrayList<SupplierOrder> getSupplierOrderList() {
        return supplierOrderList;
    }

    public void setSupplierOrderList(ArrayList<SupplierOrder> supplierOrderList) {
        this.supplierOrderList = supplierOrderList;
    }

    public SupplierOrder createSupplierOrder(Pharmacy pharmacy) {
        SupplierOrder supplierOrder = new SupplierOrder();
        supplierOrder.setPharmacy(pharmacy);
        supplierOrderList.add(supplierOrder);
        pharmacy.getSupplierOrdersList().add(supplierOrder);
        return supplierOrder;
    }

}
