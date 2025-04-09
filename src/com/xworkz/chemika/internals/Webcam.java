package com.xworkz.chemika.internals;

public class Webcam {
        private int resolution;
        private boolean hasMic;
        private String brand;

        public Webcam(int resolution, boolean hasMic, String brand) {
            this.resolution = resolution;
            this.hasMic = hasMic;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "Resolution: " + resolution + "p, Has Mic: " + hasMic + ", Brand: " + brand;
        }
    }

