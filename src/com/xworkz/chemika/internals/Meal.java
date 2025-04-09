package com.xworkz.chemika.internals;

public class Meal {
   private String name;
   private int calories;
   private boolean isVegetarian;

    public Meal(String name,int calories,boolean isVegetarian){
        this.name=name;
        this.calories=calories;
        this.isVegetarian=isVegetarian;
    }
    @Override
    public String toString(){
        return "name :"+name+"calories :"+calories+"isVegetarian :"+isVegetarian;
    }
}
