package com.xworkz.internal.bindass;

public class Shiva extends God{
    public void praying(God god){
        god.home();
        if(god instanceof God){
            System.out.println("Shiva is a god");
            Shiva shiva=(Shiva) god;
            shiva.praise();
            god.pray();
            god.wash();
            god.temple();
            god.wish();
        }

    }
    public void praise(){
        System.out.println("praise god");
    }
}
