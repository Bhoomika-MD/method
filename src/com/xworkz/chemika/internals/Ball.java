package com.xworkz.chemika.internals;

public class Ball {
   private String color;
   private String material;
   private double diameter;

    public Ball(String color,String material,double diameter){
        this.color=color;
        this.material=material;
        this.diameter=diameter;
    }
    @Override
    public String toString(){
        return "color :"+color+"material :"+material+"diameter :"+diameter;
    }
    @Override
    public int hashCode() {
        return 95;
    }
}
