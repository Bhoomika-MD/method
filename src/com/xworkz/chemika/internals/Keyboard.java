package com.xworkz.chemika.internals;

public class Keyboard {
   private String type;
   private boolean isWireless;
   private String layout;

    public Keyboard(String type,boolean isWireless,String layout){
        this.type=type;
        this.isWireless=isWireless;
        this.layout=layout;
    }
    @Override
    public String toString(){
        return "type :"+type+"isWireless :"+isWireless+"layout :"+layout;
    }
}
