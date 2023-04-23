/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.SupplierEmp.SupplierEmp;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class UserAccountDirectory {
    
    
  private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
        
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee,Role role){
       UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        // userAccount.setSupplierEmp(supplierEmp);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
   
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

    public UserAccount findEmployee(Employee employee)
    {
        for (UserAccount ua : userAccountList)
            if (ua.getEmployee() == employee){
                return ua;
            }
        return null;
    }
    
    /*public UserAccount findSupplierEmp(SupplierEmp supplierEmp)
    {
        for (UserAccount ua : userAccountList)
            if (ua.getSupplierEmp() == supplierEmp){
                return ua;
            }
        return null;
    }*/
    
    public void deleteUserAccount(UserAccount ua)
    {
        userAccountList.remove(ua);
    }
    
    
}
