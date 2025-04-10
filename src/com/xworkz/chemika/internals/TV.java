package com.xworkz.chemika.internals;

public class TV {
   private String brand;
   private double size;
   private boolean isSmart;

    public TV(String brand,double size,boolean isSmart){
        this.brand=brand;
        this.size=size;
        this.isSmart=isSmart;
    }
    @Override
    public String toString(){
        return "brand :"+brand+"size :"+size+"isSmart :"+isSmart;
    }
    @Override
    public int hashCode() {
        return 181;
    }
}
