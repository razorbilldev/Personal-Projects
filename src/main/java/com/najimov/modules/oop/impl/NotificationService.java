package com.najimov.modules.oop.impl;

import com.najimov.modules.oop.Notification;

public class NotificationService {
    public void send(Notification notification, String message) {
        notification.send(message);
    }
}
