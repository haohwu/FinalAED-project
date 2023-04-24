/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class DeliveryManDirectory {

    private ArrayList<DeliveryMan> deliveryManList;

    public DeliveryManDirectory() {
        deliveryManList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public DeliveryMan createDeliveryMan(String name, String phone, String address) {
        DeliveryMan deliveryMan = new DeliveryMan();
        deliveryMan.setName(name);
        deliveryMan.setPhone(phone);
        deliveryMan.setAddress(address);
        deliveryManList.add(deliveryMan);
        return deliveryMan;
    }

}
