package com.xworkz.internal.bindass;

public class Rose extends Flower{
    public void thrown(Flower flower){
        flower.wilt();
        if(flower instanceof  Flower){
            System.out.println("rose is a flower");
            Rose rose=(Rose)flower;
            rose.join();
            flower.smell();
            flower.bloom();
            flower.cut();
            flower.grow();
        }
    }
    public void join(){
        System.out.println("join the rose flowers");
    }
}
