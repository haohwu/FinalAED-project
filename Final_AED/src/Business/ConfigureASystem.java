/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.SupplierEmp.SupplierEmp;
import Business.UserAccount.UserAccount;



/**
 *
 * @author whh
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
      
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH", "SomeAddress", "SomePhone");
               

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("j", "j", employee, new SystemAdminRole());
        
        return system;
    }
}
