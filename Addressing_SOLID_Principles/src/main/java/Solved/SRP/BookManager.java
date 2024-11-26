package Solved.SRP;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<String> books = new ArrayList<>();

    // Add a book to the library
    public void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to the library.");
    }

    public List<String> getBooks() {
        return books;
    }
}
