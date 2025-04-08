package com.xworkz.internal.bindass;

public class Bapuji extends School{
    public void opening(School school){
        school.open();
        if(school instanceof  School){
            System.out.println("bapuji is school");
            Bapuji bapuji=(Bapuji) school;
            bapuji.joining();
            school.tc();
            school.admit();
            school.join();
            school.close();
        }
    }
    public void joining(){
        System.out.println("joining school");
    }
}
