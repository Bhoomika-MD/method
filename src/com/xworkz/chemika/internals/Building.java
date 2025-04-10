package com.xworkz.chemika.internals;

public class Building {
   private String name;
   private int floors;
   private String purpose;

    public Building(String name,int floors,String purpose){
        this.name=name;
        this.floors=floors;
        this.purpose=purpose;
    }
    @Override
    public String toString(){
        return "name :"+name+"floors :"+floors+"purpose :"+purpose;
    }
    @Override
    public int hashCode() {
        return 100;
    }
}
