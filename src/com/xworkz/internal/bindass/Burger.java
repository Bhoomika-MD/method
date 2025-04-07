package com.xworkz.internal.bindass;

public class Burger extends Junk{
    public Burger(){
        System.out.println("no arg constructor in burger");
    }
    @Override
    public void eat(){
        System.out.println("eat junk");
    }
    @Override
    public void dontEat(){
        System.out.println("donteat junk");
    }
    @Override
    public void buy(){
        System.out.println("buy junk");
    }
    @Override
    public void give(){
        System.out.println("give junk");
    }
    @Override
    public void take(){
        System.out.println("take junk");
    }
}
