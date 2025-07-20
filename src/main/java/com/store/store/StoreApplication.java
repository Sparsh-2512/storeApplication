package com.store.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        // Run Application
        // SpringApplication.run(StoreApplication.class, args);

        // Console Application
        var orderService = new OrderService(new UpiPaymentService());
        orderService.processOrder(20.0);

    }

}
