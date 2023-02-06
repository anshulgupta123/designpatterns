package com.anaplan.abstractfactorydesignpatterns.factories;

import com.anaplan.abstractfactorydesignpatterns.transport.Transport;

public  abstract class AbstractTransport {
    public abstract Transport getTransport(String s);
}
