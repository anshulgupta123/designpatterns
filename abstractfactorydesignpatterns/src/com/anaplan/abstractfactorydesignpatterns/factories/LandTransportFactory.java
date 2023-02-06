package com.anaplan.abstractfactorydesignpatterns.factories;

import com.anaplan.abstractfactorydesignpatterns.landtransport.BigTruck;
import com.anaplan.abstractfactorydesignpatterns.landtransport.SmallTruck;
import com.anaplan.abstractfactorydesignpatterns.transport.Transport;
import com.anaplan.abstractfactorydesignpatterns.utility.Constants;
import com.anaplan.abstractfactorydesignpatterns.watertransport.BigShip;
import com.anaplan.abstractfactorydesignpatterns.watertransport.SmallShip;

public class LandTransportFactory extends AbstractTransport{
    @Override
    public Transport getTransport(String s) {
        if(s.equalsIgnoreCase(Constants.BIG_TRUCK)){
           return new BigTruck();
        }
        if(s.equalsIgnoreCase(Constants.SMALL_TRUCK)){
            return new SmallTruck();
        }
        return null;
    }
}
