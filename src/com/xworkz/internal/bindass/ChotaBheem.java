package com.xworkz.internal.bindass;

public class ChotaBheem extends Cartoon{
    public ChotaBheem(){
        System.out.println("no arg constructor in chotabheem");
    }
    @Override
    public void see(){
        System.out.println("see cartoon");
    }
    @Override
    public void change(){
        System.out.println("change cartoon");
    }
    @Override
    public void channel(){
        System.out.println("channel cartoon");
    }
    @Override
    public void open(){
        System.out.println("open cartoon");
    }
    @Override
    public void close(){
        System.out.println("close cartoon");
    }
}
