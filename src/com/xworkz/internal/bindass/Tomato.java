package com.xworkz.internal.bindass;

public class Tomato extends Vegetable{
    public void cutting(Vegetable vegetable){
        vegetable.buy();
        if(vegetable instanceof Vegetable){
            System.out.println("tomato is a vegetable");
            Tomato tomato=(Tomato) vegetable;
            tomato.rice();
            vegetable.cut();
            vegetable.pay();
            vegetable.sell();
            vegetable.fresh();
        }
    }
    public void rice(){
        System.out.println("tomato rice");
    }
}
