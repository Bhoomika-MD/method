package com.xworkz.internal.bindass;

public class Key extends Locker{
    public Key(){
        System.out.println("no arg constructor in key");
    }
    @Override
    public void open(){
        System.out.println("locker is open");
    }
    @Override
    public void close(){
        System.out.println("locker is close");
    }
    @Override
    public void newOne(){
        System.out.println("locker is new one");
    }
    @Override
    public void buy(){
        System.out.println("locker is buy");
    }
    @Override
    public void sell(){
        System.out.println("locker is sell");
    }
}
