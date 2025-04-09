package com.xworkz.chemika.internals;

public class Stapler {

        private int capacityPages;
        private String color;
        private boolean manual;

        public Stapler(int capacityPages, String color, boolean manual) {
            this.capacityPages = capacityPages;
            this.color = color;
            this.manual = manual;
        }

        @Override
        public String toString() {
            return "Capacity: " + capacityPages + " pages, Color: " + color + ", Manual: " + manual;
        }
    }

