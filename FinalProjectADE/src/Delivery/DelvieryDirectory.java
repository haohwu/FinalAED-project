/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Delivery;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class DelvieryDirectory {
    private ArrayList<Delivery> deliveryList;
    
    public DelvieryDirectory(){
        this.deliveryList = new ArrayList<>();
    }

    public ArrayList<Delivery> getDeliveryList() {
        return deliveryList;
    }

    public void setDeliveryList(ArrayList<Delivery> deliveryList) {
        this.deliveryList = deliveryList;
    }
    
    public Delivery createDelivery(String deliveryName, String deliveryPhoneNum, String deliveryAddress){
        Delivery delivery = new Delivery();
        delivery.setDeliveryName(deliveryName);
        delivery.setDeliveryPhoneNum(deliveryPhoneNum);
        delivery.setDeliveryAddress(deliveryAddress);
        deliveryList.add(delivery);
        return delivery;
    }
}
