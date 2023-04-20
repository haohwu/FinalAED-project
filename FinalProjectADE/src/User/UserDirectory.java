/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Employee.Employee;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class UserDirectory {
    private ArrayList<User> userList;
    
    public UserDirectory(){
        userList = new ArrayList<>();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }
    
    public User creatUser(String name, String password, Role role, Employee employee){
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setRole(role);
        user.setEmployee(employee);
        userList.add(user);
        return user;
    }
    
    public void deleteUser(User user){
        userList.remove(user);
    }
    
    public boolean checkIfUserUnique(String name){
        for(User user : userList){
            if(user.getName() == name){
                return false;
            }
        }
        return true;
    }
    
    public User authenticateUser(String name, String password){
        for(User user : userList){
            if(user.getName() == name && user.getPassword() == password){
                return user;
            }
        }
        return null;
    }
    
    public User findUser(Employee employee){
        for(User user : userList){
            if(user.getEmployee() == employee){
                return user;
            }
        }
        return null;
    }
}
