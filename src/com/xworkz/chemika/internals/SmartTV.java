package com.xworkz.chemika.internals;

public class SmartTV {
        private String brand;
        private int sizeInches;
        private boolean hdr;

        public SmartTV(String brand, int sizeInches, boolean hdr) {
            this.brand = brand;
            this.sizeInches = sizeInches;
            this.hdr = hdr;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Size: " + sizeInches + "\", HDR: " + hdr;
        }
    }

