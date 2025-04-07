package com.xworkz.internal.bindass;

public class Titan extends Watch{
    public Titan(){
        System.out.println("running watch in titan");
    }@Override
    public void time(){
        System.out.println("watch used to see time");
    }@Override
    public void shell(){
        System.out.println("replace watch shell");
    }@Override
    public void stop(){
        System.out.println("stop watch shell");
    }@Override
    public void start(){
        System.out.println("start watch shell");
    }@Override
    public void nill(){
        System.out.println("watch is nill");
    }
}
