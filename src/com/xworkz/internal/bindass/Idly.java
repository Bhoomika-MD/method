package com.xworkz.internal.bindass;

public class Idly extends Dish{
    public void preparing(Dish dish){
        dish.cost();
        if(dish instanceof Dish){
            System.out.println("idly is a dish");
            Idly idly=(Idly) dish;
            idly.sambar();
            dish.shape();
            dish.quality();
            dish.crispy();
            dish.round();
        }

    }
    public void sambar(){
        System.out.println("idly sambar");
    }
}
