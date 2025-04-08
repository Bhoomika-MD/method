package com.xworkz.internal.bindass;

public class PubG extends Game{
    public void playing(Game game){
        game.stop();
        if(game instanceof  Game){
            System.out.println("pubg is a game");
            PubG pubG=(PubG) game;
            pubG.hacking();
            game.start();
            game.resume();
            game.reset();
            game.end();

        }
    }
    public void hacking(){
        System.out.println("hacing pubg");
    }
}
