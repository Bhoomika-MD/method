package com.xworkz.internal.bindass;

public class India extends Country{
    public India(){
        System.out.println("running country in India");
    }
    @Override
    public void name(){
        System.out.println("name of the country");
    }
    @Override
    public void capital(){
        System.out.println("capital of the country");
    }
    @Override
    public void states(){
        System.out.println("states in the country");
    }
    @Override
    public void tradition(){
        System.out.println("tradition of the country");
    }
    @Override
    public void weather(){
        System.out.println("weather of the country");
    }
}
