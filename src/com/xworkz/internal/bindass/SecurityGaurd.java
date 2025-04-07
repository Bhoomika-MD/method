package com.xworkz.internal.bindass;

public class SecurityGaurd extends Staff{
    public SecurityGaurd(){
        System.out.println("no arg constructor in security gaurd");
    }
    @Override
    public void patrolArea(){
        System.out.println("patrol area in staff");
    }
    @Override
    public void checkId(){
        System.out.println("check id in staff");
    }
    @Override
    public void monitorCCTV(){
        System.out.println("monitorCCTV in staff");
    }
    @Override
    public void reportIncident(){
        System.out.println("reportIncident in staff");
    }
    @Override
    public void openGate(){
        System.out.println("openGate in staff");
    }
}
