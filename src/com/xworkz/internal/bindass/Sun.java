package com.xworkz.internal.bindass;

public class Sun extends Star{
    public Sun(){
        System.out.println("running star in sun");
    }
    @Override
    public void name(){
        System.out.println("name of the star");
    }
    @Override
    public void shape(){
        System.out.println("shape of the star");
    }
    @Override
    public void temp(){
        System.out.println("temp of the star");
    }
    @Override
    public void size(){
        System.out.println("size of the star");
    }
    @Override
    public void distance(){
        System.out.println("distance of the star");
    }
}
