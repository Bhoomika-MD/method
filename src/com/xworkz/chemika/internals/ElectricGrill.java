package com.xworkz.chemika.internals;

public class ElectricGrill {

        private int powerWatts;
        private boolean nonStick;
        private String brand;

        public ElectricGrill(int powerWatts, boolean nonStick, String brand) {
            this.powerWatts = powerWatts;
            this.nonStick = nonStick;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Power: " + powerWatts + "W, Non-Stick: " + nonStick + ", Brand: " + brand;
        }
    @Override
    public int hashCode() {
        return 117;
    }
    }

