package com.xworkz.internal.bindass;

public class SavingsAcc extends Account{
    public SavingsAcc(){
        System.out.println("no arg constructor in savings acc");
    }
    @Override
    public void deposit(){
        System.out.println("deposit in account");
    }
    @Override
    public void withDraw(){
        System.out.println(" withDraw in account");
    }
    @Override
    public void checkBalance(){
        System.out.println("checkBalance in account");
    }
    @Override
    public void addInterest(){
        System.out.println("addInterest in account");
    }
    @Override
    public void generateAcc(){
        System.out.println("generateAcc in account");
    }
}
