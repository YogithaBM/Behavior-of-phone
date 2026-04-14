package com.thinkworks.phone.hybrid.child;

import com.thinkworks.phone.hybrid.parent.Device;
import com.thinkworks.phone.interfaces.Business.Login;
import com.thinkworks.phone.interfaces.Device.Battery;
import com.thinkworks.phone.interfaces.Device.Storage;
import sun.rmi.runtime.Log;

public class Laptop extends Device implements Battery, Storage, Login {
    @Override
    public void loginUser() {
        System.out.println("logged in");
    }

    @Override
    public void checkBattery() {
        System.out.println("battery is full");
    }

    @Override
    public void storeData() {
        System.out.println("storage ");
    }

    @Override
    public void deviceInfo() {
        System.out.println("Information of Laptop");
    }
}
