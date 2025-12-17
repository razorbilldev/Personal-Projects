package com.najimov.modules.oop.impl;

import com.najimov.modules.oop.Notification;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
