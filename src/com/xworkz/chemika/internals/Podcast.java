package com.xworkz.chemika.internals;

public class Podcast {
   private String host;
   private String topic;
   private int episodes;

    public Podcast(String host,String topic,int episodes){
        this.host=host;
        this.topic=topic;
        this.episodes=episodes;
    }
    @Override
    public String toString(){
        return "host :"+host+"topic :"+topic+"episodes :"+episodes;
    }
}
