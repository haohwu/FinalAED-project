/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import Business.Orders.Orders;
import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class Hospital {

    private String HospitalName;
    private int HospitalId;
    private String HospitalAddress;
    private String HospitalContactNo;
    private String emailId;
    private String username;
    private static int count = 1;
    private ArrayList<Orders> PastOrderList;

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public int getHospitalId() {
        return HospitalId;
    }

    public void setHospitalId(int HospitalId) {
        this.HospitalId = HospitalId;
    }

    public String getHospitalAddress() {
        return HospitalAddress;
    }

    public void setHospitalAddress(String HospitalAddress) {
        this.HospitalAddress = HospitalAddress;
    }

    public String getHospitalContactNo() {
        return HospitalContactNo;
    }

    public void setHospitalContactNo(String HospitalContactNo) {
        this.HospitalContactNo = HospitalContactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Hospital() {
        HospitalId = count;
        count++;
        this.PastOrderList = new ArrayList<Orders>();
    }

    @Override
    public String toString() {
        return HospitalName;
    }

    public ArrayList<Orders> getPastOrderList() {
        return PastOrderList;
    }

    public void AddOrder() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
