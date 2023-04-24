package Business;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Drugs.DrugsDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Supplier.SupplierDirectory;
import Business.SupplierDeliveryMan.SupplierDeliveryManDirectory;
import java.util.ArrayList;

import Business.Hospital.HospitalDirectory;
import Business.SupplierEmp.SupplierEmpDirectory;

/**
 *
 * @author whh
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private PharmacyDirectory pharmacyDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private SupplierDirectory supplierDirectory;
    private SupplierDeliveryManDirectory supplierDeliveryManDirectory;
    private SupplierEmpDirectory supplieryEmpDirectory;
    private HospitalDirectory hospitalDirectory;
    private DrugsDirectory drugsDirectory;

    public EcoSystem(PharmacyDirectory pharmacyDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory, SupplierDirectory supplierDirectory, SupplierDeliveryManDirectory supplierDeliveryManDirectory) {

        this.pharmacyDirectory = pharmacyDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
        this.supplierDirectory = supplierDirectory;
        this.supplierDeliveryManDirectory = supplierDeliveryManDirectory;
        this.supplieryEmpDirectory = supplieryEmpDirectory;
        this.hospitalDirectory = hospitalDirectory;

        this.drugsDirectory = drugsDirectory;

    }

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);

        this.pharmacyDirectory = new PharmacyDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
        this.supplierDirectory = new SupplierDirectory();

        this.supplierDeliveryManDirectory = new SupplierDeliveryManDirectory();

        this.hospitalDirectory = new HospitalDirectory();

        this.drugsDirectory = new DrugsDirectory();
    }

    public DrugsDirectory getDrugsDirectory() {
        return drugsDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public SupplierEmpDirectory getSupplieryEmpDirectory() {
        return supplieryEmpDirectory;
    }

    public void setSupplieryEmpDirectory(SupplierEmpDirectory supplieryEmpDirectory) {
        this.supplieryEmpDirectory = supplieryEmpDirectory;
    }

    //
    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public SupplierDeliveryManDirectory getSupplierDeliveryManDirectory() {
        return supplierDeliveryManDirectory;
    }

    public boolean checkIfUserIsUnique(String userName) {
        return false;
    }
}
