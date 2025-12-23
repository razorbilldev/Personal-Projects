package com.najimov.modules.solid.interfacesegregation;

public class RobotWorker implements Worker{
    @Override
    public void work() {
        System.out.println("Robot is working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot can not work");
    }
}
