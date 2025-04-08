package com.xworkz.internal.bindass;

public class GoodDay extends Biscuite{
    public void onePack(Biscuite biscuite){
        biscuite.shop();
        if(biscuite instanceof  Biscuite){
            System.out.println("good day is a biscuite");
            GoodDay goodDay=(GoodDay) biscuite;
            goodDay.packing();
            biscuite.sell();
            biscuite.factory();
            biscuite.shop();
            biscuite.pay();
        }
    }
    public void packing(){
        System.out.println("packing biscuite");
    }
}
