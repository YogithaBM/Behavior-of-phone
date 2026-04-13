package com.thinkworks.phone.hybrid.child;

import com.thinkworks.phone.hybrid.parent.Device;
import com.thinkworks.phone.interfaces.Device.FaceUnlock;
import com.thinkworks.phone.interfaces.Device.Network;
import com.thinkworks.phone.interfaces.Device.Speaker;

public class Tablet extends Device implements FaceUnlock, Network, Speaker {
    @Override
    public void unlockWithFace() {
        System.out.println("unlock with face");
    }

    @Override
    public void connectNetwork() {
        System.out.println("network is connected");
    }

    @Override
    public void playSound() {
        System.out.println("playing sound");
    }
}
