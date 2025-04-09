package com.xworkz.chemika.internals;

public class ElectricScooter {

        private int topSpeed;
        private int rangeKm;
        private boolean foldable;

        public ElectricScooter(int topSpeed, int rangeKm, boolean foldable) {
            this.topSpeed = topSpeed;
            this.rangeKm = rangeKm;
            this.foldable = foldable;
        }

        @Override
        public String toString() {
            return "Top Speed: " + topSpeed + "km/h, Range: " + rangeKm + "km, Foldable: " + foldable;
        }
    }

