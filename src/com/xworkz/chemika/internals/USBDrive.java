package com.xworkz.chemika.internals;

public class USBDrive {

        private int capacityGB;
        private boolean encrypted;
        private String brand;

        public USBDrive(int capacityGB, boolean encrypted, String brand) {
            this.capacityGB = capacityGB;
            this.encrypted = encrypted;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Capacity: " + capacityGB + "GB, Encrypted: " + encrypted + ", Brand: " + brand;
        }
    @Override
    public int hashCode() {
        return 183;
    }
    }

