package com.anaplan.abstractfactorydesignpatterns.watertransport;

import com.anaplan.abstractfactorydesignpatterns.transport.Transport;

public class BigShip implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliverd By Big Ship");

    }
}
