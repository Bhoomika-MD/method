package com.xworkz.internal.bindass;

public class TajMahal extends HistoricalPlace{
    public void palace(HistoricalPlace historicalPlace){
        historicalPlace.build();
        if(historicalPlace instanceof  HistoricalPlace){
            System.out.println("building taj mahal");
            TajMahal tajMahal=(TajMahal) historicalPlace;
            tajMahal.mumtaj();
            historicalPlace.close();
            historicalPlace.destroy();
            historicalPlace.open();
            historicalPlace.onWork();
        }
    }
    public void mumtaj(){
        System.out.println("it was built for mumtaj");
    }
}
