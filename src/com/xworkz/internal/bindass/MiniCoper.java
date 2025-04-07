package com.xworkz.internal.bindass;

public class MiniCoper extends Car{
    public MiniCoper(){
        System.out.println("running car in MiniCoper");
    }
    @Override
    public void name(){
        System.out.println("name of the car");
    }
    @Override
    public void color(){
        System.out.println("color of the car");
    }
    @Override
    public void modle(){
        System.out.println("modle of the car");
    }
    @Override
    public void seat(){
        System.out.println("seat of the car");
    }
    @Override
    public void style(){
        System.out.println("style of the car");
    }
}
