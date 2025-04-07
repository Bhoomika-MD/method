package com.xworkz.internal.bindass;

public class Switching extends Gadget{
    public Switching(){
        System.out.println("no argument constructor in switch");
    }
    @Override
    public void on(){
        System.out.println("gadget is on");
    }
    @Override
    public void off(){
        System.out.println("gadget is off");
    }
    @Override
    public void change(){
        System.out.println("gadget is change");
    }
    @Override
    public void replace(){
        System.out.println("gadget is replace");
    }
    @Override
    public void buy(){
        System.out.println("gadget is buy");
    }
}
