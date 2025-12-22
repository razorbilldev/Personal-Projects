package com.najimov.modules.solid.singleton.order;

public class EmailService {
    public void sendSMS(String name, String uuid) {
        System.out.println("Send order info into main mailing service uzpost@mail.uz with order uuid: " + uuid);
    }
}
