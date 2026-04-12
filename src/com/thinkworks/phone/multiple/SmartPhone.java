package com.thinkworks.phone.multiple;

import com.thinkworks.phone.interfaces.Device.Fingerprint;
import com.thinkworks.phone.interfaces.functional.Bluetooth;
import com.thinkworks.phone.interfaces.functional.MusicPlayer;

public class SmartPhone implements Fingerprint, Bluetooth, MusicPlayer {
    @Override
    public void connectBluetooth() {
        System.out.println("your Bluetooth is connected");
    }

    @Override
    public void scanFingerprint() {
        System.out.println("your fingerprint is scanned");

    }

    @Override
    public void music() {
        System.out.println("Music playing");
    }
}
