package com.xworkz.internal.bindass;

public class Scissor extends Tool{
    public void two(Tool tool){
        tool.tight();
        if(tool instanceof Tool){
            System.out.println("tools is scissor");
            Scissor scissor=(Scissor) tool;
            scissor.cutting();
            tool.store();
            tool.use();
            tool.repair();
            tool.loose();
        }
    }
    public void cutting(){
        System.out.println("cutting in scissor");
    }
}
