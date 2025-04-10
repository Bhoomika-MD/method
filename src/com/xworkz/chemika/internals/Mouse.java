package com.xworkz.chemika.internals;

public class Mouse{
        private String brand;
        private boolean isWireless;
        private int dpi;

        public Mouse(String brand, boolean isWireless, int dpi) {
            this.brand = brand;
            this.isWireless = isWireless;
            this.dpi = dpi;
        }

        @Override
        public String toString() {
            return "Brand: " + brand + ", Is Wireless: " + isWireless + ", DPI: " + dpi;
        }
    @Override
    public int hashCode() {
        return 143;
    }
    }

