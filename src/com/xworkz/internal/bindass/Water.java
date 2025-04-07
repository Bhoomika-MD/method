package com.xworkz.internal.bindass;

public class Water extends Liquid{
    public Water(){
        System.out.println("running liquid in water");
    }@Override
    public void drink(){
        System.out.println("Drink Liquid");
    }@Override
    public void pour(){
        System.out.println("pour the liquid");
    }@Override
    public void waste(){
        System.out.println("waste the liquid");
    }@Override
    public void purify(){
        System.out.println("purify the liquid");
    }@Override
    public void boil(){
        System.out.println("boil the liquid");
    }
}
