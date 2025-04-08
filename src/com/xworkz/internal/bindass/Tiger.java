package com.xworkz.internal.bindass;

public class Tiger extends Animal{
    public void king(Animal animal){
        animal.forest();
        if(animal instanceof Animal){
            System.out.println("tiger is a animal");
            Tiger tiger=(Tiger) animal;
            tiger.hunt();
            animal.dense();
            animal.pond();
            animal.zoo();
            animal.tree();
        }
    }
    public void hunt(){
        System.out.println("tiger is hunted");
    }
}
