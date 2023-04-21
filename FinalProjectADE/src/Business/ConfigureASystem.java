/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Employee.Employee;
import Patient.Patient;

/**
 *
 * @author whh
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("Q", "Q", "Q");
        
        Patient patient = ecoSystem.getPatientDirectory().createPatient("W", "W", "W");
        
        return ecoSystem;
    }
}
