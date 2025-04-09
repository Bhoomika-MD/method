package com.xworkz.chemika.internals;

public class Headphone {

        private String type;
        private boolean hasMic;
        private String brand;

        public Headphone(String type, boolean hasMic, String brand) {
            this.type = type;
            this.hasMic = hasMic;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Has Mic: " + hasMic + ", Brand: " + brand;
        }
    }

