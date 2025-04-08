package com.xworkz.internal.bindass;

public class Apollo extends MedicalShop{
    public void newShop(MedicalShop medicalShop) {
        medicalShop.bandage();
        if (medicalShop instanceof MedicalShop) {
            System.out.println("apollo is a shop");
            Apollo apollo = (Apollo) medicalShop;
            apollo.tablets();
            medicalShop.dettol();
            medicalShop.soap();
            medicalShop.syrup();
            medicalShop.tablet();
        }
    }
    public void tablets(){
        System.out.println("tablets in apollo");
    }
}
