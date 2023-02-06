package com.anaplan.solidprinciples.interfacesegregation;

public class BearCarer implements BearCleaner, BearFeeder {

    public void washTheBear() {
        System.out.println("Washing the bear");
    }

    public void feedTheBear() {
        System.out.println("feeding the bear");
    }
}
