package com.xworkz.internal.bindass;

public class BrakeSystem extends VehiclePart{
    public BrakeSystem(){
        System.out.println("no arg constructor in brake system");
    }
    @Override
    public void applyBrakes(){
        System.out.println("apply brakes in VehiclePart");
    }
    @Override
    public void releaseBrakes(){
        System.out.println("releaseBrakes in VehiclePart");
    }
    @Override
    public void checkBrakes(){
        System.out.println("checkBrakes in VehiclePart");
    }
    @Override
    public void blendBrakes(){
        System.out.println("blendBrakes in VehiclePart");
    }
    @Override
    public void replaceBrakes(){
        System.out.println("replaceBrakes in VehiclePart");
    }
}
