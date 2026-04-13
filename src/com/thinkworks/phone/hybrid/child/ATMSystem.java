package com.thinkworks.phone.hybrid.child;

import com.thinkworks.phone.hybrid.parent.Device;
import com.thinkworks.phone.interfaces.Business.Login;
import com.thinkworks.phone.interfaces.Business.Logout;
import com.thinkworks.phone.interfaces.Business.Report;

public class ATMSystem extends Device implements Login, Logout, Report {

    @Override
    public void loginUser() {
        System.out.println("logged into your acc");
    }

    @Override
    public void logoutUser() {
        System.out.println(" logged out of your account");
    }

    @Override
    public void generateReport() {
        System.out.println(" report is generated");
    }
}
