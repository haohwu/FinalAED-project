/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patient;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class PatientDirectory {

    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        this.patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public Patient createPatient(String name, String phoneNum, String address) {
        Patient patient = new Patient();
        patient.setName(name);
        patient.setPhoneNum(phoneNum);
        patient.setAddress(address);
        patientList.add(patient);
        return patient;
    }

    public void deletePatient(Patient patient) {
        patientList.remove(patient);
    }

    public Patient findPatient(String name) {
        for (Patient p : patientList) {
            if (p.getName() == name) {
                return p;
            }
        }
        return null;
    }
}
