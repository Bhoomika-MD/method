package com.xworkz.internal.bindass;

public class Cat extends Pet{
    public Cat(){
        System.out.println("no arg constructor in cat");
    }
    @Override
    public void buy(){
        System.out.println("found buy in pet");
    }
    @Override
    public void sell(){
        System.out.println("found sell in pet");
    }
    @Override
    public void giveFood(){
        System.out.println("found giveFood in pet");
    }
    @Override
    public void ran(){
        System.out.println("found ran in pet");
    }
    @Override
    public void sit(){
        System.out.println("found sit in pet");
    }
}
