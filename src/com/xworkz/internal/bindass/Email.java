package com.xworkz.internal.bindass;

public class Email extends Message{
    public Email(){
        System.out.println("no arg constructor in email");
    }
    @Override
    public void compose(){
        System.out.println("compose message");
    }
    @Override
    public void send(){
        System.out.println("send message");
    }
    @Override
    public void receive(){
        System.out.println("receive message");
    }
    @Override
    public void reply(){
        System.out.println("reply message");
    }
    @Override
    public void delete(){
        System.out.println("delete message");
    }
}
