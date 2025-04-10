package com.xworkz.chemika.internals;

public class Dog {
    private String breed;
    private int age;
    private double weight;

    public Dog(String breed,int age,double weight){
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }
    @Override
    public String toString(){

        return "breed :"+breed+"age :"+age+"weight :"+weight;
    }
    @Override
    public int hashCode() {
        return 115;
    }
}
