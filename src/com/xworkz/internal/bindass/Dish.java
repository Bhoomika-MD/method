package com.xworkz.internal.bindass;

public class Dish extends Dosa{
    public Dish(){
        System.out.println("running dosa in dish");
    }@Override
    public void round(){
        System.out.println("dosa is round in shape");
    }@Override
    public void crispy(){
        System.out.println("dosa is crispy");
    }@Override
    public void shape(){
        System.out.println("dosa shape");
    }@Override
    public void quality(){
        System.out.println("dosa quality");
    }@Override
    public void cost(){
        System.out.println("dosa cost");
    }
}
