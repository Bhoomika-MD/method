package com.xworkz.internal.bindass;

public class Carrot extends Vegetable{
    public Carrot(){
        System.out.println("running vegetable in carrot");
    }
    @Override
    public void cut(){
        System.out.println("cutting vegetable");
    }
    @Override
    public void buy(){
        System.out.println("Buy  vegetable");
    }
    @Override
    public void fresh(){
        System.out.println("Fresh  vegetable");
    }
    @Override
    public void sell(){
        System.out.println("sell  vegetable");
    }
    @Override
    public void pay(){
        System.out.println("pay  vegetable");
    }
}
