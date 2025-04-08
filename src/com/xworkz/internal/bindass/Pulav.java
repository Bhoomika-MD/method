package com.xworkz.internal.bindass;

public class Pulav extends Veg{
    public void vegetables(Veg veg){
        veg.eat();
        if(veg instanceof Veg){
            System.out.println("pulav is veg");
            Pulav pulav=(Pulav)veg;
            pulav.making();
            veg.pack();
            veg.prepare();
            veg.waste();
            veg.preserve();
        }
    }
    public void making(){
        System.out.println("making pulav");
    }
}
