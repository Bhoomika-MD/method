package com.xworkz.abstraction.internal;

public class CreditCard extends Transaction {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}
