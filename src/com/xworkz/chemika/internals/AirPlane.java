package com.xworkz.chemika.internals;

public class  AirPlane {
   private String airline;
   private int capacity;
   private String model;

    public AirPlane(String airline,int capacity,String model){
        this.airline=airline;
        this.capacity=capacity;
        this.model=model;
    }
    @Override
    public String toString(){
        return "airline :"+airline+"capacity :"+capacity+"model :"+model;
    }
}
