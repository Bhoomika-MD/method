package com.xworkz.internal.bindass;

public class Printer extends Printing{
    public Printer(){
        System.out.println("no arg constructor in printer");
    }
    @Override
    public void turnOn(){
        System.out.println("printing turnon");
    }
    @Override
    public void turnOff(){
        System.out.println("printing turnoff");
    }
    @Override
    public void print(){
        System.out.println("printing print");
    }
    @Override
    public void cancel(){
        System.out.println("printing cancel");
    }
    @Override
    public void check(){
        System.out.println("printing check");
    }
}
