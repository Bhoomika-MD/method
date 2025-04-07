package com.xworkz.internal.bindass;

public class Lenskart extends SpectShop{
    public Lenskart(){
        System.out.println("running spectShop in lenskart");
    }
    @Override
    public void newShop(){
        System.out.println("new shop of spects");
    }
    @Override
    public void area(){
        System.out.println("area of the shop");
    }
    @Override
    public void open(){
        System.out.println("open the shop");
    }
    @Override
    public void close(){
        System.out.println("close the shop");
    }
    @Override
    public void size(){
        System.out.println("size of the shop");
    }
}
