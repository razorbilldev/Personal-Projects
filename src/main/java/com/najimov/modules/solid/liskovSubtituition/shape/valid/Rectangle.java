package com.najimov.modules.solid.liskovSubtituition.shape.valid;

import com.najimov.modules.solid.liskovSubtituition.shape.Shape;

public class Rectangle implements Shape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public int area() {
        return width * height;
    }
}
