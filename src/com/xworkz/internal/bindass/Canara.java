package com.xworkz.internal.bindass;

public class Canara extends Bank{
    public void newAccountHolding(Bank bank){
        bank.setInterest();
        if(bank instanceof  Bank){
            System.out.println("canara is a bank");
            Canara canara=(Canara) bank;
            canara.release();
            bank.regulateBank();
            bank.monitorInflation();
            bank.publishReport();
            bank.issueCurrency();
        }
    }
    public void release(){
        System.out.println("release canara bank");
    }
}
