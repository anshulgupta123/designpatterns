package com.anaplan.solidprinciples.depandancyinversion;

public class Dvd implements Product {

    @Override
    public void seeReviews() {
         System.out.println("5 out of 5");
    }

    @Override
    public void getSample() {
        System.out.println("This is dvd");
    }
}
