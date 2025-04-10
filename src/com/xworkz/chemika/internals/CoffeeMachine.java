package com.xworkz.chemika.internals;

public class CoffeeMachine {

        private String model;
        private boolean beanToCup;
        private int capacityCups;

        public CoffeeMachine(String model, boolean beanToCup, int capacityCups) {
            this.model = model;
            this.beanToCup = beanToCup;
            this.capacityCups = capacityCups;
        }

        @Override
        public String toString() {
            return "Model: " + model + ", Bean-to-Cup: " + beanToCup + ", Capacity: " + capacityCups + " cups";
        }
    @Override
    public int hashCode() {
        return 110;
    }
    }

