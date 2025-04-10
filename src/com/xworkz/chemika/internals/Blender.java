package com.xworkz.chemika.internals;

public class Blender {

        private int powerWatts;
        private boolean glassJar;
        private String brand;

        public Blender(int powerWatts, boolean glassJar, String brand) {
            this.powerWatts = powerWatts;
            this.glassJar = glassJar;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Power: " + powerWatts + "W, Glass Jar: " + glassJar + ", Brand: " + brand;
        }
    @Override
    public int hashCode() {
        return 98;
    }
    }

