package com.najimov.modules.solid.liskovSubtituition.shape.valid;

import com.najimov.modules.solid.liskovSubtituition.shape.Shape;

public class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }
}
