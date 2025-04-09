package com.xworkz.chemika.internals;

public class Shoe {

        private String brand;
        private int size;
        private boolean waterproof;

        public Shoe(String brand, int size, boolean waterproof) {
            this.brand = brand;
            this.size = size;
            this.waterproof = waterproof;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Size: " + size + ", Waterproof: " + waterproof;
        }
    }

