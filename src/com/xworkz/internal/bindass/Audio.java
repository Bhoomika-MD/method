package com.xworkz.internal.bindass;

public class Audio extends Media{
    public Audio(){
        System.out.println("no arg constuctor in audio");
    }
    @Override
    public void play(){
        System.out.println("play media");
    }
    @Override
    public void pause(){
        System.out.println("pause media");
    }
    @Override
    public void stop(){
        System.out.println("stop media");
    }
    @Override
    public void adjust(){
        System.out.println("adjust media");
    }
    @Override
    public void mute(){
        System.out.println("mute media");
    }
}
