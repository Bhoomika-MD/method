package com.xworkz.chemika.internals;

public class Train {
    private String name;
    private int coaches;
    private double speed;

    public Train(String name,int coaches,double speed){
        this.name=name;
        this.coaches=coaches;
        this.speed=speed;
    }
    @Override
    public String toString(){
        return "name :"+name+"coaches :"+coaches+"speed :"+speed;
    }
    @Override
    public int hashCode() {
        return 178;
    }
}
