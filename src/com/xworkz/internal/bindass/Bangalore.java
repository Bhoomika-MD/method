package com.xworkz.internal.bindass;

public class Bangalore extends City{
    public void traffic(City city){
        city.visit();
        if(city instanceof City){
            System.out.println("bangalore is a city");
            Bangalore bangalore=(Bangalore) city;
            bangalore.stuck();
            city.look();
            city.back();
            city.go();
            city.locate();

        }
    }
    public void stuck(){
        System.out.println("stuck in traffic of bangalore");
    }
}
