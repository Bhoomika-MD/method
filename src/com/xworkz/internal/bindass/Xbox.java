package com.xworkz.internal.bindass;

public class Xbox extends GameConsole{
    public Xbox(){
        System.out.println("no arg constructor in Xbox");
    }
    @Override
    public void start(){
        System.out.println("start game console");
    }
    @Override
    public void stop(){
        System.out.println("stop game console");
    }
    @Override
    public void loadGame(){
        System.out.println("loadGame game console");
    }
    @Override
    public void connectController(){
        System.out.println("connectController game console");
    }
    @Override
    public void shutDown(){
        System.out.println("shutDown game console");
    }
}
