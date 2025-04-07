package com.xworkz.internal.bindass;

public class DarkFantacy extends Biscuite{
    public DarkFantacy(){
        System.out.println("no arg constructor in Darkfantacy");
    }
    @Override
    public void buy(){
        System.out.println("buy biscuite");
    }
    @Override
    public void sell(){
        System.out.println("sell biscuite");
    }
    @Override
    public void pay(){
        System.out.println("pay biscuite");
    }
    @Override
    public void factory(){
        System.out.println("factory biscuite");
    }
    @Override
    public void shop(){
        System.out.println("shop biscuite");
    }
}
