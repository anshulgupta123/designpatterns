package com.anaplan.singleton.breakingwithreflection;

import java.io.Serializable;



public class ReflectionHandlingSingleton  {

    private static ReflectionHandlingSingleton bestWaySingeton = null;

    private ReflectionHandlingSingleton() {
    }

    public static ReflectionHandlingSingleton getSingleton() {
        if (bestWaySingeton == null) {
            synchronized (ReflectionHandlingSingleton.class) {
                if (bestWaySingeton == null) {
                    bestWaySingeton = new ReflectionHandlingSingleton();
                }
            }
        }
        return bestWaySingeton;
    }

}

