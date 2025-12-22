package com.najimov.modules.solid.openClosed.notification.impl;

import com.najimov.modules.solid.openClosed.notification.NotificationType;

public class EmailService implements NotificationType {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
