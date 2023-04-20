/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

/**
 *
 * @author whh
 */
public class PharmacyManagerRole extends Role{
    private RoleType roleType;
    
    public PharmacyManagerRole(){
        RoleType type = RoleType.PharmacyManager;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }
    
    
}
