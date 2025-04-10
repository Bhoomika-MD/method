package com.xworkz.chemika.internals;

public class Television {

        private String brand;
        private int screenSize;
        private boolean isSmart;

        public Television(String brand, int screenSize, boolean isSmart) {
            this.brand = brand;
            this.screenSize = screenSize;
            this.isSmart = isSmart;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Screen Size: " + screenSize + "\", Smart TV: " + isSmart;
        }
    @Override
    public int hashCode() {
        return 174;
    }
    }

