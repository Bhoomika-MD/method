package com.xworkz.internal.bindass;

public class ComputerScience extends Branch{
    public ComputerScience() {
        System.out.println("no arg construtor in computer science");
    }
    @Override
    public void admit(){
        System.out.println("admit into branch");
    }
    @Override
    public void pay(){
        System.out.println("pay into branch");
    }
    @Override
    public void join(){
        System.out.println("join into branch");
    }
    @Override
    public void replace(){
        System.out.println("replace into branch");
    }
    @Override
    public void present(){
        System.out.println("present into branch");
    }
}
