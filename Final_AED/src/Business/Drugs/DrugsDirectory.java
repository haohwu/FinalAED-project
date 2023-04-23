/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Drugs;


import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class DrugsDirectory {
    
 private ArrayList<Drugs> drugsList;

    
 public DrugsDirectory() {
        drugsList = new ArrayList();
    }
 
    
    public ArrayList<Drugs> getDrugsList() {
        return drugsList;
    }

    public void setDrugsList(ArrayList<Drugs> drugsList) {
        this.drugsList = drugsList;
    }

    
   
    
    public Drugs createDrugs(String Id, String DrugName, String DrugCompostion, String Disease){
        Drugs drugsobj = new Drugs();
        drugsobj.setId(Id);
        drugsobj.setDrugName(DrugName);
        drugsobj.setDisease(Disease);
        drugsobj.setDrugCompostion(DrugCompostion);
        drugsList.add(drugsobj);
        
        return drugsobj;
    }    
    
    public void deleteDrugs(Drugs drugs)
    {
        drugsList.remove(drugs);
    } 
    
    
}
