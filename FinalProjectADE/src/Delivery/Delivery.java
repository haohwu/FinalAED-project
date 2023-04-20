/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delivery;

/**
 *
 * @author whh
 */
public class Delivery {
    private int Id;
    private String deliveryName;
    private String deliveryPhoneNum;
    private String deliveryAddress;
    private static int count;
    
    public Delivery(){
        this.Id = this.count++;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryPhoneNum() {
        return deliveryPhoneNum;
    }

    public void setDeliveryPhoneNum(String deliveryPhoneNum) {
        this.deliveryPhoneNum = deliveryPhoneNum;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Delivery.count = count;
    }
    
    
}
