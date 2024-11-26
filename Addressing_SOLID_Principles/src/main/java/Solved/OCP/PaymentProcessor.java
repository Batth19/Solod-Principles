package Solved.OCP;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {
    private final List<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public void processAllPayments() {
        for (Payment payment : payments) {
            payment.process();
        }
    }
}
