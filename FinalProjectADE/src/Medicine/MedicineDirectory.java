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
public class MedicineDirectory {
    private ArrayList<Medicine> medicineList;
    
    public MedicineDirectory(){
        this.medicineList = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    public boolean checkIfMedicineUniques(String MedicineName){
        for(Medicine medicine : medicineList){
            if(medicine.getMedicineName() == MedicineName){
                return false;
            }
        }
        return true;
    }
}
