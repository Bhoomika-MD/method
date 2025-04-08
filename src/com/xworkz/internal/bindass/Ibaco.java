package com.xworkz.internal.bindass;

public class Ibaco extends IceCream{
    public void newBrand(IceCream iceCream){
        iceCream.close();
        if(iceCream instanceof  IceCream){
            System.out.println("ibaco is aicecream");
            Ibaco ibaco=(Ibaco)iceCream;
            ibaco.newShop();
            iceCream.open();
            iceCream.quality();
            iceCream.size();
            iceCream.taste();
        }
    }
    public void newShop(){
        System.out.println("ibaco is a new shop");
    }
}
