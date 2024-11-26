package Solved.OCP;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Adding payment methods
        processor.addPayment(new CreditCardPayment());
        processor.addPayment(new PayPalPayment());

        // Processing all payments
        processor.processAllPayments();
    }
}
