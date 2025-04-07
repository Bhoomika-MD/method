package com.xworkz.internal.bindass;

public class SlamBook extends Product{
    public SlamBook(){
        System.out.println("no arg constructor in slam book");
    }
    @Override
    public void getTitle(){
        System.out.println("get title in product");
    }
    @Override
    public void read(){
        System.out.println("read in product");
    }
    @Override
    public void write(){
        System.out.println("write in product");
    }
    @Override
    public void mark(){
        System.out.println("mark in product");
    }
    @Override
    public void close(){
        System.out.println("close in product");
    }
}
