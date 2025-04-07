package com.xworkz.internal.bindass;

public class BasicCustomer extends AccountHolder{
    public BasicCustomer(){
        System.out.println("no arg constructor in basic Customer");
    }
    @Override
    public void login(){
        System.out.println("login Accout holder");
    }
    @Override
    public void logout(){
        System.out.println("logout Accout holder");
    }
    @Override
    public void balence(){
        System.out.println("balence Accout holder");
    }
    @Override
    public void deposit(){
        System.out.println("deposit Accout holder");
    }
    @Override
    public void credit(){
        System.out.println("credit Accout holder");
    }
}
