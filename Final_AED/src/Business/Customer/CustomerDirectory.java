/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class CustomerDirectory {
     private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList = new ArrayList();
    }
    
    public Customer createCustomer(String name, String address, String phone){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setAddress(address);
        customer.setPhone(phone);

        customerList.add(customer);
        return customer;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
    public Customer findCustomer(String name)
    {
        for(Customer c : customerList)
        {
            if(c.getName() == name)
            {
                return c;
            }
        }
        return null;
    }
    
    public void deleteCustomer(Customer customer)
    {
        customerList.remove(customer);
    }    
}
