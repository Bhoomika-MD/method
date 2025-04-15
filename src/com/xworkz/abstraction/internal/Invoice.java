package com.xworkz.abstraction.internal;

public abstract class Invoice {
    public abstract void generateInvoice();

    public void sendEmail() {
        System.out.println("Sending invoice email to customer.");
    }
}
