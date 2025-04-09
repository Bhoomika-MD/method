package com.xworkz.chemika.internals;

public class Music {
    private String artist;
    private String genre;
    private int tracks;

    public Music(String artist,String genre,int tracks){
        this.artist=artist;
        this.genre=genre;
        this.tracks=tracks;
    }
    @Override
    public String toString(){
        return "artist :"+artist+"genre :"+genre+"tracks :"+tracks;
    }
}
