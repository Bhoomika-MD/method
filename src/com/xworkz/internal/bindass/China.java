package com.xworkz.internal.bindass;

public class China extends Country{
    public void virus(Country country){
        country.capital();
        if(country instanceof  Country){
            System.out.println("cgina is acountry");
            China china=(China)country;
            china.attack();
            country.name();
            country.states();
            country.weather();
            country.tradition();
        }
    }
    public void attack(){
        System.out.println("china attack");
    }
}
