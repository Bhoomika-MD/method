package com.xworkz.internal.bindass;

public class SmartPhone extends Device{
    public SmartPhone(){
        System.out.println("no arg constructor in smartphone");
    }
    @Override
    public void powerOn(){
        System.out.println("power on in device");
    }
    @Override
    public void powerOff(){
        System.out.println("power off in device");
    }
    @Override
    public void makeCall(){
        System.out.println("make call in device");
    }
    @Override
    public void cutCall(){
        System.out.println("cut call in device");
    }
    @Override
    public void openApp(){
        System.out.println("open app in device");
    }
}
