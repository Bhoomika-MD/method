package com.xworkz.chemika.internals;

public class Iron {

        private int wattage;
        private boolean steamFunction;
        private String soleplateType;

        public Iron(int wattage, boolean steamFunction, String soleplateType) {
            this.wattage = wattage;
            this.steamFunction = steamFunction;
            this.soleplateType = soleplateType;
        }

        @Override
        public String toString() {
            return "Wattage: " + wattage + "W, Steam: " + steamFunction + ", Soleplate: " + soleplateType;
        }
    @Override
    public int hashCode() {
        return 134;
    }
    }

