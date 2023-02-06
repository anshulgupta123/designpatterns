package com.anaplan.abstractfactorydesignpatterns.factories;

public class FactoryProducer {

    public static AbstractTransport getFactory(boolean isWater){
        if(isWater){
            return new WaterTransportFactory();
        }
        else{
            return new LandTransportFactory();
        }
    }
}
