package com.anaplan.abstractfactorydesignpatterns.landtransport;

import com.anaplan.abstractfactorydesignpatterns.transport.Transport;

public class SmallTruck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliverd By small truck");

    }
}
