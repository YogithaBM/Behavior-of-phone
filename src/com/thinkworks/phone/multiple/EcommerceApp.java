package com.thinkworks.phone.multiple;

import com.thinkworks.phone.interfaces.Business.Delivery;
import com.thinkworks.phone.interfaces.Business.Register;
import com.thinkworks.phone.interfaces.Business.Tracking;

public class EcommerceApp implements Delivery, Tracking, Register {
    @Override
    public void registerUser() {
        System.out.println("User is registered");
    }

    @Override
    public void trackOrder() {
        System.out.println("order is tracked");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is delivered");
    }
}
