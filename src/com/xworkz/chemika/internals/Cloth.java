package com.xworkz.chemika.internals;

public class Cloth {
   private String type;
   private String size;
   private double price;

    public Cloth(String type,String size,double price){
        this.type=type;
        this.size=size;
        this.price=price;
    }
    @Override
    public String toString(){
        return "type :"+type+"size :"+size+"price :"+price;
    }
}
