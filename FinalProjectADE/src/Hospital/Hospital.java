/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author whh
 */
public class Hospital {
    private int hospitalId;
    private String hospitalName;
    private String hospitalPhoneNum;
    private String hospitalAddress;
    private String hospitalEmial;
    private static int count;
    
    public Hospital(){
        this.hospitalId = this.count++;
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalPhoneNum() {
        return hospitalPhoneNum;
    }

    public void setHospitalPhoneNum(String hospitalPhoneNum) {
        this.hospitalPhoneNum = hospitalPhoneNum;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalEmial() {
        return hospitalEmial;
    }

    public void setHospitalEmial(String hospitalEmial) {
        this.hospitalEmial = hospitalEmial;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Hospital.count = count;
    }
    
    @Override
    public String toString(){
        return hospitalName;
    }
}
