package com.xworkz.chemika.internals;

public class Monitor {

        private String resolution;
        private double size;
        private boolean isCurved;

        public Monitor(String resolution, double size, boolean isCurved) {
            this.resolution = resolution;
            this.size = size;
            this.isCurved = isCurved;
        }

        @Override
        public String toString() {
            return "Resolution: " + resolution + ", Size: " + size + "\", Is Curved: " + isCurved;
        }
    @Override
    public int hashCode() {
        return 142;
    }
    }

