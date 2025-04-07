package com.xworkz.internal.bindass;

public class Ravi extends Person{
    public Ravi(){
        System.out.println("running Person in ravi");
    }
    @Override
    public void tall(){
        System.out.println("person is very tall");
    }
    @Override
    public void slim(){
        System.out.println("person is very slim");
    }
    @Override
    public void fat(){
        System.out.println("person is very fat");
    }
    @Override
    public void thin(){
        System.out.println("person is very thin");
    }
    @Override
    public void slept(){
        System.out.println("person is slept");
    }
}
