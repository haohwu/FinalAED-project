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
    
    public MedicineDetail createMedicineDetail(String Id, String name, String composition, String symptom){
        MedicineDetail medicineDetail = new MedicineDetail();
        medicineDetail.setId(Id);
        medicineDetail.setName(name);
        medicineDetail.setComposition(composition);
        medicineDetail.setSymptom(symptom);
        medicineDetailList.add(medicineDetail);
        return medicineDetail;
    }
}
