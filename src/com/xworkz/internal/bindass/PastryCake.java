package com.xworkz.internal.bindass;

public class PastryCake extends Chef{
    public PastryCake(){
        System.out.println("no arg constructor in pastercake");
    }
    @Override
    public void bakeCake(){
        System.out.println("bakecake in chef ");
    }
    @Override
    public void prepareDough(){
        System.out.println("prepareDough in chef ");
    }
    @Override
    public void decorateDough(){
        System.out.println("decorateDough in chef ");
    }
    @Override
    public void whipCream(){
        System.out.println("whipCream in chef ");
    }
    @Override
    public void serveDish(){
        System.out.println("serveDish in chef ");
    }
}
