package com.xworkz.chemika.internals;

public class School {
    private String name;
    private int studentCount;
    private String location;

    public School(String name,int studentCount,String location){
        this.name=name;
        this.studentCount=studentCount;
        this.location=location;
    }
    @Override
    public String toString(){
        return "name :"+name+"studentCount :"+studentCount+"location :"+location;
    }
}
