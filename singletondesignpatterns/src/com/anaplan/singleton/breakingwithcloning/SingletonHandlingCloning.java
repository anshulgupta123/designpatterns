package com.anaplan.singleton.breakingwithcloning;

class SuperClass implements Cloneable {
    int i = 10;

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }

}

public class SingletonHandlingCloning extends SuperClass {

    private static SingletonHandlingCloning bestWaySingeton = null;

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    private SingletonHandlingCloning() {
    }

    public static SingletonHandlingCloning getSingleton() {
        if (bestWaySingeton == null) {
            synchronized (com.anaplan.singleton.bestway.BestWaySingeton.class) {
                if (bestWaySingeton == null) {
                    bestWaySingeton = new SingletonHandlingCloning();
                }
            }
        }
        return bestWaySingeton;
    }

}

