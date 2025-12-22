package com.najimov.modules.solid.liskovSubtituition.bird;

public class BirdService {
    public void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        BirdService birdService = new BirdService();
        Bird bird = new Ostrich();
        birdService.makeBirdFly(bird);
        // Runtime exception program breaks behavior not presented. Identify the real problem.
        // The problem is not inheritance itself, The problem is wrong abstraction.
        // we assumed -> All birds can fly, which out assumption is false.
        // LSP violation is always means: Your parent abstraction is wrong.
    }
}
