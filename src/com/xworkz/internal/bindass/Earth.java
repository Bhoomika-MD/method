package com.xworkz.internal.bindass;

public class Earth extends Planet{
    public Earth(){
        System.out.println("running planet in earth");
    }
    @Override
    public void numberOfPlanets(){
        System.out.println("number of planets in solar system");
    }
    @Override
    public void size(){
        System.out.println("size of the planet");
    }
    @Override
    public void water(){
        System.out.println("water in the planet");
    }
    @Override
    public void air(){
        System.out.println("air in the planet");
    }
    @Override
    public void source(){
        System.out.println("source of the planet");
    }
}
