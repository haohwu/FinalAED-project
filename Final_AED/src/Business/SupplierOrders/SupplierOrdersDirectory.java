/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierOrders;

import Business.Customer.Customer;
import Business.Orders.Orders;
import Business.Pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class SupplierOrdersDirectory {

    private ArrayList<SupplierOrders> supplierOrderList;

    public SupplierOrdersDirectory() {
        supplierOrderList = new ArrayList();
    }

    public ArrayList<SupplierOrders> getSupplierOrderList() {
        return supplierOrderList;
    }

    public SupplierOrders createNewSupplierOrder(Pharmacy pharma) {
        SupplierOrders supplierOrders = new SupplierOrders();
        supplierOrders.setPharmacy(pharma);
        supplierOrderList.add(supplierOrders);
        pharma.getPastSupplierOrderList().add(supplierOrders);
        return supplierOrders;
    }
}
