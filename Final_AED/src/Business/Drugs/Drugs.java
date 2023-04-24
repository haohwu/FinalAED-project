
package Business.Drugs;

import Business.Employee.EmployeeDirectory;
import Business.SupplierDeliveryMan.SupplierDeliveryManDirectory;
import Business.SupplierMedicineItem.SupplierMedicineCatalog;
import Business.SupplierOrders.SupplierOrdersDirectory;

/**
 *
 * @author whh
 */
public class Drugs {
    
    private String Disease;
    private String DrugName;
    private String DrugCompostion;
    private String Id;
     private DrugsDirectory drugdirectory;
     
      public Drugs() {
         this.drugdirectory = new DrugsDirectory();

    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }


    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }

    public String getDrugName() {
        return DrugName;
    }

    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    public String getDrugCompostion() {
        return DrugCompostion;
    }

    public void setDrugCompostion(String DrugCompostion) {
        this.DrugCompostion = DrugCompostion;
    }

    public DrugsDirectory getDrugdirectory() {
        return drugdirectory;
    }

    public void setDrugdirectory(DrugsDirectory drugdirectory) {
        this.drugdirectory = drugdirectory;
    }

   
    

    @Override
    public String toString() {
        return DrugName;
    }

   
}
