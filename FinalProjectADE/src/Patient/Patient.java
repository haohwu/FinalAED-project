/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import Order.Order;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class Patient {
    private int Id;
    private String name;
    private String phoneNum;
    private String email;
    private String address;
    
    private static int count;
    private ArrayList<Order> PastOrderList;
    
    public Patient(){
        this.Id = this.count++;
        
    }
    public ArrayList<Order> getPastOrderList() {
        return PastOrderList;
    }

    public void setPastOrderList(ArrayList<Order> PastOrderList) {
        this.PastOrderList = PastOrderList;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }
    
    
}
