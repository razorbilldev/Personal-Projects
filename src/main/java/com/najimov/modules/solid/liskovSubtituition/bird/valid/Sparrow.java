package com.najimov.modules.solid.liskovSubtituition.bird.valid;

public class Sparrow extends Bird implements FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow eats seeds");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
