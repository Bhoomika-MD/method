package com.xworkz.internal.bindass;

public class Piano extends Instrument{
    public Piano(){
        System.out.println("no arg constructor in piano");
    }
    @Override
    public void tune(){
        System.out.println("tune in instrument");
    }
    @Override
    public void pressKey(){
        System.out.println("pressKey in instrument");
    }
    @Override
    public void playChord(){
        System.out.println("playChord in instrument");
    }
    @Override
    public void sustainNote(){
        System.out.println("sustainNote in instrument");
    }
    @Override
    public void adjustPedals(){
        System.out.println("adjustPedals in instrument");
    }
}
