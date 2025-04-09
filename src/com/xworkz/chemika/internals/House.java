package com.xworkz.chemika.internals;

public class House {
    private String address;
    private int rooms;
    private double price;

    public House(String address,int rooms,double price){
        this.address=address;
        this.rooms=rooms;
        this.price=price;
    }
    @Override
    public String toString(){
        return "address :"+address+"rooms :"+rooms+"price :"+price;
    }
}
