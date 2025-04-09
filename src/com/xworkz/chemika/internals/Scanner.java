package com.xworkz.chemika.internals;

public class Scanner {

        private String model;
        private int dpi;
        private boolean isFlatbed;

        public Scanner(String model, int dpi, boolean isFlatbed) {
            this.model = model;
            this.dpi = dpi;
            this.isFlatbed = isFlatbed;
        }

        @Override
        public String toString() {
            return "Model: " + model + ", DPI: " + dpi + ", Flatbed: " + isFlatbed;
        }
    }

