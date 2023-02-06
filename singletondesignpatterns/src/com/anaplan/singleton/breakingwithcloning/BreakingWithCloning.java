package com.anaplan.singleton.breakingwithcloning;

import com.anaplan.singleton.bestway.BestWaySingeton;

public class BreakingWithCloning {

    public static void main(String[] args) throws CloneNotSupportedException {
        SingletonHandlingCloning bestWaySingeton= SingletonHandlingCloning.getSingleton();
        SingletonHandlingCloning bestWaySingeton1=(SingletonHandlingCloning) bestWaySingeton.clone();
        System.out.println(bestWaySingeton.hashCode());
        System.out.println(bestWaySingeton1.hashCode());
    }
}
