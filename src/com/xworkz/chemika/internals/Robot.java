package com.xworkz.chemika.internals;

public class Robot {
   private String name;
   private String function;
   private boolean isAutonomous;

    public Robot(String name,String function,boolean isAutonomous){
        this.name=name;
        this.function=function;
        this.isAutonomous=isAutonomous;
    }
    @Override
    public String toString(){
        return "name :"+name+"function :"+function+"isAutonomous :"+isAutonomous;
    }
}
