package Violated.LSP;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Breaks behavior of Rectangle
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height); // Breaks behavior of Rectangle
        super.setHeight(height);
    }

    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println("Area: " + rect.getArea()); // Output is incorrect
    }
}