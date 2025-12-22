package com.najimov.modules.solid.openClosed.payment;

import com.najimov.modules.solid.openClosed.payment.impl.PaypalPayment;

public class PaymentService {
    public void pay(PaymentMethod paymentType, double amount) {
        paymentType.pay(amount);
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.pay(new PaypalPayment(), 2000);
    }
}
