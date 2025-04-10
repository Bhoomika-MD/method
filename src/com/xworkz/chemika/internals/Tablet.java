package com.xworkz.chemika.internals;

public class Tablet {
        private String brand;
        private double screenSize;
        private int batteryLife;

        public Tablet(String brand, double screenSize, int batteryLife) {
            this.brand = brand;
            this.screenSize = screenSize;
            this.batteryLife = batteryLife;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Screen Size: " + screenSize + "\", Battery Life: " + batteryLife + "h";
        }
    @Override
    public int hashCode() {
        return 172;
    }
    }

