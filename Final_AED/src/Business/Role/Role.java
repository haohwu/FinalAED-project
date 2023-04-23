/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import javax.swing.JPanel;

/**
 *
 * @author whh
 */
public abstract class Role {
    
    public enum RoleType{
        PharmacyAdmin("PharmacyAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SupplierAdmin("SupplierAdmin"),
        SupplierDeliveryMan("SupplierDeliveryMan"),
        SysAdmin("Sysadmin"),
        Hospital("Hospital");
        
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}