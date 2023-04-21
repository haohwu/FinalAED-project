/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicine;

/**
 *
 * @author whh
 */
public class MedicineSupplier {
    private int Id;
    private String MedicineSupplierName;
    private double price;
    
    private static int count;
    public MedicineSupplier(String MedicineSupplierName, int price) {
        this.Id = this.count++;
        this.MedicineSupplierName = MedicineSupplierName;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMedicineSupplierName() {
        return MedicineSupplierName;
    }

    public void setMedicineSupplierName(String MedicineSupplierName) {
        this.MedicineSupplierName = MedicineSupplierName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MedicineSupplier.count = count;
    }
    
    
    
}
