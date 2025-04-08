package com.xworkz.internal.bindass;

public class SanjitHegde extends Singer{
    public void saregamapa(Singer singer){
        singer.gender();
        if(singer instanceof Singer){
            System.out.println("sanjith is a singer");
            SanjitHegde sanjitHegde=(SanjitHegde) singer;
            sanjitHegde.winner();
            singer.name();
            singer.number();
            singer.place();
            singer.voice();
        }
    }
    public void winner(){
        System.out.println("he is the winner");
    }
}
