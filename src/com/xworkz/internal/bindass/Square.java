package com.xworkz.internal.bindass;

public class Square extends Shape{
    public Square(){
        System.out.println("running shape in square");
    }
    @Override
    public void correct(){
        System.out.println("shape is correct");
    }
    @Override
    public void notCorrect(){
        System.out.println("Shape is not correct");
    }
    @Override
    public void draw(){
        System.out.println("Shape draw");
    }
    @Override
    public void erase(){
        System.out.println("Shape erase");
    }
    @Override
    public void rewrite(){
        System.out.println("Shape rewrite");
    }
}
