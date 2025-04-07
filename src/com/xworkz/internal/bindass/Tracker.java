package com.xworkz.internal.bindass;

public class Tracker extends Application{
    public Tracker(){
        System.out.println("no arg constructor in tracker");
    }
    @Override
    public void on(){
        System.out.println("application is on");
    }
    @Override
    public void off(){
        System.out.println("application is off");
    }
    @Override
    public void track(){
        System.out.println("application is track");
    }
    @Override
    public void notification(){
        System.out.println("application is notification");
    }
    @Override
    public void recent(){
        System.out.println("application is recent");
    }
}
