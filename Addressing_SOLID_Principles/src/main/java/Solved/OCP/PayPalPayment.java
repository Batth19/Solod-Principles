package Solved.OCP;

public class PayPalPayment extends Payment {
    @Override
    public void process() {
        System.out.println("Processing PayPal payment...");
    }
}
