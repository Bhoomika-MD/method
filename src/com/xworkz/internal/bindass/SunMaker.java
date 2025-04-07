package com.xworkz.internal.bindass;

public class SunMaker extends Sheet{
    public SunMaker(){
        System.out.println("no arg constructor in SunMaker");
    }
    @Override
    public void apply(){
        System.out.println("apply sheet");
    }
    @Override
    public void removed(){
        System.out.println("removed sheet");
    }
    @Override
    public void newOne(){
        System.out.println("newOne sheet");
    }
    @Override
    public void order(){
        System.out.println("order sheet");
    }
    @Override
    public void deliver(){
        System.out.println("deliver sheet");
    }
}
