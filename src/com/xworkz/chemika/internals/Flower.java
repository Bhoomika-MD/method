package com.xworkz.chemika.internals;

public class Flower {
   private String color;
   private String type;
   private boolean hasFragrance;

    public Flower(String color,String type,boolean hasFragrance){
        this.color=color;
        this.type=type;
        this.hasFragrance=hasFragrance;
    }
    @Override
    public String toString(){
        return "color :"+color+"type :"+type+"hasFragrance :"+hasFragrance;
    }
    @Override
    public int hashCode() {
        return 125;
    }
}
