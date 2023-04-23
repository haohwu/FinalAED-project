/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;
import Business.Orders.Orders;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class Customer {
    private String name;
    private int id;
    private String address;
    private String phone;
   

    private static int count = 1;
    private ArrayList<Orders> PastOrderList;

    public Customer() {
        id = count;
        count++;
        this.PastOrderList = new ArrayList<Orders>();
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Orders> getPastOrderList() {
        return PastOrderList;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    
    
    
    public void AddOrder()
    {
        
    }    
    
}
