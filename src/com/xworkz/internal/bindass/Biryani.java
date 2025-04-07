package com.xworkz.internal.bindass;

public class Biryani extends Veg{
    public Biryani(){
        System.out.println("running veg in biryani");
    }@Override
    public void eat(){
        System.out.println("eat veg food");
    }@Override
    public void prepare(){
        System.out.println("prepare veg food");
    }@Override
    public void pack(){
        System.out.println("pack veg food");
    }@Override
    public void waste(){
        System.out.println("waste veg food");
    }@Override
    public void preserve(){
        System.out.println("preserve veg food");
    }
}
