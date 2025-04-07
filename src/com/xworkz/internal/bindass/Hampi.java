package com.xworkz.internal.bindass;

public class Hampi extends HistoricalPlace{
    public Hampi(){
        System.out.println("running place in hampi");
    }
    @Override
    public void build(){
        System.out.println("build a place");
    }
    @Override
    public void destroy(){
        System.out.println("destroy a place");
    }
    @Override
    public void open(){
        System.out.println("open a place");
    }
    @Override
    public void close(){
        System.out.println("close a place");
    }
    @Override
    public void onWork(){
        System.out.println("on work a place");
    }
}
