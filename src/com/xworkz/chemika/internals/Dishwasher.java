package com.xworkz.chemika.internals;

public class Dishwasher {

        private int placeSettings;
        private boolean ecoMode;
        private String brand;

        public Dishwasher(int placeSettings, boolean ecoMode, String brand) {
            this.placeSettings = placeSettings;
            this.ecoMode = ecoMode;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Place Settings: " + placeSettings + ", Eco Mode: " + ecoMode + ", Brand: " + brand;
        }
    @Override
    public int hashCode() {
        return 114;
    }
    }

