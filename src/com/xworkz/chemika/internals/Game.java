package com.xworkz.chemika.internals;

public class Game {
    private String title;
    private String platform;
    private double rating;

    public Game(String title,String platform,double rating){
        this.title=title;
        this.platform=platform;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return "title :"+title+"platform :"+platform+"rating :"+rating;
    }
}
