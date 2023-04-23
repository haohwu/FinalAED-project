/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.MedicineItems;

/**
 *
 * @author whh
 */
public class MedicineItem {
    private int id;
    private String name;
    private int price;
    private static int count = 1;

    public MedicineItem(String name, int price) {
        id = count;
        count++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

     
    
    @Override
    public String toString() {
        return name;
    }
    

    public void setPrice(int price) {
        this.price = price;
    }
}
