package com.xworkz.internal.bindass;

public class More extends Shop{
    public More(){
        System.out.println("running shop in more");
    }
    @Override
    public void open(){
        System.out.println("shop is open");
    }
    @Override
    public void close(){
        System.out.println("shop is closed");
    }
    @Override
    public void buy(){
        System.out.println("shop is buying new material");
    }
    @Override
    public void returned(){
        System.out.println("shop is retuning loss");
    }
    @Override
    public void sell(){
        System.out.println("shop is for sell");
    }
}
