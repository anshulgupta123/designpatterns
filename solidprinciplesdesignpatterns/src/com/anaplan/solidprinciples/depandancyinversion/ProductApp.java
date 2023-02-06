package com.anaplan.solidprinciples.depandancyinversion;

public class ProductApp {

    public static void main(String[] args) {
        Product book=new Book();
        Product dvd= new Dvd();
        book.getSample();
        book.seeReviews();
        dvd.getSample();
        dvd.seeReviews();
    }
}
