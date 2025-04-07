package com.xworkz.internal.bindass;

public class Ashirvad extends PG{
    public Ashirvad(){
        System.out.println("no arg constructor in Ashirvad");
    }
    @Override
    public void open(){
        System.out.println("pg is open");
    }
    @Override
    public void close(){
        System.out.println("pg is close");
    }
    @Override
    public void join(){
        System.out.println("pg is join");
    }
    @Override
    public void pay(){
        System.out.println("pg is pay");
    }
    @Override
    public void leave(){
        System.out.println("pg is leave");
    }
}
