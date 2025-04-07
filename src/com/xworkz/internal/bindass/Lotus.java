package com.xworkz.internal.bindass;

public class Lotus extends Flower{
    public Lotus(){
        System.out.println("no arg constructor in lotus");
    }
    @Override
    public void grow(){
        System.out.println("grow flower");
    }
    @Override
    public void cut(){
        System.out.println("cut flower");
    }
    @Override
    public void bloom(){
        System.out.println("bloom flower");
    }
    @Override
    public void wilt(){
        System.out.println("wilt flower");
    }
    @Override
    public void smell(){
        System.out.println("smell flower");
    }
}
