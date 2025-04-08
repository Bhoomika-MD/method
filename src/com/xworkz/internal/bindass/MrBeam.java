package com.xworkz.internal.bindass;

public class MrBeam extends Cartoon{
    public void beam(Cartoon cartoon){
        cartoon.open();
        if(cartoon instanceof  Cartoon){
            System.out.println("mr beam is a cartoon");
            MrBeam mrBeam=(MrBeam) cartoon;
            mrBeam.old();
            cartoon.close();
            cartoon.change();
            cartoon.see();
            cartoon.channel();
        }
    }
    public void old(){
        System.out.println("mr beam is a old channel ");
    }
}
