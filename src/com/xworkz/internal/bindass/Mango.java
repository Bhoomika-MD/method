package com.xworkz.internal.bindass;

public class Mango extends Fruit{
    public Mango(){
        System.out.println("running fruit in mango");
    }
    @Override
    public void sweet(){
        System.out.println("fruit is sweet");
    }
    @Override
    public void sour(){
        System.out.println("fruit is sour");
    }
    @Override
    public void smell(){
        System.out.println("fruit is smell");
    }
    @Override
    public void salt(){
        System.out.println("fruit is salt");
    }
    @Override
    public void juicy(){
        System.out.println("fruit is juicy");
    }
}
