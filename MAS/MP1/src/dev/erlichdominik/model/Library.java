package dev.erlichdominik.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dominikerlich
 * @created 08/05/2022
 * @project MP1
 */


// todo: basic
public class Library {
    private Long id;
    private String name;
    // association with an attribute
    private List<LibraryUserContract> libraryUserContracts;
    // qualified association
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        if (book == null) throw new IllegalArgumentException("book cannot be null");
        if(books.containsKey(book.getTitle())) throw new IllegalArgumentException("this book already exists");

        books.put(book.getTitle(), book);
        book.setLibrary(this);
    }

    public Book findBookByTitle(String title) {
        if (title == null) throw new IllegalArgumentException("title cannot be null");
        if (!books.containsKey(title)) throw new IllegalArgumentException("cannot find book with given title: " + title);
        return books.get(title);
    }



}
