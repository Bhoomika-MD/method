package com.xworkz.internal.bindass;

public class Ducati extends Bike {
    public void fav(Bike bike) {
        bike.color();
        if (bike instanceof Bike) {
            System.out.println("ducati is abike");
            Ducati ducati = (Ducati) bike;
            ducati.pay();
            bike.cost();
            ducati.height();
            ducati.seat();
            ducati.style();
        }
    }
    public void pay(){
        System.out.println("pay for ducati");
    }
}
