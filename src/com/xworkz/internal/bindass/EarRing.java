package com.xworkz.internal.bindass;

public class EarRing extends Gold{
    public void wash(Gold gold){
        gold.buy();
        if(gold instanceof  Gold){
            System.out.println("earing is a gold");
            EarRing earRing=(EarRing) gold;
            earRing.newOne();
            gold.sell();
            gold.give();
            gold.take();
            gold.wear();
        }
    }
    public void newOne(){
        System.out.println("wear new gold ");
    }
}
