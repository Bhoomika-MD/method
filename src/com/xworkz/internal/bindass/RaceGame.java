package com.xworkz.internal.bindass;

public class RaceGame extends Game{
    public RaceGame(){
        System.out.println("no arg constructor in RaceGame");
    }
    @Override
    public void start(){
        System.out.println("start game");
    }
    @Override
    public void stop(){
        System.out.println("stop game");
    }
    @Override
    public void reset(){
        System.out.println("reset game");
    }
    @Override
    public void resume(){
        System.out.println("resume game");
    }
    @Override
    public void end(){
        System.out.println("end game");
    }


}
