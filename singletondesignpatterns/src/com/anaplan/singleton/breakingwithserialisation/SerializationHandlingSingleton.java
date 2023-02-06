package com.anaplan.singleton.breakingwithserialisation;

import java.io.Serializable;

public class SerializationHandlingSingleton implements Serializable {

    private static SerializationHandlingSingleton bestWaySingeton = null;

    private SerializationHandlingSingleton() {
    }

    protected Object readResolve() {
        return bestWaySingeton;
    }

    public static SerializationHandlingSingleton getSingleton() {
        if (bestWaySingeton == null) {
            synchronized (com.anaplan.singleton.breakingwithreflection.ReflectionHandlingSingleton.class) {
                if (bestWaySingeton == null) {
                    bestWaySingeton = new SerializationHandlingSingleton();
                }
            }
        }
        return bestWaySingeton;
    }

}


