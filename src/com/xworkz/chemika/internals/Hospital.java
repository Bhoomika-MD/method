package com.xworkz.chemika.internals;

public class Hospital {
    private int distance;
    private String name;
    private boolean present;

    public Hospital(int distance,String name,boolean present){
        this.distance=distance;
        this.name=name;
        this.present=present;
    }
    @Override
    public String toString(){
        return "Distance :"+distance+"Name :"+name+"Present :"+present;
    }
    @Override
    public int hashCode() {
        return 132;
    }
}
