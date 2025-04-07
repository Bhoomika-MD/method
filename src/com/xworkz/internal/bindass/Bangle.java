package com.xworkz.internal.bindass;

public class Bangle extends Gold{
    public Bangle(){
        System.out.println("running gold in bangle");
    }@Override
    public void buy(){
        System.out.println("buy the gold");
    }@Override
    public void sell(){
        System.out.println("sell the gold");
    }@Override
    public void wear(){
        System.out.println("wear the gold");
    }@Override
    public void give(){
        System.out.println("give the gold");
    }@Override
    public void take(){
        System.out.println("take the gold");
    }
}
