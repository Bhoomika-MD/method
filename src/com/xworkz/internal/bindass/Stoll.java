package com.xworkz.internal.bindass;

public class Stoll extends Vale{
    public Stoll(){
        System.out.println("no arg constructor in stoll");
    }
    @Override
    public void wear(){
        System.out.println("wearing vale");
    }
    @Override
    public void buy(){
        System.out.println("buy vale");
    }
    @Override
    public void sell(){
        System.out.println("sell vale");
    }
    @Override
    public void wash(){
        System.out.println("wash vale");
    }
    @Override
    public void dry(){
        System.out.println("dry vale");
    }
}
