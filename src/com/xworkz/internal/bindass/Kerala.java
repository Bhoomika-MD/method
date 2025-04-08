package com.xworkz.internal.bindass;

public class Kerala extends State{
    public void capitals(State state){
        state.capitalOfState();
        if(state instanceof  State){
            System.out.println("kerala is a state");
            Kerala kerala=(Kerala)state;
            kerala.beside();
            state.custom();
            state.firstLetter();
            state.population();
            state.tradition();
        }
    }
    public void beside(){
        System.out.println("kerala is beside");
    }
}
