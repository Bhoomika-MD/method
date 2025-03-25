package com.xworkz.tuesdayWork;
import static com.xworkz.tuesdayWork.Satellites.GEO;
public class NewSatellite {
     Satellite satellite=new Satellite();
      public void display(NewSatellite newSatellite){
          System.out.println(satellite.getSatellites());
          satellite.setSatellites(GEO);

          System.out.println(satellite.getCost());
          satellite.setCost(78);

          System.out.println(satellite.getWeight());
          satellite.setWeight(78.638);

          System.out.println(satellite.getLoadCapacity());
          satellite.setLoadCapacity('l');

      }
}
