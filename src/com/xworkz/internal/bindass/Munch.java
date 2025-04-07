package com.xworkz.internal.bindass;

public class Munch extends Chocolate {
    public Munch() {
        System.out.println("running chocolate in munch");
    }

    @Override
    public void name() {
        System.out.println("name of the chocolate");
    }

    @Override
    public void brand() {
        System.out.println("brand of the chocolate");
    }

    @Override
    public void size() {
        System.out.println("size of the chocolate");
    }

    @Override
    public void quality() {
        System.out.println("quality of the chocolate");
    }

    @Override
    public void quantity() {
        System.out.println("quantity of the chocolate");
    }
}
