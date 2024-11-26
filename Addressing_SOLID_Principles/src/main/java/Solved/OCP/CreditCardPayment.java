package Solved.OCP;

public class CreditCardPayment extends Payment {
    @Override
    public void process() {
        System.out.println("Processing credit card payment...");
    }
}
