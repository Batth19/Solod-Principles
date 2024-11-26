package Violated.SRP;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private List<String> books = new ArrayList<>();

    // Add a book to the library
    public void addBook(String book) {
        books.add(book);
        System.out.println(book + " added to the library.");
    }

    // Notify user about a book addition
    public void notifyUser(String message) {
        System.out.println("Notification sent to user: " + message);
    }

    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        manager.addBook("The Great Gatsby");
        manager.notifyUser("New book added: The Great Gatsby");
    }
}
