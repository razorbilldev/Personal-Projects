package com.najimov.modules.solid.singleton.order;

import com.najimov.modules.solid.singleton.user.AuditLogger;

public class OrderService {
    private final OrderValidation validation = new OrderValidation();
    private final OrderRepository repository = new OrderRepository();
    private final EmailService email = new EmailService();
    private final AuditLogger logger = new AuditLogger();
    private final PaymentService paymentService = new PaymentService();

    public void placeOrder(String name, String uuid) {
        validation.validate(name, uuid);
        repository.save(name, uuid);
        email.sendSMS(name, uuid);
        paymentService.payment(name);
        logger.log(name);
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.placeOrder("Car", "AF2341");
    }
}
