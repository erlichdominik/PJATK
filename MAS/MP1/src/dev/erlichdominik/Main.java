package dev.erlichdominik;

import dev.erlichdominik.model.Author;
import dev.erlichdominik.model.Book;
import dev.erlichdominik.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final String PATH = "data.bin";

    public static void main(String[] args) {
        Person correctPerson = new Person("John", "Smith");
        Author correctAuthor = new Author(1L, correctPerson);
        List<String> publishingHouses = new ArrayList<>(List.of(
                "house1",
                "house2",
                "house3"
        ));
//        Book correctBook = new Book(1L, "Lord of the rings", correctAuthor, 20.50, 300, publishingHouses);
//        Book newBook = new Book(2L, "Hobbit", correctAuthor, 25.00, 200, publishingHouses);
//        Book newBook2 = new Book(3L, "Test", correctAuthor, 22.00, 100, publishingHouses);
//
//        Book.saveToFile(PATH, new ArrayList<>(List.of(correctBook, newBook , newBook2)));
////
        List<Book> books = Book.readFromFile(PATH);
        System.out.println(books);
        System.out.println(Book.getBooks());
//
//        Book newBook3 = new Book(4L, "4", correctAuthor, 10.00, 50,20);
//        System.out.println(Book.getBooks());
//
//        Book.appendToFile(PATH, newBook3);
//
//        System.out.println(Book.readFromFile(PATH));

//        serializationHandler.appendToFile(PATH, newBook2);

//        serializedBooks = serializationHandler.readFromFile(PATH);
//        System.out.println(serializedBooks);
//        List<Book> books = Book.readFromFile(PATH);
//        System.out.println(books);
//        System.out.println(Book.getBooks());

    }
}

