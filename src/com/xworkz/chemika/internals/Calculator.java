package com.xworkz.chemika.internals;

public class Calculator {

        private boolean scientific;
        private String brand;
        private int batteryLifeHours;

        public Calculator(boolean scientific, String brand, int batteryLifeHours) {
            this.scientific = scientific;
            this.brand = brand;
            this.batteryLifeHours = batteryLifeHours;
        }

        @Override
        public String toString() {
            return "Scientific: " + scientific + ", Brand: " + brand + ", Battery Life: " + batteryLifeHours + "h";
        }
    @Override
    public int hashCode() {
        return 101;
    }
    }

