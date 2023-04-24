/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.SupplierMedicineItem;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class SupplierMedicineCatalog {

    private ArrayList<Business.SupplierMedicineItem.SupplierMedicineItem> suppliermedicineCatalogList;

    public SupplierMedicineCatalog() {
        suppliermedicineCatalogList = new ArrayList();
    }

    public ArrayList<Business.SupplierMedicineItem.SupplierMedicineItem> getSupplierMedicineItemList() {
        return suppliermedicineCatalogList;
    }

    public boolean checkIfSupplierMedicineItemIsUnique(String name) {
        for (Business.SupplierMedicineItem.SupplierMedicineItem smi : suppliermedicineCatalogList) {
            if (smi.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public Business.SupplierMedicineItem.SupplierMedicineItem createSupplierMedicineItem(String name, int price) {
        Business.SupplierMedicineItem.SupplierMedicineItem smi = new Business.SupplierMedicineItem.SupplierMedicineItem(name, price);
        suppliermedicineCatalogList.add(smi);
        return smi;
    }

    public void deleteSupplierMedicineItem(Business.SupplierMedicineItem.SupplierMedicineItem smi) {
        suppliermedicineCatalogList.remove(smi);
    }

}
