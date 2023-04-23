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
public class SystemAdminRole extends Role{
    private Role.RoleType roleType;
    public SystemAdminRole() {
        Role.RoleType roleType = Role.RoleType.SysAdmin;
    }

}

