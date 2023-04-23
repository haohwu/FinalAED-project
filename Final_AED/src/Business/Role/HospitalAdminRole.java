/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HospitalRole.HospitalAreaJPanel;
import userinterface.CustomerRole.CustomerAreaJPanel;


/**
 *
 * @author whh
 */
public class HospitalAdminRole extends Role{
    
     private Role.RoleType roleType;
    public HospitalAdminRole() {
        Role.RoleType roleType = Role.RoleType.Hospital;
    }
    
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new HospitalAreaJPanel(userProcessContainer, account, business);
    }
    
}
