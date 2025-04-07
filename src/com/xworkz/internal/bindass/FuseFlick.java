package com.xworkz.internal.bindass;

public class FuseFlick extends ElectricDevice{
    public FuseFlick(){
        System.out.println("Running electricDevice in FuseFlick");
    }
    @Override
    public void shock(){
        System.out.println("gets electric shock when touched");
    }
    @Override
    public void shop(){
        System.out.println("shop of electric device");
    }
    @Override
    public void open(){
        System.out.println("shop open of electric device");
    }
    @Override
    public void close(){
        System.out.println("shop close of electric device");
    }
    @Override
    public void reopen(){
        System.out.println("shop  reopen of electric device");
    }
}
