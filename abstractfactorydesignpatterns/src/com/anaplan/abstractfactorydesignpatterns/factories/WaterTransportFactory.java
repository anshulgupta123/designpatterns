package com.anaplan.abstractfactorydesignpatterns.factories;

import com.anaplan.abstractfactorydesignpatterns.transport.Transport;
import com.anaplan.abstractfactorydesignpatterns.utility.Constants;
import com.anaplan.abstractfactorydesignpatterns.watertransport.BigShip;
import com.anaplan.abstractfactorydesignpatterns.watertransport.SmallShip;

public class WaterTransportFactory extends AbstractTransport{

    @Override
    public Transport getTransport(String s) {
        if(s.equalsIgnoreCase(Constants.SMALL_SHIP)){
            return new SmallShip();
        }
        if(s.equalsIgnoreCase(Constants.BIG_SHIP)){
            return new BigShip();
        }
        return null;
    }
}
