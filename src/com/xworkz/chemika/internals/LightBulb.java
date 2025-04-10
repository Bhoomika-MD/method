package com.xworkz.chemika.internals;

public class LightBulb {

        private int wattage;
        private String colorTemperature;
        private boolean smart;

        public LightBulb(int wattage, String colorTemperature, boolean smart) {
            this.wattage = wattage;
            this.colorTemperature = colorTemperature;
            this.smart = smart;
        }

        @Override
        public String toString() {
            return "Wattage: " + wattage + "W, Temp: " + colorTemperature + ", Smart: " + smart;
        }
    @Override
    public int hashCode() {
        return 136;
    }
    }

