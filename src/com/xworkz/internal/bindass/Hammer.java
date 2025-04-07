package com.xworkz.internal.bindass;

public class Hammer extends Tool{
    public Hammer(){
        System.out.println("no arg constructor in hammer");
    }
    @Override
    public void use(){
        System.out.println("use tool");
    }
    @Override
    public void tight(){
        System.out.println("tight tool");
    }
    @Override
    public void loose(){
        System.out.println("loose tool");
    }
    @Override
    public void repair(){
        System.out.println("repair tool");
    }
    @Override
    public void store(){
        System.out.println("store tool");
    }
}
