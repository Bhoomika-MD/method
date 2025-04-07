package com.xworkz.internal.bindass;

public class Orion extends Mall{
    public Orion(){
        System.out.println("no arg constructor in Orion");
    }
    @Override
    public void open(){
        System.out.println("Printing open in Orion");
    }
    @Override
    public void close(){
        System.out.println("Mall is closed");
    }
    @Override
    public void purchase(){
        System.out.println("Purchased a dress in mall");
    }
    @Override
    public void returned(){
        System.out.println("Returned a dress back in mall");
    }
    @Override
    public void trial(){
        System.out.println("tried a new dress in mall");
    }
}
