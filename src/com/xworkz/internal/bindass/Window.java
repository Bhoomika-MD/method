package com.xworkz.internal.bindass;

public class Window extends Grill{
    public Window(){
        System.out.println("no arg constructor in window");
    }
    @Override
    public void fix(){
        System.out.println("grill is fixed");
    }
    @Override
    public void open(){
        System.out.println("grill is open");
    }
    @Override
    public void close(){
        System.out.println("grill is close");
    }
    @Override
    public void removed(){
        System.out.println("grill is removed");
    }
    @Override
    public void replace(){
        System.out.println("grill is replace");
    }
}
