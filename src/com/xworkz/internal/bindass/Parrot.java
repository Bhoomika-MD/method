package com.xworkz.internal.bindass;

public class Parrot extends Bird{
    public Parrot(){
        System.out.println("no arg constructor in parrot");
    }
    @Override
    public void fly(){
        System.out.println("fly bird");
    }
    @Override
    public void eat(){
        System.out.println("eat bird");
    }
    @Override
    public void repeatWords(){
        System.out.println("repeatWords bird");
    }
    @Override
    public void perch(){
        System.out.println("perch bird");
    }
    @Override
    public void feather(){
        System.out.println("feather bird");
    }
}
