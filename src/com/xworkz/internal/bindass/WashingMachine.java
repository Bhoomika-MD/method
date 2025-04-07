package com.xworkz.internal.bindass;

public class WashingMachine extends Appliance{
    public WashingMachine(){
        System.out.println("no arg constructor in washing machine");
    }
    @Override
    public void turnOn(){
        System.out.println("turn on app");
    }
    @Override
    public void turnOff(){
        System.out.println("turn off app");
    }
    @Override
    public void start(){
        System.out.println("start on app");
    }
    @Override
    public void rinse(){
        System.out.println("rinse on app");
    }
    @Override
    public void spin(){
        System.out.println("spin on app");
    }
}
