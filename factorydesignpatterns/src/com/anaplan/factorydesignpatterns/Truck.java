package com.anaplan.factorydesignpatterns;

public class Truck implements  Transport{
    @Override
    public void deliver() {
       System.out.println("Delivered By Truck");
    }
}
