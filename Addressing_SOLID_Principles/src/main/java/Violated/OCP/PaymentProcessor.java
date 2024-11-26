package Violated.OCP;

public class PaymentProcessor {
    public void processPayment(String paymentType) {
        if (paymentType.equals("CreditCard")) {
            System.out.println("Processing credit card payment...");
        } else if (paymentType.equals("PayPal")) {
            System.out.println("Processing PayPal payment...");
        } else {
            System.out.println("Unsupported payment type: " + paymentType);
        }
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("CreditCard");
        processor.processPayment("PayPal");
    }
}
