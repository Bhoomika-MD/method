package com.xworkz.chemika.internals;

public class CameraBag {

        private int capacityCameras;
        private boolean waterproof;
        private String color;

        public CameraBag(int capacityCameras, boolean waterproof, String color) {
            this.capacityCameras = capacityCameras;
            this.waterproof = waterproof;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Camera Capacity: " + capacityCameras + ", Waterproof: " + waterproof + ", Color: " + color;
        }
    @Override
    public int hashCode() {
        return 103;
    }
    }

