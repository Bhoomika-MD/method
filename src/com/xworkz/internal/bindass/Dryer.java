package com.xworkz.internal.bindass;

public class Dryer extends Device{
    public void dries(Device device){
        device.powerOff();
        if(device instanceof  Device){
            System.out.println("dryer is a device");
            Dryer dryer=(Dryer) device;
            Dryer.plug();
            device.powerOn();
            device.openApp();
            device.cutCall();
            device.makeCall();
        }
    }
    public void plug(){
        System.out.println("plug the dryer");
    }
}
