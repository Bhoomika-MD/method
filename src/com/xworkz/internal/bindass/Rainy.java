package com.xworkz.internal.bindass;

public class Rainy extends Weather{
    public void raining(Weather weather){
        weather.cool();
        if(weather instanceof Weather){
            System.out.println("rainy is aweather");
            Rainy rainy=(Rainy) weather;
            rainy.wet();
            weather.dusty();
            weather.hot();
            weather.humid();
            weather.medium();
        }
    }
    public void wet(){
        System.out.println("rainy and its wet");
    }
}
