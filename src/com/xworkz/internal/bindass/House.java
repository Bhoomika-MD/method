package com.xworkz.internal.bindass;

public class House extends Building{
    public House(){
        System.out.println("no arg constructor in house");
    }
    @Override
    public void openDoor(){
        System.out.println("openDoor in building");
    }
    @Override
    public void closeDoor(){
        System.out.println("closeDoor in building");
    }
    @Override
    public void fixDoor(){
        System.out.println("fixDoor in building");
    }
    @Override
    public void enter(){
        System.out.println("enter in building");
    }
    @Override
    public void exit(){
        System.out.println("exit in building");
    }
}
