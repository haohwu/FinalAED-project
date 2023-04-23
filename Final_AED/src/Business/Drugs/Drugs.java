
package Business.Drugs;

/**
 *
 * @author whh
 */
public class Drugs {
    
    private String Disease;
    private String DrugName;
    private String DrugCompostion;
    private String Id;


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


    @Override
    public String toString() {
        return DrugName;
    }

   
}
