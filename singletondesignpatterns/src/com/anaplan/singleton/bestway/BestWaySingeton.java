package com.anaplan.singleton.bestway;

import java.io.Serializable;

class SuperClass implements  Cloneable{
    int i = 10;

    @Override
    public Object clone()
            throws CloneNotSupportedException
    {
        return super.clone();
    }

}
public class BestWaySingeton extends SuperClass implements Serializable{

    private static BestWaySingeton bestWaySingeton = null;

    protected Object readResolve() {
        return bestWaySingeton;
    }

    private BestWaySingeton() {
    }

    public static BestWaySingeton getSingleton() {
        if (bestWaySingeton == null) {
            synchronized (BestWaySingeton.class) {
                if (bestWaySingeton == null) {
                    bestWaySingeton = new BestWaySingeton();
                }
            }
        }
        return bestWaySingeton;
    }

}
