/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory(){
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public boolean checkEmployeeNameUnique(String name){
        for(Employee e : employeeList){
            if(e.getName() == name){
                return false;
            }
        }
        return true;
    }
    
    public void deleteEmployee(Employee e){
        employeeList.remove(e);
    }
    
    public Employee createEmployee(String name, String phoneNum, String address){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setPhoneNum(phoneNum);
        employee.setAddress(address);
        return employee;
    }
}
