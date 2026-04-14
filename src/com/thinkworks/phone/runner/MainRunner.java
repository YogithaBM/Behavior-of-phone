package com.thinkworks.phone.runner;

import com.thinkworks.phone.hybrid.child.ATMSystem;
import com.thinkworks.phone.hybrid.child.Laptop;
import com.thinkworks.phone.hybrid.child.SelfServiceKiosk;
import com.thinkworks.phone.hybrid.child.Tablet;
import com.thinkworks.phone.hybrid.parent.Device;
import com.thinkworks.phone.interfaces.functional.Printer;
import com.thinkworks.phone.multiple.*;
import javafx.scene.control.Tab;

public class MainRunner {

    public static void main(String[] args) {
        EcommerceApp ecommerceApp=new EcommerceApp();
        System.out.println("From class Ecommerce");
        ecommerceApp.deliverOrder();
        ecommerceApp.registerUser();
        ecommerceApp.registerUser();
        System.out.println("    ");

        System.out.println("From class OnlinePaymentSystem");
        OnlinePaymentSystem onlinePaymentSystem=new OnlinePaymentSystem();
        onlinePaymentSystem.makePyment();
        onlinePaymentSystem.scanDocument();
        onlinePaymentSystem.sendNotification();
        System.out.println("  ");

        System.out.println("From class PrintMachine");
        PrinterMachine printerMachine=new PrinterMachine();
        printerMachine.printDocument();
        printerMachine.showDisplay();
        printerMachine.storeData();
        System.out.println("  ");

        System.out.println("From class SmartPhone");
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.connectBluetooth();
        smartPhone.music();
        smartPhone.scanFingerprint();

        System.out.println("From class SmartWatch");
        SmartWatch smartWatch=new SmartWatch();
        smartWatch.chargeDevice();
        smartWatch.checkBattery();
        smartWatch.getLocation();
        System.out.println("   ");

        System.out.println("From class Device(parent)");
        Device device=new Device();
        device.deviceInfo();
        System.out.println("  ");

        System.out.println("From class ATMSystem");
        ATMSystem atmSystem=new ATMSystem();
        atmSystem.deviceInfo();
        atmSystem.generateReport();
        atmSystem.loginUser();
        atmSystem.logoutUser();
        System.out.println("    ");

        System.out.println("From class Laptop");
        Laptop laptop=new Laptop();
        laptop.deviceInfo();
        laptop.checkBattery();
        laptop.loginUser();
        laptop.storeData();
        System.out.println("   ");

        System.out.println("From class SelfServiceKiosk");
        SelfServiceKiosk selfServiceKiosk=new SelfServiceKiosk();
        selfServiceKiosk.deviceInfo();
        selfServiceKiosk.generateBill();
        selfServiceKiosk.placeOrder();
        selfServiceKiosk.generateBill();
        System.out.println("   ");

        System.out.println("From class Smartphone");
        com.thinkworks.phone.hybrid.child.SmartPhone smartPhoneHybrid=new com.thinkworks.phone.hybrid.child.SmartPhone();
        smartPhoneHybrid.deviceInfo();
        smartPhoneHybrid.lens();
        smartPhoneHybrid.player();
        smartPhoneHybrid.sendNotification();
        System.out.println("    ");

        System.out.println("From class Tablet");
        Tablet tablet=new Tablet();
        tablet.deviceInfo();
        tablet.connectNetwork();
        tablet.playSound();
        tablet.unlockWithFace();
        System.out.println("    ");




    }


}
