package com.xworkz.chemika.internals;

public class Planet {
   private String name;
   private double mass;
   private int moons;

    public Planet(String name,double mass,int moons){
        this.name=name;
        this.mass=mass;
        this.moons=moons;
    }
    @Override
    public String toString(){
        return "name :"+name+"mass :"+mass+"moons :"+moons;
    }
    @Override
    public int hashCode() {
        return 150;
    }
}
