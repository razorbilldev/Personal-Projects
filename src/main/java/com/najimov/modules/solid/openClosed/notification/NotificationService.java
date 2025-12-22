package com.najimov.modules.solid.openClosed.notification;

import com.najimov.modules.solid.openClosed.notification.impl.SmsService;

public class NotificationService {
    public void send(String type, String message) {
        if (type.equals("EMAIL")) {
            System.out.println("Sending email: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: " + message);
        } else if (type.equals("PUSH")) {
            System.out.println("Sending PUSH: " + message);
        }
    }

    // this is bad coding practice, if we want to extend the notification service by adding mailing, or other messaging services like telegram or Kakao
    // we will violate OCP principle, therefore rather having conditionals we refactor features into isolated modules. In result, when we want to add additional
    // feature we do not modify any existing service we just add them by implementing parent abstract class or interface if notification method.

    public void send(NotificationType type, String message) {
        type.send(message);
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send(new SmsService(), "Hello future me I am trying to keep work on myself, actually this is not quite hard as we though, but today's world is full of distraction, and its getting hard to stick focused, but I want you know I am trying my best...");
    }
}

