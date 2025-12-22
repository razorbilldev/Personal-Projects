package com.najimov.modules.solid.singleton.order;

public class AuditService {
    public void logging(String name, String uuid) {
        System.out.println("LOG: " + name + " with uuid: " + uuid);
    }
}
