package com.xworkz.internal.bindass;

public class Manager extends Employee{
    public Manager(){
        System.out.println("no arg constructor in manager");
    }
    @Override
    public void newJoin(){
        System.out.println("new join in employee");
    }
    @Override
    public void fresher(){
        System.out.println("fresher in employee");
    }
    @Override
    public void newTask(){
        System.out.println("new task in employee");
    }
    @Override
    public void fire(){
        System.out.println("fire in employee");
    }
    @Override
    public void join(){
        System.out.println(" join in employee");
    }
}
