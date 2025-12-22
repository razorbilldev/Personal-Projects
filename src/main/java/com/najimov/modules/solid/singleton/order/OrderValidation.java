package com.najimov.modules.solid.singleton.order;

public class OrderValidation {
    public void validate(String name, String uuid) {
        if (name == null || uuid == null) {
            throw new IllegalArgumentException("Invalid data");
        }
    }
}
