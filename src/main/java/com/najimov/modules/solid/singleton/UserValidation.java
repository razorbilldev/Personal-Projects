package com.najimov.modules.solid.singleton;

public class UserValidation {
    public void validate(String username, String email) {
        if (username == null || email == null) {
            throw new IllegalArgumentException("Invalid data");
        }
    }
}
