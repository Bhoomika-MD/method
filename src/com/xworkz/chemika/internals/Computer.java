package com.xworkz.chemika.internals;

public class Computer {
    private String brand;
    private String processor;
    private int ram;

    public Computer(String brand,String processor,int ram){
        this.brand=brand;
        this.processor=processor;
        this.ram=ram;
    }
    @Override
    public String toString(){
        return "brand :"+brand+"processor :"+processor+"ram :"+ram;
    }
}
