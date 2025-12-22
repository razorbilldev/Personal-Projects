package com.najimov.modules.solid.liskovSubtituition.bird.valid;

public class BirdService {
    public void makeBirdFly(FlyingBird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        BirdService birdService = new BirdService();
        Bird bird = new Sparrow();
        birdService.makeBirdFly((FlyingBird) bird);
    }
    //Ostrich cannot even be passed to makeBirdFly. No runtime exceptions. Behavior guaranteed LSP satisfied
    // When is LSP violation?
    // - When a subclass changes the expected behavior of the parent class, causing runtime errors or incorrect logic. LSP violations usually mean wrong inheritance, not wrong implementation.
    // these are common patterns which breaks Liskov's Substitution principle.
    //  Throwing UnsupportedOperationException
    // Strengthening preconditions
    // Weakening postconditions
    // Returning incompatible values
    // Changing the meaning of method. Remember them
}
