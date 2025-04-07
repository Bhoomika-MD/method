package com.xworkz.internal.bindass;

public class Lion extends Animal{
    public Lion(){
        System.out.println("Running Animal in Lion");
    }
    @Override
    public void zoo(){
        System.out.println("found animal in zoo");
    }
    @Override
    public void forest(){
        System.out.println("found animal coming from forest");
    }
    @Override
    public void tree(){
        System.out.println("found tree in forest");
    }
    @Override
    public void dense(){
        System.out.println("found dense forest");
    }
    @Override
    public void pond(){
        System.out.println("found pond in forest");
    }
}
