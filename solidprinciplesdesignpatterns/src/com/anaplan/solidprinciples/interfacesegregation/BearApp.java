package com.anaplan.solidprinciples.interfacesegregation;

public class BearApp {

    public static void main(String[] args) {
        BearCarer bearCarer= new BearCarer();
        bearCarer.washTheBear();
        bearCarer.feedTheBear();
        CrazyPerson crazyPerson= new CrazyPerson();
        crazyPerson.petTheBear();
    }
}
