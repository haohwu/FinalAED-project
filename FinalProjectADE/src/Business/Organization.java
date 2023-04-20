/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Employee.EmployeeDirectory;
import User.UserDirectory;
import Work.WorkQueue;



/**
 *
 * @author whh
 */
public abstract class Organization {
    private int organizationId;
    private String organizationName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserDirectory userDirectory;
    
    private static int count;
    public Organization(String organizationName){
        this.organizationName = organizationName;
        this.organizationId = this.count++;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Organization.count = count;
    }
    
    public enum organizationType{
        SysAdmin("SysAdmin"),
        Patient("Patient"),
        Hospital("Hospital"),
        Delivery("Delivery"),
        SupplierManager("SupplierManager"),
        SupplierDelivery("SupplierDelivery"),
        PharmacyManager("PharmacyManager");
        
        private String value;
        
        private organizationType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }
}
