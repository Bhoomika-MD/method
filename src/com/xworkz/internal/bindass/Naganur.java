package com.xworkz.internal.bindass;

public class Naganur extends Village{
    public void living(Village village){
        village.children();
        if(village instanceof Village){
            System.out.println("naganur is a village");
            Naganur naganur=(Naganur)village;
            naganur.people();
            village.distance();
            village.gender();
            village.members();
            village.population();
        }
    }
    public void people(){
        System.out.println("people in the village");
    }
}
