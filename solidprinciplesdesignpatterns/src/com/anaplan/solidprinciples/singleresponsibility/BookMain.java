package com.anaplan.solidprinciples.singleresponsibility;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

    public static void main(String[] args) {
        List<Book> listOFBook = new ArrayList<>();
        Book mathsBook= new Book();
        mathsBook.setAuthor("Rs agarwal");
        mathsBook.setName("Maths");
        mathsBook.setText("This is book of math");
        listOFBook.add(mathsBook);
        Book scienceBook= new Book();
        scienceBook.setAuthor("SL ARora");
        scienceBook.setName("Physics");
        scienceBook.setText("This is book of physics");
        listOFBook.add(scienceBook);
        BookPrinter bookPrinter= new BookPrinter();
        for(Book book :listOFBook){
            bookPrinter.printTextToConsole(book.getText());
        }

    }
}
