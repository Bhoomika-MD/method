package com.xworkz.internal.bindass;

public class Benz extends Car{
    public void costly(Car car){
        car.color();
        if(car instanceof  Car){
            System.out.println("benz is a color");
            Benz benz=(Benz) car;
            benz.buying();
            car.modle();
            car.name();
            car.seat();
            car.style();
        }
    }
    public void buying(){
        System.out.println("buying benz");
    }
}
