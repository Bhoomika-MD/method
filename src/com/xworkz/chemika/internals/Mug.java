package com.xworkz.chemika.internals;

public class Mug {

        private double volumeML;
        private boolean insulated;
        private String color;

        public Mug(double volumeML, boolean insulated, String color) {
            this.volumeML = volumeML;
            this.insulated = insulated;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Volume: " + volumeML + "ml, Insulated: " + insulated + ", Color: " + color;
        }
    }

