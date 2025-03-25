package com.xworkz.tuesdayWork;

public class Celler {

    public void cell(Celler celler) {

        Jail jail = new Jail();
        System.out.println(jail.getName());
        jail.setName("Kumar");

        System.out.println(jail.getLocation());
        jail.setLocation("Bangalore");

        System.out.println(jail.getJailerName());
        jail.setJailerName("Shashi");

        System.out.println(jail.getTotalCells());
        jail.setTotalCells(67);

    }

}
