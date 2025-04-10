package com.xworkz.chemika.internals;

public class Tripod {

        private double maxHeight;
        private boolean quickRelease;
        private String material;

        public Tripod(double maxHeight, boolean quickRelease, String material) {
            this.maxHeight = maxHeight;
            this.quickRelease = quickRelease;
            this.material = material;
        }

        @Override
        public String toString() {
            return "Max Height: " + maxHeight + "cm, Quick Release: " + quickRelease + ", Material: " + material;
        }
    @Override
    public int hashCode() {
        return 180;
    }
    }

