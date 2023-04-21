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
public class MedicineDetailDirectory {
    private ArrayList<MedicineDetail> medicineDetailList;
    
    public MedicineDetailDirectory(){
        this.medicineDetailList = new ArrayList<>();
    }

    public ArrayList<MedicineDetail> getMedicineDetailList() {
        return medicineDetailList;
    }

    public void setMedicineDetailList(ArrayList<MedicineDetail> medicineDetailList) {
        this.medicineDetailList = medicineDetailList;
    }
    
    
}
