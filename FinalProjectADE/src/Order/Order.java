/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Order;

import Delivery.Delivery;
import Hospital.Hospital;
import Medicine.Medicine;
import Patient.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author whh
 */
public class Order {
    private int Id;
    private String discription;
    private int amount;
    private boolean status;
    private Date date;
    private Patient patient;
    private Hospital hospital;
    private Delivery delivery;
    private ArrayList<Medicine> medicineList;
    
    private static int count;
    public Order(){
        this.Id = this.count++;
        this.discription = "";
        this.status = false;
        this.medicineList = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }
    
    @Override
    public String toString(){
        return Integer.toString(Id);
    }
}
