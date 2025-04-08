package com.xworkz.internal.bindass;

public class Crocs extends Chappal{
    public void newShop(Chappal chappal){
        chappal.shop();
        if(chappal instanceof Chappal){
            System.out.println("crocs is chappal");
            Crocs crocs=(Crocs)chappal;
            crocs.canWear();
            chappal.brand();
            chappal.size();
            chappal.design();
            chappal.pattern();
        }
    }
    public void canWear(){
        System.out.println("can wae on crocs");
    }
}
