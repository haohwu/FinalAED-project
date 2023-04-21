/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Delivery.DeliveryDirectory;
import Hospital.HospitalDirectory;
import Medicine.MedicineDetailDirectory;
import Medicine.MedicineDirectory;
import Patient.PatientDirectory;
import Pharmacy.PharmacyDirectory;
import Role.Role;
import Role.SysAdmin;
import SupplierDelivery.SupplierDeliveryDirectory;
import SupplierManager.SupplierManagerDirectory;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class EcoSystem extends Organization{
    public static EcoSystem ecoSystem;
    private HospitalDirectory hospitalDirectory;
    private PatientDirectory patientDirectory;
    private DeliveryDirectory deliveryDirectory;
    private SupplierDeliveryDirectory supplierDeliveryDirectory;
    private MedicineDirectory medicineDirectory;
    private MedicineDetailDirectory medicineDetailDirectory;
    private SupplierManagerDirectory supplierManagerDirectory;
    private PharmacyDirectory pharmacyDirectory;
    
    public EcoSystem(PatientDirectory patientDirectory, DeliveryDirectory deliveryDirectory, SupplierDeliveryDirectory supplierDeliveryDirectory, SupplierManagerDirectory supplierManagerDirectory, PharmacyDirectory pharmacyDirectory){
        this.patientDirectory = patientDirectory;
        this.deliveryDirectory = deliveryDirectory;
        this.supplierDeliveryDirectory = supplierDeliveryDirectory;
        this.supplierManagerDirectory  = supplierManagerDirectory;
        this.pharmacyDirectory = pharmacyDirectory;
        this.medicineDetailDirectory = medicineDetailDirectory;
        this.medicineDirectory = medicineDirectory;
    }

    public static EcoSystem getInstance(){
        if(ecoSystem == null){
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }
    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DeliveryDirectory getDeliveryDirectory() {
        return deliveryDirectory;
    }

    public void setDeliveryDirectory(DeliveryDirectory deliveryDirectory) {
        this.deliveryDirectory = deliveryDirectory;
    }

    public SupplierDeliveryDirectory getSupplierDeliveryDirectory() {
        return supplierDeliveryDirectory;
    }

    public void setSupplierDeliveryDirectory(SupplierDeliveryDirectory supplierDeliveryDirectory) {
        this.supplierDeliveryDirectory = supplierDeliveryDirectory;
    }

    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(MedicineDirectory medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }

    public MedicineDetailDirectory getMedicineDetailDirectory() {
        return medicineDetailDirectory;
    }

    public void setMedicineDetailDirectory(MedicineDetailDirectory medicineDetailDirectory) {
        this.medicineDetailDirectory = medicineDetailDirectory;
    }

    public SupplierManagerDirectory getSupplierManagerDirectory() {
        return supplierManagerDirectory;
    }

    public void setSupplierManagerDirectory(SupplierManagerDirectory supplierManagerDirectory) {
        this.supplierManagerDirectory = supplierManagerDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> role = new ArrayList<Role>();
        role.add(new SysAdmin());
        return role;
    }
    
    private EcoSystem(){
        super();
        this.patientDirectory = patientDirectory;
        this.deliveryDirectory = deliveryDirectory;
        this.supplierDeliveryDirectory = supplierDeliveryDirectory;
        this.supplierManagerDirectory  = supplierManagerDirectory;
        this.pharmacyDirectory = pharmacyDirectory;
        this.medicineDetailDirectory = medicineDetailDirectory;
        this.medicineDirectory = medicineDirectory;
        
    }
    
}
