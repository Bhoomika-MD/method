package com.xworkz.chemika.internals;

public class University {
   private String name;
   private int establishedYear;
   private int faculties;

    public University(String name,int establishedYear,int faculties){
        this.name=name;
        this.establishedYear=establishedYear;
        this.faculties=faculties;
    }
    @Override
    public String toString(){
        return "name :"+name+"establishedYear :"+establishedYear+"faculties :"+faculties;
    }
    @Override
    public int hashCode() {
        return 182;
    }
}
