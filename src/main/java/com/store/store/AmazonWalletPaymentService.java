package com.store.store;

public class AmazonWalletPaymentService implements IPaymentService {
    public void processPayment(Double amount) {
        System.out.println("Payment of Rs. " + amount + " processed using Amazon Wallet Successfully.");
    }
}
