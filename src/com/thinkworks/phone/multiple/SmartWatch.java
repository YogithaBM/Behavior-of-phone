package com.thinkworks.phone.multiple;

import com.thinkworks.phone.interfaces.Device.Battery;
import com.thinkworks.phone.interfaces.Device.Charging;
import com.thinkworks.phone.interfaces.functional.GPS;

public class SmartWatch implements Battery, Charging, GPS {

    @Override
    public void chargeDevice() {
        System.out.println("Charging the watch");
    }

    @Override
    public void checkBattery() {
        System.out.println("battery is charged");
    }

    @Override
    public void getLocation() {
        System.out.println("location of watch");
    }
}
