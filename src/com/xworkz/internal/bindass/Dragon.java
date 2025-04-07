package com.xworkz.internal.bindass;

public class Dragon extends Creature{
    public Dragon(){
        System.out.println("no arg constructor in dragon");
    }
    @Override
    public void roar(){
        System.out.println("roar in creature");
    }
    @Override
    public void fire(){
        System.out.println("fire in creature");
    }
    @Override
    public void fly(){
        System.out.println("fly in creature");
    }
    @Override
    public void gaurd(){
        System.out.println("gaurd in creature");
    }
    @Override
    public void sleep(){
        System.out.println("sleep in creature");
    }
}
