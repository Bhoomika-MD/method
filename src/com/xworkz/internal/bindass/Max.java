package com.xworkz.internal.bindass;

public class Max extends Cloth{
    public void trial(Cloth cloth){
        cloth.brand();
        if(cloth instanceof Cloth){
            System.out.println("max is a cloth shop");
            Max max=(Max)cloth;
            max.clothing();
            cloth.fold();
            cloth.stitch();
            cloth.wash();
            cloth.trend();
        }
    }
    public void clothing(){
        System.out.println("max is clothing");
    }
}
