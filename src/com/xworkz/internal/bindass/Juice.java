package com.xworkz.internal.bindass;

public class Juice extends Liquid{
    public void mix(Liquid liquid){
        liquid.boil();
        if(liquid instanceof Liquid){
            System.out.println("juice is a liquid");
            Juice juice=(Juice) liquid;
            juice.allFruit();
            liquid.drink();
            liquid.pour();
            liquid.purify();
            liquid.waste();
        }
    }
    public void allFruit(){
        System.out.println("juice have all fruits ");
    }
}
