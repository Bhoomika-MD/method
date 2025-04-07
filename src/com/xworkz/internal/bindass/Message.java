package com.xworkz.internal.bindass;

public class Message {
    public Message(){
        System.out.println("no arg constructor in Message");
    }
    public void compose(){
        System.out.println("compose message");
    }
    public void send(){
        System.out.println("send message");
    }
    public void receive(){
        System.out.println("receive message");
    }
    public void reply(){
        System.out.println("reply message");
    }
    public void delete(){
        System.out.println("delete message");
    }
}
