package com.xworkz.internal.bindass;

public class Sagar extends Hospital{
    public Sagar(){
        System.out.println("running hospital in sagar");
    }
    @Override
    public void open(){
        System.out.println("hospital is open");
    }
    @Override
    public void close(){
        System.out.println("hospital is closed");
    }
    @Override
    public void patient(){
        System.out.println("hospital has patient");
    }
    @Override
    public void near(){
        System.out.println("hospital is near");
    }
    @Override
    public void far(){
        System.out.println("hospital is far");
    }
}
