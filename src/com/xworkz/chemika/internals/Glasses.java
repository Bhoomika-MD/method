package com.xworkz.chemika.internals;

public class Glasses {

        private String frameMaterial;
        private boolean prescription;
        private String lensType;

        public Glasses(String frameMaterial, boolean prescription, String lensType) {
            this.frameMaterial = frameMaterial;
            this.prescription = prescription;
            this.lensType = lensType;
        }

        @Override
        public String toString() {
            return "Frame: " + frameMaterial + ", Prescription: " + prescription + ", Lens: " + lensType;
        }
    @Override
    public int hashCode() {
        return 129;
    }
    }

