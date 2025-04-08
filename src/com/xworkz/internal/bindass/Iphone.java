package com.xworkz.internal.bindass;

public class Iphone extends Phone{
    public void sending(Phone phone){
        phone.names();
        if(phone instanceof  Phone){
            System.out.println("iphone is a phone");
            Iphone iphone=(Iphone) phone;
            iphone.reaching();
            phone.notInUse();
            phone.use();
            phone.numbers();
            phone.speak();
        }
    }
    public void reaching(){
        System.out.println("phone is reaching");
    }
}
