package com.najimov.modules.solid.openClosed.payment.impl;

import com.najimov.modules.solid.openClosed.payment.PaymentMethod;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Crypto");
    }
}
