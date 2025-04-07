package com.xworkz.internal.bindass;

public class Bus extends Transport{
    public Bus(){
        System.out.println("no arg constructor in Bus");
    }
    @Override
    public void startRoute(){
        System.out.println("startroute in transport");
    }
    @Override
    public void stopRoute(){
        System.out.println("stopRoute in transport");
    }
    @Override
    public void newRoute(){
        System.out.println("newRoute in transport");
    }
    @Override
    public void updateRoute(){
        System.out.println("updateRoute in transport");
    }
    @Override
    public void deleteRoute(){
        System.out.println("deleteRoute in transport");
    }
}
