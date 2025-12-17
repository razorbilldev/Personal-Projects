package com.najimov.modules.oop;

import com.najimov.modules.oop.impl.EmailNotification;
import com.najimov.modules.oop.impl.NotificationService;
import com.najimov.modules.oop.impl.PushNotification;
import com.najimov.modules.oop.impl.WhatsAppNotification;

public class Main {
    public static void main(String[] args) {
        Notification notification = new WhatsAppNotification();
        NotificationService service = new NotificationService();
        service.send(notification, "Hello!");
    }
}

