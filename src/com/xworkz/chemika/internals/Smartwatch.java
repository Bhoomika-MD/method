package com.xworkz.chemika.internals;

public class Smartwatch {
        private String model;
        private boolean gps;
        private int batteryLifeHours;

        public Smartwatch(String model, boolean gps, int batteryLifeHours) {
            this.model = model;
            this.gps = gps;
            this.batteryLifeHours = batteryLifeHours;
        }

        @Override
        public String toString() {
            return "Model: " + model + ", GPS: " + gps + ", Battery: " + batteryLifeHours + "h";
        }
    @Override
    public int hashCode() {
        return 167;
    }
    }

