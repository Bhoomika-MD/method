package com.xworkz.chemika.internals;

public class Camera {
   private String brand;
   private double megapixels;
   private boolean isDSLR;

    public Camera(String brand,double megapixels,boolean isDSLR){
        this.brand=brand;
        this.megapixels=megapixels;
        this.isDSLR=isDSLR;
    }
    @Override
    public String toString(){
        return "brand :"+brand+"megapixels :"+megapixels+"isDSLR :"+isDSLR;
    }
}
