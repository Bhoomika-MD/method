package com.xworkz.internal.bindass;

public class OnlineCourse extends Course{
    public OnlineCourse(){
        System.out.println("no arg contsructor in online course");
    }
    @Override
    public void enroll(){
        System.out.println("enroll course");
    }
    @Override
    public void start(){
        System.out.println("start course");
    }
    @Override
    public void stop(){
        System.out.println("stop course");
    }
    @Override
    public void quiz(){
        System.out.println("quiz course");
    }
    @Override
    public void result(){
        System.out.println("result course");
    }
}
