package com.xworkz.internal.bindass;

public class Sensor {
    public Sensor(){
        System.out.println("no arg constructor in sensor");
    }
    public void read(){
        System.out.println("read sensor");
    }
    public void calibrate(){
        System.out.println("calibrate sensor");
    }
    public void detect(){
        System.out.println("detect sensor");
    }
    public void sendAlert(){
        System.out.println("sendAlert sensor");
    }
    public void reset(){
        System.out.println("reset sensor");
    }
}
