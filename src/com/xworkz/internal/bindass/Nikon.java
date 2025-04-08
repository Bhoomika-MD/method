package com.xworkz.internal.bindass;

public class Nikon extends Camera{
    public void oldModel(Camera camera){
        camera.close();
        if(camera instanceof  Camera) {
            System.out.println("nikon is a camera");
            Nikon nikon=(Nikon) camera;
            nikon.function();
            camera.click();
            camera.working();
            camera.notWorking();
            camera.open();
        }
    }
    public void function(){
        System.out.println("nikon camera in function");
    }
}
