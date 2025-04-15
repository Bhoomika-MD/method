package com.xworkz.abstraction.internal;

public class Runner {
    public static void main(String[] args) {
        PhonePay phonePay = new PhonePay();
        phonePay.connect();


        CreditCard card = new CreditCard();
        card.processPayment();


        Online invoice = new Online();
        invoice.generateInvoice();
        invoice.sendEmail();


        RegularCustomer customer = new RegularCustomer("Alice", "alice@example.com", "1234567890");
        customer.displayCustomer();


        OnlineOrder order = new OnlineOrder(101, "Laptop", 1, 999.99);
        order.showOrder();
    }
}
