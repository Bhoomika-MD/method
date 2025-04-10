package com.xworkz.chemika.internals;

public class Restaurent {
    private String name;
    private String cuisine;
    private double rating;

    public Restaurent(String name,String cuisine,double rating){
        this.name=name;
        this.cuisine=cuisine;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return "name :"+name+"cuisine :"+cuisine+"rating :"+rating;
    }
    @Override
    public int hashCode() {
        return 157;
    }
}
