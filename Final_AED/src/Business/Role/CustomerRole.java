/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerAreaJPanel;

/**
 *
 * @author whh
 */
public class CustomerRole extends Role{
    private RoleType roleType;
    public CustomerRole() {
        RoleType roleType = RoleType.Customer;
    }
    
    
    
}

