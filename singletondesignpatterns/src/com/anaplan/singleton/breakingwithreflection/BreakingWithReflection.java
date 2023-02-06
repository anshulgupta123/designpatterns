package com.anaplan.singleton.breakingwithreflection;

import com.anaplan.singleton.bestway.BestWaySingeton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingWithReflection {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        ReflectionHandlingSingleton singleton1 = ReflectionHandlingSingleton.getSingleton();
        ReflectionHandlingSingleton singleton2 = null;
        Constructor[] constructorArray = ReflectionHandlingSingleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructorArray) {
            constructor.setAccessible(true);
            singleton2 = (ReflectionHandlingSingleton) constructor.newInstance();

        }
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
