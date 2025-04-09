package com.xworkz.chemika.internals;

public class Bicycle {
    private String brand;
    private int gearCount;
    private double weight;

    public Bicycle(String brand,int code,double weight){
        this.brand=brand;
        this.gearCount=gearCount;
        this.weight=weight;
    }
    @Override
    public String toString(){
        return "brand :"+brand+"gearCount :"+gearCount+"weight :"+weight;
    }
}
