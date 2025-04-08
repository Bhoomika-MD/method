package com.xworkz.internal.bindass;

public class Tom extends Kid{
    public void baby(Kid kid){
        kid.age();
        if(kid instanceof  Kid){
            System.out.println("tom is kid");
            Tom tom=(Tom)kid;
            tom.playing();
            kid.gender();
            kid.height();
            kid.school();
            kid.weight()
        }
    }
    public void playing(){
        System.out.println("kis is playing");
    }
}
