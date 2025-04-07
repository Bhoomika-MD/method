package com.xworkz.internal.bindass;

public class WifiNetwork extends Network{
    public WifiNetwork(){
        System.out.println("no arg constructor in WifiNetwork");
    }
    @Override
    public void reach(){
        System.out.println("reach network");
    }
    @Override
    public void signal(){
        System.out.println("signal network");
    }
    @Override
    public void on(){
        System.out.println("on network");
    }
    @Override
    public void off(){
        System.out.println("off network");
    }
    @Override
    public void refreshed(){
        System.out.println("refreshed network");
    }
}
