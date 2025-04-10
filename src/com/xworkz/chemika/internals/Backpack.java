package com.xworkz.chemika.internals;

public class  Backpack {

        private int capacityLiters;
        private boolean waterproof;
        private String color;

        public Backpack(int capacityLiters, boolean waterproof, String color) {
            this.capacityLiters = capacityLiters;
            this.waterproof = waterproof;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Capacity: " + capacityLiters + "L, Waterproof: " + waterproof + ", Color: " + color;
        }
    @Override
    public int hashCode() {
        return 94;
    }
    }

