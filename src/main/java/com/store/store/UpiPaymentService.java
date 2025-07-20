package com.store.store;

import org.springframework.stereotype.Service;

@Service
public class UpiPaymentService implements IPaymentService {
    public void processPayment(Double amount) {
        System.out.println("Payment of Rs. " + amount + " processed using UPI Successfully.");
    }
}
