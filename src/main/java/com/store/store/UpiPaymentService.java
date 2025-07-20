package com.store.store;

public class UpiPaymentService implements IPaymentService {
    public void processPayment(Double amount) {
        System.out.println("Payment of Rs. " + amount + " processed using UPI Successfully.");
    }
}
