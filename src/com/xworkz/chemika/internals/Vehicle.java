package com.xworkz.chemika.internals;

public class Vehicle {
   private String type;
   private String fuelType;
   private int wheels;

    public Vehicle(String type,String fuelType,int wheels){
        this.type=type;
        this.fuelType=fuelType;
        this.wheels=wheels;
    }
    @Override
    public String toString(){
        return "type :"+type+"fuelType :"+fuelType+"wheels :"+wheels;
    }
    @Override
    public int hashCode() {
        return 185;
    }
}
