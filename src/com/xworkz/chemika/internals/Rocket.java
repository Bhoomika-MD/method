package com.xworkz.chemika.internals;

public class Rocket {
   private String name;
   private double height;
   private int engines;

    public Rocket(String name,double height,int engines){
        this.name=name;
        this.height=height;
        this.engines=engines;
    }
    @Override
    public String toString(){
        return "name :"+name+"height :"+height+"engines :"+engines;
    }
    @Override
    public int hashCode() {
        return 159;
    }
}
