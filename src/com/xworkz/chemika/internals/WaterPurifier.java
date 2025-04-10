package com.xworkz.chemika.internals;

public class WaterPurifier {

        private String brand;
        private int capacityLiters;
        private boolean uvFilter;

        public WaterPurifier(String brand, int capacityLiters, boolean uvFilter) {
            this.brand = brand;
            this.capacityLiters = capacityLiters;
            this.uvFilter = uvFilter;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Capacity: " + capacityLiters + "L, UV Filter: " + uvFilter;
        }
    @Override
    public int hashCode() {
        return 189;
    }
    }

