package com.xworkz.chemika.internals;

public class Tree {
   private String species;
   private int age;
   private double height;

    public Tree(String species,int age,double height){
        this.species=species;
        this.age=age;
        this.height=height;
    }
    @Override
    public String toString(){

        return "species :"+species+"age :"+age+"height :"+height;
    }
    @Override
    public int hashCode() {
        return 179;
    }

}
