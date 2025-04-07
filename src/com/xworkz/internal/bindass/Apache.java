package com.xworkz.internal.bindass;

public class Apache extends Bike{
    public Apache(){
        System.out.println("running bike in apache");
    }
    @Override
    public void cost(){
        System.out.println("cost of the bike");
    }
    @Override
    public void style(){
        System.out.println("style of the bike");
    }
    @Override
    public void color(){
        System.out.println("color of the bike");
    }
    @Override
    public void seat(){
        System.out.println("seat of the bike");
    }
    @Override
    public void height(){
        System.out.println("height of the bike");
    }
}
