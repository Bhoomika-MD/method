package com.xworkz.internal.bindass;

public class Tractor extends Vehicle{
    public Tractor(){
        System.out.println("no arg constructor in tractor");
    }
    @Override
    public void run(){
        System.out.println("vehicle is running in tractor");
    }
    @Override
    public void stop(){
        System.out.println("vehicle is stopped in tractor");
    }
    @Override
    public void start(){
        System.out.println("vehicle is started in tractor");
    }
    @Override
    public void seace(){
        System.out.println("vehicle is seaced in tractor");
    }
    @Override
    public void buy(){
        System.out.println("buy a vehicle in tractor");
    }
}
