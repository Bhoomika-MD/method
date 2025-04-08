package com.xworkz.internal.bindass;

public class SleepWell extends Bed{
    public void inHome(Bed bed){
        bed.brand();
        if(bed instanceof  Bed){
            System.out.println("sleepwell is a bed");
            SleepWell sleepWell=(SleepWell) bed;
            sleepWell.goodSleep();
            bed.color();
            bed.quality();
            bed.size();
            bed.width();
        }
    }
    public void goodSleep(){
        System.out.println("sleepwell gives good sleep");
    }
}
