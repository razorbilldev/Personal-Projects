package com.najimov.modules.oop;

public class NotificationService {
    public void send(String type, String message) {
        if (type.equals("Email")){
            System.out.println("Sending Email: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS: message");
        } else if (type.equals("PUSH")) {
            System.out.println("Sending PUSH notification: " + message);
        }else {
            throw new IllegalArgumentException("Unsupported notification type");
        }
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send("Email", "Hello");
    }
}
/*
This is bad design
* Violates Open/Closed Principle
    New type -> modify existing code
  Tightly coupled
    Business logic depends on string values
  Hard to test
    not easy mocking
 */
