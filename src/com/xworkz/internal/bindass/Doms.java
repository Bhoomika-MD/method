package com.xworkz.internal.bindass;

public class Doms extends Pen{
    public void writing(Pen pen){
        pen.write();
        if(pen instanceof Pen){
            System.out.println("doms is a pen");
            Doms doms=(Doms) pen;
            doms.run();
            pen.write();
            pen.emptyPen();
            pen.halfPen();
            pen.newPen();
            pen.oldPen();
        }
    }
    public void run(){
        System.out.println("Running");
    }
}
