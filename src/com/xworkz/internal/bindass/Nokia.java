package com.xworkz.internal.bindass;

public class Nokia extends Phone{
    public Nokia(){
        System.out.println("Nokia is a old model");
    }
    @Override
    public void use() {
        System.out.println("phone is used");
    }
    @Override
    public void notInUse() {
        System.out.println("phone is not in use");
    }
    @Override
    public void speak() {
        System.out.println("speak in phone");
    }
    @Override
    public void numbers() {
        System.out.println("phone have numbers");
    }
    @Override
    public void names() {
        System.out.println("phone has names");

    }
}
