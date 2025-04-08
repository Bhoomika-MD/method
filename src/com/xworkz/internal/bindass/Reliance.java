package com.xworkz.internal.bindass;

public class Reliance extends Shop{
    public void mart(Shop shop){
        shop.buy();
        if(shop instanceof  Shop){
            System.out.println("reliance is a shop");
            Reliance reliance=(Reliance) shop;
            reliance.releasing();
            shop.close();
            shop.open();
            shop.sell();
            shop.returned();
        }
    }
    public void releasing(){
        System.out.println("shop is releasing");
    }
}
