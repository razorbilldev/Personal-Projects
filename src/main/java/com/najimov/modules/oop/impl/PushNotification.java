package com.najimov.modules.oop.impl;

import com.najimov.modules.oop.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }
}
