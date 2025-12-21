package com.najimov.modules.oop.abstraction;

public abstract class Vehicle {
    protected int speed;

    public abstract void move();

    public void accelerate() {
        speed += 10;
    }

}
