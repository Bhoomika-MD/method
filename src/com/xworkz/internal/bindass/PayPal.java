package com.xworkz.internal.bindass;

public class PayPal extends Company{
    public PayPal(){
        System.out.println("no arg constructor in pay pal");
    }
    @Override
    public void authorise(){
        System.out.println("authorise company");
    }
    @Override
    public void payment(){
        System.out.println("payment company");
    }
    @Override
    public void bankAccount(){
        System.out.println("bankAccount company");
    }
    @Override
    public void paymentHistory(){
        System.out.println("paymentHistory company");
    }
    @Override
    public void requestPayment(){
        System.out.println("requestPayment company");
    }
}
