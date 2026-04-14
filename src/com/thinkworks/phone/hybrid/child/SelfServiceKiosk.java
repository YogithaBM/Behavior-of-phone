package com.thinkworks.phone.hybrid.child;

import com.thinkworks.phone.hybrid.parent.Device;
import com.thinkworks.phone.interfaces.Business.Billing;
import com.thinkworks.phone.interfaces.Business.Order;

public class SelfServiceKiosk extends Device implements Billing , Order {
    @Override
    public void generateBill() {
        System.out.println("Get bill");

    }

    @Override
    public void placeOrder() {
        System.out.println("order is placed");
    }

    @Override
    public void deviceInfo() {
        System.out.println("Information of SelfServiceKiosk ");
    }
}
