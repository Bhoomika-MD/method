package com.xworkz.chemika.internals;

public class Fan {
   private String type;
   private int speedLevels;
   private boolean hasRemote;

    public Fan(String type,int speedLevels,boolean hasRemote){
        this.type=type;
        this.speedLevels=speedLevels;
        this.hasRemote=hasRemote;
    }
    @Override
    public String toString(){
        return "type :"+type+"speedLevels :"+speedLevels+"hasRemote :"+hasRemote;
    }


}
