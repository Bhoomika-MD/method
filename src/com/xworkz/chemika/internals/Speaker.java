package com.xworkz.chemika.internals;

public class Speaker {

        private int power;
        private boolean isBluetooth;
        private String brand;

        public Speaker(int power, boolean isBluetooth, String brand) {
            this.power = power;
            this.isBluetooth = isBluetooth;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Power: " + power + "W, Bluetooth: " + isBluetooth + ", Brand: " + brand;
        }
    @Override
    public int hashCode() {
        return 169;
    }
    }

