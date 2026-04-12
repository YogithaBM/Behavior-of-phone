package com.thinkworks.phone.multiple;

import com.thinkworks.phone.interfaces.Device.Display;
import com.thinkworks.phone.interfaces.Device.Storage;
import com.thinkworks.phone.interfaces.functional.Printer;

public class PrinterMachine implements Printer, Display, Storage {
    @Override
    public void printDocument() {
        System.out.println("printing th Document");
    }

    @Override
    public void showDisplay() {
        System.out.println("show th display");
    }

    @Override
    public void storeData() {
        System.out.println("Storage of printer");
    }
}
