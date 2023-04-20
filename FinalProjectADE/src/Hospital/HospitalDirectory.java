/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hopitalList;
    
    public HospitalDirectory(){
        this.hopitalList = new ArrayList<>();
    }

    public ArrayList<Hospital> getHopitalList() {
        return hopitalList;
    }

    public void setHopitalList(ArrayList<Hospital> hopitalList) {
        this.hopitalList = hopitalList;
    }
    
    public Hospital createHospital(String hospitalName, String hospitalPhonenum, String hospitalAddress){
        Hospital hospital = new Hospital();
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalPhoneNum(hospitalPhonenum);
        hospital.setHospitalAddress(hospitalAddress);
        hopitalList.add(hospital);
        return hospital;
    }
    
    public void deleteHospital(Hospital hospital){
        hopitalList.remove(hospital);
    }
}
