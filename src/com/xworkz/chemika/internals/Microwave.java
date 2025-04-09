package com.xworkz.chemika.internals;

public class Microwave {

        private int powerWatts;
        private String brand;
        private boolean grillFunction;

        public Microwave(int powerWatts, String brand, boolean grillFunction) {
            this.powerWatts = powerWatts;
            this.brand = brand;
            this.grillFunction = grillFunction;
        }

        @Override
        public String toString() {
            return "Power: " + powerWatts + "W, Brand: " + brand + ", Grill: " + grillFunction;
        }
    }

