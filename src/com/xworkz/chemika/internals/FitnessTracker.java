package com.xworkz.chemika.internals;

public class FitnessTracker {

        private String model;
        private boolean heartRateMonitor;
        private int batteryLifeDays;

        public FitnessTracker(String model, boolean heartRateMonitor, int batteryLifeDays) {
            this.model = model;
            this.heartRateMonitor = heartRateMonitor;
            this.batteryLifeDays = batteryLifeDays;
        }

        @Override
        public String toString() {
            return "Model: " + model + ", HR Monitor: " + heartRateMonitor + ", Battery Life: " + batteryLifeDays + " days";
        }
    @Override
    public int hashCode() {
        return 124;
    }
    }

