package com.xworkz.internal.bindass;

public class Altos extends Hanger{
    public Altos(){
        System.out.println("no arg constructor in Altos");
    }
    @Override
    public void fix(){
        System.out.println("fix the hanger");
    }
    @Override
    public void removed(){
        System.out.println("removed the hanger");
    }
    @Override
    public void newOne(){
        System.out.println("newOne the hanger");
    }
    @Override
    public void buy(){
        System.out.println("buy the hanger");
    }
    @Override
    public void sell(){
        System.out.println("sell the hanger");
    }
}
