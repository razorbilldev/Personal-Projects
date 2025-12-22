package com.najimov.modules.solid.liskovSubtituition.shape;

public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return width * height;
    }
    // So I will follow the statement that LSP violation mostly because of wrong abstraction not implementation itself
    //  So in this case the calculation of area, in square the formula is A=a^2.
    // 2nd we are changing the meaning of the method = setWidth is for setting the parameter into width which is used in formula later, but in subclass
    // Square we are setting the width value into width and heigh as well the same procedure in setHeigh method. In my opinion this is wrong approach.
}
