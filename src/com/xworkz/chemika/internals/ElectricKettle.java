package com.xworkz.chemika.internals;

public class ElectricKettle {

        private double capacityLiters;
        private boolean cordless;
        private String color;

        public ElectricKettle(double capacityLiters, boolean cordless, String color) {
            this.capacityLiters = capacityLiters;
            this.cordless = cordless;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Capacity: " + capacityLiters + "L, Cordless: " + cordless + ", Color: " + color;
        }
    }

