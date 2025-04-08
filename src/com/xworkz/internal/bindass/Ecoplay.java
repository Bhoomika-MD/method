package com.xworkz.internal.bindass;

public class Ecoplay extends Speaker{
    public void find(Speaker speaker){
        speaker.off();
        if(speaker instanceof  Speaker){
            System.out.println("ecoplay is a speaker");
            Ecoplay ecoplay=(Ecoplay) speaker;
            ecoplay.destroy();
            speaker.on();
            speaker.resume();
            speaker.sound();
            speaker.volume();
        }
    }
    public void destroy(){
        System.out.println("destroy ecoplay");
    }
}
