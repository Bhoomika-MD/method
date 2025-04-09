package com.xworkz.chemika.internals;

public class City {
    private String name;
    private int population;
    private double area;

    public City(String name,int population,double area){
        this.name=name;
        this.population=population;
        this.area=area;
    }
    @Override
    public String toString(){
        return "Name :"+name+"Population :"+population+"Area :"+area;
    }
}
