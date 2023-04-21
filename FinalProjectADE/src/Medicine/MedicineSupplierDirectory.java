/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicine;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class MedicineSupplierDirectory {
    private ArrayList<MedicineSupplier> medicineSupplierList;
    
    public MedicineSupplierDirectory(){
        medicineSupplierList = new ArrayList<>();
    }

    public ArrayList<MedicineSupplier> getMedicineSupplierList() {
        return medicineSupplierList;
    }

    public void setMedicineSupplierList(ArrayList<MedicineSupplier> medicineSupplierList) {
        this.medicineSupplierList = medicineSupplierList;
    }
    
    public MedicineSupplier createMedicineSupplier(String SupplierName, int price){
        MedicineSupplier medicineSupplier = new MedicineSupplier(SupplierName, price);
        medicineSupplierList.add(medicineSupplier);
        return medicineSupplier;
    }
}
