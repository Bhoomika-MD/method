package com.xworkz.internal.bindass;

public class ShotPut extends Sphere{
    public void heavy(Sphere sphere){
        sphere.sketch();
        if(sphere instanceof  Sphere){
            System.out.println("shotput is a sphere");
            ShotPut shotPut=(ShotPut) sphere;
            shotPut.put();
            sphere.push();
            sphere.pull();
            sphere.draw();
            sphere.erase();
        }
    }
    public void put(){
        System.out.println("put the shortPut");
    }
}
