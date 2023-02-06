package com.anaplan.solidprinciples.depandancyinversion;

public class Book implements Product {

    @Override
    public void seeReviews() {
          System.out.println("4.5 out of 10");
    }

    @Override
    public void getSample() {
        System.out.println("Maths Book");
    }
}
