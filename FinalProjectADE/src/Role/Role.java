/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

/**
 *
 * @author whh
 */
public abstract class Role {
    
    public enum RoleType{
        SysAdmin("SysAdmin"),
        Patient("Patient"),
        Hospital("Hospital"),
        Delivery("Delivery"),
        SupplierManager("SupplierManager"),
        SupplierDelivery("SupplierDelivery"),
        PharmacyManager("PharmacyManager");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
    }
    
}
