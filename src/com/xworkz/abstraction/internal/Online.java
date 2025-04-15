package com.xworkz.abstraction.internal;

public class Online extends Invoice{
    @Override
    public void generateInvoice() {
        System.out.println("Generating online invoice.");
    }
}
