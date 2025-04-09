package com.xworkz.chemika.internals;

public class VacuumCleaner {

        private String type;
        private int powerWatts;
        private boolean bagless;

        public VacuumCleaner(String type, int powerWatts, boolean bagless) {
            this.type = type;
            this.powerWatts = powerWatts;
            this.bagless = bagless;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Power: " + powerWatts + "W, Bagless: " + bagless;
        }
    }

