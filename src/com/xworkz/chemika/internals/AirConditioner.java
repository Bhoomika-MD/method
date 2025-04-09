package com.xworkz.chemika.internals;

public class AirConditioner {

        private String brand;
        private int btu;
        private boolean inverter;

        public AirConditioner(String brand, int btu, boolean inverter) {
            this.brand = brand;
            this.btu = btu;
            this.inverter = inverter;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", BTU: " + btu + ", Inverter: " + inverter;
        }
    }

