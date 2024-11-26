package Solved.SRP;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        NotificationService notificationService = new NotificationService();

        bookManager.addBook("The Great Gatsby");
        notificationService.notifyUser("New book added: The Great Gatsby");
    }
}
