package com.xworkz.internal.bindass;

public class AdminUser extends User{
    public AdminUser(){
        System.out.println("no arg constructor in admin user");
    }
    @Override
    public void login(){
        System.out.println("login user");
    }
    @Override
    public void logout(){
        System.out.println("logout user");
    }
    @Override
    public void manageUser(){
        System.out.println("manageUser user");
    }
    @Override
    public void reset(){
        System.out.println("reset user");
    }
    @Override
    public void view(){
        System.out.println("view user");
    }
}
