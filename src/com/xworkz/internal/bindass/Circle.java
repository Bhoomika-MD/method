package com.xworkz.internal.bindass;

public class Circle extends Shape{
    public void drawing(Shape shape){
        shape.draw();
        if(shape instanceof  Shape){
            System.out.println("circle is a shape");
            Circle circle=(Circle)shape;
            circle.erasing();
            shape.correct();
            shape.erase();
            shape.rewrite();
            shape.notCorrect();
        }
    }
    public void erasing(){
        System.out.println("erasing circle");
    }
}
