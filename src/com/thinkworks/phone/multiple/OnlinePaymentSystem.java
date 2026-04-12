package com.thinkworks.phone.multiple;

import com.thinkworks.phone.interfaces.Device.Security;
import com.thinkworks.phone.interfaces.functional.Notification;
import com.thinkworks.phone.interfaces.functional.Payment;
import com.thinkworks.phone.interfaces.functional.Scanner;

public class OnlinePaymentSystem implements Scanner, Payment, Notification {
    @Override
    public void scanDocument() {
        System.out.println("Scanning QRcode");
    }

    @Override
    public void makePyment() {
        System.out.println("Payment is done");
    }

    @Override
    public void sendNotification() {
        System.out.println("sned notification");
    }
}
