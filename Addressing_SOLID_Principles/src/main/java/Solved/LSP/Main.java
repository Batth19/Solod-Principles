package Solved.LSP;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + rect.getArea());

        Shape square = new Square(5);
        System.out.println("Square Area: " + square.getArea());
    }
}
