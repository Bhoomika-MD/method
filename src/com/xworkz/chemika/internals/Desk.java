package com.xworkz.chemika.internals;

public class Desk {
        private String material;
        private int drawers;
        private boolean hasKeyboardTray;

        public Desk(String material, int drawers, boolean hasKeyboardTray) {
            this.material = material;
            this.drawers = drawers;
            this.hasKeyboardTray = hasKeyboardTray;
        }

        @Override
        public String toString() {
            return "Material: " + material + ", Drawers: " + drawers + ", Keyboard Tray: " + hasKeyboardTray;
        }
    @Override
    public int hashCode() {
        return 113;
    }
    }

