package com.xworkz.internal.bindass;

public class Python extends Language{
    public Python(){
        System.out.println("running Language in python");
    }
    @Override
    public void easy(){
        System.out.println("It is a high level language");
    }
    @Override
    public void tough(){
        System.out.println("It is a low level language");
    }
    @Override
    public void read(){
        System.out.println("read language");
    }
    @Override
    public void write(){
        System.out.println("write language");
    }
    @Override
    public void practise(){
        System.out.println("practise language");
    }
}
