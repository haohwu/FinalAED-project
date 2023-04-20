/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicine;

/**
 *
 * @author whh
 */
public class Medicine {
    private int Id;
    private String medicineName;
    private int price;
    private static int count;
    
    public Medicine(String name, int price){
        this.Id = this.count++;
        this.medicineName = name;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Medicine.count = count;
    }
    
    @Override
    public String toString(){
        return medicineName;
    }
}
