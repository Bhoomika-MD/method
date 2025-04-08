package com.xworkz.internal.bindass;

public class Perk extends Chocolate{
    public void peace(Chocolate chocolate){
        chocolate.brand();
        if(chocolate instanceof  Chocolate){
            System.out.println("perk is a chocolate");
            Perk perk=(Perk)chocolate;
            perk.cut();
            chocolate.name();
            chocolate.quality();
            chocolate.size();
            chocolate.quantity();
        }
    }
    public void cut(){
        System.out.println("cut the perk");
    }
}
