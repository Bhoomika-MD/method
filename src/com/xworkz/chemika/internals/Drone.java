package com.xworkz.chemika.internals;

public class Drone {
   private String brand;
   private double range;
   private boolean hasCamera;

    public Drone(String brand,double range,boolean hasCamera){
        this.brand=brand;
        this.range=range;
        this.hasCamera=hasCamera;
    }
    @Override
    public String toString(){
        return "brand :"+brand+"range :"+range+"hasCamera :"+hasCamera;
    }
}
