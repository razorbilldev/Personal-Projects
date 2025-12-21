package com.najimov.modules.oop.abstraction;

public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("Car moving at " + speed);
    }
}
