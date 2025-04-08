package com.xworkz.internal.bindass;

public class Dog extends Pet{
    public void small(Pet pet){
        pet.sell();
        if(pet instanceof Pet){
            System.out.println("dog is pet");
            Dog dog=(Dog)pet;
            dog.calling();
            pet.sit();
            pet.ran();
            pet.buy();
            pet.giveFood();
        }
    }
    public void calling(){
        System.out.println("calling dog");
    }
}
