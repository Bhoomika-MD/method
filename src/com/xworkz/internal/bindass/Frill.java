package com.xworkz.internal.bindass;

public class Frill extends Pattern{
    public Frill(){
        System.out.println("no arg constructor in frill");
    }
    @Override
    public void open(){
        System.out.println("open frill");
    }
    @Override
    public void close(){
        System.out.println("close frill");
    }
    @Override
    public void more(){
        System.out.println("more frill");
    }
    @Override
    public void less(){
        System.out.println("less frill");
    }
    @Override
    public void mid(){
        System.out.println("mid frill");
    }
}
