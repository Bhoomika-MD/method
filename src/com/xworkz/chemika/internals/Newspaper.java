package com.xworkz.chemika.internals;

public class Newspaper {
   private String name;
   private String language;
   private double price;

    public Newspaper(String name,String language,double price){
        this.name=name;
        this.language=language;
        this.price=price;
    }
    @Override
    public String toString(){
        return "name :"+name+"language :"+language+"price :"+price;
    }
}
