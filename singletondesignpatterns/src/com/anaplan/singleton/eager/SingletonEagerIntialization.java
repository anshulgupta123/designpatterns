package com.anaplan.singleton.eager;

public class SingletonEagerIntialization {

    private static SingletonEagerIntialization singletonEagerIntialization= new SingletonEagerIntialization();

    private SingletonEagerIntialization() {
    }

    public static SingletonEagerIntialization getSingleton(){
        return singletonEagerIntialization;
    }
}
