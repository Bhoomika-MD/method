package com.xworkz.internal.bindass;

public class Trolly extends Suitcase{
    public Trolly(){
        System.out.println("no arg constructor in trolly");
    }
    @Override
    public void zip(){
        System.out.println("zip in suitcase");
    }
    @Override
    public void open(){
        System.out.println("open in suitcase");
    }
    @Override
    public void close(){
        System.out.println("close in suitcase");
    }
    @Override
    public void buy(){
        System.out.println("buy in suitcase");
    }
    @Override
    public void sell(){
        System.out.println("sell in suitcase");
    }
}
