package com.xworkz.chemika.internals;

public class PowerBank {

        private int capacitymAh;
        private int outputPorts;
        private boolean fastCharging;

        public PowerBank(int capacitymAh, int outputPorts, boolean fastCharging) {
            this.capacitymAh = capacitymAh;
            this.outputPorts = outputPorts;
            this.fastCharging = fastCharging;
        }

        @Override
        public String toString() {
            return "Capacity: " + capacitymAh + "mAh, Ports: " + outputPorts + ", Fast Charging: " + fastCharging;
        }
    }

