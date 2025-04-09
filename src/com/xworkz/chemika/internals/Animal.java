package com.xworkz.chemika.internals;

public class Animal {
    private String species;
    private int age;
    private double weight;

    public Animal(String species,int age,double weight){
        this.species=species;
        this.age=age;
        this.weight=weight;
    }
    @Override
    public String toString(){
        return "species :"+species+"age :"+age+"weight :"+weight;
    }
}
