package com.xworkz.chemika.internals;

public class Chair {

        private String color;
        private boolean hasWheels;
        private int maxWeight;

        public Chair(String color, boolean hasWheels, int maxWeight) {
            this.color = color;
            this.hasWheels = hasWheels;
            this.maxWeight = maxWeight;
        }

        @Override
        public String toString() {
            return "Color: " + color + ", Wheels: " + hasWheels + ", Max Weight: " + maxWeight + " kg";
        }
    @Override
    public int hashCode() {
        return 106;
    }
    }

