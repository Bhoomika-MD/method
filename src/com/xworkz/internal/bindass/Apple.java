package com.xworkz.internal.bindass;

public class Apple extends Fruit{
    public void goodHealth(Fruit fruit){
        fruit.juicy();
        if(fruit instanceof Fruit){
            System.out.println("apple is a fruit");
            Apple apple=(Apple) fruit;
            apple.size();
            fruit.salt();
            fruit.sour();
            fruit.smell();
            fruit.sweet();
        }
    }
    public void size(){
        System.out.println("apple size");
    }
}
