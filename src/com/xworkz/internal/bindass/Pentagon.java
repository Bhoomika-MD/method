package com.xworkz.internal.bindass;

public class Pentagon extends Pen{
    public Pentagon(){
        System.out.println("running pen in pentagon");
    }@Override
    public void write(){
        System.out.println("Pen used to write ");
    }@Override
    public void newPen(){
        System.out.println("Buy a new pen");
    }@Override
    public void oldPen(){
        System.out.println("Buy a old pen");
    }@Override
    public void emptyPen(){
        System.out.println("Buy a empty pen");
    }@Override
    public void halfPen(){
        System.out.println("Buy a half pen");
    }
}
