package com.xworkz.chemika.internals;

public class Router {

        private String model;
        private int maxSpeed;
        private boolean dualBand;

        public Router(String model, int maxSpeed, boolean dualBand) {
            this.model = model;
            this.maxSpeed = maxSpeed;
            this.dualBand = dualBand;
        }

        @Override
        public String toString() {
            return "Model: " + model + ", Max Speed: " + maxSpeed + " Mbps, Dual Band: " + dualBand;
        }
    }

