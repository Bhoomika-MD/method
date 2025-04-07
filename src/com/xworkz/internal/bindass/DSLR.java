package com.xworkz.internal.bindass;

public class DSLR extends Camera{
    public DSLR(){
        System.out.println("no arg constructor in DSLR");
    }
    @Override
    public void working(){
        System.out.println("camera working");
    }
    @Override
    public void notWorking(){
        System.out.println("camera  not working");
    }
    @Override
    public void click(){
        System.out.println("camera click");
    }
    @Override
    public void open(){
        System.out.println("camera open");
    }
    @Override
    public void close(){
        System.out.println("camera close");
    }
}
