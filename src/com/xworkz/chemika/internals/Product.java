package com.xworkz.chemika.internals;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name,double price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    @Override
    public String toString(){
        return "name :"+name+"price :"+price+"quantity :"+quantity;
    }
    @Override
    public int hashCode() {
        return 154;
    }
}
