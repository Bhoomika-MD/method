package com.xworkz.internal.bindass;

public class Pizza extends Junk{
    public void triangle(Junk junk){
        junk.take();
        if(junk instanceof  Junk){
            System.out.println("pizza is ajunk");
            Pizza pizza=(Pizza) junk;
            pizza.eatable();
            junk.eat();
            junk.dontEat();
            junk.buy();
            junk.give();
        }
    }
    public void eatable(){
        System.out.println("eatable pizza");
    }
}
