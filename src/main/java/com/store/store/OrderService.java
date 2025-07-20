package com.store.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private IPaymentService paymentService;

    OrderService() {

    }

    @Autowired
    OrderService(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder(Double amount) {
        paymentService.processPayment(amount);
    }
}
