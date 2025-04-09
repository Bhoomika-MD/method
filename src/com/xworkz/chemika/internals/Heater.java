package com.xworkz.chemika.internals;

public class Heater {

        private int powerWatts;
        private String type;
        private boolean thermostat;

        public Heater(int powerWatts, String type, boolean thermostat) {
            this.powerWatts = powerWatts;
            this.type = type;
            this.thermostat = thermostat;
        }

        @Override
        public String toString() {
            return "Power: " + powerWatts + "W, Type: " + type + ", Thermostat: " + thermostat;
        }
    }

