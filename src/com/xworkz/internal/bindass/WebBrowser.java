package com.xworkz.internal.bindass;

public class WebBrowser extends Browser{
    public WebBrowser(){
        System.out.println("no arg constructor in web browser");
    }
    @Override
    public void on(){
        System.out.println("browser is on");
    }
    @Override
    public void off(){
        System.out.println("browser is off");
    }
    @Override
    public void search(){
        System.out.println("browser is search");
    }
    @Override
    public void delete(){
        System.out.println("browser is delete");
    }
    @Override
    public void replace(){
        System.out.println("browser is replace");
    }
}
