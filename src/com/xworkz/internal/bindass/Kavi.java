package com.xworkz.internal.bindass;

public class Kavi extends Person{
    public void writing(Person person){
        person.fat();
        if(person instanceof  Person){
            System.out.println("kavi is a person");
            Kavi kavi=(Kavi) person;
            kavi.reading();
            person.slept();
            person.slim();
            person.tall();
            person.thin();
        }
    }
    public void reading(){
        System.out.println("kavi is reading");
    }
}
