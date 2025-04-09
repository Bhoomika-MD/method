package com.xworkz.chemika.internals;

public class VRHeadset {

        private String brand;
        private boolean wireless;
        private int fovDegrees;

        public VRHeadset(String brand, boolean wireless, int fovDegrees) {
            this.brand = brand;
            this.wireless = wireless;
            this.fovDegrees = fovDegrees;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Wireless: " + wireless + ", FOV: " + fovDegrees + "°";
        }
    }

