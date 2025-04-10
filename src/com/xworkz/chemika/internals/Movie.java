package com.xworkz.chemika.internals;

public class Movie {
    private String title;
    private String genre;
    private double rating;

    public Movie(String title,String genre,double rating){
        this.title=title;
        this.genre=genre;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return "title :"+title+"genre :"+genre+"rating :"+rating;
    }
    @Override
    public int hashCode() {
        return 144;
    }
}
