package com.xworkz.chemika.internals;

public class Printer {
   private String brand;
   private boolean isColor;
   private int ppm;

    public Printer(String brand,boolean isColor,int ppm){
        this.brand=brand;
        this.isColor=isColor;
        this.ppm=ppm;
    }
    @Override
    public String toString(){
        return "brand :"+brand+"isColor :"+isColor+"ppm :"+ppm;
    }
}
