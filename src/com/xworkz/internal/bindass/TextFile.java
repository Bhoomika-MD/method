package com.xworkz.internal.bindass;

public class TextFile extends File{
    public TextFile(){
        System.out.println("no arg constructor in Text file");
    }
    @Override
    public void open(){
        System.out.println("open the file");
    }
    @Override
    public void close(){
        System.out.println("close the file");
    }
    @Override
    public void resize(){
        System.out.println("resize the file");
    }
    @Override
    public void compress(){
        System.out.println("compress the file");
    }
    @Override
    public void convert(){
        System.out.println("convert the file");
    }
}
