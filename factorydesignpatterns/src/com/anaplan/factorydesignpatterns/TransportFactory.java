package com.anaplan.factorydesignpatterns;

public class TransportFactory {

    public Transport getTransport(String transportType) {

        if (transportType.equals(Constants.TRUCK)) {
            return new Truck();
        }
        if (transportType.equals(Constants.SHIP)) {
            return new Ship();
        }
        return null;
    }
}
