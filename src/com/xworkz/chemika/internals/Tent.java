package com.xworkz.chemika.internals;

public class Tent {

        private int capacity;
        private boolean waterproof;
        private String color;

        public Tent(int capacity, boolean waterproof, String color) {
            this.capacity = capacity;
            this.waterproof = waterproof;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Capacity: " + capacity + ", Waterproof: " + waterproof + ", Color: " + color;
        }
    }

