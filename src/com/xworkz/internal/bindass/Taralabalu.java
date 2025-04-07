package com.xworkz.internal.bindass;

public class Taralabalu extends School{
    public Taralabalu(){
        System.out.println("Running school in taralabalu");
    }
    @Override
    public void open(){
        System.out.println("school is open");
    }
    @Override
    public void close(){
        System.out.println("school is closed");
    }
    @Override
    public void admit(){
        System.out.println("school admit");
    }
    @Override
    public void join(){
        System.out.println("school join");
    }
    @Override
    public void tc(){
        System.out.println("school tc");
    }
}
