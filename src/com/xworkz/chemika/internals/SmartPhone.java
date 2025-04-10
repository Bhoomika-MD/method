package com.xworkz.chemika.internals;

public class SmartPhone {
        private String model;
        private int storage;
        private boolean has5G;

        public SmartPhone(String model, int storage, boolean has5G) {
            this.model = model;
            this.storage = storage;
            this.has5G = has5G;
        }

        @Override
        public String toString() {
            return "Model: " + model + ", Storage: " + storage + "GB, 5G Enabled: " + has5G;
        }
    @Override
    public int hashCode() {
        return 165;
    }
    }

