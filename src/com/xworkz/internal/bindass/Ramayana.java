package com.xworkz.internal.bindass;

public class Ramayana extends Book{
    public Ramayana(){
        System.out.println("running book in Ramayana");
    }@Override
    public void read(){
        System.out.println("read the book");
    }@Override
    public void buy(){
        System.out.println("buy new book");
    }@Override
    public void write(){
        System.out.println("write new book");
    }@Override
    public void give(){
        System.out.println("give new book");
    }@Override
    public void take(){
        System.out.println("take new book");
    }
}
