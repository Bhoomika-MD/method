package com.xworkz.chemika.internals;

public class ExternalHardDrive {

        private int capacityTB;
        private String connectionType;
        private boolean ssd;

        public ExternalHardDrive(int capacityTB, String connectionType, boolean ssd) {
            this.capacityTB = capacityTB;
            this.connectionType = connectionType;
            this.ssd = ssd;
        }

        @Override
        public String toString() {
            return "Capacity: " + capacityTB + "TB, Connection: " + connectionType + ", SSD: " + ssd;
        }
    }

