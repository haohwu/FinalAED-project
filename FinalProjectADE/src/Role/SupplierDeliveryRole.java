/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

/**
 *
 * @author whh
 */
public class SupplierDeliveryRole extends Role{
    private RoleType roleType;
    
    public SupplierDeliveryRole(){
        RoleType type = RoleType.SupplierDelivery;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    
    
}
