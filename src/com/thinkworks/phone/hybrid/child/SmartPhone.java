package com.thinkworks.phone.hybrid.child;

import com.thinkworks.phone.hybrid.parent.Device;
import com.thinkworks.phone.interfaces.functional.Camera;
import com.thinkworks.phone.interfaces.functional.Notification;
import com.thinkworks.phone.interfaces.functional.VideosPlayer;

public class SmartPhone extends Device implements Camera, VideosPlayer, Notification {
    @Override
    public void lens() {
        System.out.println("camera is clicking photos");
    }

    @Override
    public void player() {
        System.out.println("video is playing ");
    }

    @Override
    public void sendNotification() {
        System.out.println("send notification");
    }
}
