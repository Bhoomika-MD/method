package com.xworkz.chemika.internals;

public class Ship {
    private String name;
    private double length;
    private int capacity;

    public Ship(String name,double length,int capacity){
        this.name=name;
        this.length=length;
        this.capacity=capacity;
    }
    @Override
    public String toString(){
        return "name :"+name+"length :"+length+"capacity :"+capacity;
    }
    @Override
    public int hashCode() {
        return 163;
    }
}
