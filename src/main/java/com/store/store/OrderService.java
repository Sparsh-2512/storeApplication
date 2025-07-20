package com.store.store;

public class OrderService {
    private IPaymentService paymentService;

    OrderService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder(Double amount) {
        paymentService.processPayment(amount);
    }
}
