package com.xworkz.chemika.internals;

public class Toaster {

        private int slots;
        private String color;
        private boolean bagelMode;

        public Toaster(int slots, String color, boolean bagelMode) {
            this.slots = slots;
            this.color = color;
            this.bagelMode = bagelMode;
        }

        @Override
        public String toString() {
            return "Slots: " + slots + ", Color: " + color + ", Bagel Mode: " + bagelMode;
        }
    }

