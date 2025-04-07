package com.xworkz.internal.bindass;

public class BedBug extends Insect{
    public BedBug(){
        System.out.println("running insect in Bedbug");
    }
    @Override
    public void bite(){
        System.out.println("insect bite found");
    }
    @Override
    public void died(){
        System.out.println("insect died");
    }
    @Override
    public void alive(){
        System.out.println("insect alive");
    }
    @Override
    public void fly(){
        System.out.println("insect fly");
    }
    @Override
    public void sat(){
        System.out.println("insect sat");
    }
}
