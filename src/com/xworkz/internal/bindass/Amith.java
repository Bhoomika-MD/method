package com.xworkz.internal.bindass;

public class Amith extends Student{
    public Amith(){
        System.out.println("running student in amith");
    }
    @Override
    public void rollNumber(){
        System.out.println("Roll number of the student");
    }
    @Override
    public void gender(){
        System.out.println("Gender of the student");
    }
    @Override
    public void name(){
        System.out.println("name of the student");
    }
    @Override
    public void section(){
        System.out.println("section of the student");
    }
    @Override
    public void group(){
        System.out.println("Group of the student");
    }
}
