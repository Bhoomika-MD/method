package com.xworkz.chemika.internals;

public class EReader {

        private String model;
        private int storageGB;
        private boolean waterproof;

        public EReader(String model, int storageGB, boolean waterproof) {
            this.model = model;
            this.storageGB = storageGB;
            this.waterproof = waterproof;
        }

        @Override
        public String toString() {
            return "Model: " + model + ", Storage: " + storageGB + "GB, Waterproof: " + waterproof;
        }
    @Override
    public int hashCode() {
        return 121;
    }
    }

