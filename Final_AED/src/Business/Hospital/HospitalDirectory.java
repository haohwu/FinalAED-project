/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class HospitalDirectory {
    
     private ArrayList<Hospital> HospitalList;


public HospitalDirectory() {
        HospitalList = new ArrayList();
    }

public Hospital createHospital(String name, String address, String phone){
        Hospital h = new Hospital();
        h.setHospitalName(name);
        h.setHospitalAddress(address);
        h.setHospitalContactNo(phone);

        HospitalList.add(h);
        return h;
    }
public ArrayList<Hospital> getHospitalList() {
        return HospitalList;
    }

public Hospital findHospital(String name)
    {
        for(Hospital h : HospitalList)
        {
            if(h.getHospitalName() == name)
            {
                return h;
            }
        }
        return null;
    }
 public void deleteHospital(Hospital hospital)
    {
        HospitalList.remove(hospital);
    }  

  public boolean checkIfHospitalIsUnique(String hospital){
        for (Business.Hospital.Hospital s : HospitalList){
            if (s.getHospitalName().equals(hospital))
                return false;
        }
        return true;
    }


    
}
