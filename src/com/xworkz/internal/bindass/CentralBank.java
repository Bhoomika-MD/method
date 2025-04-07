package com.xworkz.internal.bindass;

public class CentralBank extends Bank{
    public CentralBank(){
        System.out.println("no arg constructor in CentralBank");
    }
    @Override
    public void issueCurrency(){
        System.out.println("issueCurrency in bank");
    }
    @Override
    public void setInterest(){
        System.out.println("setInterest in bank");
    }
    @Override
    public void monitorInflation(){
        System.out.println("monitorInflation in bank");
    }
    @Override
    public void regulateBank(){
        System.out.println("regulateBank in bank");
    }
    @Override
    public void publishReport(){
        System.out.println("publishReport in bank");
    }
}
