package com.xworkz.internal.bindass;

public class Beoplay extends Speaker{
    public Beoplay(){
        System.out.println("running speaker in beoplay");
    }@Override
    public void sound(){
        System.out.println("Sound of the speaker");
    }@Override
    public void volume(){
        System.out.println("volume of the speaker");
    }@Override
    public void on(){
        System.out.println(" on the speaker");
    }@Override
    public void off(){
        System.out.println(" off the speaker");
    }@Override
    public void resume(){
        System.out.println("resume the speaker");
    }
}
