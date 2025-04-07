package com.xworkz.internal.bindass;

public class MotionSensor extends Sensor{
    public MotionSensor(){
        System.out.println("no arg constructor in motion sensor");
    }
    @Override
    public void read(){
        System.out.println("read sensor");
    }
    @Override
    public void calibrate(){
        System.out.println("calibrate sensor");
    }
    @Override
    public void detect(){
        System.out.println("detect sensor");
    }
    @Override
    public void sendAlert(){
        System.out.println("sendAlert sensor");
    }
    @Override
    public void reset(){
        System.out.println("reset sensor");
    }
}
