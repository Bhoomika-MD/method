package com.xworkz.tuesdayWork;

public class Satellite {

    private Satellites satellites;
    private int cost;
    private double weight;
    private char loadCapacity;

    public  Satellites getSatellites()
    {
        return this.satellites;
    }
    public  void  setSatellites(Satellites satellites)
    {
        this.satellites=satellites;
    }
    public int getCost()
    {
        return this.cost;
    }
    public  void  setCost(int cost)
    {
        this.cost=cost;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public  void  setWeight(double weight)
    {
        this.weight=weight;
    }
    public char getLoadCapacity()
    {
        return this.loadCapacity;
    }
    public  void  setLoadCapacity(char loadCapacity)
    {
        this.loadCapacity=loadCapacity;
    }

    }

