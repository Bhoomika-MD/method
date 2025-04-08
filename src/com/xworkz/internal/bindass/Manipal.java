package com.xworkz.internal.bindass;

public class Manipal extends Hospital{
    public void admitting(Hospital hospital){
        hospital.far();
        if(hospital instanceof  Hospital){
            System.out.println("manipal is ahospital");
            Manipal manipal=(Manipal) hospital;
            manipal.checking();
            hospital.close();
            hospital.near();
            hospital.open();
            hospital.patient();
        }
    }
    public void checking(){
        System.out.println("checking manipal hospital");
    }
}
