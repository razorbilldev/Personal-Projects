package com.najimov.modules.solid.singleton.order;

public class OrderRepository {
    public void save(String name, String uuid) {
        System.out.println("Saving order: " + name + " with uuid: " + " into database");
    }
}
