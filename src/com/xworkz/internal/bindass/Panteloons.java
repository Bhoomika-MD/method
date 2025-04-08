package com.xworkz.internal.bindass;

public class Panteloons extends Brand{
    public void close(Brand brand){
        brand.color();
        if(brand instanceof  Brand){
            System.out.println("panteloon is a brand");
            Panteloons panteloons=(Panteloons) brand;
            panteloons.bought();
            brand.cost();
            brand.pattern();
            brand.size();
            brand.style();
        }
    }
    public void bought(){
        System.out.println("bought new panteloons top");
    }
}
