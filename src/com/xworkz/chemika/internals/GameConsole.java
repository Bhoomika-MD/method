package com.xworkz.chemika.internals;

public class GameConsole {

        private String name;
        private int storage;
        private boolean supportsVR;

        public GameConsole(String name, int storage, boolean supportsVR) {
            this.name = name;
            this.storage = storage;
            this.supportsVR = supportsVR;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Storage: " + storage + "GB, VR Support: " + supportsVR;
        }
    @Override
    public int hashCode() {
        return 128;
    }
    }

