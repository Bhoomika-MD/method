package com.xworkz.chemika.internals;

public class Projector {

        private int lumens;
        private boolean isPortable;
        private String resolution;

        public Projector(int lumens, boolean isPortable, String resolution) {
            this.lumens = lumens;
            this.isPortable = isPortable;
            this.resolution = resolution;
        }

        @Override
        public String toString() {
            return "Lumens: " + lumens + ", Portable: " + isPortable + ", Resolution: " + resolution;
        }
    }

