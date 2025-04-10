package com.xworkz.chemika.internals;

public class Charger {

        private String connectorType;
        private int wattage;
        private boolean fastCharging;

        public Charger(String connectorType, int wattage, boolean fastCharging) {
            this.connectorType = connectorType;
            this.wattage = wattage;
            this.fastCharging = fastCharging;
        }

        @Override
        public String toString() {
            return "Connector: " + connectorType + ", Wattage: " + wattage + "W, Fast Charging: " + fastCharging;
        }
    @Override
    public int hashCode() {
        return 107;
    }
    }

