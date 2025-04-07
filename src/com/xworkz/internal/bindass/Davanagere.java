package com.xworkz.internal.bindass;

public class Davanagere extends City{
    public Davanagere(){
        System.out.println("no arg constructor in davanagere");
    }
    @Override
    public void locate(){
        System.out.println("locate city");
    }
    @Override
    public void visit(){
        System.out.println("visit city");
    }
    @Override
    public void back(){
        System.out.println("back city");
    }
    @Override
    public void look(){
        System.out.println("look city");
    }
    @Override
    public void go(){
        System.out.println("go city");
    }
}
