package com.xworkz.internal.bindass;

public class Summer extends Weather{
    public Summer(){
        System.out.println("running weather in summer");
    }@Override
    public void cool(){
        System.out.println("the weather is cool");
    }@Override
    public void hot(){
        System.out.println("the weather is hot");
    }@Override
    public void medium(){
        System.out.println("the weather is medium");
    }@Override
    public void humid(){
        System.out.println("the weather is humid");
    }@Override
    public void dusty(){
        System.out.println("the weather is dusty");
    }
}
