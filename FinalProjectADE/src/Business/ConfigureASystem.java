/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Employee.Employee;
import Role.SysAdmin;
import User.User;

/**
 *
 * @author whh
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("Q", "Q", "Q");
        
        User user = ecoSystem.getUserDirectory().creatUser("W", "W",new SysAdmin(), employee);
        
        return ecoSystem;
    }
}
