/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

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
}
