package com.anaplan.singleton.lazy;

public class SingletonLazyIntialiZation {

    private static SingletonLazyIntialiZation singleton;

    private SingletonLazyIntialiZation() {
    }

    public static synchronized SingletonLazyIntialiZation getSingleton(){
        if(singleton==null){
            singleton= new SingletonLazyIntialiZation();
        }
        return singleton;
    }

}
