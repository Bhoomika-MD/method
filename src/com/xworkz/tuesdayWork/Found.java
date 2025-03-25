package com.xworkz.tuesdayWork;

public class Found {
    public void display(Found found) {

        Alien alien = new Alien();
        System.out.println(alien.getSeenBy());
        alien.setSeenBy("Kavya");

        System.out.println(alien.getSeenDate());
        alien.setSeenDate(16);

        System.out.println(alien.getDescribe());
        alien.setDescribe("Spotted Allien");

    }
}
