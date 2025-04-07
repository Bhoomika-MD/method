package com.xworkz.internal.bindass;

public class Ball extends Sphere {
    public Ball(){
        System.out.println("no arg constructor in ball");
    }
    @Override
    public void draw(){
        System.out.println("draw sphere");
    }
    @Override
    public void pull(){
        System.out.println("pull sphere");
    }
    @Override
    public void push(){
        System.out.println("push sphere");
    }
    @Override

    public void sketch(){
        System.out.println("sketch sphere");
    }
    @Override
    public void erase(){
        System.out.println("erase sphere");
    }

}
