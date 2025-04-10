package com.xworkz.chemika.internals;

public class Oven {

        private String type;
        private int temperatureMax;
        private boolean digitalControl;

        public Oven(String type, int temperatureMax, boolean digitalControl) {
            this.type = type;
            this.temperatureMax = temperatureMax;
            this.digitalControl = digitalControl;
        }

        @Override
        public String toString() {
            return "Type: " + type + ", Max Temp: " + temperatureMax + "°C, Digital: " + digitalControl;
        }
    @Override
    public int hashCode() {
        return 148;
    }
    }

