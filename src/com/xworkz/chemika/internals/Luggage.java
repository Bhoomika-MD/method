package com.xworkz.chemika.internals;

public class Luggage {

        private int volumeLiters;
        private boolean hardShell;
        private String color;

        public Luggage(int volumeLiters, boolean hardShell, String color) {
            this.volumeLiters = volumeLiters;
            this.hardShell = hardShell;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Volume: " + volumeLiters + "L, Hard Shell: " + hardShell + ", Color: " + color;
        }
    @Override
    public int hashCode() {
        return 137;
    }
    }

