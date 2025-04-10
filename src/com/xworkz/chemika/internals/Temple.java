package com.xworkz.chemika.internals;

public class Temple {
    private int distance;
    private String name;
    private char gender;

    public Temple(int distance,String name,char gender){
        this.distance=distance;
        this.name=name;
        this.gender=gender;
    }
    @Override
    public String toString(){

        return "Distance :"+distance+"Name :"+name+"Gender :"+gender;
    }
    @Override
    public int hashCode() {
        return 175;
    }
}
