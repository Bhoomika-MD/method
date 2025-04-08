package com.xworkz.internal.bindass;

public class Sahana extends PG{
    public void sri(PG pg)
    {
        pg.pay();
        if(pg instanceof PG){
            System.out.println("sahana is a pg");
            Sahana sahana=(Sahana) pg;
            sahana.food();
            pg.open();
            pg.leave();
            pg.join();
            pg.close();
        }
    }
    public void food(){
        System.out.println("sahana pg food");
    }
}
