package com.xworkz.internal.bindass;

public class Mars extends Planet{
    public void fourth(Planet planet){
        planet.air();
        if(planet instanceof Planet){
            System.out.println("mars is a planet");
            Mars mars=(Mars)planet;
            mars.canLive();
            planet.numberOfPlanets();
            planet.size();
            planet.source();
            planet.water();
        }
    }
    public void canLive(){
        System.out.println("can live on mars");
    }
}
