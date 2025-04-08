package com.xworkz.internal.bindass;

public class Pegion extends Bird{
    public void flying(Bird bird){
        bird.repeatWords();
        if(bird instanceof Bird){
            System.out.println("bird is pegion");
            Pegion pegion=(Pegion) bird;
            pegion.cameBack();
            bird.fly();
            bird.perch();
            bird.feather();
            bird.eat();

        }
    }
    public void cameBack(){
        System.out.println("pegion came back");
    }
}
