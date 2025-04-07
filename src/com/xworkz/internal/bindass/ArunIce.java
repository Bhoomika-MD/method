package com.xworkz.internal.bindass;

public class ArunIce extends IceCream{
    public ArunIce(){
        System.out.println("running icecream in ArunIce");
    }
    @Override
    public void taste(){
        System.out.println("taste of the ice ");
    }
    @Override
    public void size(){
        System.out.println("size of the ice");
    }
    @Override
    public void open(){
        System.out.println("open of the ice shop");
    }
    @Override
    public void close(){
        System.out.println("close of the ice shop");
    }
    @Override
    public void quality(){
        System.out.println("quality of the ice");
    }
}
