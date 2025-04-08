package com.xworkz.internal.bindass;

public class Robotics extends Branch{
    public void machine(Branch branch){
        branch.replace();
        if(branch instanceof Branch){
            System.out.println("robotics is a branch");
            Robotics robotics=(Robotics) branch;
            robotics.set();
            branch.pay();
            branch.join();
            branch.present();
            branch.admit();
        }
    }
    public void set(){
        System.out.println("robots are setted");
    }
}
