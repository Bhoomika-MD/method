package com.xworkz.chemika.internals;

public class WashingMachine {
        private String type;
        private int capacityKg;
        private boolean frontLoad;

        public WashingMachine(String type, int capacityKg, boolean frontLoad) {
            this.type = type;
            this.capacityKg = capacityKg;
            this.frontLoad = frontLoad;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Capacity: " + capacityKg + "kg, Front Load: " + frontLoad;
        }
    @Override
    public int hashCode() {
        return 187;
    }
    }

