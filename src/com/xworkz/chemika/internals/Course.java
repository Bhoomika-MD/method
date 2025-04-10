package com.xworkz.chemika.internals;

public class Course {
    private String title;
    private String code;
    private int credits;

    public Course(String title,String code,int credits){
        this.title=title;
        this.code=code;
        this.credits=credits;
    }
    @Override
    public String toString(){

        return "title :"+title+"code :"+code+"credits :"+credits;
    }
    @Override
    public int hashCode() {
        return 112;
    }
}
