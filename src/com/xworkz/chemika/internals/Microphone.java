package com.xworkz.chemika.internals;

public class Microphone {

        private String type;
        private boolean isUSB;
        private int sensitivity;

        public Microphone(String type, boolean isUSB, int sensitivity) {
            this.type = type;
            this.isUSB = isUSB;
            this.sensitivity = sensitivity;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", USB: " + isUSB + ", Sensitivity: " + sensitivity + " dB";
        }
    @Override
    public int hashCode() {
        return 140;
    }
    }

