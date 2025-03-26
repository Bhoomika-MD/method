package com.xworkz.tuesdayWork;

public class Id {
    public void display(Id id) {

        IdCard idCard=new IdCard();
        System.out.println(idCard.getMaterial());
        idCard.setMaterial("Plastic");

        System.out.println(idCard.getWeight());
        idCard.setWeight(23);

        System.out.println(idCard.getDesignedBy());
        idCard.setDesignedBy("Shashwath");

        System.out.println(idCard.getColor());
        idCard.setColor("Purple");


    }
}